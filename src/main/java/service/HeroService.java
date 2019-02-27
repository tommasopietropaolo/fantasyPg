package service;

import domain.*;
import exception.InvalidNameException;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HeroService {

    public Hero createHero(Faction faction, Spec spec, String name) throws InvalidNameException {

        this.checkName(name);

        Hero myhero = new Hero(name)
                .withFaction(faction)
                .withSpec(spec);

        return myhero;
    }

    private void checkName(String name) throws InvalidNameException {
        if (name == null || name.isEmpty()) {
            throw new InvalidNameException("Il nome selezionato non è valido");
        }
    }

    public Hero generateRandomHero(String name) throws InvalidNameException {


        List<Spec> specs = Arrays.asList(new Mage(), new Hunter(), new Warrior());
        Random randomSpec = new Random();
        Spec spec = specs.get(randomSpec.nextInt(specs.size()));


        List<Faction> factions = Arrays.asList(new Ally(), new Horde());
        Random randomfac = new Random();
        Faction fac = factions.get(randomfac.nextInt(factions.size()));

        HeroService HeroService = new HeroService();

        Hero myHero = HeroService.createHero(fac, spec,name);



        return myHero;


    }
    //usando un generatore random


}



//    Math.random();
//            Random random;
//            random.nextInt();

