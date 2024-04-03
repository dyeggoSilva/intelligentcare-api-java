package com.apiIntelligentcare.controllers;

import com.apiIntelligentcare.entitiles.Cursos;
import com.apiIntelligentcare.servicies.CursosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class CursosController {

    @Autowired
    CursosService cursosService;

    @GetMapping("/cursos")
    public List cursos(){
        return cursosService.listAll();
    }

    @GetMapping("/cursos/{id}")
    public Object cursosId(@PathVariable Integer id){
        return cursosService.listId(id);
    }

    @PostMapping("/add-curso")
    public Object cadastroCurso(@RequestBody Cursos curso){
        return cursosService.saveCurso(curso);
    }

    @DeleteMapping("dell-curso/{id}")
    public void deleteCurso(@PathVariable Integer id) {
        cursosService.dellCurso(id);
    }

    @PutMapping("/update-Curso/{id}")
    public Object atualiCarro(@PathVariable Integer id,@RequestBody Cursos curso) {
        return cursosService.atualiCurso(id,curso);
    }

}
