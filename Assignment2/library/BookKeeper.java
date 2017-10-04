package library;
import java.util.Random;

//感觉管理员的这部分不知道写点什么。
// 借书是学生和管理员两个人互动的活动，只能写在其中一个人的类里。
// 并且是学生提出借书，管理员才能借给他。所以借书只能放在学生的类里。
public class BookKeeper {

    String name = "Book Keeper";
    boolean angry = false;//管理员的态度是随机的

    public BookKeeper(){}

    //管理员生气骂人
    public void Scold(Student student){
        System.out.println(name + ":I'm angry! Stupid donkey! "+student.name);
    }

    //向学生借书
    public void LendOut(Student student,Book book){
        boolean success = student.Borrow(book);
        if(success)
            System.out.println(name+": Here you are.\n");
        else
            System.out.println(name+": Sorry, you can't borrow it.\n");
    }

    //延期
    public void Extend(Student student,Book book,int day){
        boolean success = student.Extend(book,day);
        if(success)
            System.out.println(name+": You can borrow it 10 days more.\n");
        else
            System.out.println(name+": Sorry, your time is out.\n");
    }

    //办理学生还书的手续
    public void GetBack(Student student,Book book,int day){
        //管理员的脾气是随机的
        Random rand = new Random();
        angry = rand.nextBoolean();

        boolean success = student.Return(book,day);
        //正常还书
        if(success){
            System.out.println(name + ": Have a nice day,"+student.name+"\n");
        }
        //逾期或者丢书而被罚款
        else {
            if(angry)
                Scold(student);
            System.out.println(name+": Fine your money");
            student.Fine(book);

            if(student.money < 0)
                student.Charge(-1*student.money);

            System.out.println("\n");
        }
    }
}
