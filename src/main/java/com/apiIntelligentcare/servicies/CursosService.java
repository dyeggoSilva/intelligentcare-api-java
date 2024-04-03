package com.apiIntelligentcare.servicies;

import com.apiIntelligentcare.entitiles.Cursos;
import com.apiIntelligentcare.repositories.CursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursosService {
    @Autowired
    CursosRepository cursosRepository;

    public List<Cursos> listAll(){
        return cursosRepository.findAll();
    }

    public Object listId(int id){
        return cursosRepository.findById(id);
    }

    public Cursos saveCurso(Cursos curso){
        return cursosRepository.save(curso);
    }

    public void dellCurso(Integer id) {
        cursosRepository.deleteById(id);
    }


    public Optional<Cursos> atualiCurso(Integer id, Cursos curso) {
        Optional<Cursos> cursoId = cursosRepository.findById(id);
        cursoId = Optional.of(cursosRepository.save(curso));
        return cursoId;
    }

}
