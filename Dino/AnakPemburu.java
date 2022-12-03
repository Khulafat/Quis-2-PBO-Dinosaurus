package Dino;

/**
 *
 * @author Afad
 */
public class AnakPemburu extends Pemburu implements IMengambilTelur{
    
    public void anakPemburu(){
        System.out.println("Anak Pemburu1 adalah anak dari" + ortu);
    }
    
    @Override
    public void mengambilTelur(Dinosaurus dino) {
        System.out.println("Anak Pemburu mengambil Telur milik " + dino.ovi);
    }
    
}
