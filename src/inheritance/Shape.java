/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.io.PrintWriter;

/**
 * Clase Shape 
 * 
 * Obtenemos informacion sobre las areas y perimetros 
 * Obtenemos documento txt generado en PrintWriter
 * Clase abstracta
 * 
 * @author Arancha
 */

public abstract class Shape {
   /**
    * PrintWriter obtenemos documento txt generado en el main al ponerlo como argumento 
    * Es un objeto que nos permite imprimir representaciones formateadas de una salida
    */
   public void print(PrintWriter out) {
  
   }
   
   /**
    * getArea metodo que usamos para obtener el area de las figuras geometricas
    *   
   */
   public double getArea()
   {
       // Return nos devuelve el valor del area 
       // que sera sobreescrito posterior mente en cada clases
       return 0;
       
   }
   
   /**
     * getPerimeter metodo que usamos para obtener el valor del perimetro
     */
   public double getPerimeter()
   {
       // Return nos devuelve el valor del perimetro
       // que sera sobreescrito posterior mente en cada clases
       return 0;
   }
   
}

