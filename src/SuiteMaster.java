public class SuiteMaster  extends Room{
    public SuiteMaster(int numQuarto, int capacidade, double preco,  double roomSize, int typeOfRoom  ){
        super(numQuarto, capacidade, preco, roomSize, typeOfRoom);
    }
    public void exibirDetalhes(){
       super.displayDetails() ;
       System.out.println("\npossui banheira de hidromassagem");
    }
}
