
package inheritance;

import java.io.PrintWriter;

/**
 * Clase triangulo que hereda de la clase TwoDimensionalShape
 * Contiene los puntos tipo punto 
 * 
 * @author arancha
 */
public class Triangle extends TwoDimensionalShape {

    //variables pint1, point2, point3 
    private Point point1, point2, point3;

    //Constructor por defecto vacio 
    public Triangle() {
    }

    
    /**
     * Constructor Triangulo que pide como parametro los puntos 1, 2 y 3 
     */
    public Triangle(Point pt1, Point py2, Point py3) 
    {
        //Asignamos los puntos dados en el contructor a triangulo
        this.point1 = pt1;
        this.point2 = py2;
        this.point3 = py3;
    }

    
    
    /**
     * Constructor que hace un clon de triangulo
     * Pide como parametro triangulo
     */
    public Triangle(Triangle t) 
    {
        this.point1 = t.point1;
        this.point2 = t.point2;
        this.point3 = t.point3;
    }

    
    
    /**
     * Metodo para obtener el valor de punto1
     */
    public Point getPoint1() 
    {
        //Nos devuelve el valor de punto 1
        return point1;
    }

    /**
     * Metodo para cambiar el valor de punto1
     */
    public void setPoint1(Point point1) 
    {
        //Asignamos el valor del parametro a punto 1
        this.point1 = point1;
    }

    
    /**
     * Metodo para obtener el valor de punto2
     */
    public Point getPoint2() 
    {
        //Devuelve el valor del parametro a punto 2
        return point2;
    }

    
    /**
     *  Metodo para cambiar el valor de punto2
     */
    public void setPoint2(Point point2) 
    {
        //Asignamos el valor del parametro a punto 2
        this.point2 = point2;
    }

    
    
    /**
     * Metodo para obtener el valor de punto3
     */
    public Point getPoint3()
    {
        //Devuelve el valor del parametro a punto 3
        return point3;
    }

    /**
     * Metodo para cambiar el valor de punto 3
     */
    public void setPoint3(Point point3) 
    {
        //Asignamos el valor del parametro a punto 3
        this.point3 = point3;
    }

    
    /**
     * Metodo heredado de TwoDimensionalShape.
     */
    @Override
    public void print(PrintWriter out) 
    {
        super.print(out);
        out.write("\n Traiangle Data => "+ "\r\n");
        out.write("\n Point 1 = " + this.point1.getX() + " , " + this.point1.getY()+ "\r\n");
        out.write("\n Point 2 = " + this.point2.getX() + " , " + this.point2.getY()+ "\r\n");
        out.write("\n Point 3 = " + this.point3.getX() + " , " + this.point3.getY()+ "\r\n");
        out.write("\n Area = " + this.getArea()+ "\r\n");   
        out.write("\n Perimeter = " + this.getPerimeter()+ "\r\n");
        out.write("\n\n\n");;
    }

    
    /**
     * Metodo heredado de TwoDimensionalShape.
     */
    @Override
    public double getArea() 
    {

        double area;
        double perimeter = this.getPerimeter()/2;

        double a = this.point1.getX() + this.point1.getY();
        double b = this.point2.getX() + this.point2.getY();
        double c = this.point3.getX() + this.point3.getY();

        area = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
        return area;
    }

    /**
     * Metodo heredado de TwoDimensionalShape.
     */
    @Override
    public double getPerimeter() 
    {

        double sum =  0 ;
        sum +=  this.point1.getX() + this.point1.getY();
        sum += this.point2.getX() + this.point2.getY();
        sum += this.point3.getX() + this.point3.getY();
        return sum;

      
        
    }
}