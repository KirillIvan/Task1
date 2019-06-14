public class Triangle extends Figure{
    private double a;
    private double b;
    private double c;
    public double getA(){
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getPerimetr() {
        return a+b+c;
    }

    @Override
    public double getPloshad() {
        double p = getPerimetr()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public String getInfo() {
        return String.format("BC: %f AC: %f AB: %f Периметр: %f Площадь: %f",a,b,c,getPerimetr(),getPloshad());
    }

}
