package JPL0Lab6.part1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Repository repository = new Repository();
        Scanner scan = new Scanner(System.in);
        int whi = 2;
        while (whi > 0) {
            System.out.println("\n0. Out Menu");
            System.out.println("1. MainMenu");
            System.out.println("2. chooseMenu");
            System.out.println("3. SecondMenu");
            int chonmenu = scan.nextInt();
            switch (chonmenu){
                case 1 :
                    Menu.mainMenu();
                    int choose = scan.nextInt();
                    switch (choose) {
                        case 0:
                            whi = 0;
                            System.exit(0);
                            break;
                        case 1:
                            System.out.println("Danh sách sản phẩm: ");
                            repository.show();
                            break;
                        case 2:
                            System.out.println("Các sản phẩm có giá trị trên 10.000: ");
                            repository.filterProductByPrice();
                            break;
                        case 3:
                            System.out.println("Đếm số sản phẩm dựa theo loại sản phẩm: ");
                            repository.countProductByAmountSale();
                            break;
                        case 4:
                            System.out.println("Liệt kê sản phẩm dựa theo loại sản phẩm: ");
                            repository.filterProductByCategory();
                            break;
                        case 5:
                            System.out.println("Xắp xếp sản phẩm theo số lượng bán được: ");
                            repository.softProductByAmountsSale();
                            repository.show();
                            break;
                        case 6:
                            System.out.println("Đưa ra sản phẩm bán được nhiều nhất");
                            repository.filterProductByAmountSale();
                            break;
                        case 7:
                            System.out.println("Xắp xếp sản phẩm theo tên sản phẩm: ");
                            repository.sortProductByName();
                            repository.show();
                            break;
                        default:
                            System.out.println("Nothing happen ??");
                            break;
                    }
                    break;
                case 2:
                    Menu.chooseCategory();
                    int chooseCategory = scan.nextInt();
                    switch (chooseCategory){
                        case 1:
                            repository.filterProducByFood();
                            break;
                        case 2:
                            repository.filterProducByHouseWare();
                            break;
                        default:
                            System.out.println("Nothing happen ??");
                            break;
                    }
                    break;
                case 3:
                    Menu.secondMenu();
                    int chosseSecondMenu = scan.nextInt();
                    switch (chosseSecondMenu){
                        case 1:
                            repository.show();
                            System.out.println("----------------");
                            repository.setListProducts();
                            System.out.println("----------------");
                            break;
                        case 2:
                            repository.removeProduct();
                            repository.show();
                            break;
                        case 3:
                            System.out.println("Return Home");
                            break;
                        default:
                            System.out.println("Nothing happen ??");
                            break;
                    }
                    break;
                default:
                    System.out.println("Nothing happen ??");
                    break;
            }
        }
    }
}
