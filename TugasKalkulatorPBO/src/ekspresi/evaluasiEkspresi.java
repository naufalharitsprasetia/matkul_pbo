/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspresi;

import kalkulator.Kalkulator;

/**
 *
 * @author NAUFAL HARITS PRASETIA
 */
public class evaluasiEkspresi {
    // memiliki satu buah atribut bernama masukan bertipe String
    private String masukan;
    
    // memiliki default constructor, dengan string kosong
    public evaluasiEkspresi() {
        this.masukan = "";
    }
    
    // memiliki constructor menerima satu parameter
    public evaluasiEkspresi(String inp) {
        this.masukan = inp;
    }
    
    public void cekValid() {
        int cnt = 0;
        int op = 0;
        for (int i = 0; i < this.masukan.length(); i++) {
            char cur = this.masukan.charAt(i);
            if (i > 0 && this.masukan.charAt(i - 1) == cur) {
                if (cur == '+' || cur == '-')
                    throw new RuntimeException("Bilangan tidak valid");
            } else if (('0' <= cur && cur <= '9') || (cur == '.')) {
                if (cur == '.') cnt++;
                if (cnt > 1) throw new RuntimeException("Bilangan tidak valid");
            } else {
                cnt = 0;
            }
        }
    }
    
    // ubah Ans menjadi nilai yang seharusnya
    public String ubahEkspresi() {
        String hasil = "";
        for (int i = 0; i < this.masukan.length(); i++) {
            switch (this.masukan.charAt(i)) {
                case 'A':
                    hasil += Double.toString(Kalkulator.nilaiAns);
                    i += 2;
                    break;
                case '√':
                    hasil += "s";
                    break;
                default:
                    hasil += this.masukan.charAt(i);
                    break;
            }
        }
        return hasil;
    }
    
    // lakukan method overloading, dengan string yg diinginkan saja
    public String ubahEkspresi(String str) {
        String hasil = "";
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'A':
                    hasil += Double.toString(Kalkulator.nilaiAns);
                    i += 2;
                    break;
                case '√':
                    hasil += "s";
                    break;
                default:
                    hasil += str.charAt(i);
                    break;
            }
        }
        return hasil;
    }
    
    // lakukan parse sekaligus evaluasi
    public ekspresi hasilEvaluasi() {
        String str = this.ubahEkspresi();
        if (str.equals("")) return new ekspresi();
     
        return new Object() {
            
            int posisi = - 1, CC;
            
            void charBerikutnya() {
                CC = (++posisi < str.length()) ? str.charAt(posisi) : -1;
            }
            
            boolean AdvChar(int chr) {
                while (CC == ' ') charBerikutnya();
                if (CC == chr) {
                    charBerikutnya();
                    return true;
                }
                return false;
            }
            
            ekspresi pecah() {
                charBerikutnya();
                ekspresi x = pecahEkspresi();
                if (posisi < str.length())
                    throw new RuntimeException("Terdapat syntax error");
                return x;
            }
            
            ekspresi pecahEkspresi() {
                ekspresi x = pecahIstilah();
                while (true) {
                    if (AdvChar('+')) {
                        tambahEkspresi t = new tambahEkspresi(x, pecahIstilah());
                        x.setNilai(t.getHasil());
                    } else if (AdvChar('-')) {
                        kurangEkspresi k = new kurangEkspresi(x, pecahIstilah());
                        x.setNilai(k.getHasil());
                    } else {
                        return x;
                    }
                }
            }
            
            ekspresi pecahIstilah() {
                ekspresi x = pecahFaktor();
                while (true) {
                    if (AdvChar('*')) {
                        kaliEkspresi k = new kaliEkspresi(x, pecahFaktor());
                        x.setNilai(k.getHasil());
                    } else if (AdvChar('/')) {
                        bagiEkspresi b = new bagiEkspresi(x, pecahFaktor());
                        x.setNilai(b.getHasil());
                    } else {
                        return x;
                    }
                }
            }
            
            ekspresi pecahFaktor() {
                if (AdvChar('+')) return pecahFaktor();
                if (AdvChar('-')) {
                    ekspresi t = pecahFaktor();
                    t.setNilai(-t.getNilai());
                    return t;
                }
                
                ekspresi x = new ekspresi();
                int startPosisi = this.posisi;
                
                if (AdvChar('(')) {
                    x = pecahEkspresi();
                    AdvChar(')');
                } else if ((CC >= '0' && CC <= '9') || CC == '.') {
                    int cnt = 0;
                    while ((CC >= '0' && CC <= '9') || CC == '.') charBerikutnya();
                    x.setNilai(Double.parseDouble(str.substring(startPosisi, this.posisi)));
                } else if (CC >= 'a' && CC <= 'z') {
                    while (CC >= 'a' && CC <= 'z') charBerikutnya();
                    String fungsi = str.substring(startPosisi, this.posisi);
                    x = pecahFaktor();
                    if (fungsi.equals("s")) {
                        akarEkspresi k = new akarEkspresi(x.getNilai());
                        x.setNilai(k.getHasil());
                    } else {
                        throw new RuntimeException("Fungsi tidak diketahui : " + (char) CC);
                    }
                } else {
                    throw new RuntimeException("Terdapat syntax error");
                }
                
                if (AdvChar('^')) {
                    pangkatEkspresi p = new pangkatEkspresi(x, pecahFaktor());
                    x.setNilai(p.getHasil());
                }
                
                return x;
            }
        }.pecah();
    }
}
