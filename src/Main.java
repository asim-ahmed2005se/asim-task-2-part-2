import hospital.PatientRecord;

public class Main {
    public static void main(String[] args) {
        System.out.println("Initializing Patient Record System...\n");
        PatientRecord patient = new PatientRecord("Asim Ahmed", "2026-10-15", "Acute Bronchitis", (double)350.0F);
        patient.displayReceptionistView();
        System.out.println();
        patient.displayDoctorView();
        patient.updateMedicalDiagnosis("Recovering Bronchitis - Prescribed Medication");
        patient.displayDoctorView();
        System.out.println();
        patient.displayAdminView();
        System.out.println("\nProcess finished with exit code 0");
    }
}
//Complete branch 1 tasks

