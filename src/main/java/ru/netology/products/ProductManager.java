package ru.netology.products;

public class ProductManager {

        public static void main(String[] args) {
            Product book = new Book(
                    1,
                    "Гарри Поттер и Тайная комната",
                    1000,
                    "Джоан Роулинг"
            );
            Product smartphone = new Smartphone(
                    2,
                    "Iphone 12",
                    100_000,
                    "Apple"
            );

            private ProductRepository repo;

            public ProductManager(ProductRepository repo) {
                this.repo = repo;
            }
        }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0]; // тут будем хранить подошедшие запросу продукты
        for (Product product: repository.findAll()) {
            if (matches(product, text)) {
                // "добавляем в конец" массива result продукт product
            }
        }
        return result;
    }

    // метод определения соответствия товара product запросу search
    public boolean matches(Product product, String search) {
        if (product.getName().contains(search)) {
            return true;
        } else {
            return false;
        }
        // или в одну строку:
        // return product.getName().contains(search);
    }
}