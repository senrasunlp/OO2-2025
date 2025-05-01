public class Pedido {
  private Cliente cliente;
  private List<Producto> productos;
  private String formaPago;
  
  public Pedido(Cliente cliente, List<Producto> productos, String formaPago) {
    if (!"efectivo".equals(formaPago)
        && !"6 cuotas".equals(formaPago)
        && !"12 cuotas".equals(formaPago)) {
      throw new Error("Forma de pago incorrecta");
    }
    this.cliente = cliente;
    this.productos = productos;
    this.formaPago = formaPago;
  }
  
  public double getCostoTotal() {
    // Aplicar descuento del 10% si el cliente tiene más de 5 años de antigüedad
    double subtotal = this.subtotal();
    return (this.cliente.añosDesdeFechaAlta() > 5) ? subtotal * 0.9 : subtotal;
  }
  
  private double costoProductos(){
    return this.productos.stream().mapToDouble(producto -> producto.getPrecio()).sum();
  }
  
  private double subtotal(){
    return this.costoProductos() + this.formaPago.extraFormaPago(this.costoProductos());  
  }
}

public class Cliente {
  private LocalDate fechaAlta;
  
  public LocalDate getFechaAlta() {
    return this.fechaAlta;
  }
  
  public int añosDesdeFechaAlta(){
    return Period.between(this.fechaAlta, LocalDate.now()).getYears();
  }
}

public class Producto {
  private double precio;
  
  public double getPrecio() {
    return this.precio;
  }
}

public abstract class FormaPago{
  public abstract double extraFormaPago(Double costoProductos);
}

public class Efectivo extends FormaPago{
  public double extraFormaPago(Double costoProductos){
    return 0;
  }
}

public class SeisCuotas extends FormaPago{
  public  double extraFormaPago(Double costoProductos){
    return costoProductos * 0.2;
  }
}

public class DoceCuotas extends FormaPago{
  public  double extraFormaPago(Double costoProductos){
    return costoProductos * 0.5;
  }
}

