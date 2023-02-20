package Data;

import Model.Unit;

import java.util.ArrayList;

/**
 * @author Odilov_Zafarjon
 * @link https://t.me/zafarzhon_odilov
 */
public enum DataALL {
    DATA_ALL;
    private ArrayList<Unit> allUnits = new ArrayList<>();

    public void add(Unit unit) {
        allUnits.add(unit);
    }

    public Unit findUnit(int id){
        for (Unit unit : allUnits) {
            if(unit==null) continue;
            if (unit.getId() == id) {
                return unit;
            }
        }
        return null;
    }

    public Object[] getData(){
        return allUnits.toArray();
    }

}
