public class Index {
    public static void main(String[] args) {
        BmiService service= new BmiService();
        System.out.println("Масса - 60кг., Рост - 1,6м.");
        System.out.println("Индекс:"+service.calculate(60,1.6));

        System.out.println();
        System.out.println("Масса - 100кг., Рост - 1,5м.");
        System.out.println("Индекс:"+service.calculate(100,1.5));
    }
}
