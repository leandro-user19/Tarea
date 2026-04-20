

public class Producto {
    String codigo;
    String nombrecomercial;
    String categoria;
    private double preciounitario;
    private int stockdisponible;
    private int stockminimopermitido;


    public Producto (String codigo, String nombrecomercial, String categoria, double preciounitario, int stockdisponible, int stockminimopermitido){
        this.codigo = codigo;
        this.nombrecomercial=nombrecomercial;
        this.categoria=categoria;
        this.preciounitario=preciounitario;
        this.stockdisponible=stockdisponible;
        this.stockminimopermitido=stockminimopermitido;

    }

    public double precioinventario(){
        return stockdisponible*preciounitario;
    }

    public void setStock(int stockdisponible){
        if (stockdisponible <=0){
            System.out.print("El stock no puede ser negativo");
        }else{
            this.stockdisponible=stockdisponible;
        }
    }

    public void setStockminimopermitido(int stockminimopermitido){
        if (stockminimopermitido<=0){
            System.out.print("El stock no puede ser negativo");
        }else{
            this.stockminimopermitido=stockminimopermitido;
        }
    }

    public void setPreciounitario(double preciounitario){
        if (preciounitario <= 0){
            System.out.println("Error: precio inválido");
        } else {
            this.preciounitario = preciounitario;
        }
    }

    public void estadoInventario(){
        if(stockdisponible<=stockminimopermitido){
            System.out.print("Requiere reposición");
        } else if (stockdisponible==0) {
            System.out.print("Producto agotado");
        } else if (stockdisponible>1) {
            System.out.print("Stock suficiente");
        }else{
            System.out.print("Error");
        }
    }

    public void imprimir(){
        System.out.println("Codigo del producto: "+codigo);
        System.out.println("Nombre del producto: "+nombrecomercial);
        System.out.println("Categoria: "+categoria);
        System.out.println("Precio unitario: "+preciounitario);
        System.out.println("Stock disponible: "+stockdisponible);
        System.out.println("Stock minimo: "+stockminimopermitido);


    }

}
