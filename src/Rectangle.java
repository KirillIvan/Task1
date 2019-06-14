public class Rectangle extends Figure {
    private double width;
    private double height;
    public void setWidth(double width){
        this.width=width;
    }
    public double getWidth(){
        return width;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return height;
    }
    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double getPloshad() {
        return width*height;
    }

    @Override
    public double getPerimetr() {
        return 2*(width+height);
    }

    @Override
    public String getInfo() {
        return String.format("Длина: %f Ширина: %f Периметр: %f Площадь %f",width,height,getPerimetr(),getPloshad());
    }
}
