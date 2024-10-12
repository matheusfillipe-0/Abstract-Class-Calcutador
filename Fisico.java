public class Fisico extends Contribuinte{
    Double gastosSaude;
    Double gastosEduca;

    public Fisico(String nome, Double rendaBrutaAnual,Double gastosSaude,Double gastosEduca) {
        super(nome, rendaBrutaAnual);
        this.gastosSaude = gastosSaude;
        this.gastosEduca = gastosEduca;
    }


    public Double getGastosSaude() {
        return gastosSaude;
    }

    public Double getgastosEduca() {
        return gastosEduca;
    }

    @Override
    public double fornecaImposto(){
        double Imposto = 0;
        if (getRendaBrutaAnual() >  20000){
            Imposto = getRendaBrutaAnual() * 0.25;
        } else if (getRendaBrutaAnual() > 10.000) {
            Imposto = getRendaBrutaAnual() * 0.10;
        }
        return Imposto;
    }
}
