package practiceProblems;

class stack {
    static final int size = 50;
    int top ;
    int[] a = new int[size];    //size of stack

    boolean isEmpty(){
        return (top < 0);

    }
    stack(){
        top = -1;
    }
    boolean push(int x){
        if(top >= (size-1)){
            System.out.println("Stack Overflow!");
            return false;
        }
        else{
            a[++top]=x;
            System.out.println(x+" pushed into stack");
            return true;
        }
    }
    int pop(){
        if(top<0){
            System.out.println("Stack Underflow!");
            return 0;
        }
        else{
            int x = a[top--];
            return x;
        }
    }
    int peek(){
        if(top < 0){
            System.out.println("Stack Underflow!");
            return 0;
        }
        else{
            int x = a[top];
            return x;
        }
    }
    void print(){
        for(int i = top; i>-1; i--)
            System.out.print(a[i]+" ");
    }
}

public class stackImplementation {
    public static void main(String[] args) {
        stack s = new stack();
//        s.push(11);
//        s.push(12);
//        s.push(13);
        for(int i = 11 ; i<=30 ; i++)
            s.push(i);
        s.print();
        System.out.println("\nafter pop() :");
        s.pop();
        s.print();
        System.out.println("\nisEmpty():"+s.isEmpty()+"\n");

    }
}
