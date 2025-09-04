-- store.tags table
CREATE TABLE
    `tags` (
        `id` bigint NOT NULL AUTO_INCREMENT,
        `name` varchar(255) NOT NULL,
        --
        PRIMARY KEY (`id`)
    );

-- store.user_tags table
CREATE TABLE
    `user_tags` (
        `user_id` bigint NOT NULL,
        `tag_id` bigint NOT NULL,
        --
        PRIMARY KEY (`user_id`, `tag_id`),
        --
        KEY `user_tags_users_fk` (`user_id`), -- create an index on `user_id` in MySQL
        CONSTRAINT `user_tags_users_fk` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE,
        --
        KEY `user_tags_tags_fk` (`tag_id`), -- create an index on `tag_id` in MySQL
        CONSTRAINT `user_tags_tags_fk` FOREIGN KEY (`tag_id`) REFERENCES `tags` (`id`) ON DELETE CASCADE
    );