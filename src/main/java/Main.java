public class Main {
    public static void main(String[] args) {
        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean isEligible = hasHighIncome || hasGoodCredit;
        System.out.println(isEligible);
    }
}
