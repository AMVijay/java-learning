# Java 21 /JDK 21 Features

## Introducion
Java 21/JDK21 is the next LTS (Long Term Support) release. There are 15 new features added in JDK21. 

## List of new features
* Sequenced Collections
* virtual threads


###  Sequenced Collections

### Virutal Threads
Typically asynchronous task is initialized as 
```
ExecutorService executors = Executors.newFixedThreadPool(<n>);
``` 
Here, the thread count is limited to physical processor core thread. This dependency brings scalability contraint. In Java21, virutal threds helps to overcome this. VirualThreads count doesn't depend on physical processor core threads.  
It is initialized as below
```
Executors.newVirtualThreadPerTaskExecutor();
```

