import java.util.Scanner;

public class Producto {
    String nombreproducto;
    double precio;
    int cantidad;
    double total;

    Scanner sc = new Scanner(System.in);

    public void ingresardatos(){
        System.out.print("Nombre del producto: ");
        nombreproducto=sc.nextLine();

        System.out.print("Ingrese el precio: ");
        precio=sc.nextDouble();

        System.out.print("Ingrese la cantidad: ");
        cantidad=sc.nextInt();

    }

    public void calculartotal(){
        total = precio * cantidad;
    }

    public void mostrarinfo(){
        System.out.println("\n");
        System.out.println("=======================");
        System.out.println("Nombre: "+nombreproducto);
        System.out.println("Precio: "+precio);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("=======================");

    }

    public void factura(){
        System.out.println("=======Factura=======");
        System.out.println("Nombre: "+nombreproducto);
        System.out.println("Precio: "+precio);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Total: "+total);
        System.out.println("=======================");
    }
}
