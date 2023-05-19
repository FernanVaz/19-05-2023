package com.sofftek.curso.Service;

import com.sofftek.curso.Modelo.Curso;
import com.sofftek.curso.Repositorio.CursoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CursoServi implements ICursoServi{
    @Autowired
    private CursoRepo repo;

    @Override
    public List<Curso> consultarTodos() {return repo.consultarTodos();}
    @Override
    public Curso consultarUno(int id) {return repo.consultarUno(id);}
    @Override
    public Curso crear(Curso curso) {return repo.crear(curso);}
    @Override
    public Curso modificar(Curso curso) {return repo.modificar(curso);}
    @Override
    public void eliminar(int id) {repo.eliminar(id);}




}
