import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "product_nummer")
    private long productnummer;
    private String naam;
    private String beschrijving;
    private double prijs;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "ov_chipkaart_product",
            joinColumns = {@JoinColumn(name = "kaart_nummer")},
            inverseJoinColumns = {@JoinColumn(name = "product_nummer")})
    Set<OV_Chipkaart> ovChipkaarts=new HashSet<>();;



    public Product(int product_nummer, String naam, String beschrijving, double prijs) {
        this.productnummer = product_nummer;
        this.naam = naam;
        this.beschrijving = beschrijving;
        this.prijs = prijs;
//        this.ovChipkaarten = new ArrayList<>();
    }

    public Product() {

    }

    @Override
    public String toString() {
//        List<Long> ovchipkaarten = new ArrayList<>();
//        for (OVChipkaart ovChipkaart : this.ovChipkaarten){
//            ovchipkaarten.add(ovChipkaart.getKaartNummer());
//        }
        return "product{" +
                "product_nummer=" + productnummer +
                ", naam='" + naam + '\'' +
                ", beschrijving='" + beschrijving + '\'' +
                ", prijs=" + prijs + '\'' +
                ", ovchipkaarten="+ovChipkaarts+
                '}';
    }


    public long getProduct_nummer() {
        return productnummer;
    }

    public void setProduct_nummer(int product_nummer) {
        this.productnummer = product_nummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public Set<OV_Chipkaart> getOvChipkaart() {
        return ovChipkaarts;
    }

    public void setOvChipkaarten(Set<OV_Chipkaart> ovChipkaart) {
        this.ovChipkaarts = ovChipkaart;
    }
}
