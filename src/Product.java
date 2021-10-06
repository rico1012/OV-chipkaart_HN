import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    @Id
    @Column(name = "product_nummer")
    private long productnummer;
    private String naam;
    private String beschrijving;
    private double prijs;

    @ManyToMany
    @JoinTable(
            name = "ov_chipkaart_product",
            joinColumns = @JoinColumn(name = "kaart_nummer"),
            inverseJoinColumns = @JoinColumn(name = "product_nummer"))
    private List<OV_Chipkaart> ovChipkaart_kaart_nummer;

    public Product(String naam, String beschrijving, double prijs) {
        this.naam = naam;
        this.beschrijving = beschrijving;
        this.prijs = prijs;
//        this.ovChipkaarten = new ArrayList<>();
    }

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
                ", ovchipkaarten="+ovChipkaart_kaart_nummer+
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

    public List<OV_Chipkaart> getOvChipkaart() {
        return ovChipkaart_kaart_nummer;
    }

    public void setOvChipkaarten(List<OV_Chipkaart> ovChipkaart) {
        this.ovChipkaart_kaart_nummer = ovChipkaart;
    }
}
