public class Empleado {
    String nombre;
    double horas;


    public Empleado(String nombre, double horas){

        this.nombre=nombre;
        this.horas=horas;

    }

    public double pagototalhoras(){
        return 480/240*horas; //calculo de horas: 480/240= a el pago por hora
    }

    public double bono(){
        return 0.20*pagototalhoras();
    }

    public double totalmasbono(){
        return bono()+pagototalhoras();
    }

    public void imprimir(){
        System.out.println("-------Reporte del empleado-------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Sueldo: "+pagototalhoras());
        System.out.println("Bono: "+bono());
        System.out.println("Sueldo final: "+totalmasbono());
    }
}
