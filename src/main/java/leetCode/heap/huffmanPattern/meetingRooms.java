package leetCode.heap.huffmanPattern;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
    2-D integer Array B of Size Ax2, representing the start and end timing of the meetings.

    Example Input

    Input 1:
    B = [ [0, 30],
          [5, 10],
          [15, 20] ]
    Output 1:
    2

    Explanation 1:
    We need two rooms:

    Room 1: [0, 30]

    Room 2: [5, 10], [15, 20]
 */
public class meetingRooms {
    // Using Heaps
    static int meetingRoomsByUsingHeap(int[][] meetings){
        Arrays.sort(meetings, Comparator.comparing(a -> a[0]));
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int[] meeting : meetings){
            if (!queue.isEmpty() && meeting[0] >= queue.peek()){
                queue.poll();
            }
            queue.offer(meeting[1]);
        }
        return queue.size();
    }

    // By using Sorted arrays
    static int meetingRoomsUsingSorted(int[][] meetings){
        int n = meetings.length;

        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++){
            start[i] = meetings[i][0];
            end[i] = meetings[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);

        int rooms = 0, endPointers = 0;
        for (int i = 0; i < n; i++){
            if (start[i] < end[endPointers]){
                rooms ++;
            }else{
                endPointers++;
            }
        }
        return rooms;
    }

    public static void main(String[] args) {
        int[][] meetingRooms ={{0,30}, {5,10}, {15,20}};
        System.out.println(meetingRoomsByUsingHeap(meetingRooms));
        System.out.println(meetingRoomsUsingSorted(meetingRooms));
    }
}
