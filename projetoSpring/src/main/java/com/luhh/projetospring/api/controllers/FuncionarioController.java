package com.luhh.projetospring.api.controllers;

import com.luhh.projetospring.api.models.Funcionario;
import com.luhh.projetospring.api.repo.FuncionarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepo funcionarioRepo;

    // Listar Funcionarios

    @GetMapping("/")
    public String index() {
        return "index"; // This will look for index.html in templates folder
    }

    @GetMapping("/listar-funcionarios")
    public String listarFuncionarios(Model model) {
        List<Funcionario> funcionarios = funcionarioRepo.findAll();
        model.addAttribute("funcionarios", funcionarios);
        return "listar-funcionarios";
    }

    // Adicionar Funcionario

    @PostMapping("/add")
    public String addFuncionario(@ModelAttribute Funcionario funcionario) {
        Funcionario novoFuncionario = funcionarioRepo.save(funcionario);
        return "redirect:/funcionarios/listar-funcionarios";
    }

    // Atualizar Funcionario

    @PutMapping("/edit/{id}")
    public String editFuncionario(@PathVariable Long id, Model model) {
        Funcionario funcionario = funcionarioRepo.findById(id).orElse(null);
        if (funcionario != null) {
            model.addAttribute("funcionario", funcionario);
        }
        return "form-funcionario";
    }

    @GetMapping("/edit/{id}")
    public String updateFuncionarioById(@PathVariable Long id, @ModelAttribute Funcionario funcionario) {
        funcionario.setId(id);
        funcionarioRepo.save(funcionario);
        return "redirect:/funcionarios/listar-funcionarios";
    }


    // Remover Funcionario

    @DeleteMapping("/delete/{id}")
    public String deleteFuncionario(@PathVariable Long id) {
        funcionarioRepo.deleteById(id);
        return "redirect:/funcionarios/listar-funcionarios";
    }
}
