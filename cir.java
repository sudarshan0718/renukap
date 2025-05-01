package renukap;

import java.util.Scanner;

public class cir{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the circle radius: ");
        double radius= s.nextDouble();
        double area = Math.PI*radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.println("the area of circle is "+ area);
        System.out.println("the area of circumference is "+ circumference);
        S.close();
    }
}