package models;
/**
 * Clase que gestiona el cálculo de ventas y la generación de importes.
 */
public class Factura {
    // ASOCIACIÓN: La factura contiene objetos de otras clases
    private Cliente cliente;
    private Producto producto;
    private int cantidad;
    // ATRIBUTOS DE RESULTADO (Cálculos)
    private double subtotal;
    private double descuento;
    private double igv;
    private double total;
    /**
     * CONSTRUCTOR: Al crear la factura, se pasan los datos base 
     * y se dispara automáticamente el método calcular().
     */
    public Factura(Cliente cliente, Producto producto, int cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        calcular(); // Ejecuta la lógica apenas se crea el objeto
    }
    /**
     * MÉTODO PRIVADO: Contiene la lógica de negocio.
     * Es 'private' porque solo la propia Factura debe decidir cómo calcularse.
     */
    private void calcular() {
        // 1. Cálculo base: Precio unitario por cantidad
        subtotal = producto.getPrecio() * cantidad;
        
        // 2. Determinación del porcentaje de descuento inicial según tipo de cliente
        // Se usa la sintaxis moderna de 'switch' (Java 12+)
        double porcDesc;
        porcDesc = switch (cliente.getTipo()) {
            case "Frecuente" -> 0.05; // 5% de descuento
            case "VIP" -> 0.10;       // 10% de descuento
            default -> 0.00;          // Sin descuento para "Regular" u otros
        };
        
        // 3. BONIFICACIÓN: Si compra más de 20 unidades, se suma un 5% extra de descuento
        if (cantidad > 20) porcDesc += 0.05;
        
        // 4. CÁLCULOS MONETARIOS FINALES
        descuento = subtotal * porcDesc;
        double montoConDesc = subtotal - descuento; // Base imponible
        
        igv = montoConDesc * 0.18;   // Impuesto General a las Ventas (18%)
        total = montoConDesc + igv;  // Monto final a pagar
    }
    
    // MÉTODOS GETTER: Permiten a la interfaz mostrar los resultados
    public double getSubtotal() { return subtotal; }
    public double getDescuento() { return descuento; }
    public double getIgv() { return igv; }
    public double getTotal() { return total; }
}
