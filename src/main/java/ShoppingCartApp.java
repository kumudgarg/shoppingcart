import java.util.Scanner;

public class ShoppingCartApp {

    public static void main(String[] args) throws ShoppingCartException {
        int choice;
        int quantity;
        String bill;
        ShoppingCartImp shoppingCartImp = new ShoppingCartImp();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Welcome our Shopping mall ");
        System.out.println(" Product Menu :\n" + " 1. Apple\n"  + " 2. masks\n" + " 3. Both\n" + " 4. Exit" );
        choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println(" Enter Apples Quantity ");
                quantity = sc.nextInt();
                Product product1 = new Product(Item.APPLE, quantity);
                bill = shoppingCartImp.addToCart(product1);
                System.out.println(bill);
                System.out.println(" Product Menu :\n" + " 1. Apple\n"  + " 2. masks\n" + " 3. Both\n" + " 4. Exit" );
                choice = sc.nextInt();
            case 2:
                System.out.println(" Enter Masks Quantity ");
                quantity = sc.nextInt();
                Product product2 = new Product(Item.MASK, quantity);
                bill = shoppingCartImp.addToCart(product2);
                System.out.println(bill);
                System.out.println(" Product Menu :\n" + " 1. Apple\n"  + " 2. masks\n" + " 3. Both\n" + " 4. Exit" );
                choice = sc.nextInt();
            case 3:
                System.out.println("Enter qunatity for Apples");
                quantity = sc.nextInt();
                Product apple = new Product(Item.APPLE, quantity);
                System.out.println("Enter qunatity for masks");
                int maskQuantity = sc.nextInt();
                Product masks = new Product(Item.MASK, maskQuantity);
                bill = shoppingCartImp.addToCart(apple, masks);
                System.out.println(bill);
                System.out.println(" Product Menu :\n" + " 1. Apple\n"  + " 2. masks\n" + " 3. Both\n" + " 4. Exit" );
                choice = sc.nextInt();
            case 4:
                System.exit(0);

        }
    }
}
