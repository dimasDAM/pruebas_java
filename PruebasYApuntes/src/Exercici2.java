import java.util.Scanner;

public class Exercici2 {
    public static void main(String[] args) {
        int n;
        int contador = -1;
        int positius = 0;
        float total = 0;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduzca número (0 para terminar): ");
            n = sc.nextInt();
            contador += 1;
            total = total + n;
            if (n > 0) {
                positius += 1;
            }
        } while (n != 0);

        System.out.println("Has sumado " + contador + " números");
        System.out.println("Han sido positivos: " + positius);
        if (contador == 0) {
            System.out.println("No se han elegido numeros para calcular la media.");
        } else {
            System.out.println("Media de numero elegidos: " + (total / contador));
        }
        sc.close();
    }
}
