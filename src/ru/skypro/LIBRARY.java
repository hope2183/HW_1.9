package ru.skypro;

public class LIBRARY {
    private final Book[] books;
    public LIBRARY(int size) {
        books = new Book[size];
    }
    public boolean addBook(Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                return true;
            }
        }
        return false;
    }

    public void printBookInfo(String bookName) {
        for (Book book : books) {
            if (book != null && book.getTitle().equals(bookName)) {
                System.out.println(book.getTitle() + " by " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName() +
                        " was published in " + book.getPublisherYear());
                return;
            }
        }
        System.out.println("Book " + bookName + " was not found!");
    }

    private void printBook(Book book) {
        System.out.println(String.join(": ",
                book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName(),
                book.getTitle(),
                String.valueOf(book.getPublisherYear())));
    }
    public boolean changeBookEdition(String bookName, int newYear){
        for (Book book : books) {
            if (book != null && book.getTitle().equals(bookName)) {
                book.setPublisherYear(newYear);
                return true;
            }
        }
        return false;
    }
}


