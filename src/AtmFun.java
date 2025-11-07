public interface AtmFun {
    void withdraw(String pass, int amount);
    void checkBalance(String pass);
    void checkStatement(String pass,int mobileNo);
    void service(String pass);
    void changePin(String oldPin,String newPin);
    void remainCheck(String pass);
}
