public class BillingView {
    public void tampilBillingUser(String username, String pwd, String namaPaket, Integer waktu, String ruangan, Integer tarif) {
        System.out.println("username: " + username);
        System.out.println("Password: " + pwd);
        System.out.println("Paket: " + namaPaket);
        System.out.println("Waktu: " + waktu + " Jam");
        System.out.println("Ruangan: " + ruangan);
        System.out.println("Tarif: Rp " + tarif);
    }
}
