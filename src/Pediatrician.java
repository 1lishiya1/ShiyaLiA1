public class Pediatrician extends HealthProfessional {

    // 儿科医生的特色：专长治疗的儿童年龄范围
    private String ageGroupSpecialty; // 如：婴幼儿、儿童、青少年等

    // 默认构造函数
    public Pediatrician() {
        super();
    }

    // 带参数的构造函数
    public Pediatrician(int id, String name, String specialty, String ageGroupSpecialty) {
        super(id, name, specialty);
        this.ageGroupSpecialty = ageGroupSpecialty;
    }

    // 打印详细信息的方法（重写父类方法）
    @Override
    public void printDetails() {
        System.out.println("Professional type: Pediatrician");
        System.out.println("Name: " + getName());
        System.out.println("Specialty: " + getSpecialty());
        System.out.println("Specialized age group: " + ageGroupSpecialty);
    }

    public String getAgeGroupSpecialty() {
        return ageGroupSpecialty;
    }

    public void setAgeGroupSpecialty(String ageGroupSpecialty) {
        this.ageGroupSpecialty = ageGroupSpecialty;
    }

}