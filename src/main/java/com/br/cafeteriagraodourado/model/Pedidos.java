package com.br.cafeteriagraodourado.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedidos {


    @Entity
    @Table(name = "pedido")
    public class Pedido {

        @id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private Long Id;
        private Integer cpf;
        private String tipo;
        private Integer local;
        private Integer Codigo;
        private Integer QTD;
        private String pagamento;
        private BigDecimal total;
        private LocalDate data;
        private String status;


        //constructor

        public Pedido(int id, Long id1, Integer cpf, String tipo, Integer local, Integer codigo, Integer QTD, String pagamento, BigDecimal total, LocalDate data, String status) {
            this.id = id;
            Id = id1;
            this.cpf = cpf;
            this.tipo = tipo;
            this.local = local;
            Codigo = codigo;
            this.QTD = QTD;
            this.pagamento = pagamento;
            this.total = total;
            this.data = data;
            this.status = status;
        }


        //getter

        public int getId() {
            return id;
        }

        public Integer getCpf() {
            return cpf;
        }

        public String getTipo() {
            return tipo;
        }

        public Integer getLocal() {
            return local;
        }

        public Integer getCodigo() {
            return Codigo;
        }

        public Integer getQTD() {
            return QTD;
        }

        public String getPagamento() {
            return pagamento;
        }

        public BigDecimal getTotal() {
            return total;
        }

        public LocalDate getData() {
            return data;
        }

        public String getStatus() {
            return status;
        }


        //setter


        public void setId(int id) {
            this.id = id;
        }

        public void setId(Long id) {
            Id = id;
        }

        public void setCpf(Integer cpf) {
            this.cpf = cpf;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public void setLocal(Integer local) {
            this.local = local;
        }

        public void setCodigo(Integer codigo) {
            Codigo = codigo;
        }

        public void setQTD(Integer QTD) {
            this.QTD = QTD;
        }

        public void setPagamento(String pagamento) {
            this.pagamento = pagamento;
        }

        public void setTotal(BigDecimal total) {
            this.total = total;
        }

        public void setData(LocalDate data) {
            this.data = data;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}