import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BillingApp {

    public static void main(String[] args) throws IOException {
        String username;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Paket paket = null;

        System.out.print("Masukkan Username : ");
        username = reader.readLine();

        System.out.println("\nDaftar Paket Bermain. \n" +
                           "1. Paket Malam\n" +
                           "2. Paket Siang");
        Integer pilihan = Integer.parseInt(reader.readLine());

        if (pilihan == 1 ) {
            paket = new Malam(8,20000);
        } else if (pilihan == 2) {
            paket = new Siang(8, 15000);
        }
        paket.proses(username);
    }
}
