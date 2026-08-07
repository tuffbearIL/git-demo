public class main{

    public static void main(){

        Dog dog = new Dog("Chivava");
        Cat cat = new Cat();
        Bird bird = new Bird();
        dog.speak();
        System.out.print(dog.getRasa() + "\n");
        cat.eat();
        cat.prayDetected();
        System.out.print("LOOKING FOR PREY... \n");
        cat.preyDissapeared();

        bird.fly();
        bird.isAlive();
        bird.moving();

        System.out.print(Animals.animalsCreated + "\n");


    }
}