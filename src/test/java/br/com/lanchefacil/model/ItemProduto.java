package br.com.lanchefacil.model;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ItemProduto {
    @Test
    void calcularSubtotal() {
        Produto produto = new Produto("Tamagochi", BigDecimal.valueOf(10), true);
        ItemPedido itemPedido = new ItemPedido(produto, 3);
        assertEquals(BigDecimal.valueOf(30), itemPedido.calcularSubtotal());

    }

}