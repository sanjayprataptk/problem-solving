package dsa.stacks;

public class TwoStackInArray {
    int arr[];
    int capacity;
    int top1=-1, size1=0, top2=0, size2=0;

    public TwoStackInArray(int capacity){
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.top2 = capacity;
    }

    public int pop1(){
        if(top1>0){
            int x =  arr[top1];
            top1--;
            return x;
        }
        return -1;
    }

    public int pop2(){
        if(top2<capacity-1){
            int x =  arr[top2];
            top2++;
            return x;
        }
        return -1;
    }

    public boolean push1(int number){
        System.out.println(String.format("top1 = %d top2 = %d",top1,top2));
        if(this.top1+1<this.top2){
            this.top1++;
            this.arr[this.top1] = number;
            return true;
        }
        return false;
    }

    public boolean push2(int number){
        System.out.println(String.format("top1 = %d top2 = %d",top1,top2));
        if(top2-1>top1){
            top2--;
            this.arr[top2] = number;
            return true;
        }
        return false;
    }

    public int peek1(){
        if(top1>0){
            return arr[top1];
        }
        return -1;
    }

    public int peek2(){
        if(top2<capacity-1){
            return arr[top2];
        }
        return -1;
    }
}

