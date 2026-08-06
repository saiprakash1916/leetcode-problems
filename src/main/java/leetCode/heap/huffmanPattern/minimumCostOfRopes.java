package leetCode.heap.huffmanPattern;

import java.util.PriorityQueue;

/*
    Min Cost to Connect Ropes

    Given an array, arr[] of rope lengths, connect all ropes into a single rope with the minimum total cost. The cost to connect two ropes is the sum of their lengths.

    Examples:

    Input: arr[] = [4, 3, 2, 6]
    Output: 29
    Explanation: First connect 2 and 3 to get [4, 5, 6] with a cost of 5, then connect 4 and 5 to get [9, 6] with a cost of 9,
    and finally connect 9 and 6 to get one rope with a cost of 15, giving a total minimum cost of 29. Any other order, such as connecting 4 and 6 first, results in a higher total cost of 38.
 */
public class minimumCostOfRopes {
    static int minimumCost(int[] arr) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int ropes : arr) {
            priorityQueue.offer(ropes);
        }
        int cost = 0;
        while (priorityQueue.size() > 1) {
            int fist = priorityQueue.poll();
            int second = priorityQueue.poll();

            int sum = fist + second;
            cost += sum;
            priorityQueue.offer(sum);
        }
        return cost;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 6};
        System.out.println(minimumCost(arr));
    }
}
