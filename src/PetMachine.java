public class PetMachine {

    private boolean clean;

    private int water;

    private int shampoo;

    private Pet pet;

    public void takeAShower(){
        if (this.pet == null){
            System.out.println("Coloque o pet na máquina para iniciar o banho");
            return;
        }

        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + "está limpo");
    }

    public void addWater(){
        if (water == 30) {
            System.out.println("A capacidade de água está no máximo");
            return;
        }

        water += 2;
    }

    public void addShampoo(){
        if (shampoo == 10) {
            System.out.println("A capacidade de shampoo está no máximo");
            return;
        }

        shampoo += 2;
    }
}
