-- create database `demo`;
-- use `demo`;

-- CREATE TABLE `item` (
--     id           BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
--     key_column   VARCHAR(64) NOT NULL,
--     value_column VARCHAR(64) NOT NULL
-- );

-- first data
insert into item(id, key_column, value_column)
values (1, 'key_1', 'value_1'),
       (2, 'key_2', 'value_2'),
       (3, 'key_3', 'value_3'),
       (4, 'key_4', 'value_4');
;
