import domain.Hero;
import exception.InvalidNameException;
import service.HeroService;

public class Main {

    public static void main(String[] args) {

/*        HeroService HeroService = new HeroService();
        Faction faction = new Horde();
        Spec newSpec = new Mage();

        try {
            Hero myHero = HeroService.createHero(faction, newSpec,"");
            myHero.getFaction().shout();
            myHero.getSpec().attack();

        } catch (InvalidNameException e) {
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("ddddddddddddddddd");

        }*/

        HeroService HeroService = new HeroService();
        try{
            Hero myHero1 = HeroService.generateRandomHero("Punka");
            Hero myHero2 = HeroService.generateRandomHero("Lone");
            myHero1.getFaction().shout();
            myHero1.getSpec().attack();
            myHero2.getFaction().shout();
            myHero2.getSpec().attack();

        }catch (InvalidNameException e){
            System.out.println("oops!");

        }





    }
}
