import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 80-a;
        if(a >= 80){
System.out.println("pass");
        }else{
            System.out.println(b + " more score");
        }
    }
}