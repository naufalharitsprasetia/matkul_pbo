package ekspresi;

/**
 *
 * @author NAUFAL HARITS PRASETIA
 */
public class kurangEkspresi implements duaEkspresi {
    // memiliki atribut sebanyak dua ekspresi
    private ekspresi x, y;
    
    // memilki constructor default
    // mengisi nilai x = y = 0
    public kurangEkspresi() {
        this.x = new ekspresi(0);
        this.y = new ekspresi(0);
    }
    
    // memiliki constructor yang menerima dua parameter ekspresi
    // mengisi nilai x = _x dan y = _y
    public kurangEkspresi(ekspresi _x, ekspresi _y) {
        this.x = _x;
        this.y = _y;
    }
    
    /**
     *
     * @return hasil nilai dari pengurangan x dan y
     */
    @Override
    public double getHasil() {
       return (this.x.getNilai() - this.y.getNilai());
    }
}
