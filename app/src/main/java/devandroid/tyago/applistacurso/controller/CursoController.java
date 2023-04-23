package devandroid.tyago.applistacurso.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.tyago.applistacurso.model.Curso;

public class CursoController {

    public List listCursos;

    public List getNomeDeCursos(){
    listCursos = new ArrayList<Curso>();
    listCursos.add(new Curso());
    listCursos.add(new Curso());
    listCursos.add(new Curso());
    listCursos.add(new Curso());
    listCursos.add(new Curso());

    return listCursos;
    }
}
