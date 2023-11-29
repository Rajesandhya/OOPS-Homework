package oopshomework;

public class RunClass {
    public static void main(String[] args) {
        System.out.println(" Parents Class Fridge ");
        Fridge F = new Fridge();
        F.CheckingCompressor();
        F.CheckingFreezer();
        F.DigitalFeatures();
        F.switchon();

        System.out.println(" Child Class Samsung ");
        Samsung S = new Samsung();
        S.compressor();
        S.CheckingCompressor();
        S.digitalfeatures();
        S.switchon();
        S.CheckingFreezer();

        System.out.println(" Child Class Bosch ");
        Bosch B = new Bosch();
        B.CheckingCompressor();
        B.CheckingFreezer();
        B.switchon();
        B.DigitalFeatures();

        System.out.println(" Child Class Whirpool ");
        Whirpool W = new Whirpool();
        W.CheckingCompressor();
        W.CheckingFreezer();
        W.switchon();
        W.DigitalFeatures();

        System.out.println(" Child Class LG ");
        LG L = new LG();
        L.CheckingCompressor();
        L.CheckingFreezer();
        L.DigitalFeatures();
        L.switchon();
    }
}
