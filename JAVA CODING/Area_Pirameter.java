package Java_Program;
import java.util.Scanner;

class Rect {// class name should be noun
    int l;
    int b;

    void getData(){
        Scanner sk = new Scanner(System.in);
        System.out.println("Enter Length : ");
        l = sk.nextInt();
        System.out.println("Enter Breadth : ");
        b = sk.nextInt();
    }

    void showData() {
        System.out.println("Length :" + l);
        System.out.println("Breadth : " + b);
    }

    void getArea() {
        System.out.println("Area :" + (l * b));
    }

    void getPira() {
        System.out.println("Pirameter :" + 2 * (l + b));
    }

    public static void main(String args[]) {
        Rect r = new Rect();
        r.getData();
        r.showData();
        r.getArea();
        r.getPira();
    }
}