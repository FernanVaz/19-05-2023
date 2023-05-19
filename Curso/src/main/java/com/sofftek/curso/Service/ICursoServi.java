package com.sofftek.curso.Service;

import com.sofftek.curso.Modelo.Curso;
import org.springframework.stereotype.Service;

import java.util.List;



public interface ICursoServi {
    List<Curso> consultarTodos();

    Curso consultarUno(int id);

    Curso crear(Curso curso);

    Curso modificar(Curso curso);

    void eliminar(int id);

}
