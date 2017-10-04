package car;

public class CarTest {
    public static void main(String[] args){
        company_car c_car1 = new company_car();
        System.out.print("index:"+c_car1.index+"  sold_number:"+c_car1.sold_number +"\n");
        c_car1.sold();
        System.out.print("index:"+c_car1.index+"  sold_number:"+c_car1.sold_number+"\n");

        company_car c_car2 = new company_car();
        System.out.print("index:"+c_car2.index+"  sold_number:"+c_car2.sold_number+"\n");
        company_car c_car3 = new company_car();
        System.out.print("index:"+c_car3.index+"  sold_number:"+c_car3.sold_number+"\n");

        c_car2.sold();
        System.out.print("index:"+c_car2.index+"  sold_number:"+c_car2.sold_number+"\n");
        c_car3.sold();
        System.out.print("index:"+c_car3.index+"  sold_number:"+c_car3.sold_number+"\n");


        
        driver_car d_car1 = new driver_car();
        System.out.print( ((d_car1.owner)?"own":"not own" ) + " this car, driven "+d_car1.miles+"miles\n");
        d_car1.bought(1000);
        System.out.print( ((d_car1.owner)?"own":"not own" ) + " this car, driven "+d_car1.miles+"miles\n");
        d_car1.used(516);
        System.out.print( ((d_car1.owner)?"own":"not own" ) + " this car, driven "+d_car1.miles+"miles\n");
        d_car1.sold(1000);
        System.out.print( ((d_car1.owner)?"own":"not own" ) + " this car, driven "+d_car1.miles+"miles\n");

        authority_car a_car = new authority_car("N10086");
        a_car.Accident();
        a_car.Punish();
        a_car.Punish();
        a_car.Accident();
        a_car.Punish();
    }
}
