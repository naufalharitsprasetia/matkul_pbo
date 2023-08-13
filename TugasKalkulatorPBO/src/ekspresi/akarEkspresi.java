package ekspresi;

/**
 *
 * @author NAUFAL HARITS PRASETIA
 */
public class akarEkspresi extends ekspresi {
    public akarEkspresi() {
        super();
    }
    
    public akarEkspresi(double x) {
        super(x);
    }
    
    // menghasilkan nilai pengakaran ekspresi
    @Override
    public double getHasil() {
        double num = this.getNilai(); // isi nilai num dengan this.getNilai()
        if (num < 0) {
            // lakukan throw
            throw new ArithmeticException("Tidak bisa mengakarkan bilangan negatif");
        } else {
            return Math.sqrt(num);
        }
    }
}