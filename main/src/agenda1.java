import java.util.Locale;
import java.util.Scanner;

public class agenda1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        System.out.println("Bienvenido a la agenda de contacto, porfavor escoge una opcion:" +
                "  1. Crear un nuevo contacto." +
                "  2. Buscar un contacto." +
                "  3. Modificar un contacto." +
                "  4. Eliminar un contacto." +
                "  5. Salir.");

        int opcionEscogida = sc.nextInt();

        System.out.println("Has escogido la opcion " + opcionEscogida);
    }
}