package hospital;

public class PatientRecord {
    public String patientName;
    public String appointmentDate;
    private String medicalDiagnosis;
    protected double totalBill;

    public PatientRecord(String patientName, String appointmentDate, String medicalDiagnosis, double totalBill) {
        this.patientName = patientName;
        this.appointmentDate = appointmentDate;
        this.medicalDiagnosis = medicalDiagnosis;
        this.totalBill = totalBill;
    }

    public void displayReceptionistView() {
        System.out.println("=== RECEPTIONIST VIEW ===");
        System.out.println("Patient Name     : " + this.patientName);
        System.out.println("Appointment Date : " + this.appointmentDate);
        System.out.println("=========================");
    }

    public void displayDoctorView() {
        System.out.println("=== DOCTOR VIEW ===");
        System.out.println("Patient Name      : " + this.patientName);
        System.out.println("Medical Diagnosis : " + this.medicalDiagnosis);
        System.out.println("===================");
    }

    public void updateMedicalDiagnosis(String newDiagnosis) {
        this.medicalDiagnosis = newDiagnosis;
        System.out.println("[Doctor Action] Medical diagnosis updated successfully.");
    }

    public void displayAdminView() {
        System.out.println("=== ADMINISTRATION VIEW ===");
        System.out.println("Patient Name : " + this.patientName);
        System.out.println("Total Bill   : $" + this.totalBill);
        System.out.println("===========================");
    }
}
