package StructuralPatterns.AdapterPattern;

public class Client {
    public static void main (String args[]) {
        ICreditCard icc = new Customer();
        icc.giveBankDetails();
        System.out.println(icc.cardDetails());
    }
}
