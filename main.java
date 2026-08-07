public class Animals {
    
    boolean isAlive;
    int health;
    static int animalsCreated;

     Animals() {
        this.isAlive = true;
        this.health = 100;
        animalsCreated++;
    }

    void speak(){
        System.out.println("The animal is speaking \n");
    }

    void isAlive(){
        if(isAlive){
            System.out.print("The animal is alive. \n");
        } else {
            System.out.print("The animal is dead. RIP \n");
        }
    }

    void eat(){
        System.out.print("The animal is eating \n");
    }

    void moving()
    {

        System.out.print("The animal is moving! \n");
    }

}
