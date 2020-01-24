package health;
import java.util.List;
import java.util.ArrayList;


import people.Doctor;
import people.Patient;

public class PatientQueue {

    private List<Patient> patientList;
    private String ward;
    private String hospital;
    private String list;
    private Doctor doctor;

    public PatientQueue(String hospital, String ward, Doctor doctor){
        this.patientList = new ArrayList<>();
        this.ward = ward;
        this.hospital = hospital;
        this.doctor = doctor;

    }
    public void add(people.Patient patient){
        for(people.Patient testPatient : patientList){
            if(testPatient.getPatientCode().equals(patient.getPatientCode())){
                System.out.println("This patient is already on the list!");
                return;
            }
        }
        this.patientList.add(patient);
    }
    public void remove(people.Patient patient){
        for(Patient testPatient : patientList){
            if(testPatient.getPatientCode().equals(patient.getPatientCode())){
                patientList.remove(patient);
                System.out.println(patient.getInfo() + " has been removed.");
                return;
            }
        }
        System.out.println("This patient is not on the list.");
    }


    @Override
    public String toString(){
        for(people.Patient patient : patientList) {
            list = list + patient.toString() + " " + getDoctor() + "\n";

        }
        return list;
    }
    public String getDoctor(){
        return this.doctor.toString();
    }
    public void assignDoctor(Doctor doctor){
        this.doctor = doctor;
    }

}
