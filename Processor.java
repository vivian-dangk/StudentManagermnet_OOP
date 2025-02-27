
package OOPexercise.Book2.Person;
import java.util.*;
public class Processor {
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        PersonList danhsach=new PersonList();
        while(true){
            System.out.println("Hay chon cac thao tac sau: ");
            System.out.println("1. Nhap thong tin.");
            System.out.println("2. Cap nhat thong tin theo ID.");
            System.out.println("3. Xoa theo ID.");
            System.out.println("4. Tim theo ID.");
            System.out.println("5. In danh sach.");
            System.out.println("6. In hoc sinh cao diem nhat.");
            System.out.println("7. In danh sach giao vien theo khoa.");
            System.out.println("8. Kim tra hanj muon sach.");
            System.out.println("9. Thoat.");
            int chon=nhap.nextInt();
            nhap.nextLine();
            switch(chon){
                case 1: 
                    danhsach.addPerson();
                    break;
                case 2: 
                    System.out.println("Hay nhap ID muon cap nhat: ");
                    String id=nhap.nextLine();
                    danhsach.updatePerson(id);
                    break;
                case 3: 
                    System.out.println("Hay nhap ID muon xoa: ");
                    String iD=nhap.nextLine();
                    danhsach.deletePerson(iD);
                    break;
                case 4:
                    System.out.println("Hay nhap ID muon tim: ");
                    String Id=nhap.nextLine();
                    if(danhsach.findPerson(Id)==null){
                        System.out.println("Khong tim thay ID.");
                    }else{
                        System.out.println(danhsach.findPerson(Id));
                    }
                    break;
                case 5: 
                    System.out.println("Danh sach: ");
                    danhsach.displayall();
                    break;
                case 6: 
                    danhsach.findTop();
                    break;
                case 7:
                    System.out.println("Hay nhap khoa muon in: ");
                    String department=nhap.nextLine();
                    danhsach.teacherDepart(department);
                    break;
                case 8: 
                    System.out.println("Thong tin ngay muon: ");
                    danhsach.bookBorrow();
                    break;
                case 9: 
                    System.out.println("Dang thoat...........");
                    System.out.println("Bye!!!!!!!!!!!");
                     
            }
            if(chon==9){
                break;
            }
        }
    }
}
