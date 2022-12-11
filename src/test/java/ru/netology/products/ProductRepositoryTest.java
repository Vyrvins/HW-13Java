package ru.netology.products;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.products.*;

public class ProductRepositoryTest {
    @Test
    public void shouldFinAll() {
        ProductRepository repo = new ProductRepository();

        Book book1 = new Book(1, "Властелин Колец Том1", 100, "Толиен");
        Book book2 = new Book(2, "Властелин Колец Том2", 200, "Толиен");
        Book book3 = new Book(3, "Властелин Колец Том3", 300, "Толиен");
        Smartphone smartphone1 = new Smartphone(4, "Iphone 11", 70_000, "Apple");
        Smartphone smartphone2 = new Smartphone(5, "Iphone 12", 70_000, "Apple");
        Smartphone smartphone3 = new Smartphone(6, "Iphone 13", 70_000, "Apple");

        repo.add(book1);

        Product[] expected = {book1};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll() {
        ProductRepository repo = new ProductRepository();

        Book book1 = new Book(1, "Властелин Колец Том1", 100, "Толиен");
        Book book2 = new Book(2, "Властелин Колец Том2", 200, "Толиен");
        Book book3 = new Book(3, "Властелин Колец Том3", 300, "Толиен");
        Smartphone smartphone1 = new Smartphone(4, "Iphone 11", 70_000, "Apple");
        Smartphone smartphone2 = new Smartphone(5, "Iphone 12", 70_000, "Apple");
        Smartphone smartphone3 = new Smartphone(6, "Iphone 13", 70_000, "Apple");

        repo.add(book1);

        Product[] expected = {book1};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAl0() {
        ProductRepository repo = new ProductRepository();

        Book book1 = new Book(1, "Властелин Колец Том1", 100, "Токиен");
        Book book2 = new Book(2, "Властелин Колец Том2", 200, "Токиен");
        Book book3 = new Book(3, "Властелин Колец Том3", 300, "Толкиен");
        Smartphone smartphone1 = new Smartphone(4, "Iphone 11", 70_000, "Apple");
        Smartphone smartphone2 = new Smartphone(5, "Iphone 12", 70_000, "Apple");
        Smartphone smartphone3 = new Smartphone(6, "Iphone 13", 70_000, "Apple");


        Product[] expected = {};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllWhenRemovedEqualToAdded() {
        ProductRepository repo = new ProductRepository();

        Book book1 = new Book(1, "Властелин Колец Том1", 100, "Толиен");
        Book book2 = new Book(2, "Властелин Колец Том2", 200, "Толиен");
        Book book3 = new Book(3, "Властелин Колец Том3", 300, "Толиен");
        Smartphone smartphone1 = new Smartphone(4, "Iphone 11", 70_000, "Apple");
        Smartphone smartphone2 = new Smartphone(5, "Iphone 12", 70_000, "Apple");
        Smartphone smartphone3 = new Smartphone(6, "Iphone 13", 70_000, "Apple");

        repo.add(book1);
        repo.removeById(1);

        Product[] expected = {};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllWhenSmthRemoved() {
        ProductRepository repo = new ProductRepository();

        Book book1 = new Book(1, "Властелин Колец Том1", 100, "Толиен");
        Book book2 = new Book(2, "Властелин Колец Том2", 200, "Толиен");
        Book book3 = new Book(3, "Властелин Колец Том3", 300, "Толиен");
        Smartphone smartphone1 = new Smartphone(4, "Iphone 11", 70_000, "Apple");
        Smartphone smartphone2 = new Smartphone(5, "Iphone 12", 70_000, "Apple");
        Smartphone smartphone3 = new Smartphone(6, "Iphone 13", 70_000, "Apple");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(smartphone1);
        repo.add(smartphone2);
        repo.add(smartphone3);
        repo.removeById(1);
        repo.removeById(4);


        Product[] expected = {book2, book3, smartphone2, smartphone3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}