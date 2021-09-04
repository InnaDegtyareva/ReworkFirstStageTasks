package Classes;

public class Runner {
    public static void main(String[] args) {
        House[] houses = new House[]
                {new House(1, 2, 38, 1, 2, "Светская",
                        "Жилой одноэтажный", 10),
                        new House(2, 15, 60, 2, 3, "Ивовская",
                                "Жилой многоэтажный", 15),
                        new House(3, 100, 26, 10, 4, "Лазурная",
                                "Жилой многоэтажный", 2),
                        new House(4, 26, 43, 10, 3, "Анеевская",
                                "Жилой одноэтажный", 20),
                        new House(5, 0, 90, 1, 1, "Короткая",
                                "Общественное здание", 1),
                        new House(6, 46, 31, 5, 2, "Лесная",
                                "Жилой многоэтажный", 40),
                        new House(7, 125, 120, 12, 2, "Верхняя",
                                "Жилой многоэтажный", 40),
                        new House(8, 20, 110, 3, 5, "Ленонская",
                                "Жилой одноэтажный", 60)};

        printFlatsWithSeveralRooms(2, houses);
        printFlatsWithSeveralRoomsAndUpperSomeFloor(3, 5, houses);
        printRoomsLargerThenSomeArea(52, houses);
    }

    public static void printFlatsWithSeveralRooms(int numberOfRoom, House[] houses) {
        System.out.println("Список квартир с количеством комнат: " + numberOfRoom);
        for (House house : houses) {
            if (house.getNumberOfRoom() == numberOfRoom) {
                System.out.println(house);
            }
        }
    }

    public static void printFlatsWithSeveralRoomsAndUpperSomeFloor(int numberOfRoom, int floor, House[] houses) {
        System.out.println("Список квартир, раположенных выше " + floor +
                " этажа" + " и имеющих " + numberOfRoom + " комнат(ы)");
        for (House house : houses) {
            if (house.getNumberOfRoom() == numberOfRoom && house.getFloor() > floor) {
                System.out.println(house);
            }
        }
    }

    public static void printRoomsLargerThenSomeArea(int area, House[] houses) {
        System.out.println("Список квартир с площадью, больше " + area + " кв.метра(ов)");
        for (House house : houses) {
            if (house.getArea() > area) {
                System.out.println(house);
            }
        }
    }
}


