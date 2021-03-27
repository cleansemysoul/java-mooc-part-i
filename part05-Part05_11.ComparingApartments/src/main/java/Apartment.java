
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared) {
        int price = squares * pricePerSquare;
        int comparedPrice = compared.squares * compared.pricePerSquare;
        if (price > comparedPrice) {
            return price - comparedPrice;
        } else {
            return comparedPrice - price;
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int price = squares * pricePerSquare;
        int comparedPrice = compared.squares * compared.pricePerSquare;
        return price > comparedPrice;
    }
}
