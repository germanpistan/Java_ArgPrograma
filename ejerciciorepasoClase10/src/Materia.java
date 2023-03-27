import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia (){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public boolean puedeCursar (Alumno alumno ){
        boolean b = true;   //planteo al reves, y que todos puedan cursar excepto el que tenga una mteria desaprobada
        List<Materia> correlativas = getCorrelativas();
        for (Materia m : correlativas){
            for (Materia aprobada : alumno.getMateriasAprobadas()){   //comparo la lista de aprobadas con la de materias
                if (!m.equals(aprobada)){
                    b=false;  //si tengo una materia desaprobada, no puedo cursar
                }
            }
        }
        return b;

    }
}
