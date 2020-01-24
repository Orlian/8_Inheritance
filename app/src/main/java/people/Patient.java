package people;

public class Patient extends Person {

    private String procedure;
    private String bloodPressure;
    private String name;
    private String patientCode;

    public Patient(String name, String procedure, String bloodPressure, String patientCode){
        super(name);
        this.name = name;
        this.procedure = procedure;
        this.bloodPressure = bloodPressure;
        this.patientCode =  patientCode;
    }

    public String getBloodPressure() {
        return this.bloodPressure;
    }

    public String getProcedure() {
        return this.procedure;
    }

    public String getPatientCode() {
        return this.patientCode;
    }

    @Override
    public String toString(){
        return "Patient: " + super.getInfo() + ". Bp: " + this.bloodPressure + " mmHg. Patient code: " + this.patientCode;
    }

}
