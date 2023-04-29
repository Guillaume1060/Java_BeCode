# Challenge 2: Word counter

Create a small program with Maven and the plain spring library that will count the words of a sentence
that a user has typed in. So this means that will also need to implement 'command line' input again. In
this case just reading a single line of input. When you press enter, the result should show 
the words that you have entered and how many times they have occurred in that sentence. You can disregard
the difference between uppercase and lowercase (meaning that Hello and hello need to be treated as the 
same word). You will also need to disregard punctuation marks. 

Example: 

You have entered the sentence: "Hello world, hello there"

| Word | Occurances |
|-----|-------|
|hello | 2 |
|world | 1 |
|there | 1 |


Extra: what happens to the outcome when the user enters more than one sentence? How can you fix this?

So in this challenge, students are confronted with the lifecycle of spring managed objects (beans). Normal java
objects are end of life whenever the program flow leaves the scope these objects live in. In other words, if you 
create a new object in a method, and the program flow leaves the method, this object will get cleaned up. But with
spring, the standard scope is 'Singleton', which means that the spring bean factory will create one and only
one object of this class and it lives on until the factory object of spring is being cleaned up (that is at 
the end of the program or when the program is terminated). 

The consequence of this is that objects that store 'state', don't get cleaned up. They keep their state throughout
the program. When counting words in sentences and keeping track of the count in a spring managed object, the
count will not go away until the program dies. 

There are 2 fixes for this: one is to not use a spring managed bean to keep track of the count. In some
cases, this is the best solution (just using the 'new' keyword). But sometimes it pays off to have state
and be able to benefit from what spring has to offer. In that case, students need to learn how to create 
spring beans with the scope 'prototype'. Students should try both for this challenge.
