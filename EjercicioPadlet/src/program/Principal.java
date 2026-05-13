package program;

import views.FacturacionFrm;

public class Principal {
    public static void main(String[] args) {
        // Instanciar la clase FacturacionFrm
        FacturacionFrm frm = new FacturacionFrm();

        // Centrar en la pantalla
        frm.setLocationRelativeTo(null);

        // Mostrar pantalla
        frm.setVisible(true);
    }
}
