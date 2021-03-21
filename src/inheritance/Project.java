/*
 ** Copyright (C) 2014 Aparna Mahadev
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301, USA
 */
package inheritance;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Ejecucion del projecto 
 * 
 * @author arancha
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Intentamos a continuacion el contenido de los corchetes y
         * capturamos en caso de error con una excepcion mas abajo
         */
        try {
            //Generamos el documento txt al ponerlo como argumento cuando ejecutamos projecto
            PrintWriter out = new PrintWriter(new FileWriter(args[0]));
            //Lista de array tipo Shape con 30 posiciones
            ArrayList<Shape> myShapes = new ArrayList<Shape>(30);
            /**
             * Creamos pt1 tipo Point 
             * Asignamos como parametros de X e Y los valores introducicdos 
             */
            Point pt1 = new Point(1, 1);
            /**
             * Creamos pt2 tipo Point 
             * Asignamos como parametros de X e Y los valores introducicdos 
             */
            Point pt2 = new Point(5, 8);
            /**
             * Variable pt3 tipo Point
             */
            Point pt3;
            /**
             * Creamos pt4 tipo Point 
             * Con el constructor por defecto, vacio 
             */
            Point pt4 = new Point();

            /**
             * Creamos un triangulo dandole como parametros pt1 y pt2 como X e Y
             * Y otro nuevo objeto tipo point con X e Y
             */
            Triangle triangle_1 = new Triangle(pt1, pt2, new Point(10, 4));
            /**
             * Asignamos el valor de X para pt1
             */
            pt1.setX(2);
            /**
             * Asignamos el valor de Y para pt1
             */
            pt1.setY(2);
            /**
             * Creamos pt2 con puntos de X e Y dados en los parametros
             */
            pt2 = new Point(2, 8);
            /**
             * Creamos pt3 con puntos de X e Y dados en los parametros
             */
            pt3 = new Point(12, 2);
            /**
             * Creamos un triangulo dandole los 3 lados ya creados 
             */
            Triangle triangle_2 = new Triangle(pt1, pt2, pt3);
            /**
             * Llamamos a la copia de triangulo2 en el contrsuctor 
             */
            Triangle triangle_3 = new Triangle(triangle_2);
            /**
             * Asignamos a Point2 un nuevo punto con parametros dados 
             */
            triangle_2.setPoint2(new Point(5, 8));
            /**
             * Añadimos a la lista los triangulos creados 1, 2 y 3
             */
            myShapes.add(triangle_1);
            myShapes.add(triangle_2);
            myShapes.add(triangle_3);

            /**
             * variables circulo
             */
            Circle circle_1, circle_2, circle_3;
            /**
             * Creamos circulo1 con ejes X e Y de pt1 y radio 4
             */
            circle_1 = new Circle(pt1, 4);
            /**
             * Creamos circulo2 con ejes X e Y de pt2 y radio 12
             */
            circle_2 = new Circle(pt2, 12);
            /**
             * Llamamos al contructor que copia los circulos
             * y en circulo3 la damos como parametro el circulo2
             */
            circle_3 = new Circle(circle_2);
            /**
             * Asignamos el radio a circulo 3
             */
            circle_3.setRadius(5);
            /**
             * Añadimos a nuestra lista los circulos 1, 2 y 3 
             */
            myShapes.add(circle_1);
            myShapes.add(circle_2);
            myShapes.add(circle_3);

            /**
             * Variables rectangulo r1, r2 y r3
             */
            Rectangle r1, r2, r3;
            /**
             * Creamos rectamgulo r1 con altura y ancho dados en parametro 
             */
            r1 = new Rectangle(10, 3);
            /**
             * Creamos rectamgulo r2 con altura y ancho dados en parametro 
             */
            r2 = new Rectangle(20, 4);
            /**
             * Asignamos el ancho a rectangulo1
             */
            r1.setWidth(3);
            /**
             * Asignamos la altura  a rectangulo2
             */
            r2.setHeight(10);
            /**
             * Llamamos y creamos un clon de rectangulo en rectangulo3 con rectangulo2
             */
            r3 = new Rectangle(r2);
            /***
             * Asignamos la altura de rectangulo3 
             */
            r3.setHeight(100);
            /**
             * Añadimos a nuestra lista las figuras rectangulos r1, r2 y r3
             */
            myShapes.add(r1);
            myShapes.add(r2);
            myShapes.add(r3);

            /**
             * Variables tipo esfera
             */
            Sphere sphere_1, sphere_2, sphere_3;
            /**
             * Creamos esfera 1 con radio 4
             */
            sphere_1 = new Sphere(4);
            /**
             * Creamos esfera 3 con radio 12
             */
            sphere_2 = new Sphere(12);
            /**
             * Invocamos al contructor que copia y le damos como parametro espera1
             */
            sphere_3 = new Sphere(sphere_1);
            /**
             * Asignamos el radio de esfera3 a 5
             */
            sphere_3.setRadius(5);
            /**
             * Añadimos a nuestra lista las esferas creadas
             */
            myShapes.add(sphere_1);
            myShapes.add(sphere_2);
            myShapes.add(sphere_3);

            /**
             * Variables cubo
             */
            Cube cube_1, cube_2, cube_3;
            /**
             * Creamos cubo1 con altura 4
             */
            cube_1 = new Cube(4);
            /**
             * Creamos cubo2 con altura 12
             */
            cube_2 = new Cube(12);
            /**
             * Invocamos la copia de cubo asignando en cubo3 copia de cubo1
             */
            cube_3 = new Cube(cube_1);
            /**
             * Asignamos la altura a  cubo3
             */
            cube_3.setSideLength(5);
            /**
             * Añadimos a nuestra lista de figuras los cubos creados
             */
            myShapes.add(cube_1);
            myShapes.add(cube_2);
            myShapes.add(cube_3);

            /**
             * Variables cilindro
             */
            Cylinder cy1, cy2, cy3;
            /**
             * Creamos cilindro1 con radio y altura
             */
            cy1 = new Cylinder(4, 10);
            /**
             * Creamos cilindro2 con radio y altura
             */
            cy2 = new Cylinder(7, 12);
            /**
             * Invocamos a copias de cilindro y le damos como parametro cilindro2 
             */
            cy3 = new Cylinder(cy2);
            /**
             * Asignamos la altura de cilindro3
             */
            cy3.setHeight(15);
            /**
             * Asignamos el radio de cilindro3 
             */
            cy3.setRadius(10);
            /**
             * Añadimos a nuestra lista de figuras los cilindros creados 
             */
            myShapes.add(cy1);
            myShapes.add(cy2);
            myShapes.add(cy3);

            /**
             * Variables cono 
             */
            Cone cone_1, cone_2, cone_3;
            /**
             * Creamos cono1 con radio y altura dados en parametro
             */
            cone_1 = new Cone(4, 10);
            /**
             * Creamos cono2 con radio y altura dados en parametro
             */
            cone_2 = new Cone(7, 12);
            /**
             * Llamamos al clonador de conos y 
             * asiganmos a  cono3 como parametro el cono1
             */
            cone_3 = new Cone(cone_1);
            /**
             * Asiganamos la altura a cono 3
             */
            cone_3.setHeight(15);
            /**
             * Asignamos el radio a cono3
             */
            cone_3.setRadius(10);
            /**
             * Añadimos a nuestra lista de figuras los conos creados
             */
            myShapes.add(cone_1);
            myShapes.add(cone_2);
            myShapes.add(cone_3);

            /**
             * Con este for sacamos por pantalla el contenido de nuestra lista 
             */
            for (Shape s : myShapes) { 
                //mostramos al figura, el nombre de la clase a la que pertenecen
                // y su nombre
                out.println(s.getClass().getName());
                // generamos el archibo txt
                s.print(out);
                out.println();
            }
            //cerramos el print
            out.close();
        } // Fin del try
        /**
         * Capturamos las posibles excepciones sacandolas por pantalla
         */
        catch (Exception e) {
            //sacamos el mensaje de la excepcion 
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.exit(0);
        }  //Final de la excepcion
    } // Final del main
}  // Final de proyecto
