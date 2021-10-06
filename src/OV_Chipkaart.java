import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class OV_Chipkaart {
    @Id
    @Column(name = "kaart_nummer")
    private long kaartNummer;
    private Date geldig_Tot;
    private int klasse;
    private double saldo;
    @ManyToOne
    @JoinColumn(name = "reiziger_id")
    private Reiziger reiziger;
    @ManyToMany(mappedBy = "ovChipkaart_kaart_nummer")
    private List<Product> product_nummer;


    public OV_Chipkaart(Date geldig_Tot, int klasse, double saldo, Reiziger reiziger, List<Product> producten) {
        this.geldig_Tot = geldig_Tot;
        this.klasse = klasse;
        this.saldo = saldo;
        this.reiziger = reiziger;
        this.product_nummer = producten;
    }

    public OV_Chipkaart() {

    }

    public List<Product> getProducten() {
        return product_nummer;
    }

    public void setProducten(List<Product> producten) {
        this.product_nummer = producten;
    }

    public long getKaartNummer() {
        return kaartNummer;
    }

    public void setKaartNummer(int kaartNummer) {
        this.kaartNummer = kaartNummer;
    }

    public Date getGeldigTot() {
        return geldig_Tot;
    }

    public void setGeldigTot(Date geldigTot) {
        this.geldig_Tot = geldigTot;
    }

    public int getKlasse() {
        return klasse;
    }

    public void setKlasse(int klasse) {
        this.klasse = klasse;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Reiziger getReiziger() {
        return reiziger;
    }

    public void setReiziger(Reiziger reiziger) {
        this.reiziger = reiziger;
    }

    @Override
    public String toString() {
//        List<Long> nmr = new ArrayList<>();
//        for (Product product : this.producten){
//            nmr.add(product.getProduct_nummer());
//        }
        return "OVChipkaart{" +
                "kaartNummer=" + kaartNummer +
                ", geldigTot=" + geldig_Tot +
                ", klasse=" + klasse +
                ", saldo=" + saldo +
                ", reiziger=" + reiziger +
                ", producten" + product_nummer +
                '}';
    }
}
