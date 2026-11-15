import java.util.Scanner;

public class Exercici1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca numero");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if ((i % 2 == 0) && (i != 16) && (i % 3 != 0)) {
                System.out.println(i);
            }

        }
        sc.close();
    }

}
