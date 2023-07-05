# HashMap Implementation

## Introduction
* HashMap is one of the important collection type in Java and used by developers mostly. 
* It stores objects as Key-Value pairs.
* It uses Hash value of Key to store and retrieve the object from the collection.

## Implementation
* HashMap Object collection implementation uses Array of Object Node<Key, Value>.
```
class Node<K,V> {
    final int hash; // hash value of key
    final K key;    // key value 
    V value;        // value
    Node<K,V> next; // Next node
}
```
* HashMap object initialization is the first step. `HashMap testHashMap = new HashMap();`, Here, loadFactor value 0.75 is initialized from Defauly load factor.
* Data is added using `.put(key, value)` method call. Implementation logic of `.put()`: 
    * **Step 1:** `hash(key)`-  Hash value
    is generated for the input key.
    * **Step 2:** For very first value adding into collection, `resize()` method is called to initialize the `Node<K,V>[] table`.  determines the size of the array used for HashMap Collection.
    * **Step 3:** Get the size of the internal Array `Node<K,V>[] table`.
    * **Step 4:** Determine the index value to push new element. Logic uses Bitwise AND operator between (size of the array - 1) and hash value. In this case, index value will be random and it won't be higher than size of array.
    * **Step 5:** Now Check whether array has value already in the derived index. 
        * If no, then create `new Node(hash,key, value, null)` and set this node in the array in the derived index `table[i] = new Node(hash,key, value, null)` .
        * If yes, then traverse to the next element using `node.next` and repeat Step 5 flow.
    *  




## Internal Representation
Below is the internal view of objects for the collection of listed object: 
```
Key = "1", Value = "one"
Key = "2", Value = "two"
Key = "3", Value = "three"
Key = "4", Value = "four"
Key = "5", Value = "five"
Key = "6", Value = "six"
Key = "7", Value = "seven"
Key = "8", Value = "eight"
Key = "9", Value = "nine"
Key = "10", Value = "ten"
```
## .put() method implementation
* Internally objects are organized as Array of Objects.
```
transient Node<K,V>[] table;
```
* 

