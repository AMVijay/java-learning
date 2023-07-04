# HashMap Implementation

## Introduction
* HashMap is one of the important collection type in Java and used by developers mostly. 
* It stores objects as Key-Value pairs.
* It uses Hash value of Key to store and retrieve the object from the collection.

## Implementation
* HashMap Object collection implementation uses Array of Object Node<Key, Value>.
* HashMap object initialization is the first step. `HashMap testHashMap = new HashMap();`, Here, it loadFactor value 0.75 is loaded from Defauly load factor.
* When data is getting added using `.put(key, value)` method, 
    * Step 1: `hashkey(key)`-  HashKey is generated for the key.
    * Step 2: `resize()` - resizing of the HashMap object happens.
    * Step 3: Derive the index value using the logic 




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

