#  My Custom Java Collections Library

A personal project to build core Java data structures from scratch, to deepen my understanding of DSA and Java internals.

---

##  Purpose

This library re-implements popular collections like ArrayList, LinkedList, Stack, Queue, HashMap, Set, and more.
It’s designed for learning and practice.

---

##  Progress Checklist

###  **Core Collections**

- [ ] MyArrayList
  - [ ] Add elements
  - [ ] Get/Set by index
  - [ ] Remove by index
  - [ ] Dynamic resizing
  - [ ] Iterator

- [ ] MyLinkedList
  - [ ] Singly linked list
  - [ ] Doubly linked list
  - [ ] AddFirst / AddLast
  - [ ] RemoveFirst / RemoveLast

- [ ] MyStack
  - [ ] Backed by ArrayList or LinkedList
  - [ ] Push / Pop / Peek
  - [ ] isEmpty

- [ ] MyQueue
  - [ ] Enqueue / Dequeue / Peek
  - [ ] Circular array version

- [ ] MyDeque
  - [ ] Insert/Remove both ends

---

###  **Map & Set**

- [ ] MyHashMap
  - [ ] Put / Get / Remove
  - [ ] Handle collisions (chaining)
  - [ ] Resizing

- [ ] MyHashSet
  - [ ] Based on MyHashMap

---

###  **Trees & Heaps**

- [ ] MyBinarySearchTree
  - [ ] Insert / Delete / Search
  - [ ] In-order / Pre-order / Post-order traversal

- [ ] MyPriorityQueue (Heap)
  - [ ] MinHeap
  - [ ] MaxHeap

---

###  **Infrastructure**

- [ ] Make collections Generic `<T>`
- [ ] Implement Iterable / Iterator
- [ ] Add unit tests (JUnit)
- [ ] Write JavaDocs for all classes
- [ ] Create example usage in `main()`

---

## ✨ **Future Ideas**

- [ ] TreeSet with AVL or Red-Black Tree
- [ ] LRU Cache
- [ ] Thread-safe collections
- [ ] Serialization support
- [ ] Publish as a Maven artifact
- [ ] Benchmark vs. `java.util`

---

##  How to Use

To explore or contribute to this project:

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/ayoubMah/mycollections.git
    cd mycollections
    ```

2.  **Compile the code:**
    If you're using a build tool like Maven or Gradle, follow their respective build commands (e.g., `mvn compile` or `gradle build`).
    
    For manual compilation (assuming source files are in `src/main/java`):
    ```bash
    javac -d out src/main/java/**/*.java
    ```

3.  **Run examples or tests:**
    *   **Examples:** Execute a class with a `main` method (e.g., if you have `MyArrayListDemo.java` in `src/main/java/com/example/collections/`):
        ```bash
        java -cp out com.ACollections.collections.MyArrayList
        ```
    *   **Tests:** If unit tests are implemented (e.g., with JUnit), you'd typically run them via your build tool (e.g., `mvn test` or `gradle test`).

---

## 📜 License

This project is licensed under the MIT License — see the [LICENSE](LICENSE) file for details.

---

## ✍️ Author

**Ayoub El-mahjouby**
[GitHub Profile](https://github.com/ayoubMah)
