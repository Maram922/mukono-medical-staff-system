public class Radiographer extends MedicalStaff {
    public Radiographer(String id, String dept, int hours) {
        super(id, dept, hours);
    }

    @Override
    public void performPatientCare() {
        System.out.println("Radiographer performs X-rays and scans for diagnosis");
    }
}
