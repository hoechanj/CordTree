import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        int c= a*b;
        int d = b/a;

        if(a>b){
            System.out.println(c);
        }else{
            System.out.println(d);
        }
        
    }
}