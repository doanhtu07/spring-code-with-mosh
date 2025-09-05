CREATE TABLE
    `categories` (
        `id` TINYINT AUTO_INCREMENT PRIMARY KEY,
        `name` VARCHAR(255) NOT NULL
    );

CREATE TABLE
    `products` (
        `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
        `name` VARCHAR(255) NOT NULL,
        `price` DECIMAL(10, 2) NOT NULL,
        `category_id` TINYINT,
        KEY `products_categories_fk` (`category_id`), -- create an index on `category_id` in MySQL
        CONSTRAINT `products_categories_fk` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`) ON DELETE RESTRICT
    );