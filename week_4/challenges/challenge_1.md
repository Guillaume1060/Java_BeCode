# Challenge 1: Hello world with Spring

Write a small program using Maven and the plain spring library (not spring boot yet) that will print
a hello message in the terminal. This hello message is not the standard 'hello world with Spring' in 
plain English. The language of the message depends on a configuration property. So you will also 
need a property file which contains one property to decide the language in which to print the 'hello'
message. You will also need this hello message in your property file, but translated into a couple 
of different languages, including your native language. By default, if there is no language configured, 
write the message in your native language.

Example of the property file: 

```properties
configured_language=NL
native_hello_world=hello world in spring!
NL_hello_world=Hallo wereld met spring!
FR_hello_world=Bonjour le monde avec spring!
GER_hello_world=Hallo Welt mit Schpring!
```

You need to write tests for the set of used classes except the class containing the 'main' method.
