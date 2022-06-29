public class BmiService {
    public int calculate (int kg, double m){
        double result=m*m;
        double result2=kg/result;
        return (int) result2;
    }
}
