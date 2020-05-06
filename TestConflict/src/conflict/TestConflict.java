package conflict;

public class TestConflict {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
       double area =  new TestConflict().calcArea(6);
       System.out.println(area);

    }
    
    private double calcArea(double r) {
        return Math.PI * r * r;
    }
    
    private double calcPeremeter(int l, int w) {
        return 2*l + 2*w;
    }

}
