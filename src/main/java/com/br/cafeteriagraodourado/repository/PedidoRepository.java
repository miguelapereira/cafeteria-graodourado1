package com.br.cafeteriagraodourado.repository;

import com.br.cafeteriagraodourado.model.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PedidoRepository  extends JpaRepository<Pedidos.Pedido,Long> {
}
