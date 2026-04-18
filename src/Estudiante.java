import java.util.Scanner;

public class Estudiante {
    String nombre;
    String carrera;
    int edad;
    Scanner sc = new Scanner(System.in);


    public void registrardatos(){
        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese su carrera: ");
        carrera=sc.nextLine();
        System.out.print("Ingrese su edad: ");
        edad=sc.nextInt();
    }

    public void mostrardatos (){
        System.out.println("Nombre: " +nombre);
        System.out.println("Carrera: " +carrera);
        System.out.println("Edad: " +edad);

    }
}
