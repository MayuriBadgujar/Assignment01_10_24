public class PersonMain {
    public static void main(String args[]){
        System.out.println("---------------------Person Class----------------------");
        Person person=new Person();
        person.introduce();
        System.out.println("------------------Employee Class-------------------------");
        Employee employee=new Employee();
        employee.introduce();
        employee.work();
        employee.getSalary();
        System.out.println("-------------------HR Class------------------------");
        HRManager hr=new HRManager();
        hr.introduce();
        hr.work();
        hr.addEmployee();
        System.out.println("-------------------------------------------");
    }
}
/*
---------------------Person Class----------------------
I am a person.
------------------Employee Class-------------------------
I am an employee.
I am working as an employee.
-------------------HR Class------------------------
I am an HR Manager.
I am managing HR-related tasks.
Adding a new employee to the company.
-------------------------------------------
 */