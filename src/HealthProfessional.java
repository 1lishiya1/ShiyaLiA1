public class HealthProfessional {
    
    // 定义实例变量 (Instance Variables)
    private int id;
    private String name;
    // 另一个相关的实例变量：“专业领域” (specialty)
    private String specialty;

    // 默认构造函数 (Default Constructor)
    public HealthProfessional() {
        this.id = 0;
        this.name = "Addy"; // 将姓名默认设为“Addy”
        this.specialty = "Default"; // 将专业领域默认设为“default”
    }

    // 带参数的构造函数 (Parameterized Constructor)
    public HealthProfessional(int idParam, String nameParam, String specialtyParam) {
        this.id = idParam;
        this.name = nameParam;
        this.specialty = specialtyParam;
    }

    // Method to print all variables
    public void printDetails() {
        System.out.println("Doctor Details:");
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Specialty: " + this.specialty);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}