import java.util.*;
public class ScoreCalculator 
{
    public static void main(String[] args) {

        Map<Integer, List<Integer>> stScores = new HashMap<>();

        stScores.put(1, Arrays.asList(10, 20, 10));

        stScores.put(2, Arrays.asList(10, 20, 11));

        Map<Integer, Integer> stTotalScores = new HashMap<>();

        for (Map.Entry<Integer, List<Integer>> entry : stScores.entrySet()) 
         {
            int stId = entry.getKey();
            List<Integer> scores = entry.getValue();
            int totalScore = 0;

            for (int score : scores) {
                totalScore += score;
            }

            stTotalScores.put(stId, totalScore);
        }

        System.out.println("Student ID\tTotal Score");

        for (Map.Entry<Integer, Integer> entry : stTotalScores.entrySet()) 
        {
            int stId = entry.getKey();
            int totalScore = entry.getValue();
            System.out.println(stId + "\t\t" + totalScore);
        }
    }
}