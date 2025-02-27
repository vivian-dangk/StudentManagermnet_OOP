
package OOPexercise.Book2.Person;
import java.util.*;
public class PersonList {
    ArrayList<Person> danhsach=new ArrayList<>();
    Scanner nhap=new Scanner(System.in);
    public void addPerson(){
        System.out.println("Hay nhap so luong nguoi: ");
        int n=nhap.nextInt();
        nhap.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Hay chon de phan loai (1. Student/2. Teacher): ");
            int loai=nhap.nextInt();
            nhap.nextLine();
            if(loai==1){
                Student myst=new Student();
                myst.addPerson();
                danhsach.add(myst);
            }else if(loai==2){
                Teacher mytc=new Teacher();
                mytc.addPerson();
                danhsach.add(mytc);
            }
        }
    }
    public void updatePerson(String id){
        for(Person myps: danhsach){
            if(myps.getID().equalsIgnoreCase(id)){
                myps.updatePerson(id);
            }
        }
    }
    public void deletePerson(String id){
        for(int i=danhsach.size()-1;i>=0;i++){
            if(danhsach.get(i).getID().equalsIgnoreCase(id)){
                danhsach.remove(i);
            }
        }
    }
    public Person findPerson(String id){
        for(Person myps: danhsach){
            if(myps.getID().equalsIgnoreCase(id)){
                return myps;
            }
        }
        return null;
    }
    public void findTop(){
        Student topst=null;
        double maxGPA=-1;
        for(Person myps: danhsach){
            if(myps instanceof Student){
                Student hocsinh=(Student) myps;
                if(hocsinh.getGpa()>maxGPA){
                    maxGPA=hocsinh.getGpa();
                    topst=hocsinh;
                }
            }
        }
        if(topst!=null){
            System.out.println("Hoc sinh co GPA cao nhat la: ");
            topst.displayInfo();
            System.out.println("GPA: "+maxGPA);
        }else{
            System.out.println("Khong co sinh vien trong danh sach.");
        }
    }
    public void displayall(){
        for(Person myps: danhsach){
            myps.displayInfo();
        }
    }
    public ArrayList<Teacher> teacherDepart(String department){
        ArrayList<Teacher> giaovien=new ArrayList<>();
        for(Person myps: danhsach){
            if(myps instanceof Teacher){
                Teacher list=(Teacher) myps;
                if(list.getDepartment().equalsIgnoreCase(department)){
                    giaovien.add(list);
                }
            }
        }
        return giaovien;
    }
    public void bookBorrow(){
        for(Person myps: danhsach){
            if(!myps.bookOevrdue()){
                myps.displayInfo();
                System.out.println("Da qua han.");
            }else{
                myps.displayInfo();
                System.out.println("Van con han.");
            }
        }
    }
}
