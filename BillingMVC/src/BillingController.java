public class BillingController {
    private Billing model;
    private BillingView view;

    public BillingController(Billing model, BillingView view) {
        this.model = model;
        this.view = view;
    }

    public String getBillingUsername() { return model.getUsername(); }

    public String getBillingPwd() { return model.getPwd(); }

    public String getBillingNamapaket() { return model.getNamaPaket(); }

    public Integer getBillingWaktu() { return model.getWaktu(); }

    public String getBillingRuangan() { return model.getRuangan(); }

    public Integer getBillingTarif() { return model.getTarif(); }

    public void setBillingUsername(String username) { this.model.setUsername(username); }

    public void setBillingPwd(String pwd) { this.model.setPwd(pwd); }

    public void setBillingNamaPaket(String namaPaket) { this.model.setNamaPaket(namaPaket); }

    public void setBillingWaktu(Integer waktu) { this.model.setWaktu(waktu); }

    public void setBillingRuangan(String ruangan) { this.model.setRuangan(ruangan); }

    public void setBillingTarif(Integer tarif) { this.model.setTarif(tarif); }

    public void updateView() {
        view.tampilBillingUser(getBillingUsername(), getBillingPwd(),
                    getBillingNamapaket(), getBillingWaktu(),
                    getBillingRuangan(), getBillingTarif());
    }
}
