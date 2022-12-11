package ru.netology.products;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {
    @Test
    public void shouldSearchBookIfExist() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(1, "Властелин Колец Том1", 100, "Толкиен");
        Book book2 = new Book(2, "Властелин Колец Том2", 200, "Толкиен");
        Book book3 = new Book(3, "Властелин Колец Том3", 300, "Толкиен");
        Smartphone smartphone1 = new Smartphone(4, "Iphone 11", 70_000, "Apple");
        Smartphone smartphone2 = new Smartphone(5, "Iphone 12", 70_000, "Apple");
        Smartphone smartphone3 = new Smartphone(6, "Iphone 13", 70_000, "Apple");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] expected = {book1, book2, book3};
        Product[] actual = manager.searchBy("Властелин");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchBookIfNotExist() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(1, "Властелин Колец Том1", 100, "Толиен");
        Book book2 = new Book(2, "Властелин Колец Том2", 200, "Толиен");
        Book book3 = new Book(3, "Властелин Колец Том3", 300, "Толиен");
        Smartphone smartphone1 = new Smartphone(4, "Iphone 11", 70_000, "Apple");
        Smartphone smartphone2 = new Smartphone(5, "Iphone 12", 70_000, "Apple");
        Smartphone smartphone3 = new Smartphone(6, "Iphone 13", 70_000, "Apple");

        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] expected = {};
        Product[] actual = manager.searchBy("Властелин");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchIfNoProducts() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(1, "Властелин Колец Том1", 100, "Толиен");
        Book book2 = new Book(2, "Властелин Колец Том2", 200, "Толиен");
        Book book3 = new Book(3, "Властелин Колец Том3", 300, "Толиен");
        Smartphone smartphone1 = new Smartphone(4, "Iphone 11", 70_000, "Apple");
        Smartphone smartphone2 = new Smartphone(5, "Iphone 12", 70_000, "Apple");
        Smartphone smartphone3 = new Smartphone(6, "Iphone 13", 70_000, "Apple");

        Product[] expected = {};
        Product[] actual = manager.searchBy("Властелин");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchIfTextInOneBook() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(1, "Властелин Колец Том1", 100, "Толиен");
        Book book2 = new Book(2, "Властелин Колец Том2", 200, "Толиен");
        Book book3 = new Book(3, "Властелин Колец Том3", 300, "Толиен");
        Smartphone smartphone1 = new Smartphone(4, "Iphone 11", 70_000, "Apple");
        Smartphone smartphone2 = new Smartphone(5, "Iphone 12", 70_000, "Apple");
        Smartphone smartphone3 = new Smartphone(6, "Iphone 13", 70_000, "Apple");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] expected = {book1};
        Product[] actual = manager.searchBy("Том1");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchIfNoMatches() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(1, "Властелин Колец Том1", 100, "Толиен");
        Book book2 = new Book(2, "Властелин Колец Том2", 200, "Толиен");
        Book book3 = new Book(3, "Властелин Колец Том3", 300, "Толиен");
        Smartphone smartphone1 = new Smartphone(4, "Iphone 11", 70_000, "Apple");
        Smartphone smartphone2 = new Smartphone(5, "Iphone 12", 70_000, "Apple");
        Smartphone smartphone3 = new Smartphone(6, "Iphone 13", 70_000, "Apple");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] expected = {};
        Product[] actual = manager.searchBy("Колобок");

        Assertions.assertArrayEquals(expected, actual);
    }
}
