public class MukonoHospital {
    public static void main(String[] args) {
      MedicalStaff[] staff = {
              new Doctor("D001", "Surgery", 40),
              new Nurse("N001", "Paediatrics", 45),
              new Pharmacist("P001", "Pharmacy", 38),
              new LabTechnician("L001", "Laboratory", 42),
      };

      for (MedicalStaff s : staff){
          s.displayDetails();
          s.performPatientCare();
      }
    }
}