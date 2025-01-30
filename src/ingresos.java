import java.util.Scanner;

public class ingresos {
    int ingresos = 0;
    int valor = 0;
    Scanner scanner = new Scanner(System.in);
    
    public int Ingresos() {
        do {
            System.out.print("valor: ");
            valor = scanner.nextInt();
            ingresos += valor;
            
        } while (valor != 0);

        return ingresos;
        
    }
}