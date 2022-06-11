package JPL0Lab6.part1;

import java.util.*;

public class Repository {
    List<Product> listProducts = new ArrayList<>();

    public Repository(){
        listProducts.add(new Product("01","Bánh Doraemon 3 vị",Category.FOOD,100,3500,57));
        listProducts.add(new Product("02","Xúc xích sườn non",Category.FOOD,150,3500,12));
        listProducts.add(new Product("03","Thanh cua",Category.FOOD,100,5000,85));
        listProducts.add(new Product("04","Bánh khoai môn",Category.FOOD,200,42000,78));
        listProducts.add(new Product("05","Thìa ăn cơm inox mạ vàng",Category.HOUSEWARE,50,8000,4));
        listProducts.add(new Product("06","Bát đụng gia vị",Category.HOUSEWARE,65,4000,44));
        listProducts.add(new Product("07","Nước Hoa Hồng Soothing Facial Toner Simple",Category.COSMETICS,140,92000,88));
        listProducts.add(new Product("08","Combo gội xả HAIRBURST",Category.COSMETICS,100,639000,7));
        listProducts.add(new Product("09","Tính chất dưỡng ẩm sâu Klairs Rich Moist Soothing Serum",Category.COSMETICS,50,249000,24));
        listProducts.add(new Product("10","Kem dưỡng thể Paula's Choice RESIST WEIGHTLESS BODY TREATMENT",Category.COSMETICS,80,715000,63));
        listProducts.add(new Product("11","Áo thin TSUN",Category.FASHION,250,320000,146));
    }

    public void show(){
        for (Product product : listProducts){
            System.out.println(product);
        };
    }

    public void sortProductByName(){
        listProducts.sort(Comparator.comparing(Product::getName));
    }
    public void filterProductByPrice() {
        for (Product product : listProducts) {
            if (product.getPrice() > 10000) {
                System.out.println(product);
            }
        }
    }

    public void filterProductByAmountSale(){
        Product product = new Product();
        long resemble = product.getAmountSale();
        String name = null;
        String id = null;
        for (Product a : listProducts){
            if (a.getAmountSale() >= resemble){
                resemble = a.getAmountSale();
                name = a.getName();
                id = a.getId();
            }
        }
        System.out.println("Sản Phẩm bán được nhiều nhất là : " + id + " - " + name + " - " +  resemble);
    }
    public void filterProductByCategory() {
        for (Product product : listProducts) {
            if (product.getCategory() == Category.FOOD) {
                System.out.println(product);
            } else if(product.getCategory() == Category.HOUSEWARE){
                System.out.println(product);
            } else if (product.getCategory() == Category.COSMETICS){
                System.out.println(product);
            } else {
                System.out.println(product);
            }
        }
    }

    public void softProductByAmountsSale() {
        listProducts.sort(Comparator.comparing(Product::getAmountSale));
    }

    public void countProductByAmountSale(){
        long count = listProducts.stream()
                .filter(Product -> Product.getAmountSale() >= 50)
                .count();
        System.out.println("Số lượng sản phâm bán được từ 50 trở lên là : " + count);
    }


    public void filterProducByFood(){
        for (Product product : listProducts) {
            if (product.getCategory() == Category.FOOD) {
                System.out.println(product);
            }
        }
    }

    public void filterProducByHouseWare(){
        for (Product product : listProducts) {
            if (product.getCategory() == Category.HOUSEWARE) {
                System.out.println(product);
            }
        }
    }

public void setListProducts() {
        listProducts.set(2, new Product("03","thanh",Category.COSMETICS,1205,25000,1070));
    for (Product product : listProducts) {
            System.out.println(product);
    }

}
    public void removeProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn thay đổi thông tin sản phẩm có số thứ tự :");
        int id = sc.nextInt();
        listProducts.remove(id);
    }
}

