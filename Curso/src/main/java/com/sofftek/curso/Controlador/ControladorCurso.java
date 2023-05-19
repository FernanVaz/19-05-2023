package com.sofftek.curso.Controlador;

import com.sofftek.curso.Modelo.Curso;
import com.sofftek.curso.Service.CursoServi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/cursos")
public class ControladorCurso {
        @Autowired
        private CursoServi servicio;
        @GetMapping
        public ResponseEntity<List<Curso>> consultarTodos(){
            return new ResponseEntity<>(servicio.consultarTodos(), HttpStatus.OK);
        }
        @GetMapping("/{id}")
        public ResponseEntity<Curso> consultarUno(@PathVariable("id")int id ) {
            return new ResponseEntity<>(servicio.consultarUno(id), HttpStatus.OK);
        }
        @PostMapping
        public Curso crear(@RequestBody Curso curso) {
            return servicio.crear(curso);
        }
        @PutMapping
        public ResponseEntity<Curso> modificar(@RequestBody Curso curso){
            return new ResponseEntity<>(servicio.modificar(curso), HttpStatus.OK);
        }
        @DeleteMapping("/{id}")
        public void eliminar(@PathVariable("id")int id){
            servicio.eliminar(id);
        }
    }
