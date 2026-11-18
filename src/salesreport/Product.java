
package salesreport;

public class Product implements IProduct {

    private String[] products;
    private int[][] sales;

    // Constructor
    public Product(String[] products, int[][] sales) {
        this.products = products;
        this.sales = sales;
    }

    // Calculate total products sold
    @Override
    public int GetTotalProductsSold() {

        int total = 0;

        for (int i = 0; i < sales.length; i++) {

            for (int j = 0; j < sales[i].length; j++) {

                total += sales[i][j];
            }
        }

        return total;
    }

    // Calculate average products sold per product
    @Override
    public double GetAverageProductSold() {

        int total = 0;

        for (int i = 0; i < sales.length; i++) {

            for (int j = 0; j < sales[i].length; j++) {

                total += sales[i][j];
            }
        }

        return (double) total / sales.length;
    }

    // Determine the most popular product
    @Override
    public String GetMostPopularProduct() {

        int highestSales = -1;
        String popularProduct = "";

        for (int i = 0; i < sales.length; i++) {

            int productTotal = 0;

            for (int j = 0; j < sales[i].length; j++) {

                productTotal += sales[i][j];
            }

            if (productTotal > highestSales) {

                highestSales = productTotal;
                popularProduct = products[i];
            }
        }

        return popularProduct + " (" + highestSales + ")";
    }
}