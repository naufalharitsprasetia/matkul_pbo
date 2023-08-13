package ekspresi;

/**
 *
 * @author NAUFAL HARITS PRASETIA
 */
public class bagiEkspresi implements duaEkspresi {
    // memiliki atribut sebanyak dua ekspresi
    private ekspresi x, y;
    
    // memilki constructor default
    // mengisi nilai x = y = 0
    public bagiEkspresi() {
        this.x = new ekspresi(0);
        this.y = new ekspresi(0);
    }
    
    // memiliki constructor yang menerima dua parameter ekspresi
    // mengisi nilai x = _x dan y = _y
    public bagiEkspresi(ekspresi _x, ekspresi _y) {
        this.x = _x;
        this.y = _y;
    }
    
    /**
     *
     * @return hasil nilai dari pembagian x dan y
     * (jika tidak valid keluarkan -1 dan throw exception)
     */
    @Override
    public double getHasil() {
        if (this.y.getNilai() == 0) {
            throw new ArithmeticException("Tidak bisa membagi suatu bilangan dengan 0");
        } else {
            return this.x.getNilai() / this.y.getNilai();
        }
    }
}
