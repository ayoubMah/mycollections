# My Java Collection Framework (JCF)

A complete implementation of Java's Collection Framework from scratch - built for deep learning and understanding of data structures, algorithms, and design patterns.

## 🎯 Project Goals

- Master core data structures (arrays, linked lists, hash tables, trees, heaps)
- Understand Java generics deeply
- Learn classic design patterns (Iterator, Template Method, Factory)
- Practice Test-Driven Development (TDD)
- Build production-quality, publishable code

## 📦 Project Structure

```
my-collection-framework/
├── src/main/java/com/yourname/collections/
│   ├── interfaces/
│   ├── abstracts/
│   ├── list/
│   ├── set/
│   ├── queue/
│   ├── map/
│   └── util/
└── src/test/java/com/yourname/collections/
```

## ✅ Implementation Checklist

### Phase 1: Foundation & List Implementations

#### Core Interfaces
- [ ] `Collection<E>` interface (extends `Iterable<E>`)
- [ ] `Iterator<E>` interface (or use `java.util.Iterator`)
- [ ] `List<E>` interface (extends `Collection<E>`)

#### Abstract Classes
- [ ] `AbstractCollection<E>` (implements `Collection<E>`)
- [ ] `AbstractList<E>` (extends `AbstractCollection`, implements `List<E>`)

#### ArrayList Implementation
- [ ] `ArrayList<E>` class
    - [ ] Internal array storage
    - [ ] Constructor(s) - default capacity
    - [ ] `add(E element)` with dynamic resizing
    - [ ] `add(int index, E element)`
    - [ ] `get(int index)` with bounds checking
    - [ ] `set(int index, E element)`
    - [ ] `remove(int index)` with element shifting
    - [ ] `remove(Object o)`
    - [ ] `size()`, `isEmpty()`, `clear()`
    - [ ] `contains(Object o)`
    - [ ] `indexOf(Object o)`, `lastIndexOf(Object o)`
    - [ ] Inner class: `ArrayListIterator` implementing `Iterator<E>`
    - [ ] `iterator()` method
    - [ ] Fail-fast iterator (ConcurrentModificationException)
- [ ] `ArrayListTest` - comprehensive unit tests

#### LinkedList Implementation
- [ ] `LinkedList<E>` class
    - [ ] Node inner class (with `data`, `next`, `prev`)
    - [ ] Head and tail references
    - [ ] `add(E element)` - add to end
    - [ ] `add(int index, E element)`
    - [ ] `addFirst(E element)`, `addLast(E element)`
    - [ ] `get(int index)`
    - [ ] `set(int index, E element)`
    - [ ] `remove(int index)`
    - [ ] `removeFirst()`, `removeLast()`
    - [ ] `size()`, `isEmpty()`, `clear()`
    - [ ] Inner class: `LinkedListIterator`
    - [ ] `iterator()` method
    - [ ] Fail-fast iterator
- [ ] `LinkedListTest` - comprehensive unit tests

#### Stack Implementation
- [ ] `Stack<E>` class
    - [ ] `push(E element)`
    - [ ] `pop()`
    - [ ] `peek()`
    - [ ] `isEmpty()`
    - [ ] `size()`
- [ ] `StackTest` - unit tests

---

### Phase 2: Queue & Deque

#### Interfaces
- [ ] `Queue<E>` interface (extends `Collection<E>`)
- [ ] `Deque<E>` interface (extends `Queue<E>`)

#### Abstract Classes
- [ ] `AbstractQueue<E>` (extends `AbstractCollection`, implements `Queue<E>`)

#### Implementations
- [ ] Update `LinkedList<E>` to implement `Deque<E>`
    - [ ] `offer(E element)`, `poll()`, `peek()`
    - [ ] `offerFirst()`, `offerLast()`
    - [ ] `pollFirst()`, `pollLast()`
    - [ ] `peekFirst()`, `peekLast()`

- [ ] `ArrayDeque<E>` class
    - [ ] Circular array implementation
    - [ ] All deque operations
    - [ ] Dynamic resizing
- [ ] `ArrayDequeTest` - unit tests

---

### Phase 3: Map Implementations (Hash-Based)

#### Map Interfaces
- [ ] `Map<K, V>` interface (standalone, NOT extending Collection)
    - [ ] `put(K key, V value)`
    - [ ] `get(Object key)`
    - [ ] `remove(Object key)`
    - [ ] `containsKey(Object key)`, `containsValue(Object value)`
    - [ ] `size()`, `isEmpty()`, `clear()`
    - [ ] `keySet()`, `values()`, `entrySet()`
