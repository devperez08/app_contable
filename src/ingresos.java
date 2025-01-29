import java.util.Scanner;

public class ingresos {
    Scanner scanner = new Scanner(System.in);
    
    public int Ingresos() {
        
        System.out.print("valor: ");
        int valor = scanner.nextInt();
        
        return valor;
    }
}