abstract class Contribuinte {

    Double rendaBrutaAnual;
    String nome;


    public Contribuinte(String nome, Double rendaBrutaAnual) {
        this.rendaBrutaAnual = rendaBrutaAnual;
        this.nome = nome;


    }

    public Double getRendaBrutaAnual() {
        return rendaBrutaAnual;
    }


    public String getNome() {
        return nome;
    }

    public abstract double fornecaImposto();
}