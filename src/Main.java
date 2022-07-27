/**Класс Cow (weight, age, gender, nickName)
 Класс Sheep (weight, age, gender, nickName)
 Класс Horse (weight, age, gender, nickName)
 Класс Farm (address, cows, horses, sheep, ownerName)
 2 Farm тузунуздор  1 чи Farm да 3 sheep,5 cows, 2 horses болсун. 2 чи  Farm да 1 sheep, 1 cow, 1 horse болсун.*/

public class Main {
    public static void main(String[] args) {

        Cow cow1 = new Cow(209.89, 7, "Female", "Marusya");
        Cow cow2 = new Cow(334.14, 8, "Male", "Taratatr");
        Cow cow3 = new Cow(320.18, 2, "Male", "Kapsak");
        Cow cow4 = new Cow(354.84, 5, "Female", "Alabula");
        Cow cow5 = new Cow(247.04, 4, "Male", "Karakoz");
        Cow cow6 = new Cow(342.44, 5, "Female", "Suttuu");

        Cow [] cows = {cow1, cow2, cow3, cow4, cow5};
        Cow [] cows1 = {cow6};

        Sheep sheep1 = new Sheep(28.8, 3, "Male", "Sarykoi");
        Sheep sheep2 = new Sheep(33.9, 4, "Female", "Karakoi");
        Sheep sheep3 = new Sheep(51.3, 3, "Male", "Bozkoi");
        Sheep sheep4 = new Sheep(23.7, 6, "Male", "Akkoi");

        Sheep [] sheep01 = {sheep1, sheep2, sheep3};
        Sheep [] sheep02 = {sheep4};


        Horse horse1 = new Horse(250.3, 4, "Male", "Taytoru");
        Horse horse2 = new Horse(234.5, 8, "Female", "Gultoru");
        Horse horse3 = new Horse(223.9, 5, "Male", "Taybaatyr");


        Horse [] horses1 = {horse1, horse2};
        Horse [] horses2 = {horse3};


        Farm farm1 = new Farm("Balashikha", "Maksim Petrovich", cows, sheep01, horses1);
        Farm farm2 = new Farm("Lipetskaya", "Gaydar Viktorovich", cows1, sheep02, horses2);


        System.out.println("Farm 1: ");
        Farm [] farms = {farm1};
        for (Farm farm : farms) {
            System.out.println(farm.toString());
        }

        System.out.println("Farm 2: ");
        Farm [] farms1 = {farm2};
        for (Farm farm : farms1) {
            System.out.println(farm.toString());

        }
    }


}