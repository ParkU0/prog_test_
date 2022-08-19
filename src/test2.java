import java.util.ArrayList;
import java.util.List;

public class test2 {

    public static void main(String[] args) {

        //
       // int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[][] board = {{0, 0, 0, 0, 0,1}, {0, 0, 1, 0, 3,2}, {0, 2, 5, 0, 1,1}, {4, 2, 4, 4, 2,1}, {3, 5, 1, 3, 1,1}, {3, 5, 1, 3, 1,1}};
        int[] moves = {1,5,3,5,1,2,1,4,6};
        Solution(board, moves);
    }

    public static  int Solution(int [][]board, int []moves) {
        int answer = 0;
        int count = board.length-1;

        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < moves.length; i++){
            int board1=moves[i]-1;
            if(board[board1][count] == 0){
                for(int j = count-1;j>=0;j--){
                    if(board[board1][j]!=0){
                        list.add(board[board1][j]);
                        board[board1][j] = 0;
                        break;
                    }
                }
            }else {
                list.add(board[board1][count]);
                board[board1][count] = 0;
            }
            System.out.println(list);
        }

        for(int i =0; i<list.size()-1;i++){
            if(list.get(i)==list.get(i+1)){
                answer += 2;
                i++;
            }
        }
        System.out.println(answer);

        return answer;
    }
}
