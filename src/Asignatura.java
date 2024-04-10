public class Asignatura 
{
    private int id;
    private double calificacion;

    //La asignatura necesita una ID
    public Asignatura(int id)
    {
        this.id = id;
    }

    //Getters
    public int getId() {
        return id;
    }

    public double getCalificacion() {
        return calificacion;
    }

    //Setters
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
