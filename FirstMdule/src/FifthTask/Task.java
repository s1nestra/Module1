package FifthTask;

public class Task {
    public static void main(String[] args) {
        Horse horse = new Horse();
        if (horse.checkMove()){
            System.out.println("Ход правельный");
        }else
            System.out.println("ход не верный");
    }
}
