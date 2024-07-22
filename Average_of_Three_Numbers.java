import java.util.*;
public class Average_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter the third number: ");
        double c = sc.nextDouble();
        double average = (a+b+c)/3;
        System.err.println("The average value is :"+ average );
        sc.close();
    }
}
