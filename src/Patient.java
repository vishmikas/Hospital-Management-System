public class Patient extends User{

    private int age;
    private String address;
    private String phoneNumber;

    public Patient(String name, int age, int i, String address, String phoneNumber) {
        super(name, age);
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", Age: " + age + " Address: " + address + " Phone: " + phoneNumber;
    }
}
