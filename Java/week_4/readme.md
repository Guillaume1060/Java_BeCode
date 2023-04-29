# Java Week 4

## Index

1. [Hello world with Spring](challenges/challenge_1.md)
2. [Word counter](./challenges/challenge_2.md)
3. [Naming collisions](./challenges/challenge_3.md)
4. [Hospital registration portal](./challenges/challenge_4.md)

---> [Resources](./resources.md) <---

## Ideal flow of the learning track

By now, standard java syntax should be quite fluent. Testing has been introduced, in this week we take testing to the next level and introduce mocking. This goes hand in hand with the Spring introduction and dependency injection. We do all this while also keeping in mind the Object Oriented concepts, especially encapsulation will become problematic with Spring. 

We should, if possible, already warn for the dangers of class reusage especially cross context.Spring, and most spring examples, encourage people to work with 'services' around a domain. This service then contains all of the behaviour which even slightly touches the domain. All of these methods are stateless, and thus all of them are public. Very soon, these services become gigantic classes that are hard to test and are very entangled with other classes. Educate them about the dangers of this approach but also that this is done by a lot of developers and doing it differently might cause conflict.

- Students should learn what Spring is, what the origin of Spring was and how it has evolved, what Inversion of Control is, why it exists. Students should also learn what Dependency Injection is. What problems does it solve?
- I would introduce basic Spring, no Spring boot yet. Students should get familiar with basic spring concepts, such as beans, how the wiring/injection of dependencies happens. They should also understand that Spring is basically using the Factory design pattern to build objects of classes (the beans) and that it will inject those beans in other beans. Furthermore, they will need to understand collisions and how to fix it. 
- Spring by default implements the singleton pattern. Students need to understand what that means. Spring uses the concept of bean scopes to determine the lifecycle of those beans. They need to know the different scopes and the impact that has on the lifecycle of beans.
- Students should learn how to use property files with spring and maven.
- Students should also know what the component scan is and get used to annotations like @Configuration, @Service, @Component, etc... 

## Learning Goals

- Understand what spring is, where it came from and why it was built.
- Be able to explain what IoC and Dependency Injection is and what the benefit of this is.
- Be able to start a simple spring project using Maven.
- Understand what Maven is and what it can do for you. Understand the structure of a maven pom.xml file.
- Know the simple maven commands: mvn clean install, mvn clean compile, mvn dependency:tree, mvn dependency:resolve.
- Have basic understanding of how Spring works: bean factory, bean container, etc...
- Understand Spring beans, scopes and the lifecycle of beans with these scopes. In this week at least singleton and prototype.
- Understand how Spring will inject/wire these beans, using naming conventions and package scanning.
- Understand mocking: know at least one mocking framework and be able to use it to test your spring beans.

> **NOTE**: Feel free to pick any previous challenge and try to make a spring version out of it for practice!