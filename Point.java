class Point {
    String id
    double x,y;
    String color;

    public Point(String id, double x, double y, String color) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move (char xDirection, char yDirection) {
        if (xDirection == 'L')
            x-=1;
        else
            x+=1;
        if (yDirection == 'U')
            y+=1;
        else
            y-=1;
    }

    public void draw () {
        System.out.println(String.format("%s(%f, %f)"), id, x, y);
    }



}
class Scratch {
    public static void main(String[] args) {
        
    }
}