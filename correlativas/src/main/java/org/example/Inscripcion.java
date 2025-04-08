package org.example;

import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(Alumno alumno, List<Materia> materias) {
        this.alumno = alumno;
        this.materias = materias;
    }
    public boolean aprobada() {
        return materias.stream().allMatch(materia ->
                alumno.getMateriasAprobadas().containsAll(materia.getCorrelativas())
        );
    }
}