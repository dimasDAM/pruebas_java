import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) throws Exception {
        System.out.println("EN ESTE PROGRAMA PROBAREMOS VARIOS BUCLES");
        // GENERAR TABLA DEL NUMERO QUE LE PIDAMOS
        Scanner sc = new Scanner(System.in);
        System.out.println("Calula la tabla del numero: ");

        int n = sc.nextInt();
        while (n < 0) {
            System.out.println("Ingrese un numero positivo");
            n = sc.nextInt();
            sc.nextLine();
            
        }

        /// Desde donde iniciamos el bucle? int i=0
        /// Hasta cuando o que condiciones hace que pare? i <= 0
        /// Como EVOLUCIONA?? i++ (suma uno) i-- (resta uno)
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
        }

        // // AHORA MOSTRAREMOS NUMEROS PARES DESDE 0 DEL NUMERO QUE PIDAMOS
        System.out.println();
        System.out.println("Numeros pares del numero solicitado:");

        while (n >= 0) { /// Mientras n no sea 0 repitelo
            if (n % 2 == 0) { /// Si n es Par (resto = 0)
                System.out.println(n);
                n = n - 1;
            } else
                n = n - 1;
        }

        sc.close();
    }

}
