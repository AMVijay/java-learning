## Introduction
In this port, will analyze how Java compile and create byte code of Lambda Implementation.

## Analysis
* As per definition, Lambda is nothing but functional implementation code block. 
* So does java create new anonymous method in bytecode for execution.? Answer is No. 
* Instead, java compilier will create the lambda implementation into `java.util.function.Consumer` implementation. As per Java Source code, `java.util.function.Consumer` is the functional implementation interface definition.
* Example: below lines of lambda code 
```java
inputList.forEach( element -> {System.out.println("Element Value" + element);});
```
will be converted into as 
```java
Consumer<String> element = elementValue -> System.out.println("Element Value" + elementValue);
inputList.forEach(a-> element.accept(a));
```
