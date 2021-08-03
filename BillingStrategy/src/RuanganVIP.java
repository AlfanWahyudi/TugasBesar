public class RuanganVIP implements Ruangan{
    @Override
    public Double getHargaRuangan(Integer rawHarga) { return  rawHarga + rawHarga * 0.15; }
}
