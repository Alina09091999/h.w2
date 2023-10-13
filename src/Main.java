public class Main {
    public static void main(String[] args) {

        int initially = 50;
        int replenishment = 70;
        int bonus = replenishment / 100;
        int result = initially + replenishment + bonus;

        if (replenishment > 1000) {
            System.out.println("Итоговый счет " + result);
            System.out.println("Бонус " + bonus);
        } else {
            System.out.println("Итоговый счет " + result);
            System.out.println("Бонус 0");
        }
    }

}


