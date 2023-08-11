# Task: Library Management System

You are tasked with designing a basic Library Management System using object-oriented principles in Java. The system should support books and magazines, with the ability to check them out and return them. Additionally, it should track library patrons.

## Your design should include the following classes:

### Item: 
This is the parent class for both books and magazines. It should have attributes like title, item ID, and availability status. It should also have methods to get and set these attributes.

### Book: 
This class should inherit from the Item class and include attributes specific to books, such as author and number of pages. It should also include methods to get and set these attributes.

### Magazine: 
This class should also inherit from the Item class and include attributes specific to magazines, such as issue number and publication date. It should also include methods to get and set these attributes.

### Patron: 
This class represents a library patron. It should have attributes like name, patron ID, and an array of checked-out items. It should have methods to check out an item, return an item, and display the array of checked-out items.

### Library: 
This class represents the library itself. It should maintain an array of items and patrons.

## Your task is to:

* Design the class hierarchy based on the given scenario, utilizing proper inheritance and encapsulation principles.
* Implement the classes with appropriate attributes and methods.
* Write a simple program that demonstrates the usage of these classes, including adding items and patrons to the library, checking out and returning items, and displaying information about items and patrons.
* Remember to think about the relationships between classes, the access modifiers of attributes and methods, and how to encapsulate the behavior properly.

## Tips:
* Design classes with methods like display items, that do nothing at the beginning
* When you design is done then do a logic for display and/or other stuff
* For simplification make your arrays with sized size like 100
