import java.util.ArrayList;

public class AssignmentOne {

    // 声明ArrayList来存储预约对象
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // 使用默认构造函数创建一个对象
//        HealthProfessional pro1 = new HealthProfessional();
//        pro1.printDetails(); // 打印默认信息
//
//        // 使用带参构造函数创建一个对象
//        HealthProfessional pro2 = new HealthProfessional(1, "Zhang", "Cardiology Department");
//        pro2.printDetails(); // 打印我们设置的信息

        // Part 3 - Using classes and objects

        System.out.println(" Part 3 - Using classes and objects");

        // 创建三个全科医生对象
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Zhang", "Family medicine", true);
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Zhao", "General practice", false);
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Qian", "Community medical care", true);

        // 创建两个儿科医生对象
        Pediatrician p1 = new Pediatrician(201, "Sun", "Fever", "Infants and young children");
        Pediatrician p2 = new Pediatrician(202, "Li", "Congenital diseases", "Teenagers");

        // 打印所有健康专业人员的详细信息
        System.out.println("General practitioner information:");
        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();

        System.out.println("Pediatrician information");
        p1.printDetails();
        p2.printDetails();

        System.out.println("-------------------------------------------------");

        // Part 5 - Collection of appointments

        System.out.println("Part 5 - Collection of appointments");

        // 创建2个全科医生预约
        createAppointment("Zzwang", "13800138000", "09:00-10:00", gp1);
        createAppointment("Lily", "13900139000", "10:30-11:30", gp2);

        // 创建2个儿科医生预约
        createAppointment("Mr.Zhu", "13600136000", "14:00-15:00", p1);
        createAppointment("Mrs.Xi", "13700137000", "15:30-16:30", p2);

        // 打印现有预约
        System.out.println("\n=== All appointment information ===");
        printExistingAppointments();

        // 取消一个预约
        System.out.println("\n=== Cancel Booking ===");
        cancelBooking("13900139000"); // 取消赵女士的预约

        // 再次打印更新后的预约列表
        System.out.println("\n===  All appointment information after cancel ===");
        printExistingAppointments();

        System.out.println("--------------------------------------------------");

    }


    // 创建新预约并添加到ArrayList
    public static void createAppointment(String patientName, String mobilePhone,
                                         String preferredTimeSlot, HealthProfessional doctor) {
        // 验证必要信息是否完整
        if (patientName == null || mobilePhone == null || preferredTimeSlot == null || doctor == null) {
            System.out.println("The appointment information is incomplete.");
            return;
        }

        // 创建新预约对象
        Appointment newAppointment = new Appointment(patientName, mobilePhone, preferredTimeSlot, doctor);
        appointments.add(newAppointment);
        System.out.println("Successfully created an appointment: Name: " + patientName + ", Time:" + preferredTimeSlot);
    }


     // 显示ArrayList中现有的所有预约
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("There is no appointment record");
            return;
        }
        for (int i = 0; i < appointments.size(); i++) {
            appointments.get(i).printAppointmentDetails();
            System.out.println("=========");
        }
    }

    // 根据患者手机号取消预约
    public static void cancelBooking(String mobilePhone) {
        if (mobilePhone == null || mobilePhone.trim().isEmpty()) {
            System.out.println("The mobile phone number cannot be empty");
            return;
        }

        for (int i = 0; i < appointments.size(); i++) {
            Appointment appointment = appointments.get(i);
            if (mobilePhone.equals(appointment.getMobilePhone())) {
                System.out.println("Cancel:" + appointment.getPatientName());
                appointments.remove(i);
                System.out.println("Cancel successfully！");
                return;
            }
        }

        System.out.println("Can not find phone number: " + mobilePhone);
    }
}

