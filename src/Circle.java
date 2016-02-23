/**
 * The class rapresents a circle;
 * it is defined by its center point and radius
 * 
 * @author Amedeo Di Gaetano
 * @version 1.0, 23 Feb 2016
 * @since 1.0
 */
public class Circle implements Shape {

    /**
     * The center point of the circle
     */
    private final Point center;

    /**
     * The radius of the circle
     */
    private final double radius;
    
    /**
     * The bounding Box of the circle
     */
    private final BoundingBox bb;

    /**
     * The constructor initialize the attributes and create a Bounding Box
     * 
     * @param center the center point of the circle
     * @param radius the radius of the circle
     */
    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
        bb = new BoundingBox(new Point(center.getX()-radius,center.getY()-radius), new Point(center.getX()+radius,center.getY()+radius));
    }
    
    /**
     * The method compute the perimeter (circumference) of the circele
     * 
     * @return the perimeter (circumference) of the circle
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    /**
     * The method return its Bounding Box
     * 
     * @return the object Bounding Box
     */
    public BoundingBox getBB(){
        return bb;
    }
}
