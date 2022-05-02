package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvaluateDivision {

    public static void main(String[] args) {

        double[] result = calcEquation(
                convertToList(new String[][]{{"a","b"}, {"b","c"}}),
                new double[] {2.0,3.0},
                convertToList(new String[][]{{"a","c"},{"b","a"},{"a","e"},{"a","a"},{"x","x"}})
        );

        for(double el : result){
            System.out.println(el);
        }
    }

    private static double[] calcEquation(
            List<List<String>> equations,
            double[] values,
            List<List<String>> queries) {

//         Initialize double array with -1.0 to hold all query results
        double[] result = new double[queries.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = -1.0;
        }

        String q1, q2, e1, e2;
        for(List<String> query: queries){
            q1 = query.get(0);
            q2 = query.get(1);

            int index = 0;
            for(List<String> equation: equations){
                e1 = equation.get(0);
                e2 = equation.get(1);

                if(q1.equals(e1) && q2.equals(e2))
                    result[index] = values[index];
                if(q2.equals(e1) && q1.equals(e2))
                    result[index] = 1.0/values[index];

                index++;
            }
        }

        return result;
    }

    private static List<List<String>> convertToList(String[][] strMatrix){
        List<List<String>> list = new ArrayList<>();

        for(String[] pair: strMatrix){
            list.add(Arrays.asList(pair));
        }

        return list;
    }

}
