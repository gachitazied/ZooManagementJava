public class ZooManagement {
    public static void main(String[] args) {
        // Zoo
        Zoo myZoo = new Zoo("Nahli", "el ghazela");
        Zoo myZooZoo = new Zoo("bougarnine", "boumhal");
        //
        Animal lion1 = new Animal("Felin", "Simba", 5, true);
        Animal lion2 = new Animal("Felin", "zouhair", 8, true);
        Animal lion3 = new Animal("Felin", "Badira", 10, true);
        Animal lion4 = new Animal("Felin", "Badira", 10, true);
        Animal lion5 = new Animal("Felin", "Badira", 10, true);
        // Ajoute les animaux au zoo


        myZoo.addAnimal(lion1);
        myZoo.addAnimal(lion2);
        myZoo.addAnimal(lion3);
        myZoo.addAnimal(lion4);



        // Affichez les informations du zoo
        System.out.println(myZoo);




        // Testez la recherche d'un animal
        int foundIndex = myZoo.searchAnimal(lion3);
        if (foundIndex != -1) {
            System.out.println("Animal trouvé à l'indice " + foundIndex);
        } else {
            System.out.println("Animal non trouvé");
        }

        // Testez de suppresion
        boolean removed = myZoo.removeAnimal(lion1);
        if (removed) {
            System.out.println("Animal supprimé avec succès");
        } else {
            System.out.println("Animal non trouvé ou suppression échouée");
        }


        boolean full = myZoo.isZooFull();
        System.out.println("\n" + full);

        //Testee
        System.out.println(myZoo.comparerZoo(myZoo, myZooZoo));




    }
}
