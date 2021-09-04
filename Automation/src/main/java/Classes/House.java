package Classes;

public class House {
    private int id;
    private int numberOfFlat;
    private int area;
    private int floor;
    private int numberOfRoom;
    private String street;
    private String typeOfBuilding;
    private int age;

    public House(int id, int numberOfFlat, int area, int floor, int numberOfRoom, String street,
                 String typeOfBuilding, int age) {
        this.id = id;
        this.numberOfFlat = numberOfFlat;
        this.area = area;
        this.floor = floor;
        this.numberOfRoom = numberOfRoom;
        this.street = street;
        this.typeOfBuilding = typeOfBuilding;
        this.age = age;
    }

    public House(int id, int numberOfFlat, int area) {
        this.id = id;
        this.numberOfFlat = numberOfFlat;
        this.area = area;
    }

    public House(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfFlat() {
        return this.numberOfFlat;
    }

    public void setNumberOfFlat(int numberOfFlat) {
        this.numberOfFlat = numberOfFlat;
    }

    public int getArea() {
        return this.area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor() {
        return this.floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumberOfRoom() {
        return this.numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTypeOfBuilding() {
        return this.typeOfBuilding;
    }

    public void setTypeOfBuilding(String typeOfBuilding) {
        this.typeOfBuilding = typeOfBuilding;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Home{id=" + this.id + ", numberOfFlat=" + this.numberOfFlat +
                ", area=" + this.area + ", floor=" + this.floor +
                ", numberOfRoom=" + this.numberOfRoom + ", street='" + this.street +
                ", typeOfBuilding='" + this.typeOfBuilding + ", age=" + this.age + '}';
    }
}

