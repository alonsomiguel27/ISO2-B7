package servidor;

public class DocenteInvestigador {

    private List<Proyecto> listaProyectos;

    public DocenteInvestigador() {
        super();
        this.listaProyectos = new ArrayList<Proyecto>();
    }

    public void consultarBibliografia() {
        // TODO Auto-generated method stub
    }

    public void gestionarBibliografia() {
        // TODO Auto-generated method stub
    }

    public Stats generarEstadisticasUso() {
        // TODO Auto-generated method stub
        return null;
    }

    public List<Proyecto> getListaProyectos() {
        return listaProyectos;
    }

    public void setListaProyectos(List<Proyecto> listaProyectos) {
        this.listaProyectos = listaProyectos;
    }
}
