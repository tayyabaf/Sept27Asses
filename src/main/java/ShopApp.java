import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class ShopApp implements Comparator {

    //implementing comparator methods
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    public Comparator reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator thenComparing(Comparator other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public Comparator thenComparing(Function keyExtractor, Comparator keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public Comparator thenComparing(Function keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator thenComparingInt(ToIntFunction keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator thenComparingLong(ToLongFunction keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator thenComparingDouble(ToDoubleFunction keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }


    // methods


    public static double calcTotal(Clothing[] clothingItems) {
        double totalPrice=0;
        for (int i = 0; i < clothingItems.length; i++) {
            double subTotal = clothingItems[i].getPrice();
            totalPrice+=subTotal;
        }
        return totalPrice;
    }
    public static boolean isAFit(Customer customer, Clothing clothing){
        if (customer.getSize() == clothing.getSize()){
            return true;
        }
        return false;
    }


    public static void sortAndPrintClothingByPrice(ArrayList<Clothing> clothingArrayList) {

        Collections.sort(clothingArrayList, Comparator.comparingDouble(Clothing::getPrice));
        clothingArrayList.forEach(clothing -> System.out.println(clothing));
//            @Override
//            public int compare(Clothing c1, Clothing c2) {
//
//                return Double.compare(c1.getPrice(), c2.getPrice());
            }



    public static void printEmployeeName(Employee employee){
        System.out.println(employee.getName());
    }

    public static void printDiscAmtOff(Discountable[] discountables, Clothing clothing){
        for (int i = 0; i< discountables.length; i++) {
            System.out.println(discountables[i].calcDiscount(clothing));
        }
    }
}
