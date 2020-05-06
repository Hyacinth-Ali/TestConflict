package conflict;

public class TestConflict {

    public static void main(String[] args) {
       TestConflict testConflict =  new TestConflict();
       double area = testConflict.calcArea(4);
       System.out.println(area);

    }
    
    private double calcArea(int r) {
        return 2 * Math.PI * r * r;
    }

}
