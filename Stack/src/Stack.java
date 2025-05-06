public class Stack {
    private final LinkedList lis;

    public Stack(){
        lis = new LinkedList();
    }

    //stack operations : push,pop,peek,isEmpty

    void push(int val){
        lis.addElement(val);           // push operation
    }

    void pop(){
        lis.shiftToNextElement();     // pop operation
    }

    int peek(){
        return lis.headOfTheLinkedList();      // return top of the stack
    }

    boolean isEmpty(){
        return lis.isEmpty();
    }
}