/**
 * The class rapresents a rectangle;
 * it is defined by two opposite vertices, in this case the top-left and the bottom-right
 * 
 * @author Amedeo Di Gaetano
 * @version 1.0, 23 Feb 2016
 * @since 1.0
 */
public class Rectangle extends Polygon {

    /**
     * The method just calls the upper constructor
     * 
     * @param tl
     * @param br 
     */
    public Rectangle(Point tl, Point br) {
        super(4, Rectangle.getVertices(tl, br));
        
    }
    
    /**
     * The method compute the coordinates of all the four vertices given two of them that are opposites;
     * it is static and private because it is used in the constructor only
     * 
     * @param tl the top-left vertex
     * @param br the bottom-right vertex
     * @return an array containing all the vertices
     */
    private static Point[] getVertices(Point tl, Point br){
        Point[] points = new Point[4];
        
        points[0] = tl;
        points[1] = new Point(br.getX(), tl.getY());
        points[2] = br;
        points[3] = new Point(tl.getX(), br.getY());
        
        return points;
    }
}
