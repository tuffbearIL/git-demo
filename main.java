public class main{

    public static void main(){

        BankAccount bankAccount = new BankAccount("LukasJava", 3000);

        bankAccount.addCash(300);
        bankAccount.removeCash(4444);
        System.out.println(bankAccount.showCash());
        bankAccount.addCash(22);

    }
}