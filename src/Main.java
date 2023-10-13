public class Main {
    public static void main(String[] args) {

        int initially = 100;
        int replenishment = 300;
        int bonus = replenishment / 100;
        int result = initially + replenishment + bonus;
        int resultWithoutBonus = initially + replenishment;

        if (replenishment > 1000) {
            System.out.println("Итоговый счет " + result);
            System.out.println("Бонус " + bonus);
        } else {
            System.out.println("Итоговый счет " + resultWithoutBonus);
            System.out.println("Бонус 0");
        }
    }

}


