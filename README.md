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


