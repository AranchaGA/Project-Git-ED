

package inheritance;
import java.io.PrintWriter;

/**
 * Clase Cono que hereda de la clase ThreeDimensionalShape
 * Contiene el radio y la altura
 * 
 * @author arancha
 */
public class Cone extends ThreeDimensionalShape{
    /**
     * variable radio 
     */
    double radius;
    /**
     * variable altura 
     */
    double height;

    /**
     * Constructor por defecto vacio 
     */
    public Cone() 
    {
    }

    
    /**
     * Constructor que toma como parametro el radio y la altura 
     */
    public Cone(double radius, double height) 
    {
        //Asignamos la altura y el radio dados como parametro a la figura
        this.radius = radius;
        this.height = height;
    }
     
    
    /**
     * Constructor que hace un clon de cono
     * Pide como parametro un cono 
     */ 
    public Cone(Cone con)
    {
         this.radius = con.radius;
         this.height = con.height;
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
     * Metodo para cambiar el radio por el del parametro
     */
    public void setRadius(double radius) 
    {
        //Asignamos el radio dado en el parametro a la figura
        this.radius = radius;
    }

    
    
    /**
     * Metodo para obtener la altura 
     */
    public double getHeight() 
    {
        // Nos devuelve la altura
        return height;
    }

    
    
    /**
     * Metodo para dar valor a la altura
     */
    public void setHeight(double height) 
    {
        //Asignamos el valor de la altura dada en el parametro 
        this.height = height;
    }

    
    
    /**
     * Metodo heredado de ThreeDimensionalShape 
     */
    @Override
    public double getSurfaceArea() 
    {

        return (Math.PI * (this.radius * this.radius) * this.height) / 3;
    }

    
    /**
     * Metodo heredado de ThreeDimensionalShape 
     */
    @Override
    public double getVolume() 
    {

        return (Math.PI * (this.radius)) * (this.radius  + Math.sqrt( ( this.radius * this.radius) + (this.height * this.height)));
        
    }

    
    
    /**
     * Metodo heredado de ThreeDimensionalShape 
     */
    @Override
    public void print(PrintWriter out) 
    {
        super.print(out);
        out.write("\n Radius  = " + this.getRadius()+ "\r\n");
        out.write("\n Height  = " + this.getHeight()+ "\r\n");
        out.write("\n  Surface  Area = " + this.getVolume() + "\r\n");
        out.write("\n  Volume  = " + this.getSurfaceArea()+ "\r\n");
        out.write("\n\n\n");
    }
     
}