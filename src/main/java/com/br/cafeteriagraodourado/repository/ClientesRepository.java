package com.br.cafeteriagraodourado.repository;

import com.br.cafeteriagraodourado.model.Catalogo;
import com.br.cafeteriagraodourado.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository  extends JpaRepository<Clientes, Long> {


}
