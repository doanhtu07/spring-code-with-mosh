ALTER TABLE `users`
DROP COLUMN `state`;

ALTER TABLE `addresses`
ADD COLUMN `state` varchar(255) NULL;