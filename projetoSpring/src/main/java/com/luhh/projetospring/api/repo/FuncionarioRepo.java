package com.luhh.projetospring.api.repo;

import com.luhh.projetospring.api.models.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepo extends JpaRepository<Funcionario, Long> {
}
