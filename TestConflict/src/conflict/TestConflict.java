package conflict;

public class TestConflict {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
       double area =  new TestConflict().calcArea(6);
       System.out.println(area);

    }
    
    private double calcArea(int r) {
        return 2 * Math.PI * r * r;
    }

}
