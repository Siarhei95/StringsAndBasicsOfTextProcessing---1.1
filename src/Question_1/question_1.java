package Question_1; //CamelCase
import java.util.*;

public class question_1 {
    public static void main(String[] args) {
        String[] camelCase = new String[]{"newCar", "mySuccess", "bestTechnology", "goodMood"}; //введем в массив рандомные переменные типа camelCase
        System.out.println("Words like 'camelCase': ");
        for (int i = 0; i < 4; i++) {
        }
        System.out.println(Arrays.toString(camelCase));
        System.out.println();
        snake_case(camelCase);
    }
    public static void snake_case(String camelCase[]) {
        System.out.println("Words like 'snake_case': ");
        for (int i = 0; i < 4; i++) {
            String replaceString = camelCase[i].replaceAll("([A-Z]+)", "\\_$1").toLowerCase();
            System.out.print(Arrays.toString(new String[]{replaceString}));
            System.out.print(",");
        }
    }
}