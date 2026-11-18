package salesreport;

import java.util.Scanner;

public class SalesReportApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array storing product names
        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        // Two-dimensional array storing monthly sales
        int[][] sales = new int[3][3];

        // Enter sales for each product
        for (int i = 0; i < products.length; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Enter number of sales for month "
                        + (j + 1) + " for " + products[i]
                        + " mattress: ");

                sales[i][j] = input.nextInt();

                while (sales[i][j] < 0) {

                    System.out.print("Enter a valid number: ");
                    sales[i][j] = input.nextInt();
                }
            }

            System.out.println();
        }

        // Create Product object
        Product product = new Product(products, sales);

        // Create PrintProduct object
        PrintProduct report = new PrintProduct();

        // Display the sales report
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("\n******************************************");

        report.printTotalProductSales(product);
        report.printAverageProductSales(product);
        report.printMostPopularProduct(product);

        input.close();
    }
}
