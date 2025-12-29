public interface HospitalManager {
     void addDoctor();
     void addNurse();
     void addPatient();
     void bookAppointment();
     void viewDoctors();
     void viewNurses();
     void viewPatients();
     void changeAppointmentStatus(int status);
     void changePatientStatus(int status);
}
