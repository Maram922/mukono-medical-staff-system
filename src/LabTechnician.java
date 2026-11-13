public class LabTechnician extends MedicalStaff{
    public LabTechnician(String id, String dept, int hours) {
        super(id, dept, hours);
    }

    @Override
    public void performPatientCare() {
        System.out.println("Lab technician runs tests and reports results");
    }
}
