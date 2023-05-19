package com.sofftek.curso.Repositorio;

import com.sofftek.curso.Modelo.Curso;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class CursoRepo implements ICursoRepo{
    public List<Curso> cursos = new ArrayList<>();
    @Override
    public List<Curso> consultarTodos() {
        return cursos;
    }

    @Override
    public Curso consultarUno(int id) {

            return cursos.stream()
                    .filter(c -> c.getIdCurso() == id)
                    .findFirst()
                    .orElse(null);

    }

    @Override
    public Curso crear(Curso curso) {
        cursos.add(curso);
        return curso;
    }
    @Override
    public Curso modificar(Curso curso) {
        Optional<Curso> aModificar = cursos.stream().filter(c -> c.getIdCurso() == curso.getIdCurso()).collect(Collectors.toList()).stream().findFirst();
        aModificar.ifPresent(objeto -> objeto=curso);
        return aModificar.isPresent()?aModificar.get():null;
    }
    @Override
    public void eliminar(int id){ cursos.removeIf(c -> c.getIdCurso() == id);}
}
