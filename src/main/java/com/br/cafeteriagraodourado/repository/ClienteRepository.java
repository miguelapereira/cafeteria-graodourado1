package com.br.cafeteriagraodourado.repository;

import com.br.cafeteriagraodourado.model.Clientes;
import com.br.cafeteriagraodourado.model.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository  extends JpaRepository<Clientes.Cliente,Long> {

    Clientes.Cliente findByCpf( Integer Cpf );
}
