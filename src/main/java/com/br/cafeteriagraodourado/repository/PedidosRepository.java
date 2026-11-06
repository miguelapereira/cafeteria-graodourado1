package com.br.cafeteriagraodourado.repository;

import com.br.cafeteriagraodourado.model.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidosRepository  extends JpaRepository<Pedidos,Long> {


    Pedidos findByCpf(Integer cpf);
}
