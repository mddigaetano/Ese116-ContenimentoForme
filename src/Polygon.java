/**
 * The class rapresents a general polygon;
 * it can be both irregular or regular;
 * don't use the last option because there's a proper class for it
 * 
 * @author Amedeo Di Gaetano
 * @version 1.0, 23 Feb 2016
 * @since 1.0
 */
public class Polygon implements Shape {

    /**
     * The number of sides of the polygon
     */
    protected final int N_SIDES;

    /**
     * An array containing all the vertices of the polygon as Point objects
     */
    protected final Point[] vertices;

    /**
     * The Bounding Box of the polygon
     */
    protected final BoundingBox bb;

    /**
     * The method initialize the number of sides and vertices values.
     * After that it find the minimum and the maximum coordinates and use them to istantiante the Bounding Box
     * 
     * @param nSides
     * @param vertices 
     */
    public Polygon(int nSides, Point[] vertices) {
        N_SIDES = nSides;
        this.vertices = vertices;
        
        double xMax = vertices[0].getX();
        double yMax = vertices[0].getY();
        double xMin = vertices[0].getX();
        double yMin = vertices[0].getY();
        for(int i=1; i<N_SIDES; i++){
            if(vertices[i].getX() > xMax)
                xMax = vertices[i].getX();
            else if (vertices[i].getX() < xMin)
                xMin = vertices[i].getX();
            
            if(vertices[i].getY() > yMax)
                yMax = vertices[i].getY();
            else if (vertices[i].getY() < yMin)
                yMin = vertices[i].getY();
        }
        
        bb = new BoundingBox(new Point(xMin,yMin), new Point(xMax,yMax));
    }

    /**
     * The method compute the lenght of the perimeter and returns it
     * 
     * @return the perimeter of the polygon
     */
    @Override
    public double getPerimeter() {
        double perimeter = 0;
        
        for(int i = 1; i < N_SIDES; i++){
            perimeter += vertices[i-1].distanceTo(vertices[i]);
        }
        perimeter += vertices[0].distanceTo(vertices[N_SIDES-1]);
        
        return perimeter;
    }
    
    /**
     * The method return an array containing all the vertices
     * 
     * @return an array containing all the vertices
     */
    public Point[] getVertices(){
        return vertices;
    }
}
