import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;
        double ave = (double)(a+b)/2;
        System.out.print(sum + " " + ave);
    }
}