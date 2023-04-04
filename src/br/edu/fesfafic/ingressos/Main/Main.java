package br.edu.fesfafic.ingressos.Main;

import br.edu.fesfafic.ingressos.Model.VendaIngressos;

public class Main {
    public static void main(String[] args){
        VendaIngressos venda = new VendaIngressos(300, 80);
        venda.verificarDisponibilidade();
        venda.comprarIngresso(3);
        venda.cancelarCompa(2);
        System.out.println(venda);
    }
}
