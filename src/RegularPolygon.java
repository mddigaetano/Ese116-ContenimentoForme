/**
 * The class rapresents a regular polygon;
 * it is defined by the number of sides, the center and the radius of the circumscribed circumference
 * 
 * @author Amedeo Di Gaetano
 * @version 1.1, 26 Feb 2016
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
     * Then it initialize the other attributes.
     * This constructor creates the polygon from its radius lenght.
     * 
     * @param nSides the number of sides
     * @param center the center of the circumscribed circumference
     * @param radius the radius of the circumscribed circumference
     */
    public RegularPolygon(int nSides, Point center, double radius) {
        super(nSides, RegularPolygon.getVertices(nSides, center, radius));
        this.center = center;
        this.radius = radius;
        this.side = 2 * radius * Math.asin(Math.toRadians(180/this.N_SIDES));
    }
    
    /**
     * The method istantiates a Regular Polygon.
     * First it calls the upper constructor.
     * Then it initialize the other attributes.
     * This constructor creates the polygon from its radius lenght.
     * 
     * @param nSides the number of sides
     * @param center the center of the circumscribed circumference
     * @param radius the radius of the circumscribed circumference
     * @param degrees
     */
    public RegularPolygon(int nSides, Point center, double radius, double degrees) {
        super(nSides, RegularPolygon.getVertices(nSides, center, radius, degrees));
        this.center = center;
        this.radius = radius;
        this.side = 2 * radius * Math.asin(Math.toRadians(180/this.N_SIDES));
    }
    
    /**
     * The method istantiates a Regular Polygon.
     * First it calls the upper constructor.
     * Then it initialize the other attributes.
     * This constructor creates the polygon from its side lenght.
     * 
     * @param nSides the number of sides
     * @param center the center of the circumscribed circumference
     * @param side the lenght of a side
     * @since version 1.1
     */
    public RegularPolygon(int nSides, double side, Point center){
        super(nSides, RegularPolygon.getVertices(nSides, center, RegularPolygon.getRadius(nSides, side)));
        this.center = center;
        this.side = side;
        this.radius = RegularPolygon.getRadius(nSides, side);
    }
    
    /**
     * The method istantiates a Regular Polygon.
     * First it calls the upper constructor.
     * Then it initialize the other attributes.
     * This constructor creates the polygon from its side lenght.
     * 
     * @param nSides the number of sides
     * @param center the center of the circumscribed circumference
     * @param side the lenght of a side
     * @param degrees
     * @since version 1.1
     */
    public RegularPolygon(int nSides, double side, Point center, double degrees){
        super(nSides, RegularPolygon.getVertices(nSides, center, RegularPolygon.getRadius(nSides, side), degrees));
        this.center = center;
        this.side = side;
        this.radius = RegularPolygon.getRadius(nSides, side);
    }
    
    /**
     * The method returns an array containing all the vertices;
     * they're computed with a formula (it's possible because they're regular polygons)
     * 
     * @param nSides the number of sides
     * @param center the center of the circumscribed circumference
     * @param radius the radius of the circumscribed circumference
     * @return an array containing all the vertices
     */
    private static final Point[] getVertices(int nSides, Point center, double radius){
        Point[] points = new Point[nSides];
        double degrees;
        if(nSides % 2 == 0)
            degrees = 180/nSides;
        else
            degrees = -90;
        
        for (int i = 0; i < nSides; i++) {
            points[i] = new Point(center.getX() + radius * Math.cos((2 * Math.PI * i) / nSides + Math.PI - Math.toRadians(degrees)), center.getY() + radius * Math.sin((2 * Math.PI * i) / nSides + Math.PI - Math.toRadians(degrees)));
        }
        
        return points;
    }
    
    /**
     * The method returns an array containing all the vertices;
     * they're computed with a formula (it's possible because they're regular polygons),
     * assuming that the starting point is degrees
     * 
     * @param nSides the number of sides
     * @param center the center of the circumscribed circumference
     * @param radius the radius of the circumscribed circumference
     * @param degrees the angle of inclination (in degrees)
     * @return an array containing all the vertices
     * @since version 1.1
     */
    private static final Point[] getVertices(int nSides, Point center, double radius, double degrees){
        Point[] points = new Point[nSides];
        
        for (int i = 0; i < nSides; i++) {
            points[i] = new Point(center.getX() + radius * Math.cos((2 * Math.PI * i) / nSides + Math.toRadians(degrees)), center.getY() + radius * Math.sin((2 * Math.PI * i) / nSides + Math.toRadians(degrees)));
        }
        
        return points;
    }
    
    /**
     * The method return the lenght of the radius of the circumscribed circumference
     * given the number and lenght of the sides.
     * 
     * @param nSides the number of sides
     * @param side the lenght of a side
     * @return the lenght of the radius
     * @since version 1.1
     */
    private static final double getRadius(int nSides, double side){
        return side/(2 * Math.sin(Math.toRadians(180/nSides)));        
    }
    
    /**
     * The method compute the perimeter of a n-sided polygon
     * 
     * @return the perimeter of the regular polygon
     * @since version 1.1
     */
    @Override
    public final double getPerimeter(){
        return this.side * this.N_SIDES;
    }
}
