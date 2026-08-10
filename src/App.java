import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Room> rooms = new ArrayList<>(); // Lista para armazenar os quartos cadastrados
        int op = 0;

        // Variáveis declaradas fora do switch para evitar erros de repetição
        int roomNumber = 0;
        int capacity = 0;
        double price = 0.0;
        double size = 0.0;
        int privateRooms = 0;

        System.out.println("Cadastro de quartos");

        while (op != 4) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastro de Quarto Comum");
            System.out.println("2. Cadastro de Suíte Master");
            System.out.println("3. Cadastro de Suíte Presidencial");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            op = scan.nextInt();

            if (op == 1 || op == 2 || op == 3) {
                // Solicita as informações comuns a todos os tipos de quarto
                System.out.print("Número do quarto: ");
                roomNumber = scan.nextInt();
                System.out.print("Capacidade de hóspedes: ");
                capacity = scan.nextInt();
                System.out.print("Preço por noite: ");
                price = scan.nextDouble();
                System.out.print("Tamanho do quarto (m²): ");
                size = scan.nextDouble();
            }

            if (op == 1) {
                rooms.add(new QuartoComum(roomNumber, capacity, price, size, 1));
                System.out.println("Quarto Comum cadastrado com sucesso!");
            } else if (op == 2) {
                rooms.add(new SuiteMaster(roomNumber, capacity, price, size, 2));
                System.out.println("Suíte Master cadastrada com sucesso!");
            } else if (op == 3) {
                System.out.print("Número de salas privativas: ");
                privateRooms = scan.nextInt();
                rooms.add(new SuitePresidencial(roomNumber, capacity, price, size, 3, privateRooms));
                System.out.println("Suíte Presidencial cadastrada com sucesso!");
            } else if (op == 4) {
                System.out.println("Encerrando cadastro...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        // Exibe todos os quartos cadastrados
        System.out.println("\n--- Quartos Cadastrados ---");
        for (Room room : rooms) {
            // Exibe os detalhes do quartos
            room.displayDetails();
            
            // Exibe o tipo do quarto (número inteiro que representa o tipo)
            System.out.println("Tipo de Quarto: " + room.getTypeOfRoom());

            // Exibe o número de salas privativas apenas para Suítes Presidenciais
            if (room instanceof SuitePresidencial) {
                SuitePresidencial suite = (SuitePresidencial) room;
                System.out.println("Número de salas privativas: " + suite.getSalasPrivativas());
            }
            
            System.out.println("---------------------------");
        }

        // Exibe o total de quartos cadastrados
        System.out.println("Total de quartos cadastrados: " + rooms.size());

        scan.close();
    }
}

