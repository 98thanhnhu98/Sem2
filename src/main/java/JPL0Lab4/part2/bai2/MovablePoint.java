package JPL0Lab4.part2.bai2;
public class MovablePoint implements Movable {
    private int x;
    private int y;

    public MovablePoint(){
        this.x = 9;
        this.y = 9;
    }

    @Override
    public int moveUp() {
        y = this.y;
     return y = y + 1;
    }

    @Override
    public int moveDown() {
        y = this.y;
       return y = y - 1;
    }

    @Override
    public int moveRight() {
        x = this.x;
        return x = x +1 ;
    }

    @Override
    public int moveLeft() {
        x = this.x;
       return  x = x  - 1 ;
    }

    public static void main(String[] args) {
        MovablePoint movablePoint1 = new MovablePoint();
        int d = movablePoint1.x;
        int c = movablePoint1.y;
        c = movablePoint1.moveUp();
        for (int i = 0;i <= 7;i++){
            d = movablePoint1.moveRight();
        }
        System.out.println("X = " + d + " Y = " + c);
    }
}
