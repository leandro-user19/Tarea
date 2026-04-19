import java.util.Scanner;

void main() {

    Scanner c1 = new Scanner(System.in);

    System.out.println("Ingrese su nombre: ");
    String nombre=c1.nextLine();

    System.out.println("Ingrese el su consumo: ");
    double consumo=c1.nextDouble();

    System.out.println("Ingrese el costo por Kw: ");
    double costokw=c1.nextDouble();

    Cliente cl1 = new Cliente(nombre, consumo, costokw);


    cl1.imprimir();
}