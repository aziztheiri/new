// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SocieteArrayList sal = new SocieteArrayList();

        sal.ajouterEmploye(new Employee(1,"theiri","aziz","info",5));
        sal.ajouterEmploye(new Employee(2,"x","f","info",5));
        sal.ajouterEmploye(new Employee(3,"a","e","info",4));
        sal.ajouterEmploye(new Employee(4,"z","c","info",6));
        sal.displayEmploye();
        System.out.println("XXXXXXXXXXXXX");
        sal.trierEmployeParId();
        System.out.println("XXXXXXXXXXXXXX");
        sal.trierEmployeParNomDépartementEtGrade();
    }
}