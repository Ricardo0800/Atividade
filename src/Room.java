public class Room {
    private int roomNumber;
    private int guestCapacity;
    private double pricePerNight;
    private double roomSize;
    private int typeOfRoom;
    
    public Room(int roomNumber, int guestCapacity, double pricePerNight, double roomSize,int typeOfRoom) {
        setRoomNumber(roomNumber);
        setGuestCapacity(guestCapacity);
        setPricePerNight(pricePerNight);
        setRoomSize(roomSize);
        setTypeOfRoom(typeOfRoom);
    }

    public int getRoomNumber() {
        return roomNumber;
    }
    public void setTypeOfRoom(int typeOfRoom) {
        if(typeOfRoom <= 3 && typeOfRoom >= 1) {
        this.typeOfRoom = typeOfRoom;
    }else{
        System.out.println("Invalid room type");
        
    }
}

    public void setRoomNumber(int roomNumber) {
        if (roomNumber <= 0) {
            throw new IllegalArgumentException("O número do quarto deve ser maior que 0.");
        }
        this.roomNumber = roomNumber;
    }

    public int getGuestCapacity() {
        return guestCapacity;
    }

    public void setGuestCapacity(int guestCapacity) {
        if (guestCapacity <= 0) {
            throw new IllegalArgumentException("A capacidade de hóspedes deve ser maior que 0.");
        }
        this.guestCapacity = guestCapacity;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        if (pricePerNight <= 0) {
            throw new IllegalArgumentException("O preço por noite deve ser positivo.");
        }
        this.pricePerNight = pricePerNight;
    }

    public double getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(double roomSize) {
        if (roomSize <= 0) {
            throw new IllegalArgumentException("O tamanho do quarto deve ser positivo.");
        }
        this.roomSize = roomSize;
    }
    public int getTypeOfRoom() {
        return typeOfRoom;
    }

    public void displayDetails() {
        System.out.println("Detalhes do Quarto:");
        System.out.println("Número do Quarto: " + roomNumber);
        System.out.println("Capacidade de Hóspedes: " + guestCapacity);
        System.out.println("Preço por Noite: R$" + pricePerNight);
        System.out.println("Tamanho do Quarto: " + roomSize + " m²");
        System.out.println("Tipo de quarto : " + typeOfRoom);
    }
}
