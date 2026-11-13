public class Pharmacist extends MedicalStaff{
    public Pharmacist(String id, String dept, int hours) {
        super(id, dept, hours);
    }

    @Override
    public void performPatientCare() {
        System.out.println("Pharmacist dispenses drugs and advises patients");
    }
}
