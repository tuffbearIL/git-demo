public class Cat extends Animals {

    private boolean isHunting;

    Cat(){
        this.isHunting = false;
    }

    @Override
    void speak(){
        System.out.print("The cat goes *MEOW* \n");
    }

    void prayDetected(){
        if(isHunting){
            System.out.print("The cat is already hunting! \n");
            return;
        } else {
            isHunting = true;
            System.out.print("Prey on the vision! \n");
        }
    }

    void preyDissapeared(){
        if(!isHunting){
            return;
        } else {
            isHunting = false;
            System.out.print("The cat lost its prey. \n");
        }
    }

}
