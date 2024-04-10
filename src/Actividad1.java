public class Actividad1 {
    public static void main(String[] args) throws Exception 
    {
        //Creacion de asignaturas
        Asignatura a1 = new Asignatura(0);
        Asignatura a2 = new Asignatura(1);
        Asignatura a3 = new Asignatura(2);
        
        //Creacion de alumno y calculo de notas
        Alumno alumno = new Alumno(a1, a2, a3);
        Profesor.ponerNotas(alumno);

        //Mostramos la media
        System.out.printf("%.2f", Profesor.calcularMedia(alumno));
    }
}
