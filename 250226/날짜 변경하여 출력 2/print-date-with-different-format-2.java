import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc= new Scanner(System.in);
        int yyyy,mm,dd;
        yyyy = sc.nextInt();
        mm = sc.nextInt();
        dd = sc.nextInt();
        System.out.print(mm +"-"+dd+"-"+yyyy);
    }
}