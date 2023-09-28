import java.util.Scanner;

public class PruebaEstudiante {
    public static void main(String[] args) {
        
        String n, m, c;
        int ca;

        Scanner entrada = new Scanner(System.in);

        System.out.printf("%nNombre: ");
            n = entrada.nextLine();

        System.out.printf("%nCuenta: ");
            c = entrada.nextLine();
        
        System.out.printf("%nMateria: ");
            m = entrada.nextLine();

        System.out.printf("%nCalificacion de "+ m +" es: ");
            ca = entrada.nextInt();
        
        if(ca <0 || ca >100){
            System.out.print("La calificacion es incorrecta");
        } else{

            Estudiante est = new Estudiante(n, m, c, ca);
            
            System.out.printf("%nEl estudiante "+ est.getNombre() +" con # de cuenta "+ est.getCuenta() +" y calificacion "+ est.getCalif() +"%n");
            System.out.printf("%nEsta: "+ est.getObservacion());

        }
               
    }
}
