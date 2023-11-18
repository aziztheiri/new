import java.util.*;

public class DepartementHashSet implements IDepartement<Departement> {
    Set<Departement> departementSet ;

    public DepartementHashSet(Set<DepartementHashSet> myHashSet) {
        departementSet = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement departement) {
        departementSet.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
       /* for(Departement d : departementSet){
            if(d.getDepartementName().equals(nom))
                return true ;
        } */
        Iterator<Departement> it = departementSet.iterator();
        while(it.hasNext()){
            if(it.next().getDepartementName().equals(nom))
                return true ;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        departementSet.contains(departement);
        return false;
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departementSet.remove(departement);

    }

    @Override
    public void displayDepartement() {
        System.out.println(departementSet);
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> dep = new TreeSet<>();
        dep.addAll(departementSet);
        return dep ;
    }
}