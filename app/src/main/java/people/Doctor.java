package people;

public class Doctor extends Person {

    private String title;
    private String name;

    public Doctor(String name, String title){
        super(name);
        this.title = title;
        this.name = name;
    }

    public String getTitle() {
        return this.title;
    }
    @Override
    public String toString(){
        return "Doctor: " + super.getInfo() + ". Title: " + this.title + ". ";
    }
}
