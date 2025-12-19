package es.UCLM.esi.ISO2.B7;

import java.util.List;

public class GruposView {

    private List<String> misGrupos;
    private List<String> gruposDisponibles;

    public GruposView(List<String> misGrupos, List<String> gruposDisponibles) {
        this.misGrupos = misGrupos;
        this.gruposDisponibles = gruposDisponibles;
    }

    public void onUnirseGrupo(String idGrupo) {
    }

    public void onAccederGrupo(String idGrupo) {
    }
}
