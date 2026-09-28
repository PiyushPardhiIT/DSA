//118. Pascal's Triangle

import java.util.ArrayList;
import java.util.List;

public class Fifteen {
    public static void main(String[] args) {
        int numRows = 5;
        java.util.List<java.util.List<Integer>> result = new Fifteen().generate(numRows);

        System.out.print("Pascal's Triangle: " + result);
    }
        public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            // First element
            row.add(1);

            // Middle elements
            for (int j = 1; j < i; j++) {
                row.add(
                    result.get(i - 1).get(j - 1)
                    + result.get(i - 1).get(j)
                );
            }

            // Last element
            if (i > 0) {
                row.add(1);
            }

            result.add(row);
        }

        return result;
    }

}
