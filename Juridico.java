public class Juridico extends Contribuinte {
    Double gastosPessoal;
    Double gastosEqui;

    public Juridico(String nome, Double rendaBrutaAnual, Double gastosPessoal, Double gastosEqui) {
        super(nome, rendaBrutaAnual);
        this.gastosPessoal = gastosPessoal;
        this.gastosEqui = gastosEqui;
    }

    public Double getGastosPessoal() {
        return gastosPessoal;
    }

    public Double getGastosEqui() {
        return gastosEqui;
    }

    @Override
    public double fornecaImposto(){
        double Imposto = 0;
        if (getRendaBrutaAnual() > 200000){
            Imposto = getRendaBrutaAnual() * 0.30;
        } else if (getRendaBrutaAnual() > 100000) {
            Imposto = getRendaBrutaAnual() * 0.10;
        } else {
            Imposto = getRendaBrutaAnual() * 0.05;
        }
        return Imposto;
    }
}