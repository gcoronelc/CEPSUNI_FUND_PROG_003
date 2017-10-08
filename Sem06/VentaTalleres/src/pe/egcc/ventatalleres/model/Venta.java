package pe.egcc.ventatalleres.model;

public class Venta {
  
  // INPUT
  private String empresa;
  private String taller;
  private int cantidad;

  // OUTPUT
  private double precio;
  private double importe;

  public Venta() {
  }

  public Venta(String empresa, String taller, int cantidad) {
    this.empresa = empresa;
    this.taller = taller;
    this.cantidad = cantidad;
  }


  public String getEmpresa() {
    return empresa;
  }

  public void setEmpresa(String empresa) {
    this.empresa = empresa;
  }

  public String getTaller() {
    return taller;
  }

  public void setTaller(String taller) {
    this.taller = taller;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public double getImporte() {
    return importe;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }

  @Override
  public String toString() {
    String repo = empresa + " - " + taller 
            + " - " + precio + " - "
            + " - " + cantidad + " - "
            + importe;
    return repo;
  }

  
  
}
