public class Medicamento {
    
    protected String medicina;
    protected String dosis;
    protected String observaciones;
    protected String unidad;
    protected int cantidadTotal;

    public Medicamento() {}
    
    public Medicamento(String medicina, String dosis, String observaciones, String unidad, int cantidadTotal) {

        this.medicina = medicina;
        this.dosis = dosis;
        this.observaciones = observaciones;
        this.unidad = unidad;
        this.cantidadTotal = cantidadTotal;

    }
    
}
