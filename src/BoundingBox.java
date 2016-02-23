public class BoundingBox {

    private final Point topLeft;

    private final Point bottomRight;

    public BoundingBox(Point tl, Point br) {
        topLeft = tl;
        bottomRight = br;
    }

    public boolean isContained(BoundingBox bb) {
        return (this.topLeft.getX() >= bb.topLeft.getX() && this.topLeft.getY() >= bb.topLeft.getY() && this.bottomRight.getX() <= bb.bottomRight.getX() && this.bottomRight.getY() <= bb.bottomRight.getY());
    }
}
