/**
 * The class rapresents a regular hexagon;
 * It has no charateristics, but it's easier to istantiate this way
 * 
 * @author Amedeo Di Gaetano
 * @version 1.1, 29 Feb 2016
 * @since 1.0
 */
public class Hexagon extends RegularPolygon {

    /**
     * The method just calls the upper constructor
     * 
     * @param center the center of the circumscribed circumference
     * @param radius the radius of the circumscribed circumference
     */
    public Hexagon(Point center, double radius) {
        super(6, center, radius);
    }
    
    /**
     * The method just calls the upper constructor
     * 
     * @param center the center of the circumscribed circumference
     * @param radius the radius of the circumscribed circumference
     * @param degrees the angle of inclination (in degrees)
     * @since version 1.1
     */
    public Hexagon(Point center, double radius, double degrees) {
        super(6, center, radius, degrees);
    }
}
