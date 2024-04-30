import java.util.ArrayList;

public class CircleCalculator extends Calculator{
    private ArrayList<Double> resultListCircle = new ArrayList<Double> ();
    double area = 0;

    public double calculate(double radius) {
        area = radius * radius * 3.14;
        resultListCircle.add(area);
        return area;
    }

//    @Override
//    public int calculate(int firstNum, int secondNum, char math) {
//        return 0;
//    }


    public ArrayList<Double> getCalc() {
        return resultListCircle;
    }

    public void setCalc(Double set) {
        resultListCircle.add(area);
    }

    public void removeResult() {
        resultListCircle.remove(0);
    }

    public void inquiryResults() {
        for(int i = 0; i < resultListCircle.size(); i++) {
            System.out.println(resultListCircle.get(i));
        }
    }
}


