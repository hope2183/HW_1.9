package ru.skypro;

public class Book {
    private final Author author;
    private final String title;
    private int publisherYear;
    public Book (Author author, String title, int publisherYear){
        this.author = author;
        this.title = title;
        this.publisherYear = publisherYear;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublisherYear() {
        return publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", publisherYear=" + publisherYear +
                '}';
    }

}
