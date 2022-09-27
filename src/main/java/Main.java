import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        //3 clothing objects
        Clothing jeans = new Clothing("Blue Jeans", 20, 'm');
        Clothing tShirt = new Clothing("White T Shirt", 5.0,'s');
        Clothing buttonUp = new Clothing("Button Up Shirt", 30.0, 'l');
//manager cart array
        Clothing [] managerCart = {jeans, tShirt, buttonUp};
//creating manager
        Manager theManager = new Manager("Julie", managerCart, 'm');
//employee cart array
        Clothing [] employeeCart = {jeans, tShirt, buttonUp};
//creating employee
        HourlyEmployee theEmployee = new HourlyEmployee("Susan", employeeCart, 'l');
//invoking methods
        System.out.println(ShopApp.calcTotal(managerCart));

        System.out.println(ShopApp.isAFit(theEmployee, jeans));

        theEmployee.printEmpPriceAfterDisc(jeans);
        theEmployee.printEmpPriceAfterDisc(tShirt);

        theManager.printEmpPriceAfterDisc(jeans);
        theManager.printEmpPriceAfterDisc(tShirt);
// making arraylist
        ArrayList<Clothing> clothingList = new ArrayList<>();
        clothingList.add( new Clothing("black shirt", 4.5, 's'));
        clothingList.add( new Clothing("green shirt", 6.5, 'l'));
        clothingList.add( new Clothing("yellow shirt", 10.5, 's'));
        clothingList.add( new Clothing("red shirt", 3.5, 's'));
        clothingList.add( new Clothing("orange shirt", 5.5, 's'));
//print arraylist
        for (Clothing x : clothingList){
            System.out.println(x.toString());
        }

//more methods
        ShopApp.printEmployeeName(theManager);
        ShopApp.printEmployeeName(theEmployee);
//creating discountable array and running method
Discountable [] discountablePeople = {theEmployee, theManager};
ShopApp.printDiscAmtOff(discountablePeople, jeans);

//sorting method
ShopApp.sortAndPrintClothingByPrice(clothingList);

    }
}
