/**
 * The class rapresents a regular polygon;
 * it is defined by the number of sides, the center and the radius of the circumscribed circumference
 * 
 * @author Amedeo Di Gaetano
 * @version 1.0, 23 Feb 2016
 * @since 1.0
 */
public class RegularPolygon extends Polygon {

    /**
     * The center of the circumscribed circumference
     */
    protected final Point center;

    /**
     * The radius of the circumscribed circumference
     */
    protected final double radius;
    
    /**
     * The lenght of a side
     */
    protected final double side;

    /**
     * The method istantiates a Regular Polygon.
     * First it calls the upper constructor.
     * Then it initialize the other attributes
     * 
     * @param nSides
     * @param center
     * @param radius 
     */
    public RegularPolygon(int nSides, Point center, double radius) {
        super(nSides, RegularPolygon.getVertices(nSides, center, radius));
        this.center = center;
        this.radius = radius;
        this.side = this.getPerimeter() / this.N_SIDES;                         //TODO change this and override perimeter
    }
    
    /**
     * The method returns an array containing all the vertices;
     * they're computed with a formula (it's possible because they're regular polygons),
     * assuming that the starting point is 0°
     * 
     * @param nSides the number of sides
     * @param center the center of the circumscribed circumference
     * @param radius the radius of the circumscribed circumference
     * @return an array containing all the vertices
     */
    private static final Point[] getVertices(int nSides, Point center, double radius){
        Point[] points = new Point[nSides];
        
        for (int i = 0; i < nSides; i++) {
            points[i] = new Point(center.getX() + radius * Math.cos(2 * Math.PI * i / nSides), center.getY() + radius * Math.sin(2 * Math.PI * i / nSides));
        }
        
        return points;
    }
}
