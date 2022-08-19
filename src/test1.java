import java.util.ArrayList;
import java.util.List;

public class test1 {

    public static void main(String[] args) {

        //연속 숫자 제거 {1,1,3,3,0,1,1} -> {1,3,0,1}
        //{4,4,4,3,3}->{4,3}
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        Solution(arr);
    }

    public static  int[] Solution(int []arr){
        int[] answer = {};
        List<Integer> answerList = new ArrayList<Integer>();

        answerList.add(arr[0]);
        for(int i=0; i < arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                answerList.add(arr[i+1]);
            }
        }

        answer = new int[answerList.size()];
        for(int i=0; i < answerList.size(); i++)
        {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
