import collection.ArbolTrabajadores;
import iterator.Iterator;
import model.RegistroAsistencia;
import model.Trabajador;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        ArbolTrabajadores sistemaAsistencia = new ArbolTrabajadores();

        // 12 Trabajadores insertados en desorden numérico para probar que el árbol los ordena de forma ascendente
        sistemaAsistencia.insertar(new Trabajador(108, "Diego", "Chavez", "987654321",
                new RegistroAsistencia(LocalDateTime.of(2026, 6, 14, 8, 0), LocalDateTime.of(2026, 6, 14, 17, 0))));

        sistemaAsistencia.insertar(new Trabajador(101, "Ana", "Martínez", "951753456",
                new RegistroAsistencia(LocalDateTime.of(2026, 6, 14, 7, 55), LocalDateTime.of(2026, 6, 14, 16, 30))));

        sistemaAsistencia.insertar(new Trabajador(112, "Carlos", "Pérez", "963852741",
                new RegistroAsistencia(LocalDateTime.of(2026, 6, 14, 8, 15), null))); // Entrada sin salida asignada

        sistemaAsistencia.insertar(new Trabajador(103, "Beatriz", "Soto", "954123654",
                new RegistroAsistencia(LocalDateTime.of(2026, 6, 14, 8, 0), LocalDateTime.of(2026, 6, 14, 17, 0))));

        sistemaAsistencia.insertar(new Trabajador(105, "Eduardo", "Gómez", "922334455",
                new RegistroAsistencia(LocalDateTime.of(2026, 6, 14, 7, 45), LocalDateTime.of(2026, 6, 14, 16, 0))));

        sistemaAsistencia.insertar(new Trabajador(102, "Flora", "Díaz", "911223344",
                new RegistroAsistencia(LocalDateTime.of(2026, 6, 14, 8, 0), null))); // Entrada sin salida asignada

        sistemaAsistencia.insertar(new Trabajador(110, "Gabriel", "Torres", "966778899",
                new RegistroAsistencia(LocalDateTime.of(2026, 6, 14, 8, 0), LocalDateTime.of(2026, 6, 14, 17, 0))));

        sistemaAsistencia.insertar(new Trabajador(104, "Héctor", "Benítez", "944556677",
                new RegistroAsistencia(LocalDateTime.of(2026, 6, 14, 8, 10), LocalDateTime.of(2026, 6, 14, 17, 10))));

        sistemaAsistencia.insertar(new Trabajador(107, "Irene", "Mendoza", "988990011",
                new RegistroAsistencia(LocalDateTime.of(2026, 6, 14, 7, 50), LocalDateTime.of(2026, 6, 14, 16, 50))));

        sistemaAsistencia.insertar(new Trabajador(106, "Juan", "Morales", "977889900",
                new RegistroAsistencia(LocalDateTime.of(2026, 6, 14, 8, 0), LocalDateTime.of(2026, 6, 14, 17, 0))));

        sistemaAsistencia.insertar(new Trabajador(111, "Karen", "Delgado", "933445566",
                new RegistroAsistencia(LocalDateTime.of(2026, 6, 14, 8, 0), null))); // Entrada sin salida asignada

        sistemaAsistencia.insertar(new Trabajador(109, "Luis", "Castro", "955667788",
                new RegistroAsistencia(LocalDateTime.of(2026, 6, 14, 8, 0), LocalDateTime.of(2026, 6, 14, 17, 0))));

        System.out.println("==========================================================================================");
        System.out.println("   SISTEMA DE ASISTENCIA - RECURSOS HUMANOS (Recorrido Inorder por ID)");
        System.out.println("==========================================================================================");

        // Se solicita el iterador abstracto para recorrer uniformemente la estructura
        Iterator iterador = sistemaAsistencia.createIterator();
        while (iterador.hasNext()) {
            Trabajador t = (Trabajador) iterador.next();
            System.out.println(t);
        }
        System.out.println("==========================================================================================");
    }
}