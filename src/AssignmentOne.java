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

    }
}

