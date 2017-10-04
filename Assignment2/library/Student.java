package library;

public class Student {
    String name = "student";
    int can_borror_number = 3; //可借阅的书的数量
    double money = 0;

    public Student(){}

    public Student(String student_name,double student_money){
        name = student_name;
        money = student_money;
    }

    //学生借书
    public boolean Borrow(Book book){
        //借书少于三本，可以借书：
        System.out.println(name + " borrows " + book.name);
        if ( can_borror_number > 0){
            //书未被借走、未丢失，可以接到：
            if( book.Borrowed() ) {
                --can_borror_number;
                System.out.println(name + " successfully borrows " + book.name);
                return true;
            }
            //书被借走或丢失，不能借：
            else
                return false;
        }
        //借书多余三本，借不走
        else {
            System.out.println(name + " can't borrow more than 3 books," + book.name );
            return false;
        }
    }

    //学生还书
    //days:借出的第days天还书
    public boolean Return(Book book,int days){
        System.out.println(name + " returns " + book.name );
        if(days > book.available_days || book.lost) {
            book.Returned();
            return false;
        }
        else {
            book.Returned();
            return true;
        }
    }

    //学生续期
    public boolean Extend(Book book,int days){
        System.out.println(name + " extends " + book.name );
        if(days > book.available_days )
            return false;
        else
            return book.Extended();
    }

    //学生丢失书
    public void Lost(Book book){
        book.Lost();
        System.out.println(name + " loses book " + book.name+"\n");
    }

    //学生充钱
    public void Charge(double more){
        money += more;
        System.out.println(name + " charge money $"+more+" now money:$"+money);
    }

    //学生罚款
    public void Fine(Book book){
        money -= (book.lost)? book.price : 2 ; //罚款有两种，如果是书丢了则要赔书。否则是因为逾期而被罚款
        System.out.println(name + " is fined $"+book.price+", now money:$"+money);
    }
}
