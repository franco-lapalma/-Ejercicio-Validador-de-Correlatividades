package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;


class InscripcionTest {
    @Test
    public void testInscripcionAprobada() {
        var algoritmos = new Materia("Algoritmos", List.of());
        var paradigmas = new Materia("Paradigmas", List.of(algoritmos));
        var diseno = new Materia("Diseño de Sistemas", List.of(paradigmas));

        var alumno = new Alumno (List.of(algoritmos, paradigmas));
        var inscripcion = new Inscripcion(alumno, List.of(diseno));

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void testInscripcionRechazada() {
        var algoritmos = new Materia("Algoritmos", List.of());
        var paradigmas = new Materia("Paradigmas", List.of(algoritmos));
        var diseno = new Materia("Diseño de Sistemas", List.of(paradigmas));

        var alumno = new Alumno(List.of(algoritmos)); // no cursó Paradigmas
        var inscripcion = new Inscripcion(alumno, List.of(diseno));

        assertFalse(inscripcion.aprobada());
    }
    @Test
    public void testVariasInscripciones() {
        var algoritmos = new Materia("Algoritmos", List.of());
        var arquitectura = new Materia("Arquitectura", List.of());
        var fisica = new Materia("Fisica", List.of());
        var sintaxis = new Materia("Sintaxis", List.of(algoritmos));
        var paradigmas = new Materia("Paradigmas", List.of(algoritmos));
        var diseno = new Materia("Diseño de Sistemas", List.of(paradigmas, algoritmos));
        var basesDeDatos = new Materia("Bases de Datos", List.of(algoritmos, sintaxis));
        var comunicacionDeDatos = new Materia("Diseño de Sistemas", List.of(arquitectura, fisica));


        var alumno = new Alumno (List.of(algoritmos, paradigmas, sintaxis, fisica, arquitectura));
        var inscripcion = new Inscripcion(alumno, List.of(diseno, basesDeDatos, comunicacionDeDatos, basesDeDatos));

        Assertions.assertTrue(inscripcion.aprobada());
    }

}