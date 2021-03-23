import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    Customer(){
        this.deposits = new ArrayList();
        this.withdraws = new ArrayList();
        this.name = "Tony";
        this.accountNumber = 12345;
        this.checkBalance = 0.0D;
        this.savingBalance = 0.0D;
    }
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkBalance = checkDeposit;
        this.savingBalance = savingDeposit;
        this.deposits = new ArrayList();
        this.withdraws = new ArrayList();
        this.deposit(checkDeposit, new Date(), "Checking");
    }

    public double deposit(double amt, Date date, String account){
        if (account.equals("Checking")) {
            this.deposits.add(new Deposit(amt, date, "Checking"));
            this.checkBalance += amt;
            return this.checkBalance;
        } else {
            this.deposits.add(new Deposit(amt, date, "Saving"));
            this.savingBalance += amt;
            return this.savingBalance;
        }
    }
    public double withdraw(double amt, Date date, String account){
        if (account.equals("Checking") && this.checkingAmount(amt)) {
            this.withdraws.add(new Withdraw(amt, date, "Checking"));
            this.checkBalance -= amt;
            return this.checkBalance;
        } else if (this.savingAmount(amt)) {
            this.withdraws.add(new Withdraw(amt, date, "Saving"));
            this.savingBalance -= amt;
            return this.savingBalance;
        } else {
            return 0.0D;
        }
    }

    private boolean savingAmount(double amt) {
        return this.savingBalance - amt >= -100.0D;
    }

    private boolean checkingAmount(double amt) {
        return this.checkBalance - amt >= -100.0D;
    }

    private boolean checkOverdraft(double amt, String account){
                  if(checkBalance - amt > OVERDRAFT){
                      return false;
                  } if(checkBalance - amt < OVERDRAFT){
                return true;
            }if(savingBalance - amt > OVERDRAFT){
                return false;
            } if(savingBalance - amt < OVERDRAFT){
                return true;
            }
                  return true;

          }
    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

}
