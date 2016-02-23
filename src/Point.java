/**
 * The class rapresents a point;
 * It is defined by its two coordinates: x and y
 * 
 * @author Amedeo Di Gaetano
 * @version 1.0, 23 Feb 2016
 * @since 1.0
 */
public class Point {

    /**
     * The point's x coordinate
     */
    private final double x;

    /**
     * The point's y coordinate
     */
    private final double y;

    /**
     * The constructor initialize the values of the attributes
     * 
     * @param x the point's x coordinate
     * @param y the point's y coordinate
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * The method computes the distance the object has to another point, given as parameter
     * 
     * @param p the point from which to calculate the distance
     * @return the distance to the other point
     */
    public double distanceTo(Point p) {
        return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
    }

    /**
     * The method returns the x coordinate of the point
     * 
     * @return the x coordinate of the point
     */
    public double getX() {
        return x;
    }

    /**
     * The method returns the y coordinate of the point
     * 
     * @return the y coordinate of the point
     */
    public double getY() {
        return y;
    }
}
