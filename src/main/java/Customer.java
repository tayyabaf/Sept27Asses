import java.util.Arrays;

public abstract class Customer extends Person{
    private Clothing [] clothingItems;
    private char size;
    Clothing clothingItem;


    public Customer(String name, Clothing[] clothingItems, char size) {
        super(name);
        this.clothingItems = clothingItems;
        this.size = size;
    }

    public Clothing[] getClothingItems() {
        return clothingItems;
    }

    public Clothing getClothingItem() {
        return clothingItem;
    }

    public char getSize() {
        return size;
    }




    @Override
    public String toString() {
        return "Customer{" +
                "clothingItems=" + Arrays.toString(clothingItems) +
                ", size=" + size +
                '}';
    }
}
