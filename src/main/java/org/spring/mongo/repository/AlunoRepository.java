package org.spring.mongo.repository;

import org.spring.mongo.model.Aluno;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AlunoRepository extends MongoRepository<Aluno, UUID> {
}
