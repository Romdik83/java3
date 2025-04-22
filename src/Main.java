public class Main {
    public static void main(String[] args) {
        int balans = 100;
        int bonus;
        int newBalans;
        int payment = 300;
        if (payment > 1000) {
            bonus = payment / 100;
            newBalans = balans + bonus + payment;
        } else {
            bonus = 0;
            newBalans = balans + payment;
        }

        System.out.println("Итоговая сумма: " + newBalans);


    }
}