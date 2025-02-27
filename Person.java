
package OOPexercise.Book2.Person;
import java.util.*;
import java.text.*;
public abstract class Person implements IPerson{
    Scanner nhap=new Scanner(System.in);
    private String ID;
    private String fullName;
    private Date dateBirth;
    private Date dateBorrow;
    private Date dateReturn;
    private SimpleDateFormat bd=new SimpleDateFormat("dd/MM/yyyy");

    public Person(String ID, String fullName, Date dateBirth, Date dateBorrow, Date dateReturn) {
        this.ID = ID;
        this.fullName = fullName;
        this.dateBirth = dateBirth;
        this.dateBorrow = dateBorrow;
        this.dateReturn = dateReturn;
    }

    public Person() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void setDateBorrow(Date dateBorrow) {
        this.dateBorrow = dateBorrow;
    }

    public void setDateReturn(Date dateReturn) {
        this.dateReturn = dateReturn;
    }

    public void setBd(SimpleDateFormat bd) {
        this.bd = bd;
    }
    @Override
    public void addPerson(){
        
    }
    @Override
    public void updatePerson(String id){
        
    }
    @Override
    public void displayInfo(){
        
    }
    
    public void enter(){
        System.out.println("Hay nhap ID: ");
        this.ID=nhap.nextLine();
        System.out.println("Hay nhap ten: ");
        this.fullName=nhap.nextLine();
        while(true){
            try{
                System.out.println("Hay nhap ngay sinh: ");
                this.dateBirth=bd.parse(nhap.nextLine());
                break;
            }catch(ParseException e){
                System.out.println("Nhap sai hay nhap lai.");
            }
        }
        while(true){
            try{
                System.out.println("Hay nhap ngay muon: ");
                this.dateBorrow=bd.parse(nhap.nextLine());
                break;
            }catch(ParseException e){
                System.out.println("Nhap sai hay nhap lai.");
            }
        }
        while(true){
            try{
                System.out.println("Hay nhap ngay tra: ");
                this.dateReturn=bd.parse(nhap.nextLine());
                break;
            }catch(ParseException e){
                System.out.println("Nhap sai hay nhap lai.");
            }
        }
    }
    public void edit(){
        System.out.println("Hay cap nhat ID: ");
        this.ID=nhap.nextLine();
        System.out.println("Hay cap nhat ten: ");
        this.fullName=nhap.nextLine();
        while(true){
            try{
                System.out.println("Hay cap nhat ngay sinh: ");
                this.dateBirth=bd.parse(nhap.nextLine());
                break;
            }catch(ParseException e){
                System.out.println("Nhap sai hay nhap lai.");
            }
        }
        while(true){
            try{
                System.out.println("Hay cap nhat ngay muon: ");
                this.dateBorrow=bd.parse(nhap.nextLine());
                break;
            }catch(ParseException e){
                System.out.println("Nhap sai hay nhap lai.");
            }
        }
        while(true){
            try{
                System.out.println("Hay cap nhat ngay tra: ");
                this.dateReturn=bd.parse(nhap.nextLine());
                break;
            }catch(ParseException e){
                System.out.println("Nhap sai hay nhap lai.");
            }
        }
    }
    public void display(){
        System.out.println("ID: "+ID+", ten: "+fullName+", ngay sinh: "+bd.format(dateBirth));
        System.out.println("Ngay muon: "+bd.format(dateBorrow)+", ngay tra: "+bd.format(dateReturn));
    }
    public boolean bookOevrdue(){
        double tongngay=(this.dateReturn.getTime()-this.dateBorrow.getTime())/(1000*60*60*24);
        if(tongngay>=30){
            return false;
        }
        return true;
    }
    
}
