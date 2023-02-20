package Model;

import java.time.LocalDateTime;

/**
 * @author Odilov_Zafarjon
 * @link https://t.me/zafarzhon_odilov
 */
public final class Unit {
    private final int id;

    private final String carNumber;

    private LocalDateTime localDateTime;

    public Unit(int id, LocalDateTime localDateTime, String carNumber) {
        this.id = id;
        this.carNumber = carNumber;
        setLocalDateTime(localDateTime);
    }

    public int getId() {
        return id;
    }

    public String getCarNumber(){
        return carNumber;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "id: "+getId() + " , car number: "+getCarNumber();
    }
}
