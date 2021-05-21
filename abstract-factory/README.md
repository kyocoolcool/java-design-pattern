# Abstract Factory

## Purpose

> Abstract Factory Pattern says that just define an interface or abstract class
> for creating families of related (or dependent) objects but without specifying
> their concrete sub-classes.That means Abstract Factory lets a class returns a 
> factory of classes. So, this is the reason that Abstract Factory Pattern is one level
> higher than the Factory Pattern.

## Advantage of Abstract Factory Pattern
> You can be sure that the products you’re getting from a factory are compatible with each other.   
> You avoid tight coupling between concrete products and client code.  
> Single Responsibility Principle. You can extract the product creation code into one place, making the code easier to support. 
> Open/Closed Principle. You can introduce new variants of products without breaking existing client code. 

## Disadvantage of Abstract Factory Pattern
> The code may become more complicated than it should be, since a lot of new interfaces and classes are introduced along with the pattern.

## Usage of Abstract Factory Pattern

> When the system needs to be independent of how its object are created, composed, and represented.     
> When the family of related objects has to be used together, then this constraint needs to be enforced.        
> When you want to provide a library of objects that does not show implementations and only reveals interfaces.     
> When the system needs to be configured with one of a multiple family of objects.
