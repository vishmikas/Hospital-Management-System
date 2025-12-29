import java.time.LocalDate;

public class Appointment {

    private Patient patient;
    private Doctor doctor;
    private LocalDate date;

    public Appointment(Patient patient, Doctor doctor, LocalDate date) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return super.toString() + " " + patient.toString() + " " + doctor.toString() + ", Date: " + date;
    }
}
