package com.br.cafeteriagraodourado.repository;

import com.br.cafeteriagraodourado.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Clientes.Cliente, Long> {
    Clientes.Cliente findByCpf(Integer cpf);
}
