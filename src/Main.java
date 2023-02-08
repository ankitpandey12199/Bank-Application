import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      SBIAccount account=new SBIAccount("Ankit kumar pandey","2023",5000);
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
        System.out.println(account.deposit(1000));
        System.out.println(account.calculateInterst(5));
        System.out.println(account.withDraw(5000,"2023"));
        System.out.println(account.getBalance());
    }
}