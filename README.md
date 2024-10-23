# Zadanie - 1 - Tree Modeling Project

## Table of Contents

- [Overview](#Overview)
- [Project Structure](#Project-Structure)
- [Features](#Features)
- [Class Descriptions](#Class-Descriptions)
  - [`TreeComponent`](#TreeComponent)
  - [`CompositeComponent`](#CompositeComponent)
  - [`Leaf` and `Needle`](#Leaf-and-Needle)
  - [`Branch` and `Trunk`](#Branch-and-Trunk)
  - [`Tree`](#Tree)
  - [`DeciduousTree` and `ConiferousTree`](#DeciduousTree-and-ConiferousTree)
  - [`Birch` and `Pine`](#Birch-and-Pine)
- [Design Patterns and Principles](#Design-Patterns-and-Principles)

## Overview

This project is a Java implementation that models deciduous and coniferous trees using Object-Oriented Programming (OOP) principles and the Composite design pattern. It simulates the growth and behavior of trees and their components (such as branches, leaves, and needles) in a natural environment.

## Project Structure

The project is organized into packages and directories as follows:
```
src/
├── main/
│   └── java/
│       └── pl/
│           └── rafalzbanski/
│               ├── components/
│               │   ├── CompositeComponent.java
│               │   ├── Branch.java
│               │   ├── Trunk.java
│               │   ├── Leaf.java
│               │   └── Needle.java
│               ├── coniferous/
│               │   ├── ConiferousTree.java
│               │   └── Pine.java
│               ├── deciduous/
│               │   ├── DeciduousTree.java
│               │   └── Birch.java
│               ├── main/
│               │   └── Main.java
│               └── tree/
│                   ├── TreeComponent.java
│                   └── Tree.java

```

- `src/main/java/pl.rafalzbanski`: Base package for the project.
  - `components/`: Package containing tree component classes.
    - `CompositeComponent.java`: Abstract class for components that can have children.
    - `Branch.java`: Represents a tree branch.
    - `Trunk.java`: Represents the trunk of a tree.
    - `Leaf.java`: Represents a leaf of a deciduous tree.
    - `Needle.java`: Represents a needle of a coniferous tree.
  - `coniferous/`: Package for coniferous tree classes.
    - `ConiferousTree.java`: Abstract class for coniferous trees.
    - `Pine.java`: Concrete class representing a pine tree.
  - `deciduous/`: Package for deciduous tree classes.
    - `DeciduousTree.java`: Abstract class for deciduous trees.
    - `Birch.java`: Concrete class representing a birch tree.
  - `main/`: Package containing the main application class.
    - `Main.java`: Entry point of the application for testing.
  - `tree/`: Package containing base tree classes.
    - `TreeComponent.java`: Abstract class representing any component of a tree.
    - `Tree.java`: Abstract class representing a generic tree.


## Features

- Composite Design Pattern: Allows individual tree components and compositions to be treated uniformly.
- OOP Principles: Uses inheritance, encapsulation, and polymorphism.
- Simulation of Tree Growth: Models the growth of trees and their components over time.
- Seasonal Behavior: Simulates how trees behave during winter.
  - Deciduous Trees: Shed leaves during winter.
  - Coniferous Trees: Retain needles during winter.
- Extendability: Easy to add new types of trees or components.

## Class Descriptions

### `TreeComponent`
- Description: Abstract base class for all tree components.
- Methods:
  - `grow()`: Abstract method to simulate growth.
### `CompositeComponent`
- Description: Abstract class for components that can have child components (e.g., branches, trunks).
- Fields:
  - `List<TreeComponent> children`: Holds child components.
- Methods:
  - `add(TreeComponent component)`: Adds a child component.
  - `remove(TreeComponent component)`: Removes a child component.
  - `grow()`: Invokes `grow()` on all child components.
  - `winterAction()`: Invokes winter action on all child components.
### `Leaf` and `Needle`
- Description: Concrete classes representing leaves and needles.
- Methods:
  - `grow()`: Simulates growth.
  - `fall()`: For `Leaf`, simulates falling during winter.
  - `stayOnTree()`: For `Needle`, indicates needles stay during winter.
### `Branch` and `Trunk`
- Description: Composite components representing branches and trunks.
- Methods:
  - `grow()`: Simulates growth and invokes `grow()` on children.
  - `winterAction()`: Invokes `winterAction()` on children.
### `Tree`
- Description: Abstract base class for trees.
- Fields:
  - `Trunk trunk`: The trunk of the tree.
  - `int age`: Age of the tree.
  - `double height`: Height of the tree.
- Methods:
  - `grow()`: Abstract method to simulate growth.
  - `winter()`: Abstract method to simulate winter behavior.
  - `heal()`: Simulates tree regeneration.
  - `getTrunk()`: Returns the trunk.
  - `getAge()`: Returns the age.
  - `getHeight()`: Returns the height.
### `DeciduousTree` and `ConiferousTree`
- Description: Abstract classes representing deciduous and coniferous trees.
- Methods:
  - `grow()`: Implements growth logic specific to the type.
  - `winter()`: Implements winter behavior.
  - Additional methods like `shedLeaves()` and `retainNeedles()`.
### `Birch` and `Pine`
- Description: Concrete classes representing specific types of trees.
- Methods:
  - `grow()`: Overrides to provide specific growth increments.
  - Additional methods like `produceSap()` and `emitEssentialOil()`.

## Design Patterns and Principles

- __Composite Pattern__: Allows treating individual objects and compositions uniformly.
- __Inheritance and Polymorphism__: Abstract classes and overridden methods provide a flexible and extensible design.
- __Encapsulation__: Protects the internal state of objects and exposes behavior through methods.
- __Abstraction__: Uses abstract classes and methods to define common interfaces and behaviors.
