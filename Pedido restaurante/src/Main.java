import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nombre del cliente: ");
    String nombre=sc.nextLine();

    System.out.print("Plato: ");
    String plato=sc.nextLine();

    System.out.print("Precio: ");
    double precio=sc.nextDouble();

    System.out.print("Cantidad: ");
    int cantidad=sc.nextInt();

    Pedido p1 = new Pedido(nombre, plato, precio, cantidad);
    p1.imprimir();

}
