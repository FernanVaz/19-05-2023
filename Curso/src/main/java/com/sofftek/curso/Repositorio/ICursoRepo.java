package com.sofftek.curso.Repositorio;

import com.sofftek.curso.Modelo.Curso;

import java.util.List;

public interface ICursoRepo {
    List<Curso> consultarTodos();

    Curso consultarUno(int id);

    Curso crear(Curso curso);

    Curso modificar(Curso curso);

    void eliminar(int id);
}
