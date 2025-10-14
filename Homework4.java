import java.util.Scanner;
public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 수를 입력하세요:");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = gcd(a, b);
        System.out.println("결과값:" + result);
    }


    static int gcd(int m, int n) {
        if (n ==0)
            return m;
        return gcd(n, m % n);


    }
}