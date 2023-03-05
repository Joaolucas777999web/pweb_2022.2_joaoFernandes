package br.com.joao.cadpessoas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.joao.cadpessoas.model.Pessoa;
import br.com.joao.cadpessoas.repositories.PessoaRepository;

@Controller
@RequestMapping("/")
public class PessoaController {

    @Autowired
    PessoaRepository pessoaRepo;

    public PessoaController(PessoaRepository pessoaRepo) {
        this.pessoaRepo = pessoaRepo;
    }

    @GetMapping
    public String index() {
        return "index.html";
    }

    @GetMapping("/listarPessoas")
    public ModelAndView listarPessoas(){
        List<Pessoa> todasAsPessoas = pessoaRepo.findAll()
        ModelAndView modelAndView = new ModelAndView("ListarPessoas");
        modelAndView.addObject("todasAsPessoas", todasAsPessoas);
        return modelAndView;
}