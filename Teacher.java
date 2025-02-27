
package OOPexercise.Book2.Person;
import java.util.*;
public class Teacher extends Person{
    
    private String department;
    private String subject;

    public Teacher(String department, String subject, String ID, String fullName, Date dateBirth, Date dateBorrow, Date dateReturn) {
        super(ID, fullName, dateBirth, dateBorrow, dateReturn);
        this.department = department;
        this.subject = subject;
    }
    
    public Teacher() {
    }

    public String getDepartment() {
        return department;
    }
    
    @Override 
    public void addPerson(){
        super.enter();
        System.out.println("Hay nhap khoa: ");
        this.department=nhap.nextLine();
        System.out.println("Hay nhap mon giang day: ");
        this.subject=nhap.nextLine();
    }
    @Override
    public void updatePerson(String id){
        super.edit();
        System.out.println("Hay cap nhat khoa: ");
        this.department=nhap.nextLine();
        System.out.println("Hay cap nhat mon giang day: ");
        this.subject=nhap.nextLine();
    }
    @Override
    public void displayInfo(){
        super.display();
        System.out.println("Khoa: "+department+", mon: "+subject);
    }
}
