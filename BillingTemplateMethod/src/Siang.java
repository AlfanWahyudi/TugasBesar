public class Siang extends Paket{
    public Siang(Integer waktu, Integer harga) {
        this.waktu = waktu;
        this.harga = harga;
    }

    @Override
    public void memilihPaket(Integer waktu, Integer harga) {
        System.out.println("Paket Siang");
        System.out.println("Waktu : " + waktu + " Jam");
        System.out.println("Harga : Rp " + harga);
    }
}
