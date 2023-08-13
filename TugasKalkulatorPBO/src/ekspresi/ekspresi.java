package ekspresi;

/**
 *
 * @author NAUFAL HARITS PRASETIA
 */
public class ekspresi {
    // memiliki atribut double nilai
    private double nilai;
    
    // memilki default constructor yang mengisi nilai = 0.0
    ekspresi() {
        this.nilai = 0.0;
    }
    
    // memiliki constructor menerima satu buah parameter double
    ekspresi(double x) {
        this.nilai = x;
    }
    
    // setter untuk atribut nilai
    public void setNilai(double x) {
        this.nilai = x;
    }
    
    // getter untuk atribut nilai
    public double getNilai() {
        return this.nilai;
    }
    
    public double getHasil() {
        return this.nilai;
    }
}
