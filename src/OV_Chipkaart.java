import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "ov_chipkaart")
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
    @ManyToMany(mappedBy = "ovChipkaarts")
    private Set<Product> products;


    public OV_Chipkaart(Date geldig_Tot, int klasse, double saldo, Reiziger reiziger, Set<Product> producten) {
        this.geldig_Tot = geldig_Tot;
        this.klasse = klasse;
        this.saldo = saldo;
        this.reiziger = reiziger;
        this.products = producten;
    }

    public OV_Chipkaart() {

    }

    public Set<Product> getProducten() {
        return products;
    }

    public void setProducten(Set<Product> producten) {
        this.products = producten;
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
                ", producten" + products +
                '}';
    }
}
