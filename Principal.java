import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Imprimir "Hola Mundo"
        System.out.println("Hola mundo");

        // Mostrar la fecha y hora actual
        mostrarFechaHora();

        // Crear y mostrar usuarios
        Usuario[] usuarios = crearUsuarios(3);
        for (Usuario u : usuarios) {
            System.out.println("Nombre: " + u.nombre + ", Apellidos: " + u.apellidos + ", Email: " + u.email);
        }
    }

    // Método para mostrar la fecha y hora actual
    public static void mostrarFechaHora() {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Fecha y hora actual: " + ahora.format(formato));
    }

    // Método para crear usuarios
    public static Usuario[] crearUsuarios(int cantidad) {
        Scanner scanner = new Scanner(System.in);
        Usuario[] usuarios = new Usuario[cantidad];

        for (int i = 0; i < cantidad; i++) {
            usuarios[i] = new Usuario();
            System.out.print("Nombre: ");
            usuarios[i].nombre = scanner.nextLine();
            System.out.print("Apellidos: ");
            usuarios[i].apellidos = scanner.nextLine();
            System.out.print("Email: ");
            usuarios[i].email = scanner.nextLine();
        }
        scanner.close();
        return usuarios;
    }
}

class Usuario {
    public String nombre;
    public String apellidos;
    public String email;
}

