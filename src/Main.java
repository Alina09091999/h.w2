public class Main {
    public static void main(String[] args) {

        int initially = 50;
        int replenishment = 1170;
        int bonus = replenishment / 100;
        int result = initially + replenishment + bonus;

        if (replenishment > 1000) {
            System.out.println(result);
        } else {
            System.out.println(initially + replenishment);
        }
    }
}

// Объявляете переменные для входных данных и
// параметров программы: начального счёта,
// суммы пополнения и тп

// Условным оператором проверяете, превысила ли
// сумма пополнения порог, и для этих двух разных
// сценариев рассчитываете сумму бонуса и выводите
// на экран.
