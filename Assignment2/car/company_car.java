package car;

public class company_car {

    int usable_year = 10; // 保修年限
    int year = 0; //使用的年数
    static int total_index = 0; //出厂编号
    int index;
    public static int sold_number = 0; //卖出的车的数量

    //制造汽车，每辆车的编号都++
    public company_car(){
        ++total_index;
        index = total_index;
    }

    public void sold(){
        ++sold_number;
    }

    public int used(int used_year){
        year += used_year;
        return year;
    }

    //修车：如果低于使用年限就可以修好，否则无法修好
    public boolean repaired(){
        if(year <= usable_year)
            return true;
        else
            return false;
    }
}
