public interface Bank {
     String deposit(int amm);
     String withDraw(int amm,String pass);
     int checkBalance();
     double calculateInterst(int t);

}
