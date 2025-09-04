-- store.profiles table
CREATE TABLE
    `profiles` (
        `id` bigint NOT NULL,
        `bio` text NULL,
        `phone_number` varchar(25) NULL,
        `date_of_birth` date NULL,
        `loyalty_points` int UNSIGNED DEFAULT 0 NULL,
        --
        PRIMARY KEY (`id`), -- create primary key index `id`
        --
        CONSTRAINT `profiles_users_fk` FOREIGN KEY (`id`) REFERENCES `users` (`id`) -- create foreign key constraint
    );