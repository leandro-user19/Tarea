import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("-----Registro de prodcuto-------");

    System.out.print("Codigo: ");
    String codigo = sc.nextLine();

    System.out.print("Nombre: ");
    String nommbrecomercial = sc.nextLine();

    System.out.print("Categoria: ");
    String categoria = sc.nextLine();

    System.out.print("Precio unitario: ");
    double preciounitario = sc.nextDouble();

    System.out.print("Stock disponible: ");
    int stockdisponible = sc.nextInt();

    System.out.print("Stock minimo: ");
    int stockminimopermitido = sc.nextInt();

    Producto p1 = new Producto(codigo, nommbrecomercial, categoria, preciounitario, stockdisponible, stockminimopermitido);

    System.out.println("\n---Producto---");
    p1.imprimir();
    p1.estadoInventario();
    p1.precioinventario();

    System.out.println("\n===Actualizar producto===");

    System.out.print("Nuevo precio: ");
    double nuevoPrecio = sc.nextDouble();
    p1.setPreciounitario(nuevoPrecio);

    System.out.print("Nuevo stock: ");
    int nuevoStock = sc.nextInt();
    p1.setStock(nuevoStock);
    p1.setStockminimopermitido(nuevoStock);

    System.out.println("\n---Producto acutalizado---");
    p1.imprimir();
    p1.estadoInventario();
}
