package Lista03.src.questao04;

public class Casa extends Imovel {
    private double areaQuintal;
    private boolean temPiscina;

    public Casa(String endereco, double area, int numeroQuartos, double preco, double areaQuintal, boolean temPiscina) {
        super(endereco, area, numeroQuartos, preco);
        this.areaQuintal = areaQuintal;
        this.temPiscina = temPiscina;
    }

    @Override
    public double calcularTaxaAdministracao() {
        return this.preco * 0.10;
    }

    @Override
    public void exibirCaracteristicas() {
        super.exibirCaracteristicas();
        System.out.println("Área do Quintal: " + this.areaQuintal + "m²");
        System.out.println("Tem Piscina: " + (this.temPiscina ? "Sim" : "Não"));
    }
}
