public class PelangganBill {
    private Ruangan ruangan;
    private Integer waktu;
    private Integer harga;

    public Integer getWaktu() { return waktu; }

    public Integer getHarga() { return harga; }

    public void setRuangan(Ruangan ruangan) { this.ruangan = ruangan; }

    public void setWaktu(Integer waktu) { this.waktu = waktu; }

    public void setHarga(Integer harga) { this.harga = harga; }

    public Double total() { return this.ruangan.getHargaRuangan(getHarga()); }

    public void tampil() {
        System.out.println("Waktu Bermain Selama : " + getWaktu() + " Jam");
        System.out.println("Total Biaya : Rp " + total());
    }
}
