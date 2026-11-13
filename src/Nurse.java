public class Nurse extends MedicalStaff{
    public Nurse(String id, String dept, int hours) {
        super(id, dept, hours);
    }

    @Override
    public void performPatientCare() {
        System.out.println("Nurse monitors patients and administers medication");
    }
}
