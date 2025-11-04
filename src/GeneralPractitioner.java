/**
 * 这个类继承自 HealthProfessional 基类
 */
public class GeneralPractitioner extends HealthProfessional {

    // 是否有急诊服务
    private boolean hasEmergencyService;

    //默认构造函数
    public GeneralPractitioner() {
        super(); // 调用父类（HealthProfessional）的默认构造函数
        this.hasEmergencyService = false; // 默认没有急诊服务
    }

    //带参数的构造函数 - 初始化所有变量
    public GeneralPractitioner(int id, String name, String specialty, boolean hasEmergencyService) {
        super(id, name, specialty); // 调用父类的带参构造函数
        this.hasEmergencyService = hasEmergencyService;
    }

    // 重写父类：打印详细信息的方法
    public void printDetails() {
        super.printDetails(); // 先显示ID、姓名、专业领域
        // 是否提供急诊服务
        System.out.println("Provide emergency services: " + (hasEmergencyService ? "Yes" : "No"));
    }

    public boolean isHasEmergencyService() {
        return hasEmergencyService;
    }

    public void setHasEmergencyService(boolean hasEmergencyService) {
        this.hasEmergencyService = hasEmergencyService;
    }

}