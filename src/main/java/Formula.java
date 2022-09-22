import java.util.Scanner;

public class Formula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float g = 9.8f;
        int v = sc.nextInt();
        int p = sc.nextInt();
        System.out.println("Результат вычислений: " + (p*g*v) + " H");
    }
}
