package salesreport;

public class PrintProduct {

    // Print total product sales
    public void printTotalProductSales(Product product) {

        System.out.println("TOTAL PRODUCT SALES: "
                + product.GetTotalProductsSold());
    }

    // Print average product sales
    public void printAverageProductSales(Product product) {

        System.out.println("AVERAGE PRODUCT SALES: "
                + String.format("%.0f",
                        product.GetAverageProductSold()));
    }

    // Print most popular product
    public void printMostPopularProduct(Product product) {

        System.out.println("MOST POPULAR PRODUCT: "
                + product.GetMostPopularProduct());
    }
}
