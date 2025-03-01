import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc= new Scanner(System.in);

        String str = sc.nextLine();
        String[] parts = str.split("-");
        System.println(parts[0], "." + parts[1] + "." +parts[2]);
    }
}