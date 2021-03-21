
package inheritance;

import java.io.PrintWriter;

/**
 * Clase Rectangulo que hereda de la clase TwoDimensionalShape
 * Contiene la altura y ancho 
 * 
 * @author arancha
 */
public class Rectangle  extends TwoDimensionalShape{

     /**
      * variable altura 
      */
     double length;  
     /**
      * * variable ancho
      */
     double width;   
    /**
     * Constructor por defecto vacio 
     */
    public Rectangle() {
    }

    
    /**
     * Constructor Rectangulo que pide como parametro la altura y ancho  
     */
    public Rectangle(double length, double width)
    {
        // Asignamos los valores del parametro a al afigura rectangulo 
        this.length = length;
        this.width = width;
    }
     
     
    /**
     * Constructor que hace un clon de rectangulo
     * Pide como parametro otro rectangulo 
     */
    public Rectangle(Rectangle rect)
    {
        this.length = rect.length;
        this.width = rect.width;
    }

    
    /**
     * Metodo para obtener el valor altura
     */
    public double getLength() 
    {
        //Nos devuelve el valor de la altura
        return length;
    }

    
    
    /**
     * Metodo para cambiar el valor de altura
     */
    public void setHeight(double length) 
    {
        //Asignamos el valor del parametro a altura
        this.length = length;
    }
    
    

    /**
     * Metodo para obtener el valor del ancho
     */
    public double getWidth() 
    {
        //Nos devuelve el valor del ancho 
        return width;
    }

    
    /**
     * Metodo para cambiar el valor de ancho
     */
    public void setWidth(double width) 
    {
        this.width = width;
    }
    

    
    /**
     * Metodo heredado de TwoDimensionalShape.
     */
    @Override
    public void print(PrintWriter out) 
    {
       
        super.print(out);
        out.write("\n Area = " + this.getArea()+ "\r\n");
        out.write("\n Perimeter = " + this.getPerimeter()+ "\r\n");
        out.write("\n Is Square? = " + this.isSquare()+ "\r\n");;
        out.write("\n\n\n");
        
    }

    
    
    /**
     * Metodo heredado de TwoDimensionalShape.
     */
    @Override
    public double getArea() 
    {
        return this.length * this.width;
    }
    
    

    /**
     * Metodo heredado de TwoDimensionalShape.
     */
    @Override
    public double getPerimeter() 
    {
        return 2 * (this.length + this.width);
    }
    
    
    
    /**
     * Metodo heredado de TwoDimensionalShape. and width.
     */
    public boolean  isSquare()
    {
        if(this.length == this.width)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
     
}