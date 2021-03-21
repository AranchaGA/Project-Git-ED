
package inheritance;

import java.io.PrintWriter;

/**
 * Clase cubo que hereda de la clase ThreeDimensionalShape
 * Contiene la altura
 * 
 * @author arancha 
 */
public class Cube extends ThreeDimensionalShape{
    /**
     * variable altura
     */
     double length;

     /**
      * Constructor Cubo por defecto vacio 
      */
    public Cube() {
    }

    
    /**
     * Constructor que toma como parametro la altura 
     */
    public Cube(double length) 
    {
        //Asignamos la altura a cubo 
        this.length = length;
    }
     
     
    /**
     * Constructor que hace un clon de cubo
     * Pide como parametro un cubo  
     */
    public Cube(Cube cube)
    {
         this.length = cube.length;
    }

   
    /**
     *  Metodo para obtener el valor de la altura
     */
    public double getLength() 
    {
        //Nos retorna el valor de altura
        return length;
    }

    
    /**
     * Metodo para cambiar la altura por la dada en el parametro 
     */
    public void setSideLength(double length) 
    {
        //Asignamos la altura dada en el parametro a la figura cubo
        this.length = length;
    }

    
    
    /**
     *  Metodo heredado de ThreeDimensionalShape 
     */
    @Override
    public double getSurfaceArea() 
    {
        return 6 * this.length * this.length;
    }

    
    
    /**
     *  Metodo heredado de ThreeDimensionalShape 
     */
    @Override
    public double getVolume() 
    {
        return this.length * this.length * this.length;
    }

    
    /**
     *  Metodo heredado de ThreeDimensionalShape 
     */
    @Override
    public void print(PrintWriter out) 
    {
        
        super.print(out);
        out.write("\n Side  Length = " + this.getLength()+ "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea()+ "\r\n");
        out.write("\n Volume = " + this.getVolume()+ "\r\n");;
        out.write("\n\n\n");
        
    }
     
     
}
