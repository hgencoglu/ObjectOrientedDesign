package StructuralPatterns.CompositePattern;

public class Developer implements Employee {
    private String name;
    private String eID;
    private  String position;

    Developer(String name, String eID, String position){
        this.name=name;
        this.eID=eID;
        this.position=position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(eID+" "+name+" "+position);
    }
}
