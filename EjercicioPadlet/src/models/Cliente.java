package models;

public class Cliente {
    // ATRIBUTOS (Propiedades privadas para mantener el encapsulamiento)
    private String codigo;
    private String nombre;
    private String tipo;
    
    // Crear método constructor
    public Cliente(String codigo, String nombre, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    // MÉTODOS GETTER (Permiten el acceso controlado a los datos privados)    
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getTipo() {return tipo; }
    
    // Simulación de una pequeña base de datos local (Array de objetos)
    public static Cliente getBuscarPorCodigo (String codigo) {
        Cliente[] clientes = {
            new Cliente("C001","juan Pérez", "Regular"),
            new Cliente("C002", "Ana Torres", "Frecuente"),
            new Cliente("C003", "Luis Gómez", "VIP")
        };
        
        // Bucle "for-each" para recorrer la lista de clientes
        for (Cliente c : clientes) {
            // .equalsIgnoreCase: Compara sin importar mayúsculas/minúsculas
            // .trim(): Elimina espacios en blanco al inicio o final
            if (c.getCodigo().equalsIgnoreCase(codigo.trim())) {
                return c; // Si lo encuentra, devuelve el objeto completo
            }
        }
        // Si termina el bucle y no hubo coincidencias, devuelve nulo
        return null;
    }
}
