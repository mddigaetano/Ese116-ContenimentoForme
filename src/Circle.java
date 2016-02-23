public class Circle implements Shape {

    private final Point center;

    private final double radius;
    
    private final BoundingBox bb;

    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
        bb = new BoundingBox(new Point(center.getX()-radius,center.getY()-radius), new Point(center.getX()+radius,center.getY()+radius));
    }
    
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    public BoundingBox getBB(){
        return bb;
    }
}
