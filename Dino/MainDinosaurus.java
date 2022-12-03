package Dino;

/**
 *
 * @author Afad
 */
public class MainDinosaurus {
    public static void main(String[] args) {
        TyrannosaurusRex trex = new TyrannosaurusRex();
        Triceratops trice = new Triceratops();
        Oviraptor ovi = new Oviraptor();
        Pemburu pemburu = new Pemburu();
        AnakPemburu anakPemburu = new AnakPemburu();
        
        System.out.println("TyrannosaurusRex merupakan");
        trex.makan();
        trex.berjalan();
        System.out.println("\n");
        
        System.out.println("Triceratops merupakan");
        trice.makan();
        trice.berjalan();
        System.out.println("\n");
        
        System.out.println("Oviraptor merupakan");
        ovi.makan();
        ovi.berjalan();
        ovi.bertelur();
        System.out.println("\n");
        
        pemburu.berburu(trex);
        System.out.println("\n");
        
        anakPemburu.anakPemburu();
        anakPemburu.mengambilTelur(ovi);
    }
}
