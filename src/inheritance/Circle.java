
package inheritance;

import java.io.PrintWriter;

/**
 * Clase Circuloo que hereda de la clase TwoDimensionalShape
 * Contiene radio y centro
 * 
 * @author aranc
 */
public class Circle  extends TwoDimensionalShape{
    /**
     *  variable radio
     */
    private double  radius ;
    /**
     *  variable centro
     */
    private Point center;

    /**
     * Constructor Circulo que pide como parametro centro y radio 
     */
    public Circle( Point center,double radius) 
    {
        this.radius = radius;
        this.center = center;
    }
    
    
    /**
     * Constructor que hace un clon de circulo
     * Pide como parametro otro circulo
     */
    public Circle(Circle circle)
    {
        this.radius = circle.radius;
        this.center = circle.center;
    }

    
    /**
     * Metodo para obtener el valor de radio
     */
    public double getRadius() 
    {
        // Nos devuelve el valor de radio
        return radius;
    }

    
    
    /**
     * Metodo para cambiar el valor de radio
     */
    public void setRadius(double radius) 
    {
        //Asignamos el valor del parametro a radio
        this.radius = radius;
    }

    
    /**
     * Metodo para obtener el valor del centro
     */
    public Point getCenter() 
    {
        //Nos devuelve el valor del centro
        return center;
    }

    
    
    /**
     * Metodo para cambiar el valor del centro
     */
    public void setCenter(Point center) 
    {
        //Asignamos el valor del parametro a centro
        this.center = center;
    }

    
    
    /**
     * Metodo heredado de TwoDimensionalShape 
     */
    @Override
    public void print(PrintWriter out) 
    {
        super.print(out);
        out.write("\n Cirle: "+ "\r\n");
        out.print("\n Center = " + this.center.getX() + " " + this.center.getY()+ "\r\n");
        out.write("\n Area = " + this.getArea()+ "\r\n");;
        out.write("\n Perimeter = " + this.getPerimeter()+ "\r\n");
        out.write("\n Radious = " + this.getRadius()+ "\r\n");;
        out.write("\n\n\n");
    }

    
    /**
     * Metodo heredado de TwoDimensionalShape .
     */
    @Override
    public double getArea() 
    {
        return Math.PI * this.radius * this.radius ;
    }

    
    /**
     * Metodo heredado de TwoDimensionalShape 
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    
    
    
    
}
