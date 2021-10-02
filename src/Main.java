public class Main {
    public static void main(String[] args) {
        int initialAccount = 100;
        int replenishmentAmount = 1100;
        int bonus = 1;
        if (replenishmentAmount <= 100) {
            bonus = 0;
        }else {
             bonus = replenishmentAmount/100;
        }
        int finalAccount = initialAccount + bonus + replenishmentAmount;
        System.out.println(finalAccount);
    }
}
