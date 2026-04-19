import java.io.OutputStream;

public class Pedido {
    String cliente;
    String plato;
    double precio;
    int cantidad;

    public Pedido (String cliente, String plato, double precio, int cantidad){
        this.cliente=cliente;
        this.plato=plato;
        this.precio=precio;
        this.cantidad=cantidad;
    }

    public double sub_total(){
        return precio * cantidad;
    }

    public double descuento(){
        if (sub_total()>25){
            System.out.println("Apto para descuento");
            return sub_total()*0.10;
        }else{
            System.out.println("Sin descuento");
            return 0;
        }
    }

    public double totalfinal(){
        return sub_total()-descuento();
    }

    public void imprimir(){
        System.out.println("--------CUENTA DEL PEDIDO--------");
        System.out.println("Cliente: "+ cliente);
        System.out.println("Plato: "+plato);
        System.out.println("Precio: "+precio);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Subtotal: "+sub_total());
        System.out.println("Descuento: "+descuento());
        System.out.println("Total final: "+totalfinal());
    }


}
