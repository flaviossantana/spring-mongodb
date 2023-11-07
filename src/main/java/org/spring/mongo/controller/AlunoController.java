package org.spring.mongo.controller;

import org.spring.mongo.model.Aluno;
import org.spring.mongo.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping("/aluno/cadastrar")
    public String cadastrar(Model model) {
        model.addAttribute("aluno", new Aluno());
        return "aluno/cadastrar";
    }

    @PostMapping("/aluno/salvar")
    public String salvar(@ModelAttribute Aluno aluno) {
        this.alunoRepository.save(aluno);
        return "redirect:/";
    }


}
