package br.com.fiap.acessly.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.acessly.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long>{
    
}
