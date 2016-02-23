public class Rectangle extends Polygon {

    public Rectangle(Point tl, Point br) {
        super(4, Rectangle.getVertices(tl, br));
        
    }
    
    private static Point[] getVertices(Point tl, Point br){
        Point[] points = new Point[4];
        
        points[0] = tl;
        points[1] = new Point(br.getX(), tl.getY());
        points[2] = br;
        points[3] = new Point(tl.getX(), br.getY());
        
        return points;
    }
}
