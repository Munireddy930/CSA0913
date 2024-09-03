interface printable {
    int a = 10;
    void print();
}
cinterface showable  implements F {
    public void taste() {
        System.out.println("Apple tastes sweet .");
    }
}
class Orange implements Fruit {
    public void taste() {
        System.out.println("Orange tastes sweet .");
    }
}
public class Main {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit orange = new Orange();
        apple.taste();
        orange.taste();
    }
}