- [ ] `Map.Entry<K, V>` inner interface

#### Abstract Classes
- [ ] `AbstractMap<K, V>` (implements `Map<K, V>`)

#### HashMap Implementation
- [ ] `HashMap<K, V>` class
    - [ ] Internal array of buckets (Entry[])
    - [ ] Hash function
    - [ ] Collision resolution (separate chaining with linked list)
    - [ ] `put(K key, V value)` - with collision handling
    - [ ] `get(Object key)` - O(1) average
    - [ ] `remove(Object key)`
    - [ ] `containsKey()`, `containsValue()`
    - [ ] Load factor and rehashing/resizing
    - [ ] `size()`, `isEmpty()`, `clear()`
    - [ ] `keySet()`, `values()`, `entrySet()` views
    - [ ] Inner class: `HashMapEntry<K, V>` (implements `Map.Entry`)
    - [ ] Iterator support for entry set
- [ ] `HashMapTest` - comprehensive unit tests

#### LinkedHashMap Implementation
- [ ] `LinkedHashMap<K, V>` class (extends `HashMap`)
    - [ ] Maintains insertion order with doubly-linked list
    - [ ] Override necessary methods
- [ ] `LinkedHashMapTest` - unit tests

---

### Phase 4: Set Implementations (Hash-Based)

#### Set Interfaces
- [ ] `Set<E>` interface (extends `Collection<E>`)
    - [ ] No duplicate elements
    - [ ] No index-based access

#### Abstract Classes
- [ ] `AbstractSet<E>` (extends `AbstractCollection`, implements `Set<E>`)

#### HashSet Implementation
- [ ] `HashSet<E>` class
    - [ ] Internal `HashMap<E, Object>` (value is dummy object)
    - [ ] `add(E element)` - returns false if duplicate
    - [ ] `remove(Object o)`
    - [ ] `contains(Object o)` - O(1) average
    - [ ] `size()`, `isEmpty()`, `clear()`
    - [ ] `iterator()`
- [ ] `HashSetTest` - unit tests

#### LinkedHashSet Implementation
- [ ] `LinkedHashSet<E>` class (extends `HashSet`)
    - [ ] Uses `LinkedHashMap` internally
    - [ ] Maintains insertion order
- [ ] `LinkedHashSetTest` - unit tests

---

### Phase 5: Sorted Collections (Tree-Based)

#### Utility Interfaces
- [ ] `Comparator<T>` interface
    - [ ] `compare(T o1, T o2)`
- [ ] Use `java.lang.Comparable<T>` (built-in)

#### Sorted Interfaces
- [ ] `SortedMap<K, V>` interface (extends `Map<K, V>`)
    - [ ] `firstKey()`, `lastKey()`
    - [ ] `subMap()`, `headMap()`, `tailMap()`
    - [ ] `comparator()`

- [ ] `SortedSet<E>` interface (extends `Set<E>`)
    - [ ] `first()`, `last()`
    - [ ] `subSet()`, `headSet()`, `tailSet()`
    - [ ] `comparator()`

#### TreeMap Implementation
- [ ] `TreeMap<K, V>` class (Red-Black Tree)
    - [ ] Node inner class (key, value, color, left, right, parent)
    - [ ] `put(K key, V value)` with BST insertion + balancing
    - [ ] Red-Black Tree rotations (left, right)
    - [ ] Red-Black Tree recoloring
    - [ ] `get(Object key)` - O(log n)
    - [ ] `remove(Object key)` with rebalancing
    - [ ] In-order traversal for sorted iteration
    - [ ] `firstKey()`, `lastKey()`
    - [ ] `comparator()` support
    - [ ] Iterator with in-order traversal
- [ ] `TreeMapTest` - unit tests

#### TreeSet Implementation
- [ ] `TreeSet<E>` class
    - [ ] Internal `TreeMap<E, Object>` (value is dummy)
    - [ ] `add(E element)` - maintains sorted order
    - [ ] `remove(Object o)` - O(log n)
    - [ ] `contains(Object o)` - O(log n)
    - [ ] `first()`, `last()`
    - [ ] `iterator()` returns sorted iterator
- [ ] `TreeSetTest` - unit tests

