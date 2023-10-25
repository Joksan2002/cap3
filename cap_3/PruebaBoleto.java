import java.util.Random;
import java.util.Scanner;

public class PruebaBoleto {
    public static void main(String[] args){
        String ide;
        Random random = new Random();
        int numero = random.nextInt(10) + 1;

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Numero de Identidad: ");
        ide = entrada.next();

            System.out.println("");
            System.out.println("1. Servicio al Cliente");
            System.out.println("2. Retirar-Depositar");
            System.out.println("3. Pagos de Servicios");
            System.out.printf("ingrese el numero del 1-3: ");
            int num = entrada.nextInt();

            Boleto bol = new Boleto(ide);
            switch(num){
                case 1: 
                    System.out.printf("%nBANCO ATLANTIDA");
                    System.out.println("");
                    System.out.println("Servicio al Cliente");
                    System.out.println("        M"+ numero);
                    System.out.println("ID: "+ bol.getIde());
                    System.out.println("Fecha: "+ bol.getFecha());
                    System.out.println("Hora: "+ bol.getHora());
                    System.out.println("¡Que tenga buen dia!");
                    break;
                case 2:
                    System.out.printf("%nBANCO ATLANTIDA");
                    System.out.println("");
                    System.out.println("Retirar-Depositar");
                    System.out.println("       S"+ numero);
                    System.out.println("ID: "+ bol.getIde());
                    System.out.println("Fecha: "+ bol.getFecha());
                    System.out.println("Hora: "+ bol.getHora());
                    System.out.println("¡Que tenga buen dia!");
                    break;
                case 3:
                    System.out.printf("%nBANCO ATLANTIDA");
                    System.out.println("");
                    System.out.println("Pagos de Servicios");
                    System.out.println("       E"+ numero);
                    System.out.println("ID: "+ bol.getIde());
                    System.out.println("Fecha: "+ bol.getFecha());
                    System.out.println("Hora: "+ bol.getHora());
                    System.out.println("¡Que tenga buen dia!");
                    break;
                default:
                    System.out.println("Numero invalido");     
            }

        entrada.close(); 
    }    
}
