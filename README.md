# Assignment-3
<details>
<summary> MyArrayListStack</summary>

This is a simple implementation of a stack using ArrayList in Java. It provides basic functionalities like push, pop, peek, size, and isEmpty.

### Methods

The following methods are available in the MyArrayListStack class:

#### `push(T element)`

Adds an element to the top of the stack.
```java
public void push(T element) {
        arrStack.add(element); //adds an element to the top of the stack
    }
```
#### `pop()`

Removes and returns the top element of the stack.
```java
public T pop() {
        if (isEmpty()) { //checks for whether the stack is empty
            throw new EmptyStackException(); //throws an exception if true
        }
        return arrStack.remove(size() - 1); //returns the top element of the stack, while removing it
    }
```
#### `peek()`

Returns the top element of the stack without removing it.
```java
public T peek() {
        if (isEmpty()) { //checks for whether the stack is empty
            throw new EmptyStackException(); //throws an exception if true
        }
        return arrStack.get(size() - 1); //returns the top element of the stack, without removing it
    }
```
#### `size()`

Returns the size of the stack.
```java
public int size() {
        return arrStack.size(); //returns the size of stack
    }
```
#### `isEmpty()`

Returns true if the stack is empty, otherwise false.
```java
public boolean isEmpty() {
        return arrStack.isEmpty(); //returns true if the stack is empty, otherwise false
    }
```

### Usage
```java
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
```        
</details>

<details>
<summary> MyLinkedListStack</summary>

This is a simple implementation of a stack using LinkedList in Java. It provides basic functionalities like push, pop, peek, size, and isEmpty.

### Methods

The following methods are available in the MyLinkedListStack class:

#### `push(T element)`

Adds an element to the top of the stack.
```java
public void push(T element) {
        linkStack.addFirst(element); //adds an element to the top of the stack
    }
```
#### `pop()`

Removes and returns the top element of the stack.
```java
public T pop() {
        if (isEmpty()) { //checks for whether the stack is empty
            throw new EmptyStackException(); //throws an exception if true
        }
        return linkStack.removeFirst(); //returns the top element of the stack, while removing it
    }
```
#### `peek()`

Returns the top element of the stack without removing it.
```java
public T peek() {
        if (isEmpty()) { //checks for whether the stack is empty
            throw new EmptyStackException(); //throws an exception if true
        }
        return linkStack.getFirst(); //returns the top element of the stack, without removing it
    }
```
#### `size()`

Returns the size of the stack.
```java
public int size() {
        return linkStack.size(); //returns the size of stack
    }
```
#### `isEmpty()`

Returns true if the stack is empty, otherwise false.
```java
public boolean isEmpty() {
        return linkStack.isEmpty(); //returns true if the stack is empty, otherwise false
    }
```

### Usage
```java
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
```
</details>

<details>
<summary> MyArrayListQueue</summary>

This is a simple implementation of a queue using ArrayList in Java. It provides basic functionalities like enqueue, dequeue, peek, size, and isEmpty.

### Methods

The following methods are available in the MyArrayListQueueclass:

#### `enqueue(T element)`

Adds an element to the back of the queue.
```java
public void enqueue(T element) {
        queue.add(element); //Add an element to the back of the queue.
    }
```
#### `isEmpty()`

Returns true if the queue is empty, otherwise false.
```java
public boolean isEmpty() {
        return queue.isEmpty(); //returns true if the queue is empty, otherwise false
    }
```
#### `dequeue()`

Returns the front element of the queue ,while removing it
```java
public T dequeue() {
        if (isEmpty()) { //checks for whether the queue is empty
            throw new NoSuchElementException(); //throws an exception if true
        }
        T element = queue.get(0); //stores the front element
        queue.remove(0); //removes the front element
        return element; //returns the front element
    }
```
#### `peek()`

Returns the front element of the queue without removing it
```java
public T peek() {
        if (isEmpty()) { //checks for whether the queue is empty
            throw new NoSuchElementException(); //throws an exception if true
        }
        return queue.get(0); //returns the front element of the queue without removing it
    }
```
#### `size()`

Returns the size of queue
```java
public int size() {
        return queue.size(); //returns the size of queue
    }
```

### Usage
```java
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        //Creating MyArrayListQueue object
        MyArrayListQueue<Integer> arrayListQueue = new MyArrayListQueue<>();

        //adding elements with the "enqueue" method
        arrayListQueue.enqueue(34);
        arrayListQueue.enqueue(56);
        arrayListQueue.enqueue(-3);
        //outputting the size of queue
        System.out.println(arrayListQueue.size()); //prints 3
        //getting the front element of the queue, while removing it
        System.out.println(arrayListQueue.dequeue()); //prints "34"
        //getting the front element of the queue, without removing it
        System.out.println(arrayListQueue.peek()); //prints "56"
        //checking whether the queue is empty
        System.out.println(linkedListStack.isEmpty()); //prints false
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
```
</details>

<details>
<summary> MyLinkedListQueue</summary>

This is a simple implementation of a queue using LinkedList in Java. It provides basic functionalities like enqueue, dequeue, peek, size, and isEmpty.

### Methods

The following methods are available in the MyLinkedListQueueclass:

#### `enqueue(T element)`

Adds an element to the back of the queue.
```java
public void enqueue(T element) {
        queue.addLast(element); //Add an element to the back of the queue.
    }
```
#### `isEmpty()`

Returns true if the queue is empty, otherwise false.
```java
public boolean isEmpty() {
        return queue.isEmpty(); //returns true if the queue is empty, otherwise false
    }
```
#### `dequeue()`

Returns the front element of the queue ,while removing it
```java
public T dequeue() {
        if (isEmpty()) { //checks for whether the queue is empty
            throw new NoSuchElementException(); //throws an exception if true
        }
        return queue.removeFirst(); //returns the front element, while removing it
    }
```
#### `peek()`

Returns the front element of the queue without removing it
```java
public T peek() {
        if (isEmpty()) { //checks for whether the queue is empty
            throw new NoSuchElementException(); //throws an exception if true
        }
        return queue.getFirst(); //returns the front element, without removing it
    }
```
#### `size()`

Returns the size of queue
```java
public int size() {
        return queue.size(); //returns the size of queue
    }
```

### Usage
```java
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        //Creating MyLinkedListQueue object
        MyLinkedListQueue<String> linkedListQueue = new MyLinkedListQueue<>();

        //adding elements with the "enqueue" method
        linkedListQueue.enqueue("mathematics");
        linkedListQueue.enqueue("Mos Def");
        linkedListQueue.enqueue("Eminem");
        //outputting the size of queue
        System.out.println(linkedListQueue.size()); //prints 3
        //getting the front element of the queue, while removing it
        System.out.println(linkedListQueue.dequeue()); //prints "mathematics"
        //getting the front element of the queue, without removing it
        System.out.println(linkedListQueue.peek()); //prints "Mos Def"
        //checking whether the queue is empty
        System.out.println(linkedListStack.isEmpty()); //prints false
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
```
</details>
