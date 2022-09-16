package class02;

import edu.duke.*;

public class PerimeterRunner {
    public double getPerimeter(Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints(Shape s) {
        int totalPoints = 0;
        for (Point currPt : s.getPoints()) {
            totalPoints++;
        }
        return totalPoints;
    }

    public double getAverageLength(Shape s) {
        int numOfPoints = getNumPoints(s);
        double perimeter = getPerimeter(s);
        return perimeter / numOfPoints;
    }

    public double getLargestSide(Shape s) {
        double largestSide = 0;
        Point prePt = s.getLastPoint();
        for (Point currPt : s.getPoints()) {
            double dist = currPt.distance(prePt);
            if (dist > largestSide) {
                largestSide = dist;
            }
        }
        return largestSide;
    }

    public double getLargestX(Shape s) {
        double largestX = 0;
        Point prePt = s.getLastPoint();
        for (Point currPt : s.getPoints()) {
            double currX = currPt.getX();
            if (currX > largestX) {
                largestX = currX;
            }
        }
        return largestX;
    }


    public void testPerimeter() {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);

        int numOfPoints = getNumPoints(s);
        System.out.println("Number of Points = " + numOfPoints);

        double averageLength = getAverageLength(s);
        System.out.println("Avg = " + averageLength);

        double largestSide = getLargestSide(s);
        System.out.println("Largest Side = " + largestSide);
        double largestX = getLargestX(s);
        System.out.println("Largest X = " + largestX);
    }

    public static void main(String[] args) {
        PerimeterRunner pr = new PerimeterRunner();
        pr.testPerimeter();
    }
}
