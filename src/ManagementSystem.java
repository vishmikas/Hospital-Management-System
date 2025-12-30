import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagementSystem implements HospitalManager{

    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Nurse> nurses = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();
    ArrayList<Appointment> appointments = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    @Override
    public void addDoctor() {
        System.out.println("Enter Doctor's Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Doctor's ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Doctor's speciality: ");
        String speciality = scanner.nextLine();

        System.out.println("Enter Doctor's Ward No: ");
        int wardNo = scanner.nextInt();
        scanner.nextLine();

        doctors.add(new Doctor(name, id, speciality, wardNo));

        System.out.println("New Doctor Added Successfully");
    }

    @Override
    public void addNurse() {
        System.out.println("Enter Nurse's Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Nurse's ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Nurse's department: ");
        String department = scanner.nextLine();

        System.out.println("Enter Nurse's Ward No: ");
        int wardNo = scanner.nextInt();
        scanner.nextLine();

        nurses.add(new Nurse(name, id, department, wardNo));

        System.out.println("New Nurse Added Successfully");
    }

    @Override
    public void addPatient() {
        System.out.println("Enter Patient's Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Patient's ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Patient's age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Patient's address: ");
        String address = scanner.nextLine();

        System.out.println("Enter Patient's phone number: ");
        String phoneNumber = scanner.nextLine();

        patients.add(new Patient(name, id, age, address, phoneNumber));

        System.out.println("New Patient Added Successfully");
    }

    @Override
    public void bookAppointment() {
        Patient newPatient = null;
        Doctor newDoctor = null;

        System.out.println("Enter patient ID: ");
        int patientID;

        try {
            patientID = scanner.nextInt();
        }
        catch(Exception e) {
            System.out.println("Invalid ID");
            return;
        }
        scanner.nextLine();

        for(Patient patient : patients) {
            if(patient.getID() == patientID){
                newPatient = patient;
                break;
            }
        }
        if(newPatient == null){
            System.out.println("Patient ID does not exist");
            return;
        }

        System.out.println("Enter doctor's ID: ");
        int doctorID;
        try {
            doctorID = scanner.nextInt();
        }
        catch(Exception e) {
            System.out.println("Invalid ID");
            return;
        }
        scanner.nextLine();

        for(Doctor doctor : doctors) {
            if(doctor.getID() == doctorID) {
                newDoctor = doctor;
                break;
            }
        }
        if(newDoctor == null){
            System.out.println("Doctor ID does not exist");
            return;
        }

        System.out.println("Enter appointment date(YYYY-MM-DD): )");
        LocalDate date;
        try{
            date = LocalDate.parse(scanner.nextLine());
        }
        catch(Exception e) {
            System.out.println("Invalid date");
            return;
        }

        appointments.add(new Appointment (newPatient, newDoctor, date));
        System.out.println("New Appointment Added Successfully");
    }

    @Override
    public void viewDoctors() {
        if(doctors.isEmpty()){
            System.out.println("No doctors found");
        }
        else{
            for(Doctor doctor : doctors) {
                System.out.println(doctor.toString());
            }
        }
    }

    @Override
    public void viewNurses() {
        if(nurses.isEmpty()) {
            System.out.println("No nurses found");
        }
        else {
            for (Nurse nurse : nurses) {
                System.out.println(nurse.toString());
            }
        }
    }

    @Override
    public void viewPatients() {

    }

    @Override
    public void changeAppointmentStatus(int status) {

    }

    @Override
    public void changePatientStatus(int status) {

    }
}
