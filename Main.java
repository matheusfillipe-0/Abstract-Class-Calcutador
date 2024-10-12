
public class Main {
    public static void main(String[] args) {
        Contribuinte fisico  = new Fisico("João Silva", 15000.0, 2000.0,2000.0);
        Contribuinte juridico = new Juridico("Jose Silva", 300000.0, 2000.0,2000.0);

        System.out.println("Imposto Pessoa Física: " + fisico.fornecaImposto());
        System.out.println("Imposto Pessoa Física: " + juridico.fornecaImposto());

    }
}