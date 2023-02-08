import java.util.UUID;

public class HDFCAccount implements Bank{
    private String name;
    private String password;
    public HDFCAccount(String name,String password,int balance)
    {
        this.balance=balance;
        this.password=password;
        this.name=name;
        this.rateOfInterst=5.0;
        this.accountNumber= String.valueOf(UUID.randomUUID());
    }
    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public double getRateOfInterst() {
        return rateOfInterst;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    private int balance;
    private double rateOfInterst;
    private String accountNumber;

    @Override
    public String deposit(int amm) {
        if(amm<0)return "enter a valid ammount";
        balance+=amm;
        return "succesfully depostied";
    }

    @Override
    public String withDraw(int amm,String password) {
        if(!this.password.equals(password))return "Invalid password";
        if(amm>this.balance)return "insufficent balance";
        balance=balance-amm;
        return "withdrawl succesfull";
    }

    @Override
    public int checkBalance() {
        return balance;
    }

    @Override
    public double calculateInterst(int t) {
        return (t*balance*rateOfInterst)/100;
    }
}
