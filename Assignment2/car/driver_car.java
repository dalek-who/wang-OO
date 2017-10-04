package car;

public class driver_car {

    boolean owner = false; //是否拥有该车
    int miles = 0; //行驶里程数

    public driver_car(){}

    public void bought(int already_miles){
        owner = true;
        miles = already_miles;
    }

    public int sold(int price){
        owner = false;
        return price;
    }

    public int used(int distance){
        miles += distance;
        return miles;
    }


}
