package es.UCLM.esi.ISO2.B7;

import java.util.List;

public class NotificacionesView {

    // Sistema de notificaciones (CDU 7)
    private List<?> notificaciones;

    public void onMarcarLeida(String idNoti) {
        // Implementación mínima, como en el resto de componentes
        System.out.println("Notificación marcada como leída: " + idNoti);
    }
}
