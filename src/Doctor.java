public class Doctor extends MedicalStaff{
    public Doctor(String id, String dept, int hours) {
        super(id, dept, hours);
    }

    @Override
    public void performPatientCare() {
        System.out.println("Doctor diagnoses patients and prescribes treatment");
    }
}
