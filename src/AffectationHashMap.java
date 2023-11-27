import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    HashMap<Employee,Departement> myMap;
    AffectationHashMap(){
        myMap=new HashMap<>();
    }
    public void ajouterEmployeDepartement(Employee e,Departement d){
        myMap.put(e,d);
    }
    public void afficherEmployeDepartement(){
        for(Map.Entry<Employee,Departement> e: myMap.entrySet()){
            System.out.println(e);
        }
        //System.out.println(myMap);
    }
    public boolean supprimerEmploye(Employee e){
        if(myMap.remove(e)==null) return false;
        return true;
    }
    public boolean supprimerEmployeEtDepartements(Employee e,Departement d){
        for(Map.Entry<Employee,Departement> entry:myMap.entrySet()){
            if(entry.getKey().equals(e) && entry.getValue().equals(d)){
                myMap.remove(e);
                return true;
            }

        }
        return false;
    }
    public void afficherEmployes(){
        System.out.println(myMap.keySet());
    }
    public void afficherDepartements(){
        System.out.println(myMap.values());
    }
    public boolean rechercherEmplye(Employee e){
        return myMap.containsKey(e);
    }
    public TreeMap<Employee,Departement> triMap(){
        return new TreeMap<>(myMap);
    }


}