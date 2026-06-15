package model;

public class Trabajador {
    private int id;
    private String nombre;
    private String apellido;
    private String telefono;
    private RegistroAsistencia asistencia;

    public Trabajador(int id, String nombre, String apellido, String telefono, RegistroAsistencia asistencia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.asistencia = asistencia;
    }

    public int getId() { return id; }

    @Override
    public String toString() {
        return "ID: " + id + " | " + apellido + " " + nombre + " | Tel: " + telefono + " | [" + asistencia.toString() + "]";
    }
}