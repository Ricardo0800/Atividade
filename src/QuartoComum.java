public class QuartoComum extends Room{
    public QuartoComum(int numQuarto, int capacidade, double preco,  double roomSize, int typeOfRoom  ){
        super(numQuarto, capacidade, preco, roomSize, typeOfRoom);
    }
        public void displayDetails() {
            System.out.println("Detalhes do Quarto:");
            System.out.println("Número do Quarto: " + super.getRoomNumber());
            System.out.println("Capacidade de Hóspedes: " + getGuestCapacity());
            System.out.println("Preço por Noite: R$" + getPricePerNight());
            System.out.println("Tamanho do Quarto: " + super.getRoomSize() + " m²");
            System.out.println("Tipo de quarto : " + super.getTypeOfRoom());
        }
    }
 
