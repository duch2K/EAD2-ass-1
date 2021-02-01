package kz.iitu.javaee;

import kz.iitu.javaee.model.MotorbikeType;

import java.util.ArrayList;
import java.util.List;

public class MotorbikeService {
    public List getAvailableBrands(MotorbikeType type){

        List brands = new ArrayList();

        switch (type) {
            case SPORT:
                brands.add("Ducati V4S");
                brands.add("BMW S1000RR");
                brands.add("Honda Fireblade SP");
                brands.add("Yamaha YZF-R1M");
                brands.add("Kawasaki Ninja H2");
                break;
            case STREET:
                brands.add("BMW G310R");
                brands.add("Honda CB300R");
                brands.add("KTM DUKE 390");
                brands.add("Ducati SCRAMBLER HASHTAG 400");
                brands.add("Kawasaki Z650");
                break;
            case CRUISER:
                brands.add("BMW R 18");
                brands.add("Honda Rebel 1100");
                brands.add("Honda Rebel");
                brands.add("Kawasaki Vulcan S");
                break;
            case RETRO:
                brands.add("Triumph Thruxton RS");
                brands.add("Yamaha XSR900/XSR700");
                brands.add("BMW R nineT");
                break;
            default:
                brands.add("No Brand Available");
        }

        return brands;
    }
}
