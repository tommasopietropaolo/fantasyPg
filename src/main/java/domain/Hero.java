package domain;

public class Hero extends Character {

    private Faction faction;
    private Spec spec;

    public Hero(String name){
        super(name);
    }

    public Faction getFaction() {
        return faction;
    }

    public Hero withFaction(Faction faction) {
        this.faction = faction;
        return this;
    }

    public Spec getSpec() {
        return spec;
    }

    public Hero withSpec(Spec spec) {
        this.spec = spec;
        return this;
    }


}
