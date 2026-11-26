package br.com.lanchefacil.model;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AlteracaoDoitem {
    @Test
        void alteracaoDoItem() {
            int quantidade = 3;

            Produto produto = new Produto("Tamagochi", BigDecimal.valueOf(10), true);
            ItemPedido itemPedido = new ItemPedido(produto, quantidade);
            assertEquals(3, itemPedido.getQuantidade());
            itemPedido.setQuantidade(quantidade++);
            itemPedido.setQuantidade(quantidade--);

        }
}