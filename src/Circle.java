public class Circle extends Figure{
    private double radius;
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getPerimetr() {
        return Math.PI*radius*2;
    }

    @Override
    public double getPloshad() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public String getInfo() {
        return String.format("Радиус: %f Длина окружности: %f Площадь круга: %f",radius,getPerimetr(),getPloshad());
    }
}
