package Service;

import Data.Data;
import Data.DataALL;
import Model.Unit;
import enums.PriceTag;

import java.time.LocalDateTime;

/**
 * @author Odilov_Zafarjon
 * @link https://t.me/zafarzhon_odilov
 */
public enum ParkService {
    PARK_SERVICE;

    public void add(int id,String carNumber, LocalDateTime localDateTime){
        Unit unit = DataALL.DATA_ALL.findUnit(id);
        if(unit!=null){
            Data.DATA.add(unit);
        }else{
            unit = new Unit(id,localDateTime, carNumber);
            Data.DATA.add(unit);
            DataALL.DATA_ALL.add(unit);
        }
    }

    public void remove(int id,LocalDateTime localDateTime){
        Unit unit = Data.DATA.remove(id);
        if(unit!=null){
            LocalDateTime first = unit.getLocalDateTime();
            if(first.toLocalDate().equals(localDateTime.toLocalDate())){
                int minute = (localDateTime.getHour()-first.getHour())*60 + localDateTime.getMinute() - first.getMinute();
                if(minute>0&&minute<=20){
                    System.out.println(unit + " total amount for "+minute+" minutes: "+PriceTag.ZERO_AND_TWENTY.getPrice()+" sum");
                }else if(minute<=60){
                    System.out.println(unit + " total amount for "+minute+" minutes: "+PriceTag.TWENTY_AND_SIXTY.getPrice()+" sum");
                }else if(minute<=180){
                    System.out.println(unit + " total amount for "+minute+" minutes: "+PriceTag.SIXTY_AND_HUNDRED_EIGHTY.getPrice()+" sum");
                }else if(minute>180) {
                    System.out.println(unit + " total amount for " + minute + " minutes: " + PriceTag.HUNDRED_EIGHTY_AND_MORE.getPrice() + " sum");
                }
            }else
                System.out.println(unit + " total amount " + PriceTag.HUNDRED_EIGHTY_AND_MORE.getPrice() + " sum");
        }else{
            System.out.println("Error: you wanted remove non unit!");
        }
    }
    public Object[] getActiveUnits(){
        return Data.DATA.getUnits();
    }

    public Object[] getAllData(){
        return DataALL.DATA_ALL.getData();
    }
}
