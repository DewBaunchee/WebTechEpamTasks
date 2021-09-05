package by.varyvoda.matvey;

import by.varyvoda.matvey.strategy.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static Map<String, TaskStrategy> strategies = new HashMap<>();
    static {
        strategies.put("1", new EquationStrategy(in));
        strategies.put("2", new CoordinatesValidatingStrategy(in));
        strategies.put("3", new TangentFunctionStrategy(in));
        strategies.put("4", new PrimaryNumbersStrategy(in));
        strategies.put("5", new AscendingSubsequenceStrategy(in));
        strategies.put("6", new ArrayToMatrixStrategy(in));
        strategies.put("7", new ShellSortStrategy(in));
        strategies.put("8", new SequencesMergeStrategy(in));
        strategies.put("9", new BasketBallStrategy(in));
    }

    public static boolean choose() {
        System.out.println("Choose:");
        strategies.keySet().forEach(key -> System.out.println("\t" + key + ": " + strategies.get(key).description()));

        String choice = in.nextLine().trim().toLowerCase();
        if(choice.equals("exit")) return false;

        TaskStrategy taskStrategy = strategies.get(choice);
        if(taskStrategy == null) return true;

        try {
            taskStrategy.algorithm();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public static void main(String[] args) {
        while(choose()) {
            System.out.println("\n-------------------------\n");
        }
    }
}
