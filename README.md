# My Custom Java Collections Library

A personal project to build core Java data structures from scratch, to deeply understand DSA and Java internals.

---

## Purpose

This library re-implements popular collections like arrays, ArrayList, LinkedList, Stack, Queue, HashMap, Set, Tree, Heap, and more — from scratch.
It’s designed for learning, practicing clean code, and building stuff.

---

### **Phase 0 — Raw Arrays**

#### ✅ RawIntArray
- [X] `add(value)`
- [ ] `addAt(index, value)`
- [ ] `removeAt(index)`
- [X] `remove(value)`
- [X] `find(value)`
- [X] `findBinary(value)`
- [X] `indexOf(value)`
- [X] `contains(value)`
- [X] `get(index)`
- [X] `set(index, value)`
- [X] `len()`
- [X] `isEmpty()`
- [ ] `clear()`
- [X] `display()`
- [X] `bubbleSort()`
- [X] `selectionSort()`
- [X] `insertionSort()`
- [X] `max()`
- [X] `Unit Tests ✅`

---

### **Phase 1 — Lists**

#### ✅ MyArrayList<T>
- [X] `add(value)`
- [X] `display()`
- [ ] `addAt(index, value)`
- [ ] `removeAt(index)`
- [X] `remove(value)`
- [X] `removeAll(value)`
- [ ] `find(value)`
- [X] `indexOf(value)`
- [X] `contains(value)`
- [X] `get(index)`
- [X] `set(index, value)`
- [X] `size()`
- [X] `isEmpty()`
- [X] `clear()`
- [ ] `toArray()`
- [ ] `iterator()`

#### ✅ MyLinkedList<T>
- [ ] `add(value)`
- [ ] `addFirst(value)`
- [ ] `addLast(value)`
- [ ] `remove(value)`
- [ ] `removeFirst()`
- [ ] `removeLast()`
- [ ] `find(value)`
- [ ] `indexOf(value)`
- [ ] `contains(value)`
- [ ] `get(index)`
- [ ] `set(index, value)`
- [ ] `count()`
- [ ] `isEmpty()`
- [ ] `clear()`
- [ ] `iterator()`

---

### **Phase 2 — Linear Structures**

#### ✅ MyStack<T>
- [ ] `push(value)`
- [ ] `pop()`
- [ ] `peek()`
- [ ] `isEmpty()`
- [ ] `count()`
- [ ] `clear()`

#### ✅ MyQueue<T>
- [ ] `enqueue(value)`
- [ ] `dequeue()`
- [ ] `peek()`
- [ ] `isEmpty()`
- [ ] `count()`
- [ ] `clear()`

#### ✅ MyDeque<T>
- [ ] `addFirst(value)`
- [ ] `addLast(value)`
- [ ] `removeFirst()`
- [ ] `removeLast()`
- [ ] `peekFirst()`
- [ ] `peekLast()`
- [ ] `isEmpty()`
- [ ] `count()`
- [ ] `clear()`

---

### **Phase 3 — Map & Set**

#### ✅ MyHashMap<K,V>
- [ ] `add(key, value)`
- [ ] `get(key)`
- [ ] `remove(key)`
- [ ] `containsKey(key)`
- [ ] `containsValue(value)`
- [ ] `keys()`
- [ ] `values()`
- [ ] `count()`
- [ ] `isEmpty()`
- [ ] `clear()`

#### ✅ MyHashSet<T>
- [ ] `add(value)`
- [ ] `remove(value)`
- [ ] `contains(value)`
- [ ] `count()`
- [ ] `isEmpty()`
- [ ] `clear()`

---

### **Phase 4 — Trees & Heaps**

#### ✅ MyBinarySearchTree<T>
- [ ] `add(value)`
- [ ] `remove(value)`
- [ ] `find(value)`
- [ ] `contains(value)`
- [ ] `traverseInOrder()`
- [ ] `traversePreOrder()`
- [ ] `traversePostOrder()`
- [ ] `getMin()`
- [ ] `getMax()`
- [ ] `count()`
- [ ] `isEmpty()`
- [ ] `clear()`

#### ✅ MyPriorityQueue<T> (Heap)
- [ ] `add(value)`
- [ ] `poll()`
- [ ] `peek()`
- [ ] `isEmpty()`
- [ ] `count()`
- [ ] `clear()`

---

### **Phase 5 — Infrastructure**

- [ ] Make all collections generic `<T>` or `<K,V>`
- [ ] Implement `Iterable<T>` where needed
- [ ] Add proper exceptions (`IndexOutOfBoundsException`, etc.)
- [ ] Add JUnit tests for all
- [ ] Add JavaDocs for all classes & methods
- [ ] Make nice CLI banner (✅ already started!)
- [ ] Example `main()` for each structure

---

## ✨ **Future Ideas**

- [ ] AVL Tree or Red-Black Tree
- [ ] LRU Cache
- [ ] Thread-safe collections
- [ ] Serialization support
- [ ] Publish as a Maven/Gradle artifact
- [ ] Performance benchmarks vs. `java.util`

---

## 💡 How to Use

Clone the repo and run your CLI banner:

```bash

javac -d out src/**/*.java
java MyCollectionsApp
```

## 📜 License

This project is licensed under the MIT License — see the [LICENSE](LICENSE) file for details.

---

## ✍️ Author

**Ayoub El-mahjouby**
[GitHub Profile](https://github.com/ayoubMah)
