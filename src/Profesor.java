import java.util.Random;

public class Profesor 
{
    //Califica las asignaturas de un alumno
    public static void ponerNotas(Alumno alumno)
    {
        Random random = new Random();

        //Calificamos las 3 asignaturas del alumno introducido
        alumno.getA1().setCalificacion(random.nextDouble(0, 11));
        alumno.getA2().setCalificacion(random.nextDouble(0, 11));
        alumno.getA3().setCalificacion(random.nextDouble(0, 11));
    }

    //Calcula la media de las asignaturas de un alumno
    public static double calcularMedia(Alumno alumno)
    {
        return (alumno.getA1().getCalificacion() + alumno.getA2().getCalificacion() + alumno.getA3().getCalificacion()) / 3;
    }
}
