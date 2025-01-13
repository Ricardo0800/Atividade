public class SuitePresidencial extends Room{
    private int salasPrivativas;
    public SuitePresidencial(int numQuarto, int capacidade, double preco,  double roomSize, int typeOfRoom, int numSalas  ){
        super(numQuarto, capacidade, preco, roomSize, typeOfRoom);
        this.salasPrivativas = numSalas;
    }
    public void exibirDetalhes(){
        super.displayDetails();
        System.out.println("\nTem Hidromassagem\nNumero de salas privativas: "+salasPrivativas);
    }
}
