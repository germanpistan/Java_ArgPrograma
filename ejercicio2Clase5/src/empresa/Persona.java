package empresa;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Integer edad(){
        Integer edad = 0;
        //calculo la edad
        //obtengo la fecha actual
        LocalDate fechaActual = LocalDate.now();
        //saco el periodo entre dos fechas:
        Period periodo = Period.between(fechaDeNacimiento, fechaActual);
        //ahora saco la cantidad de años en ese periodo
        edad = periodo.getYears();
        //devuelvo la edad:
        return edad;
    }
}
