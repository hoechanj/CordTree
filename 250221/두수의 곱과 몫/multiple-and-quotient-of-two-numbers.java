import java.util.Scanner;
public class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int ab = a*b;
    int ab1 = a/b;

    System.out.println(a + " * " + b + " = " + ab);
    System.out.println(a + " / " + b + " = "  +ab1);
}

}