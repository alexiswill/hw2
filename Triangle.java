package Main;

public class Triangle {
    private double height;
    private double base;


    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double  calculateArea() {
        return ((this.height * this.base) / 2);


    }


    public int x (){
        int x = 0;
        return (x * 10);
    }
    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getBase(){
        return base;
    }
    public void setBase(double base){
        this.base = base;
    }

}
