# Stack
<h1>LinkedList - Custom Singly Linked List</h1>

<p>
  A lightweight implementation of a singly linked list in Java, optimized for stack-like operations. This list supports:
</p>

<ul>
  <li>Adding elements to the head of the list.</li>
  <li>Accessing the head element.</li>
  <li>Removing the head element (shift).</li>
  <li>Checking if the list is empty.</li>
</ul>

<h2>🧠 Class Overview</h2>

<pre>
<code>
public class LinkedList {
    private ListNode head;
    
    boolean isEmpty()
    int headOfTheLinkedList()
    void addElement(int value)
    void shiftToNextElement()
}
</code>
</pre>

<h2>📘 Methods</h2>

<h3><code>boolean isEmpty()</code></h3>
<p>Checks if the linked list is empty.</p>
<ul>
  <li><strong>Returns:</strong> true if the list is empty; false otherwise.</li>
  <li><strong>Time Complexity:</strong> O(1)</li>
</ul>

<h3><code>int headOfTheLinkedList()</code></h3>
<p>Returns the data at the head node of the list.</p>
<ul>
  <li><strong>Returns:</strong> Head node’s value, or -1 if the list is empty.</li>
  <li><strong>Time Complexity:</strong> O(1)</li>
</ul>

<h3><code>void addElement(int value)</code></h3>
<p>Adds a new node containing <code>value</code> to the head of the list.</p>
<ul>
  <li><strong>Time Complexity:</strong> O(1)</li>
</ul>

<h3><code>void shiftToNextElement()</code></h3>
<p>Removes the current head node and moves to the next node in the list.</p>
<ul>
  <li><strong>Prints:</strong> "Empty stacked." if the list is empty.</li>
  <li><strong>Time Complexity:</strong> O(1)</li>
</ul>

<h2>📂 Dependencies</h2>
<ul>
  <li><strong>ListNode.java</strong> — A supporting class that represents individual nodes in the linked list. Each node contains an integer value and a reference to the next node.</li>
</ul>


<h1>📚 Stack - Custom Stack Implementation</h1>

<p>
  This class represents a simple stack built on top of a custom singly linked list. It supports standard stack operations:
</p>

<ul>
  <li><strong>Push</strong>: Add an element to the top.</li>
  <li><strong>Pop</strong>: Remove the top element.</li>
  <li><strong>Peek</strong>: View the top element without removing it.</li>
  <li><strong>isEmpty</strong>: Check if the stack is empty.</li>
</ul>

<h2>🧠 Class Overview</h2>

<pre>
<code>
public class Stack {
    private final LinkedList lis;
    
    public Stack();
    void push(int val);
    void pop();
    int peek();
    boolean isEmpty();
}
</code>
</pre>

<h2>📘 Methods</h2>

<h3><code>void push(int val)</code></h3>
<p>Adds a new element <code>val</code> to the top of the stack.</p>
<ul>
  <li><strong>Time Complexity:</strong> O(1)</li>
</ul>

<h3><code>void pop()</code></h3>
<p>Removes the element at the top of the stack.</p>
<ul>
  <li><strong>Time Complexity:</strong> O(1)</li>
</ul>

<h3><code>int peek()</code></h3>
<p>Returns the top element of the stack without removing it.</p>
<ul>
  <li><strong>Returns:</strong> Top element value or -1 if the stack is empty.</li>
  <li><strong>Time Complexity:</strong> O(1)</li>
</ul>

<h3><code>boolean isEmpty()</code></h3>
<p>Checks whether the stack is empty.</p>
<ul>
  <li><strong>Returns:</strong> true if the stack has no elements, false otherwise.</li>
  <li><strong>Time Complexity:</strong> O(1)</li>
</ul>

<h2>📂 Dependencies</h2>
<ul>
  <li><strong>LinkedList.java</strong> — Used to implement internal stack storage.</li>
  <li><strong>ListNode.java</strong> — Represents a node in the linked list.</li>
</ul>


