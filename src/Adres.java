import javax.persistence.*;

@Entity
public class Adres {
    @Id
    @Column(name = "adres_id")
    private long adres_id;
    private String postcode;
    private String huisnummer;
    private String straat;
    private String woonplaats;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "reiziger_id")
    private Reiziger reiziger_id;

    public Adres(String postcode, String huisnummer, String straat, String woonplaats, Reiziger reiziger) {
        this.postcode = postcode;
        this.huisnummer = huisnummer;
        this.straat = straat;
        this.woonplaats = woonplaats;
        this.reiziger_id = reiziger;
    }

    public Adres() {

    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }


    public long getAdres_id() {
        return adres_id;
    }

    public void setAdres_id(long adres_id) {
        this.adres_id = adres_id;
    }

    public String getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(String huisnummer) {
        this.huisnummer = huisnummer;
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }


    public Reiziger getReiziger() {
        return reiziger_id;
    }

    public void setReiziger(Reiziger reiziger) {
        this.reiziger_id = reiziger;
    }



    @Override
    public String toString() {
        return "Adres{" +
                "id=" + adres_id +
                ", postcode='" + postcode + '\'' +
                ", huisnummer='" + huisnummer + '\'' +
                ", straat='" + straat + '\'' +
                ", woonplaats='" + woonplaats + '\'' +
                ", reiziger=" + reiziger_id +
                '}';
    }




}
