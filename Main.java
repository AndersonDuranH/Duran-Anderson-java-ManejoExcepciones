import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("=========================");
            System.out.println("REGISTRO DE USUARIOS");
            System.out.println("=========================");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    try {

                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();

                        System.out.print("Edad: ");
                        int edad = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Correo: ");
                        String correo = scanner.nextLine();

                        System.out.print("Salario: ");
                        double salario = scanner.nextDouble();
                        scanner.nextLine();

                        ValidadarUsuario.validarUsuario(
                                nombre,
                                edad,
                                correo,
                                salario);

                        System.out.println(
                                "\nUsuario registrado correctamente.");

                    } catch (InputMismatchException e) {

                        System.out.println(
                                "\nError: Debe ingresar un número válido.");

                        scanner.nextLine();

                    } catch (NombreInvalidoException e) {

                        System.out.println(
                                "\nError: " + e.getMessage());

                    } catch (EdadInvalidaException e) {

                        System.out.println(
                                "\nError: " + e.getMessage());

                    } catch (CorreoInvalidoException e) {

                        System.out.println(
                                "\nError: " + e.getMessage());

                    } catch (SalarioInvalidoException e) {

                        System.out.println(
                                "\nError: " + e.getMessage());

                    } catch (Exception e) {

                        System.out.println(
                                "\nError: " + e.getMessage());

                    } finally {

                        System.out.println(
                                "Proceso finalizado.\n");
                    }

                    break;

                case 2:

                    System.out.println("Saliendo del sistema...");
                    break;

                default:

                    System.out.println("Opción inválida.\n");
            }

        } while (opcion != 2);

        scanner.close();
    }
}