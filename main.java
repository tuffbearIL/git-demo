public class main{

    public static void main(){

        BankAccount bankAccount = new BankAccount("LukasJava", 3000);

        bankAccount.addCash(300);
        bankAccount.removeCash(4444);
        System.out.println(bankAccount.getCash());
        bankAccount.addCash(22);

    }
}