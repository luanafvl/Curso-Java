package com.luhh.projetospring.api.repo;

import com.luhh.projetospring.api.models.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepo extends JpaRepository<Departamento, Long> {
}
