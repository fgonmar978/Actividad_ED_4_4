public class Alumno 
{
    //Asignaturas del alumno
    private Asignatura a1;
    private Asignatura a2;
    private Asignatura a3;

    //Constructor alumno con asignaturas ya creadas
    public Alumno(Asignatura a1, Asignatura a2, Asignatura a3) 
    {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    //Constructor alumno con las id de las asignaturas a crear
    public Alumno(int id1, int id2, int id3)
    {
        a1 = new Asignatura(id1);
        a2 = new Asignatura(id2);
        a3 = new Asignatura(id3);
    }

    //Getters
    public Asignatura getA1() {
        return a1;
    }

    public Asignatura getA2() {
        return a2;
    }

    public Asignatura getA3() {
        return a3;
    }
}
