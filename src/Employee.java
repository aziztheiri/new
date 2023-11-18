public class Employee implements Comparable<Employee> {
    private int id ;
    private  String nom;
    private String prenom ;
    private String departement ;
    private int grade ;

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDepartement() {
        return departement;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public Employee() {

    }
    public Employee(int id,String nom,String prenom,String departement,int grade){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.departement=departement;
        this.grade=grade;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", departement='" + departement + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if (o == null )return false ;
        if (o instanceof Employee e ){
            return this.nom.equals(e.nom) && this.id == e.id;
        }
        return false ;
    }
    public int compareTo(Employee o) {
        return this.id-o.id ;
    }
}
