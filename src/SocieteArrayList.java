import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employee> {
     ArrayList<Employee> listeEmployes;

    public SocieteArrayList() {

        listeEmployes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employee employe) {

        listeEmployes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employee employe : listeEmployes) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employee employe) {

        return listeEmployes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employee employe) {
        listeEmployes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employee employe : listeEmployes) {
            System.out.println(employe);
        }
      //  System.out.println(listeEmployes);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(listeEmployes);
        System.out.println(listeEmployes);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {

}
}
