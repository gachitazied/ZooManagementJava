public class Zoo {

    String name;
    String city;
    int count;
    final int NBR_MAX_CAGES =25;

    Animal [] animals;

     int nbrCages;

public  Zoo(String name, String city )
{

this.name=name;
this.city=city;
animals = new Animal[NBR_MAX_CAGES];

}


    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        for(int i=0; i <count;i++) {
            str.append(animals[i].toString());
        }

        return name + "\n" + city + "\n" + NBR_MAX_CAGES + "\n" + str;
    }



    public boolean addAnimal(Animal animal) {
        if (nbrCages < NBR_MAX_CAGES) {
            System.out.println("ajouter avec succee");
            animals[nbrCages] = animal;
            nbrCages++;
            return true;

        } else {
            System.out.println("Le zoo est plein. Impossible d'ajouter plus d'animaux.");
            return false;
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            animals[index] = null;

            for (int i = index; i < nbrCages - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[nbrCages - 1] = null;
            nbrCages--;
            return true;
        } else {
            return false; // Animal non trouvé
        }
    }

    public boolean isZooFull() {
        return count >= NBR_MAX_CAGES;
    }

    public Zoo comparerZoo(Zoo z1, Zoo z2) {

            if (z1.count > z2.count) {
                return z1;
            }
            return z2;
        }
    }



