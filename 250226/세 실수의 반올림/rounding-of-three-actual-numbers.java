import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double c = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.printf("%.3f\n%.3f\n%.3f", a, b, c);
    }
}