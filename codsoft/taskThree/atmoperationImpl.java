package codSoft.taskThree;

import java.util.HashMap;
import java.util.Map;

public class atmoperationImpl implements atmOperationInter {
    ATM atm = new ATM();
    Map<Double,String> miniStat = new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Available Balance is : "+atm.getViewBalance());
    }

    @Override
    public void depositAmount(double depositAmount) {
        miniStat.put(depositAmount," Amount Deposited");
        System.out.println(depositAmount +" Deposited Sucessfully !!");
        atm.setViewBalance(atm.getViewBalance()+depositAmount);
        viewBalance();
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
    if(withdrawAmount%500==0){
       if(withdrawAmount<=atm.getViewBalance()){
        miniStat.put(withdrawAmount," Amount Withdrawn ");
        System.out.println("Collect your cash : " +withdrawAmount);
        atm.setViewBalance(atm.getViewBalance()-withdrawAmount);
        viewBalance();
       }
       else{
        System.out.println("Insufficient Funds !");
       }
    }
    else{
        System.out.println("Enter the amount in the multiples of 500");
    }
    }

    @Override
    public void miniStatement() {
        for(Map.Entry<Double,String>m:miniStat.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());

        }
    }
    
}
