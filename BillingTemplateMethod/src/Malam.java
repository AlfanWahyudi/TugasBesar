public class Malam  extends Paket{
    public Malam(Integer waktu, Integer harga) {
        this.waktu = waktu;
        this.harga = harga;
    }

    @Override
    public void memilihPaket(Integer waktu, Integer harga) {
        System.out.println("Paket Malam");
        System.out.println("Waktu : " + waktu + " Jam");
        System.out.println("Harga : Rp " + harga);
    }
}
