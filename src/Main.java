
public class Main {

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();
        bankApplication.processValidation("accountId000", 50, "USD");
        bankApplication.processValidation("accountId003", 250, "HRV");
        bankApplication.processValidation("accountId001", 50, "EUR");
        bankApplication.processValidation("accountId001", 50, "USD");
        bankApplication.processValidation("accountId001", 50, "USD");
    }
}

