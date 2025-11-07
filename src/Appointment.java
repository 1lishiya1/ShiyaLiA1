public class Appointment {

    //患者基本信息
    private String patientName;
    private String mobilePhone;
    private String timeSlot;

    // 选择的医生,使用子类对象
    private HealthProfessional selectedDoctor;

    // 默认构造函数
    public Appointment() {
        this.patientName = "name";
        this.mobilePhone = "none";
        this.timeSlot = "default";
        this.selectedDoctor = null; // 初始时没有选择医生
    }

    // 带参数的构造函数
    public Appointment(String patientName, String mobilePhone,
                       String timeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.timeSlot = timeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // 打印所有实例变量的方法
    public void printAppointmentDetails() {
        System.out.println("Name: " + patientName);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Time: " + timeSlot);

        if (selectedDoctor != null) {
            System.out.println("Appointment information:");
            selectedDoctor.printDetails(); // 调用医生的打印方法
        } else {
            System.out.println("No doctor has been chosen yet.");
        }
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    public void setSelectedDoctor(HealthProfessional selectedDoctor) {
        this.selectedDoctor = selectedDoctor;
    }

}