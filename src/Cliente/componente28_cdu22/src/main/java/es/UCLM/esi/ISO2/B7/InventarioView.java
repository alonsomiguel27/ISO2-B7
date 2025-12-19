package es.UCLM.esi.ISO2.B7;

import java.util.List;

public class InventarioView {

    private List<Object> items; // En diseño sería HardwareDTO

    public InventarioView(List<Object> items) {
        this.items = items;
    }

    public void onMarcarMantenimiento(String idItem) {
        System.out.println("Marcando mantenimiento para item " + idItem);
    }

    public void onActualizarEstado(String idItem, String estado) {
        System.out.println("Actualizando estado de " + idItem + " a " + estado);
    }
}
