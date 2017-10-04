package library;

/*
public class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv1's channel is " + tv1.channel
                + " and volume level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel
                + " and volume level is " + tv2.volumeLevel);
    }
}
*/


public class TestLibrary{
    public static void main(String[] args){
        BookKeeper keeper = new BookKeeper();
        //实例化的书：
        Book book1 = new Book("人月神话",90);
        Book book2 = new Book("机器学习导论",40);
        Book book3 = new Book("算法导论",120);
        Book book4 = new Book("C语言",10);
        Book book5 = new Book("Thinking in Java",50);
        Book book6 = new Book("计算机组成与设计",12.5);
        Book book7 = new Book("数据库基础",102);

        //实例化的学生：
        Student student1 = new Student("王苑铮",60);
        Student student2 = new Student("寇伊",150);
        Student student3 = new Student();

        keeper.LendOut(student1,book1);
        keeper.Extend(student1,book1,20);
        keeper.Extend(student1,book1,23);

        keeper.LendOut(student1,book2);
        keeper.LendOut(student1,book3);
        keeper.LendOut(student1,book4);

        keeper.LendOut(student2,book3);
        keeper.LendOut(student2,book4);

        keeper.GetBack(student1,book1,50);

        keeper.LendOut(student2,book1);

        keeper.Extend(student1,book2,35);

        student1.Lost(book2);
        keeper.GetBack(student1,book2,40);

        student1.Lost(book3);
        keeper.GetBack(student1,book3,20);

        keeper.LendOut(student3,book3);
    }
}