package car;

//交管局眼中的车
public class authority_car {
    int accident_time = 0; //事故次数
    String car_id; //车牌号
    boolean accident = false; //是否出了事故
    boolean punish = false; //是否已接受处罚

    public authority_car(String the_car_id){
        car_id = the_car_id;
    }

    //车出事故
    public void Accident(){
        ++accident_time;
        accident = true;
        punish = false;
    }

    //惩罚事故车辆
    public void Punish(){
        if( accident && !punish) {
            System.out.println(car_id + "  is punished\n");
            punish = true;
        }
        else
            System.out.println(car_id + "  don't need to be punished again\n");
    }

}

