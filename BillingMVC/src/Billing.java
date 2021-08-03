public class Billing {
    private String username;
    private String pwd;
    private String namaPaket;
    private Integer waktu;
    private String ruangan;
    private Integer tarif;

    public String getUsername() { return username; }

    public String getPwd() { return pwd; }

    public String getNamaPaket() { return namaPaket; }

    public Integer getWaktu() { return waktu; }

    public String getRuangan() { return ruangan; }

    public Integer getTarif() { return tarif; }

    public void setUsername(String username) { this.username = username; }

    public void setPwd(String pwd) { this.pwd = pwd; }

    public void setNamaPaket(String namaPaket) { this.namaPaket = namaPaket; }

    public void setWaktu(Integer waktu) { this.waktu = waktu; }

    public void setRuangan(String ruangan) { this.ruangan = ruangan; }

    public void setTarif(Integer tarif) { this.tarif = tarif; }
}
