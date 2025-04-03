package br.com.kasolution.exercicio7;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Item> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    public void limparCarrinho() {
        itens.clear();
    }
}