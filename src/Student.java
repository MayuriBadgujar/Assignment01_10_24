public class Student {
    private String name;
    private int age;
    private String address;

   //default
    public Student() {
        this.name = "unknown";
        this.age = 0;
        this.address = "not available";
    }


    public void set(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //parameterized
    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    public void info() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);

    }
}
