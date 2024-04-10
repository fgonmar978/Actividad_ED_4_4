public class Profesor 
{
    //Califica las asignaturas de un alumno
    public static void ponerNotas(Alumno alumno)
    {
        //Calificamos las 3 asignaturas del alumno introducido
        alumno.getA1().setCalificacion(notaRandom());
        alumno.getA2().setCalificacion(notaRandom());
        alumno.getA3().setCalificacion(notaRandom());
    }

    //Calcula la media de las asignaturas de un alumno
    public static double calcularMedia(Alumno alumno)
    {
        return (alumno.getA1().getCalificacion() + alumno.getA2().getCalificacion() + alumno.getA3().getCalificacion()) / 3;
    }

    //Devuelve un double entre el 0 y el 10
    public static double notaRandom() 
    {
        double random = Math.random() * 11;
        if (random > 10) random = 10;
        return random;
    }
}
