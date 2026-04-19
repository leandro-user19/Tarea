import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese su nombre: ");
    String nombre=sc.nextLine();

    System.out.print("Ingrese sus horas trabajadas: ");
    double sueldo=sc.nextDouble();

    Empleado p1 = new Empleado(nombre, sueldo);
    p1.imprimir();

}
