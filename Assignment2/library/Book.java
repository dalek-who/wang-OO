package library;



public class Book{

    String name = "<Thinking in Java>";
    double price = 30.00;
    int available_days = 0; // 可借出的天数
    int extend_days = 10;   //每次可续期十天
    boolean CanBeBorrowed = true;    //是否可借阅
    boolean CanBeExtend  = true ;    // 允许续期
    boolean lost = false;   //是否丢失


   public Book(String book_name,double book_price){
        name = "《"+book_name+"》";
        price = book_price;
    }

    //书被借走
    public boolean Borrowed(){
       if(!lost && CanBeBorrowed) {
           CanBeBorrowed = false;
           available_days = 30;
           System.out.println(name + " has been borrowed");
           return true;
       }
       else {
           System.out.println(name + " is not available");
           return false;
       }
    }

    //书被续期
    public boolean Extended(){
        if (!CanBeExtend){
            System.out.println(name + " can't be extended again! ");
            return false;
        }
       else {
            CanBeExtend = false;
            available_days += extend_days;
            System.out.println(name + " is extended ");
            return true;
        }
    }

    //书被归还
    public void Returned(){
        if(!lost) {
            CanBeBorrowed = true;
            CanBeExtend = true;
            available_days = 30;
            System.out.println(name + " has been returned");
        }
        else {
            System.out.println(name + " has been lost");
        }
    }

    //书被丢失
    public void Lost(){
        CanBeBorrowed = false;
        CanBeExtend = false;
        lost = true;
        System.out.println(name + " has been lost");
    }

}