import java.util.ArrayList;
import java.util.Scanner;

public class ManagementSystem implements HospitalManager{

    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Nurse> nurses = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();
    ArrayList<Appointment> appointsments = new ArrayList<>();

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

    }

    @Override
    public void bookAppointment() {

    }

    @Override
    public void viewDoctors() {

    }

    @Override
    public void viewNurses() {

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
