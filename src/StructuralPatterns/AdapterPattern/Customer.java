package StructuralPatterns.AdapterPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Customer extends BankDetails implements ICreditCard{


    @Override
    public void giveBankDetails() {
        try {
            InputStreamReader isp = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isp);

            System.out.println("Hesap sahibinin ismini giriniz: ");
            String customerName = br.readLine();

            System.out.println("Hesap Numarasını giriniz: ");
            long accountNo = Long.parseLong(br.readLine());

            System.out.println("Banka Adını giriniz: ");
            String bankName = br.readLine();

            setAccountName(customerName);
            setAccountNumber(accountNo);
            setBankName(bankName);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String cardDetails() {

        long accno = getAccountNumber();
        String accountOwnerName = getAccountName();
        String bankName = getBankName();
        return accountOwnerName+" "+bankName+" "+accno;
    }
}
