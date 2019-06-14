import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Кол-во фигур: ");
        int N = scan.nextInt();
        Figure[] f = new Figure[N];
        for(int i = 0;i<N;i++){
            System.out.println("Выберите тип фигуры: 1-Прямоугольник, 2 - Круг, 3 - Треугольник");
            int type = scan.nextInt();
            switch(type){
                case 1:
                    f[i]=new Rectangle(Double.valueOf(typeString("Длина: ")),Double.valueOf(typeString("Ширина: ")));
                    break;
                case 2:
                    f[i]=new Circle(Double.valueOf(typeString("Радиус: ")));
                    break;
                case 3:
                    f[i]=new Triangle(Double.valueOf(typeString("BC")),Double.valueOf(typeString("AC")),Double.valueOf(typeString("AB")));
                    break;
            }
        }
        for(int i = 0;i<N;i++){
            System.out.println(f[i].getInfo());
        }

    }
    public static String typeString(String str){
        Scanner scan = new Scanner(System.in);
        System.out.println(str);
        return scan.next();
    }
}
