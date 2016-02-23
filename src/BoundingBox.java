/**
 * The class rapresents a Bounding Box, that is the smallest rectangle that contains a shape;
 * in this project the sides of the Bounding Box will be parallel to the axes
 * 
 * @author Amedeo Di Gaetano
 * @version 1.0, 23 Feb 2016
 * @since 1.0
 */
public class BoundingBox {

    /**
     * The Top-Left point of the rectangle
     */
    private final Point topLeft;

    /**
     * The Bottom-Right point of the rectangle
     */
    private final Point bottomRight;

    /**
     * The constructor initialize the values of the attributes
     * 
     * @param tl the top-left vertex
     * @param br the bottom-right vertex
     */
    public BoundingBox(Point tl, Point br) {
        topLeft = tl;
        bottomRight = br;
    }

    /**
     * The method check if the object is "inside" another Bounding Box
     * 
     * @param bb the Bounding Box to check
     * @return the result of the evaluation
     */
    public boolean isContained(BoundingBox bb) {
        return (this.topLeft.getX() >= bb.topLeft.getX() && this.topLeft.getY() >= bb.topLeft.getY() && this.bottomRight.getX() <= bb.bottomRight.getX() && this.bottomRight.getY() <= bb.bottomRight.getY());
    }
}
