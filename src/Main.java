public class Main {
    public static void main(String[] args) {
        Calculator calculator = new StringCalculator(new DefaultNumberParser(), new DefaultSumCalculator());
        System.out.println(calculator.add(""));  
        System.out.println(calculator.add("1")); 
        System.out.println(calculator.add("1,5,3,7,9,0,1"));  
        System.out.println(calculator.add("1\n2,3")); 
        System.out.println(calculator.add("//;\n1;2"));
        System.out.println(calculator.add("1,-2,3"));
    }
}

