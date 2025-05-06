public class Main {
    public static void main(String[] args) {
        Stack numberStack = new Stack();


        System.out.println("Top of the stack is: "+numberStack.peek());

        numberStack.pop();

        // adding elements to stack
        numberStack.push(17);
        numberStack.push(23);
        numberStack.push(65);
        numberStack.push(38);

        System.out.println("Top of the stack is: "+numberStack.peek());
        System.out.println(numberStack.isEmpty());

        numberStack.pop();

        System.out.println("Top of the stack after pop operation: "+numberStack.peek());
    }
}