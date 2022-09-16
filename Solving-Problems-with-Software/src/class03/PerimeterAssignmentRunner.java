package class03;

import edu.duke.*;

import java.io.File;

public class PerimeterAssignmentRunner {
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

    public double getLargestPerimeterMultipleFiles() {
        DirectoryResource dr = new DirectoryResource();
        double largestPerimeter = 0;
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            double perimeter = getPerimeter(s);
            if (perimeter > largestPerimeter) {
                largestPerimeter = perimeter;
                System.out.println("1");
            } else {
                System.out.println("2");
            }
        }
        return largestPerimeter;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        File temp = null;    // replace this code
        return temp.getName();
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

    public void testPerimeterMultipleFiles() {
        System.out.println(getLargestPerimeterMultipleFiles());
    }

//    public void testFileWithLargestPerimeter() {
//        DirectoryResource dr = new DirectoryResource();
//        double largestPerimeter = getLargestPerimeterMultipleFiles();
//        for (File f : dr.selectedFiles()) {
//            FileResource fr = new FileResource(f);
//            Shape s = new Shape(fr);
//            double perimeter = getPerimeter(s);
//            if (perimeter == largestPerimeter) {
//                System.out.println("File name = " + fr.get);
//            }
//        }
//    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle() {
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0, 0));
        triangle.addPoint(new Point(6, 0));
        triangle.addPoint(new Point(3, 6));
        for (Point p : triangle.getPoints()) {
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = " + peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main(String[] args) {
//        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
//        pr.testPerimeter();
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeterMultipleFiles();
    }
}
