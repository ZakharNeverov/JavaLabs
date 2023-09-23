import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Hero hero = new Hero(new WalkStrategy());
        System.out.println("Введите тип передвижения героя\n 1 - Пешком\n 2 - На лошади\n 3 - Полёт\n 4 - Передвижение героя \n 5 - Выход из программы\n");
        int choice = 0;
        WalkStrategy ws = new WalkStrategy();
        HorseRidingStrategy hs = new HorseRidingStrategy();
        FlyingStrategy fs = new FlyingStrategy();
        try{
            do {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> {
                        hero.setMovementStrategy(ws);
                        hero.move();
                    }
                    case 2 -> {
                        hero.setMovementStrategy(hs);
                        hero.move();
                    }
                    case 3 -> {
                        hero.setMovementStrategy(fs);
                        hero.move();
                    }
                    case 4 -> {
                        hero.move();
                    }
                    case 5 -> {
                        System.out.println("Выход\n");
                    }
                    default -> System.out.println("Неправильно введёное значение\n");
                }
            } while(choice !=5);
        }
        catch (Exception e) {
            System.out.println(e.getMessage() + "\n");
            e.printStackTrace();
        }
        scanner.close();
    }

}
