package org.spring.mongo.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Document("alunos")
public class Aluno {

    @Id
    private ObjectId id;
    @Field("nome")
    private String nome;
    @Field("curso")
    private Curso curso;
    @DBRef(db = "notas")
    private List<Nota> notas;
    @Field("data_nascimento")
    private String dataNascimento;
    @DBRef(db = "habilidades")
    private List<Habilidade> habilidades;

}
