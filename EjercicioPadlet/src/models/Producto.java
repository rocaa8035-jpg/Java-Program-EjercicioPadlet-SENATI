package models;

public class Producto {
    // ATRIBUTOS (Propiedades privadas para mantener el encapsulamiento)
    private String codigo;
    private String descripcion;
    private double precio;
    // Crear método constructor
    public Producto(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    // MÉTODOS GETTER (Permiten el acceso controlado a los datos privados)    
    public String getCodigo() { return codigo; }
    public String getDescripcion() { return descripcion; }
    public double getPrecio() { return precio; }
    // Simulación de una pequeña base de datos local (Array de objetos)
    public static Producto getBuscarPorCodigo(String codigo) {
        Producto[] productos = {
            new Producto("P001", "Laptop", 2500),
            new Producto("P002", "Mouse", 50),
            new Producto("P003", "Teclado", 120),
            new Producto("P004", "Monitor", 800),
            new Producto("P005", "USB", 30)
        };
        for (Producto p : productos) {
            if (p.getCodigo().equalsIgnoreCase(codigo.trim())) {
            return p;
            }
        }
    return null;
    }
}
