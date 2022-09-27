public abstract class Employee extends Customer{
    private final double DISCOUNT = .10;

    public Employee(String name, Clothing[] clothingItems, char size) {
        super(name, clothingItems, size);
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }

    public abstract void printEmpPriceAfterDisc(Clothing clothing);
}
