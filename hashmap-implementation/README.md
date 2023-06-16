# HashMap Implementation

## Introduction
* HashMap is one of the key collection type in Java. 
* It stores objects as Key-Value pairs.
* It uses Hash value of Key to store and retrieve the object from the collection.

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

