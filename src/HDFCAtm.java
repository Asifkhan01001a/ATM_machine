import java.util.Scanner;
import java.util.UUID;

public class HDFCAtm implements AtmFun{
    int balance;
    String pin;
    String name;
    String acNo;
    String refId;

    HDFCAtm(int balance,String pin,String name){
        this.balance=balance;
        this.pin=pin;
        this.name=name;
        acNo=String.valueOf(UUID.randomUUID());
    }

    @Override
    public void withdraw(String pass, int amount) {

    }

    @Override
    public void checkBalance(String pass) {

    }

    @Override
    public void checkStatement(String pass, int mobileNo) {

    }

    @Override
    public void service(String pass) {

    }

    @Override
    public void changePin(String oldPin, String newPin) {

    }
}
