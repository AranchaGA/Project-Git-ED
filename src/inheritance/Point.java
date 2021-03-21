
package inheritance;
import java.io.PrintWriter;

/**
 * Clase Point que contiene las coordenadas cartesianas X e Y
 * Esta clase no hereda de ninguna pero sera usada por otras 
 *
 * @author arancha
 */
public class Point 
{
    /**
     * variable X de la figura
     */
    private double x ;
    /**
     *   * variable Y de la figura
     */
    private double y;

    /**
     * Constructor por defecto
     */
    public Point() 
    {
        //Al crear el constructor les damos las siguientes variables 
        this.x = 0.0;
        this.y = 0.0 ;
    }

    
    /**
     * Constructor con parametros para su creacion de X e Y
     */
    public Point(double x, double y) 
    {
        //Asignamos las variables introducidas en el parametros a la figura
        this.x = x;
        this.y = y;
    }
    
    
     /**
     * Constructor con la propia clase como parametro
     */
    public Point(Point pnt)
    {
        //Asignamos el valor como parametro a las variables
        this.x = pnt.x;
        this.y = pnt.y;
    }
    
   
     /**
     * Metodo para obtener la variable X
     */
    public double getX() 
    {
        //Return nos devuelve el valor de X
        return x;
    }
    
    
     /**
     * Metodo para cambiar el valor de X por el dado en el  parametro
     */
    public void setX(double x) 
    {
        //Asigna el valor de X del parametro a la variable X
        this.x = x;
    }
    
    
    /**
     * Metodo con el que obtenemos el valor de Y
     */
    public double getY() 
    {
        //Nos devuelve dicho valor 
        return y;
    }
    
    
     /**
     * Metodo para cambiar el valor de Y.
     */
    public void setY(double y) 
    {
        //Asigna el valor de Y dado en el parametro a la figura 
        this.y = y;
    }
    
    
    /**
     * Este metodo devuelve la distancia entre un punto y el punto dado como parametro 
     * Nos retorna el calculo de los puntos 
     */
    public double  distance(Point p)
    {
        // Nos retorna el calculo de ambos puntos 
        return Math.sqrt( ((this.x - p.x)  * (this.x - p.x))  + ((this.y - p.y)  * (this.y - p.y)));
  
    }
    
    
    /**
     * Este metodo imprime el punto en la X e Y en el archibo de salida
     */
    public void print(PrintWriter out)
    {
        
        out.write("\n Point Data => ");
        out.write("\nPrint Data = x = " + x + " y = " + y);
        out.write("\n\n\n");;
    }
    
    
}
