
public abstract class Person {
    private String id;
    private String hoTen;
    private int tuoi;

    public Person(String id, String hoTen, int tuoi) {
        this.id = id;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public String getId() {
        return id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public abstract void displayInfo();
}

    

