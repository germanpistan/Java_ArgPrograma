import java.time.LocalDate;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private Materia materia;

    private LocalDate fecha;

    public Inscripcion (){

    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public boolean aprobada (){
        boolean b = false;  //inicializo boleano falso
        b = materia.puedeCursar(alumno);

        return b;
    }
}
