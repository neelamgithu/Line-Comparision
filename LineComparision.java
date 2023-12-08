import java.util.Scanner;

public class LineComparision {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();
        double firstLineDeltaX = firstLine_x2 - firstLine_x1;
        double firstLineDeltaY = firstLine_y2 - firstLine_y1;
        double firstLineLength = Math.sqrt(firstLineDeltaX * firstLineDeltaX + firstLineDeltaY * firstLineDeltaY);
        System.out.println("The length of the line is: " + firstLineLength);
        System.out.println("Enter second line details : ");
        System.out.print("Enter x1: ");
        double secondLine_x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double secondLine_y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double secondLine_x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double secondLine_y2 = sc.nextDouble();
        double secondLineDeltaX = secondLine_x2 - secondLine_x1;
        double secondLineDeltaY = secondLine_y2 - secondLine_y1;
        double secondLineLength = Math.sqrt(secondLineDeltaX * secondLineDeltaX + secondLineDeltaY * secondLineDeltaY);
       
        String firstLineLengthString = Double.toString(firstLineLength);
        String secondLineLengthString = Double.toString(secondLineLength);
        if(firstLineLengthString.compareTo(secondLineLengthString)==0) {
            System.out.println("Both lines have same length");
        }
        else if(firstLineLengthString.compareTo(secondLineLengthString)>0) {
            System.out.println("First line is greater than second line");
        }
        else {
            System.out.println("First line is smaller than second line");
        }
    }
    }
