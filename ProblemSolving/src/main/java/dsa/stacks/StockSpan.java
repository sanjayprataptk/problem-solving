package dsa.stacks;

import java.util.Stack;

public class StockSpan {
    public static void run(){
       // Integer[] input = {13,15,12,14,16,8,6,4,10,30};
        Integer[] input = {60,10,20,40,35,30,50,70,65};

        Integer[] op = new Integer[input.length];
        Integer[] prevG = new Integer[input.length];
        Stack<Integer> stack = new Stack<Integer>();


        for(int i =0 ; i<input.length; i++){

            while (!stack.empty() && input[stack.peek()]<=input[i]){
                stack.pop();
            }

            if(stack.empty()){
                prevG[i] = -1;
                stack.push(i);
                op[i] = i - prevG[i];
                System.out.println(op[i]);
                continue;
            }

            prevG[i] = stack.peek();
            op[i] = i - prevG[i];
            stack.push(i);
            System.out.println(op[i]);

        }

    }
}
