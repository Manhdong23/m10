
public class Student extends Person {
    private double GPA;

    public Student(String id, String hoTen, int tuoi, double GPA) {
        super(id, hoTen, tuoi);
        this.GPA = GPA;
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId());
        System.out.println("HO ten: " + getHoTen());
        System.out.println("Tuoi: " + getTuoi());
        System.out.println("GPA: " + GPA);
    }
}

    

