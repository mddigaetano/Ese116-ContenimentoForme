/*
 * Copyright (C) 2016 Amedeo Di Gaetano
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 *
 * @author Amedeo Di Gaetano
 */
public class First {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Square square = new Square(new Point(8,8), 5);
        Point points[];
        Circle circle = new Circle(new Point(8,8), 4);
        
        points = square.getVertices();
        for(int i=0; i<square.N_SIDES; i++){
           System.out.println((i+1)+"° vertex: "+ (points[i].getX()) +"  "+ (points[i].getY()) );
        }
        
        System.out.println("The square is inside the circle: "+ square.bb.isContained(circle.getBB()));
    }
    
}
