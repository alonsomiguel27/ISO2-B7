package es.UCLM.esi.ISO2.B7;

public class InventarioService {

    public void actualizarEstadoItem(String idItem, String nuevoEstado) {
        System.out.println(
            "Actualizando estado del item " + idItem + " a: " + nuevoEstado
        );
    }

    public String consultarEstadoItem(String idItem) {
        System.out.println("Consultando estado del item " + idItem);
        return "en estantería";
    }

    public void registrarSeguimiento(String idItem, String observacion) {
        System.out.println(
            "Seguimiento del item " + idItem + ": " + observacion
        );
    }
}
