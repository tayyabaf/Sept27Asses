public class HourlyEmployee extends Employee implements Discountable {


    public HourlyEmployee(String name, Clothing[] clothingItems, char size) {
        super(name, clothingItems, size);
    }

    @Override
    public double calcDiscount(Clothing clothing) {
        double clothingPrice= clothing.getPrice();
        return getDISCOUNT()*clothingPrice;
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        double finalPrice = (clothing.getPrice()) - calcDiscount(clothing);
        System.out.println(finalPrice);
    }
}
