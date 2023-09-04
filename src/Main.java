import java.util.*;

public class Main {

        public static void main(String[] args) {

                Map<String, Integer> month = new LinkedHashMap<>();


                month.put("January", 1);
                month.put("February", 2);
                month.put("March", 3);
                month.put("April", 4);
                month.put("May", 5);
                month.put("June", 6);
                month.put("July", 7);
                month.put("August", 8);
                month.put("September", 9);
                month.put("October", 10);
                month.put("November", 11);
                month.put("December", 12);


                Set<String> monthNames = month.keySet();
                System.out.println(monthNames);

                List<Integer> monthNumbers = new ArrayList<>(month.values());
                System.out.println(monthNumbers);


                Integer[] monthNumbersArray = monthNumbers.toArray(new Integer[0]);
                System.out.println(Arrays.toString(monthNumbersArray));
        }
}
