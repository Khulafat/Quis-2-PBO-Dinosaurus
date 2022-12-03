package Dino;

/**
 *
 * @author Afad
 */
public class Oviraptor extends Dinosaurus implements IBertelur{

    @Override
    public void makan() {
        System.out.println("Pemakan Telur");
    }

    @Override
    public void berjalan() {
        System.out.println("Berjalan dengan dua kaki");
    }

    @Override
    public void bertelur() {
        System.out.println("Melahirkan dengan cara bertelur");
    }
    
}
