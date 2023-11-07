## Task: Personal Library

Design a class hierarchy to represent a person and their personal collection of books. You should have two classes: Person and Book.

### Person Class:

Attributes:
- name (a string) - to store the name of the person.
- age (an integer) - to store the age of the person.
- library (a collection or list of books) - to store the person's collection of books.
Constructor:
- A constructor that takes the name and age as parameters and initializes the attributes.
Methods:
- addBook(Book book) - adds a book to the person's library.
- listBooks() - lists all the books in the person's library.
- findBook(String title) - finds and returns a book from the library by its title.

### Book Class:
Attributes:
- title (a string) - to store the title of the book.
- author (a string) - to store the author's name.
- publicationYear (an integer) - to store the year the book was published.
Constructor:
 - A constructor that takes the title, author, and publicationYear as parameters and initializes the attributes.
Methods:
- getTitle() - returns the title of the book.
- getAuthor() - returns the author's name.
- getPublicationYear() - returns the publication year of the book.



### Tasks
Add a collection (choose type bases on your own) with person and books. Some person can have books, some no.
It is suggested to to it in seprate class in main method. Each task can be represented by method of this class.
It suggested to use Stream API and Optional class

- Add a possibility to find person by name. In case it is not found it should return null.
- Get names of all persons sorted alphabetically.
- Get Average age of persons.
- Sort persons based on age descend
- Find a persons that owns a book with title.
- Sort person by age. The result should be a Map<Seniority, List<Person>>. 
  Where Seniority is children (1-16 age), adults (17-60 age), seniors (61 + age)

