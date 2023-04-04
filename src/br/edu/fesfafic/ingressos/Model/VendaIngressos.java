package br.edu.fesfafic.ingressos.Model;

public class VendaIngressos {

    public int ingressosDisponiveis;
    public double precoUnitario;

    public VendaIngressos(int ingressosDisponiveis, double precoUnitario){
        this.ingressosDisponiveis = ingressosDisponiveis;
        this.precoUnitario = precoUnitario;
    }

    public void verificarDisponibilidade(){
        if(this.ingressosDisponiveis>1)
            System.out.println("Há ingressos disponíveis.");
        else if(this.ingressosDisponiveis>0)
            System.out.println("Há apenas 1 ingresso disponível.");
        else
            System.out.println("Ingressos esgotados.");
    }

    public void comprarIngresso(int quantidade){
        if (this.ingressosDisponiveis >= quantidade) {
            this.ingressosDisponiveis -= quantidade;
            System.out.println("Venda concluída com sucesso.");
        }
    }
    public void cancelarCompa(int quantidade){
        this.ingressosDisponiveis += quantidade;
        System.out.println("Ingresso(s) devolvido(s) com sucesso.");
    }

    public int getIngressosDisponiveis() {
        return ingressosDisponiveis;
    }

    public void setIngressosDisponiveis(int ingressosDisponiveis) {
        this.ingressosDisponiveis = ingressosDisponiveis;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public String toString(){
        return "VendaIngresso{" +
                "ingressosDisponiveis=" + this.ingressosDisponiveis +
                ", preçoUnitário=" + this.precoUnitario + '}';
    }
}
