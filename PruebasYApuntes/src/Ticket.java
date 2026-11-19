import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Ticket{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

/// CONSTANTES

        Map<String, Double> tipoBebida= new HashMap<>();
        tipoBebida.put( "cafe" , 1.2);
        tipoBebida.put( "te" , 1.0);
        tipoBebida.put( "chocolate" , 1.5);

        // final double CAFE = 1.2;
        // final double TE = 1;
        // final double CHOCO = 1.5;

        Map<String, Double> tipoBollo = new HashMap<>();
        tipoBollo.put("croisant", 1.1);
        tipoBollo.put("ensaimada", 1.4);
        tipoBollo.put("muffin", 0.9);

        // final double CURASAN = 1.1;
        // final double ENSAIMADA = 1.4;
        // final double MUFFIN = 0.9;
        final double LLEVAR = 0.25;
        final double total = 0.0;
        // String [] BEBIDA = new String (){"cafe", "te", "chocolate"};

/// VARIABLES

        double total = 0.0;

/// ENTRADAS
        
        System.out.print("Escoge bebida (cafe, te o chocolate): ");
        String bebidaElegida = sc.nextLine();
        System.out.print("Escoge bolleria (croisant, ensaimada o muffin): ");
        String bolloElegido = sc.nextLine();
        System.out.print("Para llevar?(s/n)")
        String paraLlevar = sc.nextLine();


/// SALIDAS

        /// Contador vueltas / Condicion (El largo del Array BEBIDA) / incremento
//         for (int i = 0; i < BEBIDA.length; i++) {
//             if (BEBIDA[i].equalsIgnoreCase(tipoBebida)) {
//             System.out.println("Bebida escogida: " + BEBIDA[i]);
//         }   
// }
 // .containsKey() reemplaza al bucle 'for' y busca directamente en el mapa
        if (tipoBebida.containsKey(bebidaElegida)) {
            double precioBebida = tipoBebida.get(bebidaElegida);
            total += precioBebida;
            System.out.println("Bebida escogida: " + bebidaElegida + " (" + precioBebida + "€)");
        } else {
            System.out.println("Bebida no válida.");
        }

        if (tipoBollo.containsKey(bolloElegido)){
            double precioBollo = tipoBollo.get(bolloElegido);
            total += precioBollo;
            System.out.println("Bollo escogido ");
        }else{
            System.out.println("Bebida no válida,");
        }

        if (paraLlevar.equals ("s")){
            System.out.println("Cargo para llevar: " + LLEVAR)
            total += LLEVAR;
        }else (paraLlevar.equals ("n")){
            
        }

        System.out.println("Total: " + total);

    }
}