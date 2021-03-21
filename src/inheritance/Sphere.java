
package inheritance;
import java.io.PrintWriter;

/**
 * Clase Esfera que hereda de la clase ThreeDimensionalShape
 * Contiene el radio
 * 
 * @author arancha
 */
public class Sphere extends ThreeDimensionalShape{
    /**
     * variable radio
     */
    double radius ;

    /**
     * Constructor por defecto vacio 
     */
    public Sphere() {
    }
    
    
    /**
     * Contructor que define el radio 
     */
    public Sphere(double radius) 
    {
        //Asignamos el radio dado en el parametro a la figura 
        this.radius = radius;
    }
    
    
    /**
     * Constructor que hace un clon de esfera
     * Pide como parametra esfera  
     */
    public Sphere(Sphere sp)
    {
        this.radius = sp.radius;
    }

    
     /**
     * Metodo para obtener el valor de radio
     */
    public double getRadius() 
    {
        // //Nos retorna el valor de radio
        return radius;
    }

    
    
    /**
     * Metodo para cambiar el radio por el del parametro
     */
    public void setRadius(double radius) 
    {
        //Asignamos el radio dado en el parametro a la figura
        this.radius = radius;
    }

    
    /**
     * Metodo heredado de ThreeDimensionalShape.
     */
    @Override
    public double getSurfaceArea() 
    {
        
        return 4 * Math.PI * this.radius * this.radius;
        
    }

    
    /**
     * Metodo heredado de ThreeDimensionalShape
     */
    @Override
    public double getVolume() 
    {
        return (4 * Math.PI * this.radius * this.radius * this.radius ) / 3;
    }

    
    /**
     * Metodo heredado de ThreeDimensionalShape.
     */
    @Override
    public void print(PrintWriter out)
    {
        
        super.print(out);
        out.write("\n Radius = " + this.getRadius()+ "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea()+ "\r\n");
        out.write("\n Volume = " + this.getVolume()+ "\r\n");
        out.write("\n\n\n");
        
    }
   
    
}
