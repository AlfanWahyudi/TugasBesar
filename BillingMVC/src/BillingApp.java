public class BillingApp {

    public static void main(String[] args) {
        Billing billingModel = retriveBillingFromDatabase();
        BillingView billingView = new BillingView();
        BillingController billingController = new BillingController(billingModel, billingView);

        System.out.println("-------Billing--------");

        billingController.updateView();

        billingController.setBillingUsername("alfan");
        billingController.setBillingPwd("1234");
        billingController.setBillingNamaPaket("Malam");
        billingController.setBillingWaktu(8);
        billingController.setBillingRuangan("VIP");
        billingController.setBillingTarif(30000);

        System.out.println("\n--------Other--------");

        billingController.updateView();
    }

    private static Billing retriveBillingFromDatabase() {
        Billing billing = new Billing();
        billing.setUsername("shendi");
        billing.setPwd("1234");
        billing.setNamaPaket("Malam");
        billing.setWaktu(8);
        billing.setRuangan("VIP");
        billing.setTarif(30000);

        return billing;
    }

}
