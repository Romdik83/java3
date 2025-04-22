public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int bonus;
        int newBalance;
        int payment = 300;
        if (payment > 1000) {
            bonus = payment / 100;
            newBalance = balance + bonus + payment;
        } else {
            bonus = 0;
            newBalance = balance + payment;
        }

        System.out.println("Итоговая сумма: " + newBalance);


    }
}