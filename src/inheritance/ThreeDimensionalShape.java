
package inheritance;

/**
 * Obtenemos informacion sobre getSurfaceArea y volumenes de fihuras 
 * 
 * Clase abstracta con herencia de Shape
 * 
 * @author arancha
 */
public abstract class ThreeDimensionalShape extends Shape{
 
    /**
     * Con este metodo obtenemos el area sur de la figura
     * Sera sobre escrito en las clases donde lo usemos
     * retornando la parte sur de la figura donde apliquemos el metodo 
     */
    public double getSurfaceArea()
    {
        //return devolvera el lado sur de la figura en la que usemos el metodo
        return 0 ;
    }
    
    
    /**
     * getVolumen metodo que usamos para obtener el volumen de las figuras geometricas
     */
    public double getVolume()
    {
        //return devolvera el volumen sobre la figura en la que usemos el metodo
        return 0;
    }
    
}
