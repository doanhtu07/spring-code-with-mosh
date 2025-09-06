CREATE TABLE
    `wishlists` (
        `user_id` BIGINT NOT NULL,
        `product_id` BIGINT NOT NULL,
        --
        PRIMARY KEY (`user_id`, `product_id`),
        --
        KEY `wishlists_users_fk` (`user_id`), -- create an index on `user_id` in MySQL
        CONSTRAINT `wishlists_users_fk` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE,
        --
        KEY `wishlists_products_fk` (`product_id`), -- create an index on `product_id` in MySQL
        CONSTRAINT `wishlists_products_fk` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`) ON DELETE CASCADE
    );