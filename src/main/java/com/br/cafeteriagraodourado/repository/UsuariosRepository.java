package com.br.cafeteriagraodourado.repository;

import com.br.cafeteriagraodourado.model.Clientes;
import com.br.cafeteriagraodourado.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
}
