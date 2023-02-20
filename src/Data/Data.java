package Data;

import Model.Unit;

import java.util.ArrayList;

/**
 * @author Odilov_Zafarjon
 * @link https://t.me/zafarzhon_odilov
 */
public enum Data {
    DATA;

    private ArrayList<Unit> units = new ArrayList<>();

    public void add(Unit unit) {
        units.add(unit);
    }

//    public Unit get(int index) {
//        return units.get(index);
//    }

    public Unit remove(int id) {
        return units.remove(getIndex(id));
    }

    public Unit findUnit(int id){
        for (Unit unit : units) {
            if(unit==null)continue;
            if (unit.getId() == id) {
                return unit;
            }
        }
        return null;
    }
    public int getIndex(int id){
        return units.indexOf(findUnit(id));
    }
    public Object[] getUnits(){
        return units.toArray();
    }
}
