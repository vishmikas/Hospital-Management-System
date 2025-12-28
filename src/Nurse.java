public class Nurse extends User{

    private String department;
    private int wardNo;

    public Nurse(String name, int ID, String department, int wardNo) {
        super(name, ID);
        this.department = department;
        this.wardNo = wardNo;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setWardNo(int wardNo) {
        this.wardNo = wardNo;
    }

    public String getDepartment() {
        return department;
    }

    public int getWardNo() {
        return wardNo;
    }

    @Override
    public String toString() {
        return super.toString() + ",Department: " + department + ", Ward No: " + wardNo;
    }
}
