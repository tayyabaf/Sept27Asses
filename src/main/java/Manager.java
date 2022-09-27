public class Manager extends Employee implements Discountable{


private final double DISCOUNT = .25;


    public Manager(String name, Clothing[] clothingItems, char size) {
        super(name, clothingItems, size);
    }

    public double getDISCOUNT() {
        return getDISCOUNT();
    }

    @Override
    public double calcDiscount(Clothing clothing) {
        double clothingPrice= clothing.getPrice();
        return DISCOUNT*clothingPrice;
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        double finalPrice = (clothing.getPrice()) - calcDiscount(clothing);
        System.out.println(finalPrice);
    }


}
