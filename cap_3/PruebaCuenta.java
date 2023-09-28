import java.util.Scanner;
public class PruebaCuenta {
    public static void main(String[] args){
        Cuenta cuenta1 = new Cuenta("Jane Gree", 50.00);
        Cuenta cuenta2 = new Cuenta("John Blue", -7.53);

        // muestra el saldo inicial de cada objeto
        System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

        // crea un objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el monto a depositar para cuenta1: "); // indicador (promt)
            double montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
        System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n", montoDeposito);
            cuenta1.depositar(montoDeposito); // suma al saldo de cuenta1

        // muestra los saldos
        System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

        System.out.print("Escriba el monto a depositar para cuenta2: "); // indicador
            montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
        System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n", montoDeposito);
            cuenta2.depositar(montoDeposito); // suma al saldo de cuenta2

        // muestra los saldos
        System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo()); 
        System.out.printf("Saldo de %s: $%.2f%n%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
        
        System.out.printf("Escriba el monto a retirar de cuenta1: ");
            double montoRetiro = entrada.nextDouble();
        System.out.printf("%nrestando %.2f al saldo cuenta1%n%n", montoRetiro);
            cuenta1.retirar(montoRetiro);
        
        //muestra los saldos
        System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

        System.out.print("Escriba el monto a retirar para cuenta2: ");
            montoRetiro = entrada.nextDouble();
        System.out.printf("%nrestando %.2f al saldo de cuenta2%n%n", montoRetiro);
            cuenta2.retirar(montoRetiro); 

        // muestra los saldos
        System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo()); 
        System.out.printf("Saldo de %s: $%.2f%n%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());    
    }
    
}
