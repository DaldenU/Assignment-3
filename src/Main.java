public class Main {
    public static void main(String[] args) {

        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        //Creating MyArrayListStack object
        MyArrayListStack<Integer> arrayStack = new MyArrayListStack<>();

        //adding elements with the "push" method
        arrayStack.push(5);
        arrayStack.push(7);
        arrayStack.push(9);
        //outputting the size of stack
        System.out.println(arrayStack.size()); //prints 3
        //checking whether the stack is empty
        System.out.println(arrayStack.isEmpty()); //prints false
        //getting the top element of the stack, while removing it
        System.out.println(arrayStack.pop()); //prints 9
        //getting the top element of the stack, without removing it
        System.out.println(arrayStack.peek()); //prints 7
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        //Creating MyLinkedListStack object
        MyLinkedListStack<String> linkedListStack = new MyLinkedListStack<>();

        //adding elements with the "push" method
        linkedListStack.push("the");
        linkedListStack.push("you");
        linkedListStack.push("tree");
        //outputting the size of stack
        System.out.println(linkedListStack.size()); //prints 3
        //checking whether the stack is empty
        System.out.println(linkedListStack.isEmpty()); //prints false
        //getting the top element of the stack, while removing it
        System.out.println(linkedListStack.pop()); //prints "tree"
        //getting the top element of the stack, without removing it
        System.out.println(linkedListStack.peek()); //prints "you"
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


    }
}
