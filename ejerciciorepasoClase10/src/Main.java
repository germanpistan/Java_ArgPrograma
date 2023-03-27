import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    System.out.println("Ejemplo validador de Correlativas");
    Materia programacionI = new Materia ();
    programacionI.setNombre("Programacion I");

    Materia programacionII = new Materia ();
    programacionII.setNombre("Programacion II");
    List<Materia> correlativasProgII = new ArrayList<>();
    correlativasProgII.add(programacionI);  //agregar a la lista de correlativa la materia programacionI
    programacionII.setCorrelativas(correlativasProgII);  //asignar a programacionII las correlativas

    Materia fisica = new Materia();
    fisica.setNombre("Fisica");

    Materia programacionIII = new Materia();
    programacionIII.setNombre("ProgramacionIII");
    List<Materia> correlativasProgIII = new ArrayList<>();
    correlativasProgIII.add(programacionII);
    correlativasProgIII.add(fisica);
    programacionIII.setCorrelativas(correlativasProgIII);

    List<Materia> materias = new ArrayList<>();
    materias.add(programacionI);
    materias.add(programacionII);
    materias.add(programacionIII);
    materias.add(fisica);


    Alumno juan = new Alumno();
    juan.setNombre("Juan");
    juan.setLegajo("A330");

    Alumno pedro = new Alumno();
    pedro.setNombre("Pedro");
    pedro.setLegajo("A460");
    List<Materia> aprobadasDePedro = new ArrayList<>();
    aprobadasDePedro.add(programacionI);
    pedro.setMateriasAprobadas(aprobadasDePedro);

    List<Alumno> alumnos = new ArrayList<>();  //crear la lista de alumnos para guardarlos ahi
    alumnos.add(juan);
    alumnos.add(pedro);

    String ruta ="C:\\Users\\Carolina\\Desktop\\ARGENTINA PROGRAMA\\ejerciciorepasoClase10\\inscripciones.csv";
    List<String> lista = new ArrayList<>();
    try {
        lista = Files.readAllLines(Paths.get(ruta));
    } catch (IOException ex) {
            ex.printStackTrace();
    }
    for (int i = 1; i < lista.size(); i++) {
        String [] registroInscripcion = lista.get(i).split(";");   //creamos el array de registro y separamos la lista
        Inscripcion ins = new Inscripcion();  //creamos el objeto inscripcion
        Alumno ai = null;
        for (Alumno a : alumnos) {  //recorremos todos los alumnos de la lista de alumnos
            if (a.getNombre().equals(registroInscripcion[0]));  //comparo la lista de alumnos con el registro String del archivo csv
            ai =a;   //ai le damos a
            break;
        }
        String columna3 = "";  //inicializo con texto en blanco
        if (ai == null) {
            columna3 = "Al alumno no existe. ";
        }
        ins.setAlumno(ai);

        Materia mi = null;
        for (Materia m : materias){
            if (m.getNombre().equals(registroInscripcion[1])){  //comparo las materias
                mi = m;
                break;
            }
        }
        if (mi==null){
            columna3 = columna3 + "La materia no existe. ";

        }
        ins.setMateria(mi);
        ins.setFecha(LocalDate.now());
        if (ins.aprobada()){
            columna3 = "Aprobada";
        } else {
            columna3 = "Desaprobada";
        }

        //hacer archivo csv para devolver estos resultados, y agregando con metodo write




    }



    }
}