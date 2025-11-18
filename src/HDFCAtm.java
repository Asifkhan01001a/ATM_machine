import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class HDFCAtm implements AtmFun{
    int balance;
    String pin;
    String name;
    String acNo;
    String refId;

    ArrayList<Integer>statement=new ArrayList<>();

    HDFCAtm(int balance,String pin,String name){
        this.balance=balance;
        this.pin=pin;
        this.name=name;
        acNo=String.valueOf(UUID.randomUUID());
    }

    @Override
    public void withdraw(String pass, int amount) {
        if(!pass.equals(pin)){
            System.out.println("<- Please Enter Valid Password ->");
        }
        else{
            statement.add(amount);
            int remain = balance-=amount;
            System.out.println("Transaction Succesfull");
            System.out.println(amount + " withdraw from your accoount ");
            System.out.println(" remaining balance is "+remain);
        }
    }

    @Override
    public void checkBalance(String pass) {
        if(!pass.equals(pin)){
            System.out.println("<- Please Enter Valid Password ->");
        }
        else{
            System.out.println(" remaining balance is "+balance);
        }
    }

    @Override
    public void checkStatement(String pass) {
        if(!pass.equals(pin)){
            System.out.println("<- Please Enter Valid Password ->");
        }
        else{
            for(int i=0;i<statement.size();i++){
                System.out.println(statement.get(i));
            }
        }
    }

    @Override
    public void service(String pass) {

    }

    @Override
    public void changePin(String oldPin, String newPin) {
        if(!pin.equals(oldPin)){
            System.out.println("Enter Valid pin");
        }

        pin = newPin;
        System.out.println("pin chnged succesfully");
    }

    @Override
    public void remainCheck(String pass) {

    }

    @Override
    public void rating(String pass) {

    }

    @Override
    public void userAuth(String Pass) {

    }

    @Override
    public void goldLoan(String Pass) {

    }

    @Override
    public void rewards(String pass) {

    }

    @Override
    public void offers(String pass) {

    }
}
