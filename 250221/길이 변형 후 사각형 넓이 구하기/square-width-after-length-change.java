import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 길이 입력
        int x = sc.nextInt();
        int y = sc.nextInt();
//새로
int new_x = x+8;
int new_y = y*3;

//넓이
int area = new_x*new_y;

        System.out.print(new_x + "\n" + new_y+ "\n" + area);  
    }
}