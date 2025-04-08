package org.example;

import lombok.Getter;
import lombok.Setter;
import java.util.List;
@Getter
@Setter

public class Alumno {
    private List<Materia> materiasAprobadas;

    public Alumno (List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

}