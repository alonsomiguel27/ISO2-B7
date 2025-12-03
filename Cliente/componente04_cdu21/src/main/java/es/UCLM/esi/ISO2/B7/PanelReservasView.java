package es.UCLM.esi.ISO2.B7;

import java.util.List;

public class PanelReservasView {

    private List<ReservaDTO> reservasPendientes;

    public PanelReservasView(List<ReservaDTO> reservasPendientes) {
        this.reservasPendientes = reservasPendientes;
    }

    public void onAsignarReserva(String idReserva, String idEjemplar) {
        System.out.println("Asignando reserva " + idReserva + " al ejemplar " + idEjemplar);
    }

    public void onGestionarRenovacion(String idPrestamo) {
        System.out.println("Gestionando renovación del préstamo " + idPrestamo);
    }
}
