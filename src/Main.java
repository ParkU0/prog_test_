import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] arr ={1, 5, 2, 6, 3, 7, 4};
        int[][] cmm = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        solution(arr, cmm);
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};

        List<Integer> an = new ArrayList<>();
        for(int i =0; i < commands.length; i++){
            int c1 = commands[i][0];
            int c2 = commands[i][1];
            List<Integer> temp = new ArrayList<>();
            for(int j = c1-1; j < c2; j++){
                temp.add(array[j]);
            }

            int[] ktemp = new int[temp.size()];

            for (int k =0; k < temp.size(); k++) {
                ktemp[k] = temp.get(k);
            }
            Arrays.sort(ktemp);
           an.add(ktemp[commands[i][2]-1]);
        }

        answer = new int[an.size()];
        for(int i =0; i<an.size();i++){
            answer[i] = an.get(i);
            System.out.println(i);
        }

        return answer;
    }
}