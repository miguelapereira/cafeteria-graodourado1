package com.br.cafeteriagraodourado.repository;

import com.br.cafeteriagraodourado.model.Catalogo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogoRepository extends JpaRepository<Catalogo, Long> {
    Catalogo findbyCodigo( Integer codigo );


}
