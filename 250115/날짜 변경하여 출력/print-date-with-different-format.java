import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\.");
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        
        System.out.println(m + "-" + d + "-" + y);
        // Please write your code here.
    }
}