public class Doctor extends User{

    private String speciality;
    private int wardNo;

    public Doctor(String name, int ID, String speciality, int wardNo) {
        super(name, ID);
        this.speciality = speciality;
        this.wardNo = wardNo;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setWardNo(int wardNo) {
        this.wardNo = wardNo;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getWardNo() {
        return wardNo;
    }

    @Override
    public String toString() {
        return super.toString() + ",Speciality " + speciality + " ,Ward No " + wardNo;
    }
}
