// الشكل العام للواجهة // ui
package librarysystem;
import java.util.ArrayList; 
import java.util.Scanner;
import javax.swing.JOptionPane;

public class LibrarySystem {
    public static void main(String[] args) {
        LS4 g = new LS4();
        ArrayList<LS3> arr = new ArrayList();
        arr.add(new LS3("book", "moatasem", "0000000000001", "late"));
        arr.add(new LS3("book1", "Mohammed", "0000000000002", "late"));
        arr.add(new LS3("book2", "Samy", "0000000000003", "reserved"));
        arr.add(new LS3("book3", "Saleh ", "0000000000004", "reserved"));
        arr.add(new LS3("book4", "montaser ", "0000000000005", "Available"));
        arr.add(new LS3("book5", "ahmaed ", "123", "reserved"));
        arr.add(new LS3("book6", "moSaleh ", "0000000000123", "late"));
                
        int  choice, Achoice, Bchoice; // الاختر 
        // choice   عشان يختار المدير و ط وخروج 
        // Achoice  خيارات المدير ححح
        // Bchoice خيارات الطالب 
        Scanner input = new Scanner(System.in);
        System.out.println("choice : ");
        System.out.println("0-Exit ");
        System.out.println("1-student ");
        System.out.println("2-Administrator ");
        choice = input.nextInt();     // 0-1-2 
        if (choice == 2) {
                       Achoice= g.aadmin();     // 0 >>>-----mod--->10
            while (Achoice != 0) {
                switch (Achoice) {
                    case 0:
                        return;
                    case 1:
                        g.Addnewbook(arr);   // اضافة كتاب جديد 
                        break;
                    case 2:
                        g.checkbookstatus(arr);  // حالة الكتاب 
                        break;
                    case 3:
                        g.Update_book_detail(arr); // تحديث التفاصيل 
                        break;
                    case 4:
                        g.Delete(arr); // خذف
                        break;
                    case 5:
                        g.viewlatebook(arr);// عرض الكتب المتأخرة  //////late
                        break;
                    case 6:
                        g.viewreservedbook(arr);  //عرض الكتب المحجوزة // reserved
                        break;
                    case 7:
                        g.Viewstudentdetail(arr);
                        break;
                    case 8:
                        g.viewallbooks(arr);  /// عرض كل الكتب 
                        break;
                    case 9:
                        g.searchforbook(arr);  // ابحث عن كتاب
                        break;
                    case 10:
                        g.Updatestatus(arr);
                        break;
                }
            g.choiceadmin(); 
            Achoice = input.nextInt();} 
            

        } else if (choice == 1) { 
               Bchoice=   g.student();  // الطالب  /// 00>>>>>>>>>>44
            while (Bchoice != 0) {

                switch (Bchoice) {
                    case 0:
                      return; 
                    case 1:
                        g.searchforbook(arr); 
                        break;
                    case 2:
                        g.Reservebook(arr); 
                        break;
                    case 3:
                        g.checkbookstatus(arr);
                        break;
                    case 4:
                        g.Renewbook(arr);
                        break;
                }
                g.choicestudent();
                Bchoice = input.nextInt();
            }
        }
        
    }

}
