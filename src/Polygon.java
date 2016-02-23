public class Polygon implements Shape {

    protected final int N_SIDES;

    protected final Point[] vertices;

    protected final BoundingBox bb;

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

    @Override
    public double getPerimeter() {
        double perimeter = 0;
        
        for(int i = 1; i < N_SIDES; i++){
            perimeter += vertices[i-1].distanceTo(vertices[i]);
        }
        perimeter += vertices[0].distanceTo(vertices[N_SIDES-1]);
        
        return perimeter;
    }
    
    public Point[] getVertices(){
        return vertices;
    }
}
