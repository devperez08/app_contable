import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        ingresos valor1 = new ingresos();
        otrosgastos valor2 = new otrosgastos();
        costoproducto valor3 = new costoproducto();

        int ingresos = 0;
        int otros_gastos = 0;
        int costoproductos = 0;
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("");
            System.out.println("REGISTRO CONTABLE");
            System.out.println("--------------------");
            System.out.println("1. REGISTRAR INGRESOS");
            System.out.println("2. REGISTRAR OTROS GASTOS");
            System.out.println("3. REGISTRAR COSTO PRODUCTOS");
            System.out.println("4. CIERRE CAJA");
            System.out.print("opcion: ");

            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    ingresos += valor1.Ingresos();
                    break;
                
                case 2:
                    otros_gastos += valor2.otros_gastos();
                    break;

                case 3:
                    costoproductos += valor3.costo_producto();
                    break;

                case 4:
                    System.out.println("\nRESUMEN FINAL:");
                    System.out.println("--------------------");
                    System.out.println("TOTAL INGRESOS: " + ingresos);
                    System.out.println("TOTAL OTROS GASTOS: " + otros_gastos);
                    System.out.println("TOTAL COSTO DE PRODUCTOS: " + costoproductos);
                    int balance = ingresos - (otros_gastos + costoproductos);
                    System.out.print("BALANCE FINAL: " + balance);
                    break;
            
                default:
                    System.out.println("OPCION NO VALIDA");
                    break;
            }
            
        }
        scanner.close();

    }
}