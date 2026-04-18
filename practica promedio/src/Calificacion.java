import java.util.Scanner;

public class Calificacion {
    String nombre;
    double nota1;
    double nota2;
    double nota3;

    Scanner sc = new Scanner(System.in);

    public void registro(){
        System.out.print("Ingrese su nombre: ");
        nombre= sc.nextLine();
        System.out.print("Ingrese la primera nota: ");
        nota1=sc.nextDouble();
        System.out.print("Ingrese la segunda nota: ");
        nota2=sc.nextDouble();
        System.out.print("Ingrese la tercera nota: ");
        nota3=sc.nextDouble();
    }

    public double promedio(){
        return (nota1+nota2+nota3) / 3;
    }

    public String estado(){
        if (promedio()>=7){
            return "Aprobado";

        }else{
            return "Reprobado";
        }
    }

    public void imprimir(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Promedio: "+promedio());
        System.out.println("Estado: "+estado());
    }
}
