package dsa.stacks;

import java.util.Stack;

public class LargestRectangleHistogram {
    public static int largestRectangleArea(Integer[] heights) {
        int n = heights.length;
        Integer[] ns = new Integer[n];
        Integer[] ps = new Integer[n];

        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();

        ps[0] = -1;
        s1.push(0);

        ns[n-1] = n;
        s2.push(n-1);

        for(int i = 1 ; i<n; i++){
            while(!s1.empty() && heights[s1.peek()]>=heights[i]){
                s1.pop();
            }

            while(!s2.empty() && heights[s2.peek()]>=heights[n-i-1]){
                s2.pop();
            }

            int x = s1.empty()?-1:s1.peek();
            int y = s2.empty()?n:s2.peek();

            ps[i] = x;
            ns[n-i-1] = y;

            s1.push(i);
            s2.push(n-i-1);
        }

        printUtils.printUtils.printArray(ns);
        printUtils.printUtils.printArray(ps);

        int res =0;
        for(int i = 0 ; i<n; i++){
            int curr = heights[i];
            curr = curr + (i - ps[i] - 1)*heights[i];
            curr = curr + (ns[i] - i - 1)*heights[i];
            res = Math.max(res,curr);
        }

        return res;
    }

    public static void run(){
        Integer[] input = new Integer[]{2,1,5,6,2,3};
        Integer[] input2 = new Integer[]{6,2,5,4,1,5,6};

        //op = 10
        printUtils.printUtils.printArray(input2);
        System.out.println(largestRectangleArea(input2));
    }
}
