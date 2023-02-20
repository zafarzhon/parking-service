package enums;

/**
 * @author Odilov_Zafarjon
 * @link https://t.me/zafarzhon_odilov
 */
public enum PriceTag {
    ZERO_AND_TWENTY(2000),
    TWENTY_AND_SIXTY(4000),
    SIXTY_AND_HUNDRED_EIGHTY(8000),
    HUNDRED_EIGHTY_AND_MORE(12000);

    private int price;

    PriceTag(int price) {
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

}
