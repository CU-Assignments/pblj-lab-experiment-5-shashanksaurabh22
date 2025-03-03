import java.util.*;

public class AutoBoxingUnboxingExample {
    
    public static Integer parseStringToInteger(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + str);
            return null;
        }
    }
    
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            if (num != null) {
                sum += num;
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        List<String> inputs = Arrays.asList("10", "20", "30", "40", "50");
        List<Integer> numbers = new ArrayList<>();
        
        for (String input : inputs) {
            Integer parsedNumber = parseStringToInteger(input);
            if (parsedNumber != null) {
                numbers.add(parsedNumber);
            }
        }
        
        int sum = calculateSum(numbers);
        System.out.println("The sum of the list is: " + sum);
    }
}
