package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroAsistencia {
    private LocalDateTime entrada;
    private LocalDateTime salida;

    public RegistroAsistencia(LocalDateTime entrada, LocalDateTime salida) {
        this.entrada = entrada;
        this.salida = salida;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String entradaStr = (entrada != null) ? entrada.format(formatter) : "No registrada";
        String salidaStr = (salida != null) ? salida.format(formatter) : "Pendiente (En oficina)";

        return "Entrada: " + entradaStr + " | Salida: " + salidaStr;
    }
}