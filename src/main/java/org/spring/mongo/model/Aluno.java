package org.spring.mongo.model;

import lombok.Data;
import org.bson.types.ObjectId;

import java.util.Date;
import java.util.List;

@Data
public class Aluno {

    private ObjectId id;
    private String nome;
    private Curso curso;
    private List<Nota> notas;
    private Date dataNascimento;
    private List<Habilidade> habilidades;

}
