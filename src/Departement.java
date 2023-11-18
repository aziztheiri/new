public class Departement implements  Comparable<Departement>{
    private int id;
    private String departementName ;
    private int employe;

    public Departement(){

    }
    public Departement(int id, String departementName, int employe) {
        this.id = id;
        this.departementName = departementName;
        this.employe = employe;
    }

    public int getId() {
        return id;
    }

    public String getDepartementName() {
        return departementName;
    }

    public int getEmploye() {
        return employe;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDepartementName(String departementName) {
        this.departementName = departementName;
    }

    public void setEmploye(int employe) {
        this.employe = employe;
    }

    public int hashCode(){
        return 2*id+departementName.hashCode()-5*2;
    }
    public boolean equals(Object o ){
        if (o == null) return false ;
        if (this ==o) return true ;
        if(o instanceof Departement d){
            return this.departementName == d.departementName && this.id == d.id;
        }
        return false ;
    }

    @Override
    public String toString() {
        return "departement{" +
                "id=" + id +
                ", departementName='" + departementName + '\'' +
                ", employe=" + employe +
                '}';
    }

    @Override
    public int compareTo(Departement o) {
        return o.id-this.id; //decroissant
    }
}
