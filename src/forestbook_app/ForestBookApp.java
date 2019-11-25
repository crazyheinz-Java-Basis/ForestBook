package forestbook_app;

import entities.animal_entities.Carnivore;
import entities.animal_entities.Herbivore;
import entities.animal_entities.Omnivore;
import entities.plant_entities.*;
import service.ForestNotebook;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ForestBookApp {

    public static void main(String[] args) {
        ForestNotebook forestNotebook = new ForestNotebook();

        Tree berk = new Tree("berk", 500);
        berk.setLeafType(LeafType.HEART);


        Flower roos = new Flower("roos", 10);
        roos.setSmell(Scent.SWEET);

        Weed brandnetel = new Weed("brandnetel", 50);
        brandnetel.setArea(2.1);

        Weed dovenetel = new Weed("dove netel", 30.5);
        dovenetel.setArea(4.0);

        Bush struik = new Bush("stomme struik", 100);
        struik.setLeafType(LeafType.HAND);
        struik.setFruit("framboos");


        forestNotebook.addPlants(berk);
        forestNotebook.addPlants(roos);
        forestNotebook.addPlants(brandnetel);
        forestNotebook.addPlants(dovenetel);
        forestNotebook.addPlants(struik);
        forestNotebook.addPlants(berk);

        Set<Plant> plantDietGras = new HashSet<>();
        plantDietGras.add(new Weed("gras", 1));

        Herbivore koe = new Herbivore("koe", 200 ,180, 200);
        koe.addPlantToDiet(new Weed("gras", 1));

        Herbivore schaap = new Herbivore("schaap", 50, 70, 50);
        schaap.addPlantToDiet(new Weed("gras", 1));


        Herbivore geit = new Herbivore("geit",10,100,100);
        geit.setPlantDiet(plantDietGras);

        Omnivore beer = new Omnivore("beer", 500, 120, 150);
        beer.addPlantToDiet(new Plant("stro",100));
        beer.setMaxFoodSize(300);

        Omnivore hond = new Omnivore("hond",10, 140, 100);
        hond.addPlantToDiet(new Plant("graan", 10));
        hond.setMaxFoodSize(100);

        Carnivore wolf = new Carnivore("wolf",10, 140,120);
        wolf.setMaxFoodSize(200);

        forestNotebook.addAnimal(koe);
        forestNotebook.addAnimal(schaap);
        forestNotebook.addAnimal(geit);
        forestNotebook.addAnimal(beer);
        forestNotebook.addAnimal(hond);
        forestNotebook.addAnimal(wolf);

        forestNotebook.printNotebook();

        System.out.println("de carnivoortjes: ");
        forestNotebook.getCarnivores().forEach((n) -> System.out.println(n));
        System.out.printf("de omnivoortjes: ");
        forestNotebook.getOmnivores().forEach((n) -> System.out.println(n));
        System.out.println("de herbivoortjes");
        forestNotebook.getHerbivores().forEach((n) -> System.out.println(n));

    }
}
