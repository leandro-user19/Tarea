public class Cliente {
    String nombre;
    double consumo;
    double costokw;

    public Cliente (String nombre, double consumo, double costokw){

        this.nombre=nombre;
        this.consumo=consumo;
        this.costokw=costokw;
    }

    public double subtotal(){
        return consumo * costokw;
    }

    public double iva(){
        return subtotal() * 0.15;
    }

    public double total(){
        return iva()+subtotal();
    }

    public void imprimir(){
        System.out.println(("--------Planilla de luz-----------"));
        System.out.println("Nombre: "+nombre);
        System.out.println("Subtotal: "+subtotal());
        System.out.println("IVA: "+iva());
        System.out.println("Total a pagar: "+total());
        System.out.println("-------------------");
    }
}
