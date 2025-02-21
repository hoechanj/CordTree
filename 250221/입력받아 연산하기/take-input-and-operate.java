import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int plus = a+87;
        int remain = b%10;

        System.out.println(plus + "\n" + remain);
    }
}