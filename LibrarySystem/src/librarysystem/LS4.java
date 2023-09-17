// add   //  get //  size // remove // set
package librarysystem;
import java.util.ArrayList; 
import java.util.Scanner;
import javax.swing.JOptionPane;
public class LS4 {
    
     Scanner input=new Scanner(System.in);
     public LS4() {
    }
    
    public  void Addnewbook(ArrayList <LS3> arr)   /// اضافة كتاب جديد 
    {  
        ///  اسم الكتاب   اسم المؤلف    رقم الكتاب    حالة الكتاب 
        String booktitle,author,ISBN,status;
    
        System.out.print( "please enter title_book  : ");
        booktitle=input.next();  // عنوان الكتاب
        System.out.print("please enter author's name  : ");
        author=input.next(); //مؤلف 
        System.out.print(" please enter ISBN  : "); //  ISBN // 13 رمز او عادي اي حاجة  
        ISBN=input.next(); 
        System.out.print("  late && " + "  reserved  "+"please enter status  : "); // الحالة
        status=input.next();
        LS3 x = new LS3(booktitle, author, ISBN,status);
        arr.add(x); 
    }
    /////////////////
    public void searchforbook(ArrayList <LS3> arr)  // ابحث عن كتاب      (باستخدام عنوان الكتاب أو المؤلف أو رقم  
    {
        String search;
        System.out.println("Enter book title || author || ISBN to search it:  ");
        search = input.next();

        for (int i = 0; i < arr.size(); i++) {
   if (arr.get(i).ISBNbook().equals(search) || arr.get(i).getbooktitle().equals(search) || arr.get(i).getauthor().equals(search))
   {
                System.out.print(arr.get(i).ISBNbook() + "\t\t");
                System.out.print(arr.get(i).getbooktitle() + "\t\t");
                System.out.print(arr.get(i).getauthor() + "\t\t");
                System.out.print(arr.get(i).check() + "\t\t");
            }
        }
        System.out.println("\n");

    }
    ///////////////////////////////////////////
     public void Viewstudentdetail(ArrayList <LS3> arr) // عرض تفاصيل ط   
    {
         System.out.println("enter the student ID ");
         
     }
    ///////////////////////////////////////////  
    public void Delete(ArrayList<LS3> arr) //  حذف عن طريق الرقم 
    {
        String ISBN;
        System.out.print("enter the book delete [type its ISBN]:  ");
        ISBN = input.next();
int j;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).ISBNbook().equals(ISBN)) {
   //  j = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete book", JOptionPane.YES_NO_CANCEL_OPTION);
        //0=yes 1=no 2=cancel
  
 // if   (j==0)
 // { arr.remove(i);}
  arr.remove(i);
  } 
        }
        
    }
    ///////////////////////////////////////
    public void checkbookstatus(ArrayList <LS3> arr)  //       من حالة الكتب (متوفرة أو محجوزة أو متأخرة).
    {
        String ISBN;   // عن طريق الرقم 
        System.out.println(" enter ISBN of book : ");  // ادخل الرقم الكتاب الذي تريد معرفة حالتة 
        ISBN = input.next();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).ISBNbook().equals(ISBN)) {
                System.out.println("حالة الكتاب هي  :  " + arr.get(i).check());
            } 
        }
    } 

    
    ////////////////////////////////////////////////
      public void Renewbook(ArrayList <LS3> arr)   
             
    {
        System.out.println("--------------------------------------------------------");   
     }
    
    
    
    ///////////////////////////////////////
    public void viewlatebook(ArrayList <LS3> arr)   // عرض الكتب المتأخرة 
    {
        System.out.println("ISBNBook\t Book title\t Author \t status"); // رقم   اسم   مؤالف     حالة 
        System.out.println("--------- \t -------- \t -------- \t ---------");

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).check().equals("late")) {
                System.out.print(arr.get(i).ISBNbook() + "\t\t");
                System.out.print(arr.get(i).getbooktitle() + "\t\t");
                System.out.print(arr.get(i).getauthor() + "\t\t");
                System.out.print(arr.get(i).check() + "\t\t");
                System.out.println("\n");

            }
        }
        System.out.println("\n");
        System.out.println("\n");


    }
    //////////////////////////////
    public void viewreservedbook(ArrayList<LS3> arr) // عرض الكتب المحجوزة// نفس الكود السابق مع تغير الحالة للفحص 
    {
        System.out.println("ISBNBook\t Book title\t Author \t status");
        System.out.println("--------- \t -------- \t -------- \t ---------");

        for (int i = 0; i < arr.size(); i++)
            if (arr.get(i).check().equals("reserved")) // محجوز
            {
                System.out.print(arr.get(i).ISBNbook() + "\t\t");
                System.out.print(arr.get(i).getbooktitle() + "\t\t");
                System.out.print(arr.get(i).getauthor() + "\t\t");
                System.out.print(arr.get(i).check() + "\t\t");
                System.out.println("\n");

        }
          System.out.println("\n");
    }
     //////////////////////////////////
    public void Update_book_detail(ArrayList <LS3> arr)  ///  تحديث التفاصل من المدير اكيد ولازم يحط التفاصيل و يحدثها من خلال رقم الكتاب 
    {
        String ISBN,booktitle,author,status;
        System.out.println("please enter ISBN of book: "); // دخل الرقم a
        ISBN=input.next();
        
        for(int i=0 ; i<arr.size();i++)
        if(arr.get(i).ISBNbook().equals(ISBN))
        {
        System.out.print("please enter title_book  new: "); 
        booktitle=input.next();
        System.out.print("please enter author name  new : ");
        author=input.next();
        System.out.println("please enter status  new : ");
        status=input.next();
   
     
        arr.get(i).setISBN(ISBN);  
        arr.get(i).set_book_title(booktitle);
        arr.get(i).set_author(author);
        arr.get(i).setstatus(status);
                
                } 
    }  
    //////////////
    public void viewallbooks(ArrayList<LS3> arr) /// عرض كل الكتب 
    {

        System.out.println("ISBNBook \t Book title \t Author \t status"); //    رقم الكتاب   اسم  اسم مؤالف حالة 
        System.out.println("--------- \t -------- \t -------- \t ----------"); //    ....
        for (LS3 a : arr) {
            System.out.println(a.ISBNbook() + " \t\t " + a.getbooktitle() + " \t\t "
                    + a.getauthor() + " \t\t " + a.check());
        }

    }
    ///////////////////////////////////////////////////////////////////
    public void Updatestatus(ArrayList<LS3> arr) ///  تحديث التفاصل من المدير اكيد ولازم يحط التفاصيل و يحدثها من خلال رقم الكتاب 
    {
        String ISBN, status;
        System.out.println("please enter ISBN of book: "); // دخل الرقم a
        ISBN = input.next();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).ISBNbook().equals(ISBN)) {

                System.out.println("please enter status  new : ");
                status = input.next();
                arr.get(i).setstatus(status);

            }
        }
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////
    
     public void Reservebook(ArrayList<LS3> arr) /// بدي اشوف الحالة اذاذاذاذا كان محجوز اقول لة ما في اذ ذاذ ذااذاذاذ غير محجوز اغير من غير ال محجوز
    {
        String ISBN, booktitle, author, status;
        System.out.println("please enter book title of book: "); // دخل  a
        booktitle = input.next();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getbooktitle().equals(booktitle)) {
                System.out.print(arr.get(i).ISBNbook() + "\t\t");
                System.out.print(arr.get(i).getbooktitle() + "\t\t");
                System.out.print(arr.get(i).getauthor() + "\t\t");
                System.out.print(arr.get(i).check() + "\t\t");
                System.out.println("\n");
                System.out.println("please enter status  new : ");
                status = input.next();
                arr.get(i).setstatus(status);

            }
        }

    }  
    
  /////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////

    public int aadmin() {
        Scanner input = new Scanner(System.in);

        System.out.println("welcome, director of the library");
        System.out.println("enter thr Username   : ");
        String Username = input.next();

        System.out.println("enter thr password   : ");
        String password = input.next();
        int Achoice = 0;

        if ("admin".equals(Username) && "admin".equals(password)) {

            System.out.println("Adminstrator, which work you want to do?");
            System.out.println("0-Exit");
            System.out.println("1-Add new book ");
            System.out.println("2-check book status ");
            System.out.println("3-Update book detail ");
            System.out.println("4-Delete book ");
            System.out.println("5-View late book ");
            System.out.println("6-View reserved books ");
            System.out.println("7-view student details ");
            System.out.println("8-view all books ");
            System.out.println("9-search for books ");
            System.out.println("10-Return book ");
            System.out.println("Please enter your choise :    ");
            Achoice = input.nextInt();

        } else {
            System.out.println("Username or password is incorrect ");
        }
        return Achoice;
}   
   ///////////////////////////////////////////////////////////
    public int student() {

        Scanner input = new Scanner(System.in);
        int Bchoice = 0;
        boolean t = false;
        boolean c = false;
        boolean h = false;

        String[] user = {"moatasem", "asd", "ahmed"};
        String[] pass = {"123456", "0", "0000"};
        System.out.println("enter thr Username   : ");
        String Username = input.next();
        System.out.println("enter thr password   : ");
        String password = input.next();
        for (int i = 0; i < user.length; i++) {
            if (user[i].equals(Username)) {
                t = true;
                break;
            }
        }
        for (int j = 0; j < pass.length; j++) {
            if (pass[j].equals(password)) {
                c = true;
                break;

            }
        }

        if (t && c) {
            System.out.println("welcome, student "+ Username +"  of the library");
            System.out.println("student, which work you want to do?");

            System.out.println("0-Exit");
            System.out.println("1-Search for book ");
            System.out.println("2-Reserve book ");
            System.out.println("3-Check book status ");
            System.out.println("4-Renew book ");
            System.out.println("Please enter your choise: ");
            Bchoice = input.nextInt();

        } else {
            System.out.println("Username or password is incorrect");

        }
        return Bchoice;
    }
   
     /********achoice********************************************/
    public  void choiceadmin(){
System.out.println("Adminstrator, which work you want to do?");
         System.out.println("0-Exit");
         System.out.println("1-Add new book ");
         System.out.println("2-check book status ");
         System.out.println("3-Update book detail ");
         System.out.println("4-Delete book ");
         System.out.println("5-View late book ");
         System.out.println("6-View reserved books ");
         System.out.println("7-view student details ");
         System.out.println("8-view all books ");
         System.out.println("9-search for books ");
         System.out.println("10-Return book ");
         System.out.println("Please enter your choise :    ");
}
     
     /**********************choicestudent *********Bchoice*****************/
     public void choicestudent() {
        System.out.println("student, which work you want to do?");

        System.out.println("0-Exit");
        System.out.println("1-Search for book ");
        System.out.println("2-Reserve book ");
        System.out.println("3-Check book status ");
        System.out.println("4-Renew book ");
        System.out.println("Please enter your choise: ");
}








}// اخررررررررررر


   //  arr.get(i).setISBN(ISBN);   
  ///////////////////////////////////////////////////////////////////////////////
    /* public void  adda(){
     String booktitle, author, ISBN, status;
        booktitle = "book1";  
        author = "moatasem";  
        ISBN = "0000000000001";
        status = "late";        
        LS3 x = new LS3(booktitle, author, ISBN, status);
        arr.add(x);
}
     public void  addb(){
     String booktitle, author, ISBN, status;
        booktitle = "book2";  
        author = "ahmaed";  
        ISBN = "0000000000002";
        status = "reserved";        
        LS3 x = new LS3(booktitle, author, ISBN, status);
        arr.add(x);
}
    public void  addc(){
     String booktitle, author, ISBN, status;
        booktitle = "book3";  
        author = "montaser";  
        ISBN = "0000000000003";
        status = "reserved";        
        LS3 x = new LS3(booktitle, author, ISBN, status);
        arr.add(x);
}
    public void  adds(){
     String booktitle, author, ISBN, status;
        booktitle = "book4";  
        author = "lana";  
        ISBN = "123";
        status = "late";        
        LS3 x = new LS3(booktitle, author, ISBN, status);
        arr.add(x);}
    
     public void  addl(){
     String booktitle, author, ISBN, status;
        booktitle = "book5";  
        author = "mjr";  
        ISBN = "0000000000123";
        status = "reserved";        
        LS3 x = new LS3(booktitle, author, ISBN, status);
        arr.add(x);}*/
///////////////////////////////////////////////// 
