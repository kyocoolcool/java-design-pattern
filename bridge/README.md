
# Bridge 

## Purpose

> Bridge is a structural design pattern that lets you split
> a large class or a set of closely related classes into
> two separate hierarchies—abstraction and implementation—which
> can be developed independently of each other.

![](bridge.png)

## Advantage of Bridge Pattern
> You can create platform-independent classes and apps. 
> The client code works with high-level abstractions. It isn’t exposed to the platform details. 
> Open/Closed Principle. You can introduce new abstractions and implementations independently from each other. 
> Single Responsibility Principle. You can focus on high-level logic in the abstraction and on platform details in the implementation. 

## Disadvantage of Bridge Pattern
> You might make the code more complicated by applying the pattern to a highly cohesive class. 

## Usage of Bridge Pattern

> Use the Bridge pattern when you want to divide and organize a monolithic class that has several variants of some functionality (for example, if the class can work with various database servers). 
> Use the pattern when you need to extend a class in several orthogonal (independent) dimensions. 
> Use the Bridge if you need to be able to switch implementations at runtime. 

## What's different?
`The Bridge` Separates an object’s interface from its implementation    
`The Factory` Method - Creates an instance of several derived classes

## Decorator used in JDBC multi driver 
