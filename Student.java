
package OOPexercise.Book2.Person;
import java.util.*;
public class Student extends Person{
    private String major;
    private float gpa;

    public Student(String major, float gpa, String ID, String fullName, Date dateBirth, Date dateBorrow, Date dateReturn) {
        super(ID, fullName, dateBirth, dateBorrow, dateReturn);
        this.major = major;
        this.gpa = gpa;
    }

    public Student() {
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public float getGpa() {
        return gpa;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    @Override
    public void addPerson(){
        super.enter();
        System.out.println("Hay nhap nganh hoc: ");
        this.major=nhap.nextLine();
        System.out.println("Hay nhap GPA: ");
        this.gpa=nhap.nextFloat();
        nhap.nextLine();
    }
    @Override
    public void updatePerson(String id){
        super.edit();
        System.out.println("Hay cap nhat nganh hoc: ");
        this.major=nhap.nextLine();
        System.out.println("Hay cap nhat GPA: ");
        this.gpa=nhap.nextFloat();
        nhap.nextLine();
    }
    @Override
    public void displayInfo(){
        super.display();
        System.out.println("Nganh hoc: "+major+", GPA: "+gpa);
    }
    
}
