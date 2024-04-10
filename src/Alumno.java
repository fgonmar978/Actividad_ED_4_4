import java.util.Calendar;

public class Alumno 
{
    //Asignaturas del alumno
    private Asignatura a1;
    private Asignatura a2;
    private Asignatura a3;

    private String nombre;
    
    private int anio;
    private String dni;

    //Constructor alumno con asignaturas ya creadas
    public Alumno(
        Asignatura a1, 
        Asignatura a2, 
        Asignatura a3,
        String nombre,
        int anio,
        String dni
    ) 
    {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        insertarDatosPersonales(nombre, anio, dni);
    }

    //Constructor alumno con las id de las asignaturas a crear
    public Alumno(
        int id1, 
        int id2, 
        int id3,
        String nombre,
        int anio,
        String dni
    )
    {
        a1 = new Asignatura(id1);
        a2 = new Asignatura(id2);
        a3 = new Asignatura(id3);
        insertarDatosPersonales(nombre, anio, dni);
    }

    //Comprueba e inserta los datos personales si cumplen los requisitos
    private void insertarDatosPersonales(String nombre, int anio, String dni)
    {
        this.nombre = nombre;
        
        //Comprobacion anio valido
        if (anio < 1920 || anio > Calendar.getInstance().get(Calendar.YEAR))
        {
            System.err.println("Este año de nacimiento es imposible, usando valor por defecto 2000");
            anio = 2000;
        }

        this.anio = anio;

        //Comprobacion DNI valido (longitud y formato)
        dni = dni.toUpperCase();
        if (!dni.matches("^[0-9]{8}[A-z]$"))
        {
            System.err.println("Formato del dni erroneo usando valor por defecto 12345678A");
            dni = "12345678A";
        }

        this.dni = dni;
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

    public String getNombre() {
        return nombre;
    }

    public int getAnio() {
        return anio;
    }

    public String getDni() {
        return dni;
    }

    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
