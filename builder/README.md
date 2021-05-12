# Builder

## Purpose

> Builder is a creational design pattern that lets you construct complex objects
> step by step. The pattern allows you to produce different types and representations
> of an object using the same construction code.

### Advantage of Builder Design Pattern
> You can construct objects step-by-step, defer construction steps or run steps recursively.  
> You can reuse the same construction code when building various representations of products.
> Single Responsibility Principle. You can isolate complex construction code
> from the business logic of the product.

## Disadvantage of Builder Design Pattern
> The overall complexity of the code increases since the pattern requires creating multiple new classes.

## Usage of Builder Pattern

> It is mostly used when object can't be created in single step like
> in the de-serialization of a complex object.

## Builder is widely used in Java core libraries:
> java.lang.StringBuilder#append()

## Thinking 🤔

> Builder Pattern VS POJO

In most cases, one uses a builder pattern because one wants to keep the object — once created — immutable.
That is, create it, and never change it again.Immutable objects are useful for multiple reasons ,
but mostly so that you know you can keep using them without the inner data changing unexpectedly.
Immutable objects do not, by definition, support changes, and the associated class does not have setter methods.

