package StructuralPatterns.CompositePattern;

public class Client {
    public static void main(String[] args){
        Developer d1 = new Developer("Hakan","1","Senyor Dev");
        Developer d2 = new Developer("Zülfikar","2","Junior Dev");
        CompanyDirector cd = new CompanyDirector();
        cd.addEmployee(d1);
        cd.addEmployee(d2);

        Manager m1 = new Manager("Gökhan","3","Manager");
        Manager m2 =  new Manager("Burak","4","Manager");
        CompanyDirector cdNode = new CompanyDirector();
        cdNode.addEmployee(m1);
        cdNode.addEmployee(m2);

        CompanyDirector cdDirectory =  new CompanyDirector();
        cdDirectory.addEmployee(cd);
        cdDirectory.addEmployee(cdNode);
        cdDirectory.showEmployeeDetails();;
    }

}
