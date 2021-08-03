public abstract class Paket {
    public Integer waktu;
    public Integer harga;

    public Paket() {
        super();
    }

    public final void proses(String username) {
        try {
            System.out.println("\n\nUsername : " + username);
            memilihPaket(this.waktu, this.harga);
            System.out.println("--------Selamat Bermain--------");
        }
        catch (Exception e) {
            System.out.println("Gagal Memilih Paket");
        }
    }

    public abstract void memilihPaket(Integer waktu, Integer harga);
}
