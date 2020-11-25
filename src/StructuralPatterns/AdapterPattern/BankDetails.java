package StructuralPatterns.AdapterPattern;

public class BankDetails  {
    private String bankName;
    private String accountName;
    private long accountNumber;

    public String getBankName(){return  bankName;}
    public void setBankName(String bankName){this.bankName=bankName;}

    public String getAccountName(){return accountName;}
    public void  setAccountName(String accountName){this.accountName=accountName;}

    public long getAccountNumber(){return accountNumber;}
    public void setAccountNumber(long accountNumber){this.accountNumber=accountNumber;}

}
