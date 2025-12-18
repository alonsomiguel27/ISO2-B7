package es.UCLM.esi.ISO2.B7;

public class Main {

    public static void main(String[] args) {
        InventarioService inventarioService = new InventarioService();

        inventarioService.actualizarEstadoItem("HW-001", "en reparación");
        inventarioService.consultarEstadoItem("HW-001");
        inventarioService.registrarSeguimiento(
            "HW-001",
            "Equipo enviado a mantenimiento"
        );
    }
}