---

### Phase 6: Priority Queue (Heap-Based)

#### PriorityQueue Implementation
- [ ] `PriorityQueue<E>` class
    - [ ] Internal array-based binary heap
    - [ ] Min-heap or max-heap (with Comparator support)
    - [ ] `offer(E element)` - heapify up
    - [ ] `poll()` - remove min/max, heapify down
    - [ ] `peek()` - view min/max without removing
    - [ ] `size()`, `isEmpty()`, `clear()`
    - [ ] Comparator support
    - [ ] Dynamic resizing
- [ ] `PriorityQueueTest` - unit tests

---

### Phase 7: Legacy Collections (Optional)

- [ ] `Vector<E>` class (synchronized ArrayList)
    - [ ] All ArrayList operations
    - [ ] Synchronized methods
- [ ] `VectorTest` - unit tests

- [ ] `Hashtable<K, V>` class (synchronized HashMap)
    - [ ] All HashMap operations
    - [ ] Synchronized methods
    - [ ] No null keys or values
- [ ] `HashtableTest` - unit tests

---

### Phase 8: Utility Classes

- [ ] `Objects` utility class
    - [ ] `equals(Object a, Object b)` null-safe
    - [ ] `hashCode(Object o)` null-safe
    - [ ] `requireNonNull(T obj)`

- [ ] `Collections` utility class (optional advanced)
    - [ ] `sort(List<T> list)`
    - [ ] `reverse(List<?> list)`
    - [ ] `shuffle(List<?> list)`
    - [ ] `binarySearch(List<T> list, T key)`
    - [ ] `min()`, `max()`

---

### Phase 9: Documentation & Publishing

- [ ] Complete Javadoc for all public APIs
- [ ] Add usage examples in README
- [ ] Code coverage report (JaCoCo) - aim for 80%+
- [ ] Performance benchmarks (optional)
- [ ] Package for Maven Central (optional)

---

## 🧪 Testing Strategy

- **Unit tests for every class** using JUnit 5
- **Test coverage**: Aim for 80%+ code coverage
- **Test categories**:
    - Basic operations (add, remove, get)
    - Edge cases (empty, single element, full capacity)
    - Boundary conditions (index out of bounds, null handling)
    - Iterator behavior (hasNext, next, fail-fast)
    - Concurrency (ConcurrentModificationException)

---

## 📚 Learning Resources

### When You Get Stuck

**Generics**:
- Oracle Java Generics Tutorial
- Effective Java (Joshua Bloch) - Chapter on Generics

**Iterator Pattern**:
- Gang of Four Design Patterns book
- Refactoring.guru - Iterator Pattern

**Hashing**:
- Introduction to Algorithms (CLRS) - Chapter 11
- Practice: Understand hash functions, collision resolution

**Red-Black Trees**:
- Visualgo.net - visualize rotations
- Introduction to Algorithms (CLRS) - Chapter 13
- GeeksforGeeks - Red-Black Tree tutorials

**Binary Heaps**:
- Introduction to Algorithms (CLRS) - Chapter 6
- Visualgo.net - heap visualization

---

## 🏆 Success Criteria

- [ ] All interfaces and classes implemented
- [ ] All tests passing
- [ ] Code coverage > 80%
- [ ] Clean, readable code following Java conventions
- [ ] Complete Javadoc documentation
- [ ] README with usage examples
- [ ] Project builds successfully with Maven
- [ ] (Optional) Published to Maven Central

---

## 🚀 Getting Started

```bash
# Clone the repository
git clone https://github.com/yourusername/my-collection-framework.git

# Build the project
mvn clean install

# Run tests
mvn test

# Generate coverage report
mvn jacoco:report
```

---

## 📝 Notes

- **Start simple**: ArrayList → LinkedList → HashMap → HashSet → TreeMap → TreeSet
- **Test-driven development**: Write tests first, then implement
- **Don't skip abstracts**: AbstractCollection and AbstractList save you tons of code
- **Iterator is crucial**: Fail-fast behavior is important for correctness
- **HashMap before HashSet**: HashSet is just a HashMap wrapper!
- **TreeMap before TreeSet**: TreeSet is just a TreeMap wrapper!

---

## 📄 License

MIT License - feel free to use and learn from this project

---
## ✍️ Author

**Ayoub El-mahjouby**
[GitHub Profile](https://github.com/ayoubMah)
