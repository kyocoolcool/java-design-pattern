# Composite

## Purpose

> Composite is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects. 

![](./composite.png)


## Advantage of Composite Design Pattern
> You can work with complex tree structures more conveniently: use polymorphism and recursion to your advantage. 
> Open/Closed Principle. You can introduce new types of adapters into the program without breaking the existing client code, as long as they work with the adapters through the client interface.

## Disadvantage of Composite Design Pattern
>  It might be difficult to provide a common interface for classes whose functionality differs too much. In certain scenarios, you’d need to overgeneralize the component interface, making it harder to comprehend. 

## Usage of Composite Pattern
> Use the Composite pattern when you have to implement a tree-like object structure.     
> Use the pattern when you want the client code to treat both simple and complex elements uniformly.

## Composite used in Java Map library
