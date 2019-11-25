package entities.plant_entities;

public enum Scent {

    SWEET,ORANGE,PINEAPPLE,MUSKY,EARTHY,SOUR;

    Scent scent;

    public Scent getScent() {
        return scent;
    }

    public void setScent(Scent scent) {
        this.scent = scent;
    }
}
