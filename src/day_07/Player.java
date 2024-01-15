package day_07;

public class Player {
    private int stamina;
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {

        if (stamina == 0) {
            return;
        }
        stamina--;
        if (stamina == 0){
            countPlayers--;
        }
    }

    public static void info() {
        String info = "Команды неполные. На поле еще есть ";
        if (countPlayers < 6) {
            switch (countPlayers) {
                case 1 -> System.out.println(info + (6 - countPlayers) + " свободных мест");
                case 4, 3, 2 -> System.out.println(info + (6 - countPlayers) + " свободных места");
                case 5 -> System.out.println(info + (6 - countPlayers) + " свободное место");
            }
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
