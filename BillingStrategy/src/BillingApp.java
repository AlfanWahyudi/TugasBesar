public class BillingApp {
    public static void main(String[] args) {
        RuanganReguler ruanganReguler = new RuanganReguler();
        RuanganVIP ruanganVIP = new RuanganVIP();

        PelangganBill pelangganSatu = new PelangganBill();
        System.out.println("Pelangan Pertama");
        pelangganSatu.setRuangan(ruanganReguler);
        pelangganSatu.setWaktu(4);
        pelangganSatu.setHarga(12000);
        pelangganSatu.tampil();

        PelangganBill pelangganDua = new PelangganBill();
        System.out.println("\nPelanggan Dua");
        pelangganDua.setRuangan(ruanganVIP);
        pelangganDua.setWaktu(4);
        pelangganDua.setHarga(12000);
        pelangganDua.tampil();
    }
}
