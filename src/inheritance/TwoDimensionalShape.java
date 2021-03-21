/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 * Obtenemos informacion sobre perimetros y areas heredados de la class Shape
 *
 * Clase abtracta con herencia de Shape
 * 
 * @author arancha
 */
public abstract  class TwoDimensionalShape extends Shape{
    
  
   /**
     * Obtenemos el perimetro de la figura
     * metodo heredado que implementamos en la clase que vamos a usar 
     */ 
   @Override
   public double getPerimeter()
   {
       // Return nos devuelve el valor del perimetro
       // que sera sobreescrito posterior mente en cada clases
        return 0 ;
   }
    
   /**
     * getArea metodo que usamos para obtener el area de las figuras geometricas
     */
   @Override
   public double getArea()
   {
       // Return nos devuelve el valor del area 
       // que sera sobreescrito posterior mente en cada clases
        return 0;
   }


}
