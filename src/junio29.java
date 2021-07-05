import java.util.Scanner;
public class junio29 {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        System.out.printIn("El mensaje fue "+ entrada);*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("Hola" + nombre);
        System.out.println(saludar(nombre));
            
    }
    public static String saludar(String nombre){
        return "Hola" + nombre;

    }
    
}
