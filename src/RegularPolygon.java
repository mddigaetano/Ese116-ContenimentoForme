public class RegularPolygon extends Polygon {

    protected final Point center;

    protected final double radius;
    
    protected final double side;

    public RegularPolygon(int nSides, Point center, double radius) {
        super(nSides, RegularPolygon.getVertices(nSides, center, radius));
        this.center = center;
        this.radius = radius;
        this.side = this.getPerimeter() / this.N_SIDES;
    }
    
    private static final Point[] getVertices(int nSides, Point center, double radius){
        Point[] points = new Point[nSides];
        
        for (int i = 0; i < nSides; i++) {
            points[i] = new Point(center.getX() + radius * Math.cos(2 * Math.PI * i / nSides), center.getY() + radius * Math.sin(2 * Math.PI * i / nSides));
        }
        
        return points;
    }
}
