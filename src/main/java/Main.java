public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        int amount = 1000_600;
        boolean registered = true;


        long bonus = service.calculate(amount, registered);
        System.out.println(bonus);

    }
}

