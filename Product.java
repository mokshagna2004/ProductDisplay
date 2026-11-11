
package DSA;

import java.util.Scanner;

public class Product {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int productID;
        String productName;
        int product_quantity;
        double product_discount;
        boolean product_available;
        double product_price;
        String product_code;
        char product_companycode;
        String product_description;

        double totalPrice;
        double discountAmount;
        double finalPrice;

        System.out.println("Enter Product ID:");
        productID = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Product Name:");
        productName = sc.nextLine();

        System.out.println("Enter Product Quantity:");
        product_quantity = sc.nextInt();

        System.out.println("Enter Product Discount (%):");
        product_discount = sc.nextDouble();

        System.out.println("Is Product Available (true/false):");
        product_available = sc.nextBoolean();

        System.out.println("Enter Product Price:");
        product_price = sc.nextDouble();

        sc.nextLine();

        System.out.println("Enter Product Code:");
        product_code = sc.nextLine();

        System.out.println("Enter Product Company Code:");
        product_companycode = sc.next().charAt(0);

        sc.nextLine();

        System.out.println("Enter Product Description:");
        product_description = sc.nextLine();


        totalPrice = product_price * product_quantity;

        discountAmount = totalPrice * product_discount / 100;

        finalPrice = totalPrice - discountAmount;


        System.out.println("PRODUCT DETAILS");

        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Quantity: " + product_quantity);
        System.out.println("Product Discount: " + product_discount + "%");
        System.out.println("Product Available: " + product_available);
        System.out.println("Product Price: " + product_price);
        System.out.println("Product Code: " + product_code);
        System.out.println("Product Company Code: " + product_companycode);
        System.out.println("Product Description: " + product_description);

        System.out.println("PRICE CALCULATION");

        System.out.println("Total Price: " + totalPrice);
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Price: " + finalPrice);

    }
}
