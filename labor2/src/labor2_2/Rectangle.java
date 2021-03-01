package labor2_2;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length,double width){

        if(width<=0 || length<=0){
            return;
        }
        this.length=length;
        this.width=width;
    }

    public double area(){
        return length*width;
    }

    public double perimeter(){
        return 2*length+2*width;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }
}
