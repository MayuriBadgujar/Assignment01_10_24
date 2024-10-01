public class StudentMain {
    public static void main(String args[]) {
        Student student[] = new Student[10];
        student[0] = new Student("Anu",25,"ABC");
        student[1] = new Student("Adu",25,"ABC");
        student[2] = new Student("Mayu",25,"ABC");
        student[3] = new Student("Aditya",25,"ABC");
        student[4] = new Student("Annu",25,"ABC");
        student[5] = new Student("Mayuri",25,"ABC");
        student[6] = new Student("Anya",25,"ABC");
        student[7] = new Student("Adi",25,"ABC");
        student[8] = new Student("Anuuu",25,"ABC");
        student[9] = new Student("Ananya",25,"ABC");


        Student[] Student;
        for (Student st : student) {
            st.info();
        }
        //for(int i=0;i<student.length;i++){
          //  System.out.println(student[i]+"    ");
        //}
    }
}
/*
Name: Anu
Age: 25
Address: ABC
Name: Adu
Age: 25
Address: ABC
Name: Mayu
Age: 25
Address: ABC
Name: Aditya
Age: 25
Address: ABC
Name: Annu
Age: 25
Address: ABC
Name: Mayuri
Age: 25
Address: ABC
Name: Anya
Age: 25
Address: ABC
Name: Adi
Age: 25
Address: ABC
Name: Anuuu
Age: 25
Address: ABC
Name: Ananya
Age: 25
Address: ABC
 */