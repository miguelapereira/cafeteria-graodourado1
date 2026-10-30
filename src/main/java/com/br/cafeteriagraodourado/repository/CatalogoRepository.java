package com.br.cafeteriagraodourado.repository;


import com.br.cafeteriagraodourado.model.Catalogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogoRepository    extends JpaRepository<Catalogo,Long> {
}
