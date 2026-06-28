public class main {
    public static void main(String[] args) {
        outter a = new outter();
        a.display();
        outter.inner b = a.new inner();
        b.display();
    }
}
