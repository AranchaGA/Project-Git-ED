package inheritance;

import java.io.PrintWriter;

/**
 * Clase cilindro que hereda de la clase ThreeDimensionalShape
 * Contiene el radio y la altura
 * 
 * @author arancha
 */
public class Cylinder extends ThreeDimensionalShape{
    /**
     * variables radio y altura 
     */ 
    double radius , height;

    /**
     *  Constructor por defecto vacio 
     */
    public Cylinder() {
    }

    
    /**
     * Constructor que toma como parametro el radio y la altura  
     */
    public Cylinder(double radius, double height) 
    {
        //Asignamos la altura y el radio dados como parametro a la figura
        this.radius = radius;
        this.height = height;
    }

    
   
    /**
     * Constructor que hace un clon de cilindro
     * Pide como parametro cilindro
     */
    public Cylinder(Cylinder cyl)
    {
        //Asignamos los valores del parametro a cilindro
        this.radius = cyl.radius;
        this.height = cyl.height;
    }

    
    /**
     * Metodo para obtener el valor de radio
     */
    public double getRadius() 
    {
        //Nos retorna el valor de radio
        return radius;
    }

    
    /**
     * Metodo para cambiar el radio por el del parametrot.
     */
    public void setRadius(double radius) 
    {
        //Asignamos el radio dado en el parametro a la figura
        this.radius = radius;
    }

    
    /**
     * Metodo para obtener la altura.
     */
    public double getHeight() 
    {
        //Nos devuelve la altura
        return height;
    }

    
    /**
     *  Metodo para dar valor a la altura
     */
    public void setHeight(double height) 
    {
        this.height = height;
    }

    
    
    /**
     * Metodo heredado de ThreeDimensionalShape
     */
    @Override
    public double getSurfaceArea() 
    {
        return 2 * Math.PI * this.radius * this.height;
    }

    
    
    
    /**
     * Metodo heredado de ThreeDimensionalShape
     */
    @Override
    public double getVolume() 
    {
        return  Math.PI * this.radius * this.radius * this.height;
    }

    
    
    
    /**
     * Metodo heredado de ThreeDimensionalShape.
     */
    @Override
    public void print(PrintWriter out) 
    {
        
        super.print(out);
        out.write("\n Radius = " + this.getRadius()+ "\r\n");
        out.write("\n Height = " + this.getHeight()+ "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea()+ "\r\n");;
        out.write("\n Volume = " + this.getVolume()+ "\r\n");
        out.write("\n\n\n");
        
    }
    
    
}
