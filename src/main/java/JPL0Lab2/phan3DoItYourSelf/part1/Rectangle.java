package JPL0Lab2.phan3DoItYourSelf.part1;

import java.util.Scanner;

public class Rectangle {
    private int width;
    private int height;
    public int Perimeter;
    public int Area;

    public Rectangle(){
        this.width = 100;
        this.height = 100;
    }
    public Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }
    public void display(){
        int i,j;
        for(i = 0;i < this.width;i++){
            for(j = 0;j < this.height;j++){
                System.out.print("# ");
            }
            System.out.print("\n");
        }
    }
    public int getArea(){
        return this.Area = this.height * this.width;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public int getPerimeter(){
        return this.Perimeter = (this.height + this.width )/2;
    }
    public int getHeight(){
        return this.height;
    }
    public int getWidth(){
        return this.width;
    }
    public void setWidth(int width){
        this.width=width;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle2 =new Rectangle();
        System.out.println("Nhap chieu dai va chieu rong");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Rectangle rectangle1 =new Rectangle(x,y);
        rectangle1.display();

        System.out.println("Nhap chieu dai va chieu rong can thay doi");
        int z = sc.nextInt();
        int k = sc.nextInt();
        rectangle1.setHeight(k);
        rectangle1.setWidth(z);
        rectangle1.display();

        int sum = rectangle1.getArea();
        System.out.println("Dien tich cua hinh la : "+ sum);
        int sam = rectangle1.getPerimeter();
        System.out.println("Chu vi cua hinh la : "+ sam);
    }
}
