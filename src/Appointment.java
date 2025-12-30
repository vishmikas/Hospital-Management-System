import java.time.LocalDate;

public class Appointment {

    private int appointmentIndex;
    private Patient patient;
    private Doctor doctor;
    private LocalDate date;

    public Appointment(int apponitmentIndex, Patient patient, Doctor doctor, LocalDate date) {
        this.appointmentIndex = apponitmentIndex;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    public int setAppointmentIndex(int apponitmentIndex) {
        this.appointmentIndex  = apponitmentIndex;
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

    public int getAppointmentIndex() {
        return appointmentIndex;
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
