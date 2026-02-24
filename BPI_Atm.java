public class BPI_Atm {
    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        int[] amounts = {2970, 270, 250};
        for (int amount : amounts) {
            System.out.println("\nWithdrawing: " + amount);
            if (amount % 10 != 0) {
                System.out.println("Amount " + amount + " should be in multiples of 10s.");
            } else {
                atmDispenser.dispense(new Currency(amount));
            }
        }
    }
}
