class Stack{
   private int top=-1;
   int a[];
    Stack(){
         a =new int[5];
    }
    Stack(int cap){
        a = new int[cap];
    }
    void push(int ele){
        if(top<a.length)
        a[++top]=ele;
    }
    int pop(){
        if(top>-1)
        return a[top--];
     else return -1;
    }
    int peek(){
        if(top>-1)
        return a[top];
        return -1;
    }
   public  boolean isEmpty(){
    if(top==-1) return true;
    return false;

    }
}