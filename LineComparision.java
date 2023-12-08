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
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        double length = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        System.out.println("The length of the line is: " + length);
    }
    }
