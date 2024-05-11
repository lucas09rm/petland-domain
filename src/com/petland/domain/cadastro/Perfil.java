package com.petland.domain.cadastro;

public class Perfil {

    private boolean fornecedor;
    private boolean cliente;
    private boolean prestador;

    public boolean isFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(boolean fornecedor) {
        this.fornecedor = fornecedor;
    }

    public boolean isPrestador() {
        return prestador;
    }

    public void setPrestador(boolean prestador) {
        this.prestador = prestador;
    }

    public boolean isCliente() {
        return cliente;
    }

    public void setCliente(boolean cliente) {
        this.cliente = cliente;
    }
}
