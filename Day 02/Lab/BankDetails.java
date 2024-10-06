class Bank{
    double amount;

    Bank(int x){
        
        amount = x;
    }
    void withDrawl(double withDrawlAmount){
        String result = (withDrawlAmount<=amount)? "withdrawal succes":"Insufficient balance";
        System.out.println(result);

        amount = (withDrawlAmount<=amount)?(amount-withDrawlAmount):amount;
        if(withDrawlAmount<=amount){
            System.out.println("your current balance is "+amount);
        }
        
    }
    void deposit(double depositAmount){
        amount= amount +depositAmount;
        System.out.println("Rs. "+depositAmount+"has been credited in your account 75088XXXX Your current balance is "+amount);


    }

   
}
class BankDetails{
    public static void main(String[] args) {
        System.out.println("Your Bank Statement");
        Bank unionBank = new Bank(10000);
       unionBank.withDrawl(3000);
        unionBank.deposit(5000);
        

    }

}