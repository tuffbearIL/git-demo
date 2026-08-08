public class BankAccount {

    private final String accountOwner;
    private int accountBalance;
    private boolean isFreezed;

    public BankAccount(String accountOwner, int accountBalance){
        this.accountOwner = accountOwner;
        this.accountBalance = accountBalance;
        this.isFreezed = false;
    }

    public int getCash(){
        return this.accountBalance;
    }

    public String getOwner(){
        return this.accountOwner;
    }

    public void addCash(int amount){
        if(amount < 999999 && amount > 0 && !this.isFreezed){
            this.accountBalance += amount;
            System.out.printf("|The amount: %d$ was added to your account| New balance: %d$ \n", amount, this.accountBalance);
        } else if(this.isFreezed){
            System.out.println("Your account is freezed. Please contact your bank ASAP.");
        } else {
            System.out.println("Problem with adding cash to the account please read rules.");
        }
    }

    private void freezeAccount(){
        if(!this.isFreezed){
            this.isFreezed = true;
            System.out.println("Account was succesfully freezed.");
        } else {
            System.out.println("The account is already freezed!");
        }

    }

    public void unfreezeAccount(){
        if(this.isFreezed){
            isFreezed = false;
            System.out.println("Account was successfully unfrozen.");
        } else {
            System.out.println("The account is not frozen.");
        }
    }

    public void removeCash(int amount){
        if(this.accountBalance - amount > 0 && !this.isFreezed){
            this.accountBalance -= amount ;
            System.out.printf("Cash were succesfully removed from the cash account. New balance: %d$ \n ", this.accountBalance);
        } else {
            System.out.println("There was problem with removing cash");
            freezeAccount();
        }
    }

}
