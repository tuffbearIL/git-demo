public class Bird extends Animals {

    @Override
    void speak(){
        System.out.print("The bird goes *PIP* \n");
    }

    @Override
    void moving(){
        System.out.print("The bird is flying! \n");
    }

    void fly(){
        System.out.print("The bird is flying \n");
    }

}
