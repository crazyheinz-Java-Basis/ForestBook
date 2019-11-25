package service;

import entities.animal_entities.Animal;
import entities.animal_entities.Carnivore;
import entities.animal_entities.Herbivore;
import entities.animal_entities.Omnivore;
import entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ForestNotebook {

    private List<Carnivore> carnivores;
    private List<Omnivore> omnivores;
    private List<Herbivore> herbivores;
    private int plantCount;
    private int animalCount;
    private List<Animal> animals;
    private List<Plant> plants;

    public ForestNotebook() {
        carnivores = new ArrayList<>();
        omnivores = new ArrayList<>();
        herbivores = new ArrayList<>();
        animals = new ArrayList<>();
        plants = new ArrayList<>();
        plantCount = 0;
        animalCount = 0;
    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }


    public int getAnimalCount() {
        return animalCount;
    }


    public void addAnimal(Animal animalIn) {
        //nog controleren of ze er niet 2 keer inzitten, vergelijken op naam eventueel
        //ook nog aan de juiste diersoort list toevoegen
        if (animals.size() <= 0) {
            addAnimalsToRightList(animalIn);
            //animals.add(animalIn);
            animalCount++;
        } else {

            boolean dubbel = false;
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i).getName().equals(animalIn.getName())) {
                    dubbel = true;
                }
            }
            if (dubbel ==  false) {
                addAnimalsToRightList(animalIn);
                animalCount++;
            }
        }
    }

    public void addAnimalsToRightList(Animal animalIn) {

        if (animalIn instanceof Carnivore) {
            animals.add(animalIn);
            carnivores.add((Carnivore)animalIn);
        }
        else if (animalIn instanceof Omnivore) {
            animals.add(animalIn);
            omnivores.add((Omnivore)animalIn);
        }
        else {
            animals.add(animalIn);
            herbivores.add((Herbivore)animalIn);
        }
    }


    public void addPlants(Plant plantIn) {
        //nog controleren of ze er niet 2 keer inzitten

        if (plants.size() <= 0) {
            plants.add(plantIn);
            plantCount++;
        } else {

            boolean dubbel = false;
            for (int i = 0; i < plants.size(); i++) {
                if (plants.get(i).getName().equals(plantIn.getName())) {
                    dubbel = true;
                }
            }
            if (dubbel ==  false) {
                plants.add(plantIn);
                plantCount++;
            }
        }
    }



    public void printNotebook() {

        System.out.println("aantal dieren: " + animalCount);
        System.out.println("aantal planten: " + plantCount);

        plants.forEach((n) -> System.out.println(n));
        System.out.println("");
        animals.forEach((n) -> System.out.println(n));


        System.out.println("nu gesorteerd bij naam de diertjes: ");
        sortAnimalsByName();
        System.out.println("");
        //animals.forEach((n) -> System.out.println(n));

        System.out.println("nu gesorteerd bij naam de plantjes: ");
        sortPlantsByName();
        System.out.println("");
        plants.forEach((n) -> System.out.println(n));



    }

    public void sortAnimalsByName() {

        Collections.sort(animals);
    }

    public void sortPlantsByName() {

        Collections.sort(plants);
    }
}
