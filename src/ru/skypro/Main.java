package ru.skypro;

public class Main {

    public static void main(String[] args) {
            Author pushkin = new Author("Alexander", "Pushkin");
            Author tolstoy = new Author("Lev", "Tolstoy");
            System.out.println(pushkin.toString());
            System.out.println(tolstoy.toString());

            Book  skazkaOTsareSaltane = new Book(pushkin, "Сказка о царе Салтане", 1945);
            Book voinaIMir = new Book(tolstoy, "Война и мир", 1890);
            System.out.println(skazkaOTsareSaltane.toString());
            System.out.println(voinaIMir.toString());

            skazkaOTsareSaltane.setPublisherYear(1845);
            System.out.println(skazkaOTsareSaltane.toString());

            // MIDDLE
        System.out.println("//MIDDLE");
                        Author ekkel = new Author("Bruce", "Ekkel");
            Book[] books = new Book[5];
            addBook (books,new Book(ekkel, "Thinking in Java", 2017));
            addBook (books, new Book(ekkel, "Using C++", 1989));
            addBook (books, new Book(ekkel, "Atomic Kotlin", 2021));

            for (Book book : books) {
                if (book != null) {
                    printBook(book);
                }

            }
//        // HARD
        System.out.println("//HARD");
        LIBRARY library = new LIBRARY(5);
        //Author ekkel = new Author("Bruce", "Ekkel");
        Author king = new Author("Stephen", "King");

        library.addBook(new Book(ekkel, "Thinking in Java", 2017));
        library.addBook (new Book(ekkel, "Using C++", 1989));
        library.addBook (new Book(ekkel, "Atomic Kotlin", 2021));
        library.addBook(new Book(king, "The Stand", 1978));

        library.printBookInfo("The Stand");
        library.changeBookEdition("The Stand",2020);
        library.printBookInfo("The Stand");

    }

        private static boolean addBook(Book[] books, Book newBook){
            for (int i = 0; i < books.length; i++) {
                if (books[i]==null) {
                    books[i]=newBook;
                    return true;
                }

            }
            return false;
        }

        private static void printBook(Book book){
            System.out.println(String.join(": ",
                    book.getAuthor().getFirstName()+" "+book.getAuthor().getLastName(),
                    book.getTitle(),
                    String.valueOf(book.getPublisherYear())));
        }

    }


