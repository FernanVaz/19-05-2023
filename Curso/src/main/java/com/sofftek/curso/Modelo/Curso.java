package com.sofftek.curso.Modelo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {
    private int idCurso;
    private String nombre;
    private int duracion;
    private int idProfesor;
}