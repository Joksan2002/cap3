import java.util.Scanner;

public class PruebaFecha {
    public static void main(String[] args){
        Fecha fecha1 = new Fecha(0, 0, 0);
        Fecha fecha2 = new Fecha(0, 0, 0);
        
        System.out.printf("Fecha1: %d/ %d/ %d%n", fecha1.obtenerAño(), fecha1.obtenerMes(), fecha1.obtenerDia());
        System.out.printf("Fecha2: %d/ %d/ %d%n", fecha2.obtenerAño(), fecha2.obtenerMes(), fecha2.obtenerDia());
        
        Scanner entrada = new Scanner(System.in);

        //datos para fecha1
        System.out.printf("%nDigite el año: ");
            int nuevoAño = entrada.nextInt();
            fecha1.establecerAño(nuevoAño);
 
        System.out.printf("%nDigite el mes: ");
            int nuevoMes = entrada.nextInt();
            fecha1.establecerMes(nuevoMes);

        System.out.printf("%nDigite el dia: ");
            int nuevoDia = entrada.nextInt();
            fecha1.establecerDia(nuevoDia);

        System.out.printf("Fecha1: %d/ %d/ %d%n", fecha1.obtenerAño(), fecha1.obtenerMes(), fecha1.obtenerDia());
        System.out.printf("Fecha2: %d/ %d/ %d%n", fecha2.obtenerAño(), fecha2.obtenerMes(), fecha2.obtenerDia());   
        
        //datos para fecha2
        System.out.printf("%nDigite el año: ");
            nuevoAño = entrada.nextInt();
            fecha2.establecerAño(nuevoAño);
 
        System.out.printf("%nDigite el mes: ");
            nuevoMes = entrada.nextInt();
            fecha2.establecerMes(nuevoMes);

        System.out.printf("%nDigite el dia: ");
            nuevoDia = entrada.nextInt();
            fecha2.establecerDia(nuevoDia);

        System.out.printf("Fecha1: %d/ %d/ %d%n", fecha1.obtenerAño(), fecha1.obtenerMes(), fecha1.obtenerDia());
        System.out.printf("Fecha2: %d/ %d/ %d%n", fecha2.obtenerAño(), fecha2.obtenerMes(), fecha2.obtenerDia());
        

        //calculo de dias entre las 2 fechas
        
    }
}