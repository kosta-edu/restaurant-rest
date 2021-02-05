INSERT INTO cook (first_name, last_name) VALUES ('June', 'Park');
INSERT INTO cook (first_name, last_name) VALUES ('Tae-Kwon', 'Yoon');

INSERT INTO tablet (location) VALUES ('1A');
INSERT INTO tablet (location) VALUES ('2A');
INSERT INTO tablet (location) VALUES ('1B');
INSERT INTO tablet (location) VALUES ('2B');

INSERT INTO dish (name, cooking_duration, price) VALUES ('soup', 10, 5);
INSERT INTO dish (name, cooking_duration, price) VALUES ('salad', 5, 10);
INSERT INTO dish (name, cooking_duration, price) VALUES ('steak', 30, 40);
INSERT INTO dish (name, cooking_duration, price) VALUES ('fish', 20, 30);
INSERT INTO dish (name, cooking_duration, price) VALUES ('coffee', 5, 3);

INSERT INTO orders (cook_id, tablet_id, order_datetime, state) VALUES (1, 1, '2020-11-07 23:54:45', 'PLACED');
INSERT INTO orders (cook_id, tablet_id, order_datetime, state) VALUES (1, 1, '2020-11-08 00:43:04', 'PLACED');
INSERT INTO orders (cook_id, tablet_id, order_datetime, state) VALUES (1, 1, '2020-11-08 00:49:11', 'PLACED');
INSERT INTO orders (cook_id, tablet_id, order_datetime, state) VALUES (2, 1, '2020-11-08 05:14:54', 'PLACED');
INSERT INTO orders (cook_id, tablet_id, order_datetime, state) VALUES (2, 2, '2021-01-26 13:41:56', 'PLACED');
INSERT INTO orders (cook_id, tablet_id, order_datetime, state) VALUES (2, 3, '2021-01-27 03:30:05', 'PLACED');
INSERT INTO orders (cook_id, tablet_id, order_datetime, state) VALUES (2, 1, '2021-01-27 03:32:43', 'PLACED');

INSERT INTO order_dishes (order_id, dish_id, quantity) VALUES (1, 2, 1);
INSERT INTO order_dishes (order_id, dish_id, quantity) VALUES (1, 3, 1);
INSERT INTO order_dishes (order_id, dish_id, quantity) VALUES (1, 5, 1);
INSERT INTO order_dishes (order_id, dish_id, quantity) VALUES (2, 1, 1);
INSERT INTO order_dishes (order_id, dish_id, quantity) VALUES (2, 3, 1);
INSERT INTO order_dishes (order_id, dish_id, quantity) VALUES (2, 5, 1);
INSERT INTO order_dishes (order_id, dish_id, quantity) VALUES (3, 1, 1);
INSERT INTO order_dishes (order_id, dish_id, quantity) VALUES (3, 4, 1);
INSERT INTO order_dishes (order_id, dish_id, quantity) VALUES (4, 1, 1);
INSERT INTO order_dishes (order_id, dish_id, quantity) VALUES (4, 3, 1);
INSERT INTO order_dishes (order_id, dish_id, quantity) VALUES (4, 5, 1);
INSERT INTO order_dishes (order_id, dish_id, quantity) VALUES (5, 1, 1);
INSERT INTO order_dishes (order_id, dish_id, quantity) VALUES (5, 2, 1);
INSERT INTO order_dishes (order_id, dish_id, quantity) VALUES (5, 4, 1);
INSERT INTO order_dishes (order_id, dish_id, quantity) VALUES (5, 5, 1);
INSERT INTO order_dishes (order_id, dish_id, quantity) VALUES (6, 3, 1);
INSERT INTO order_dishes (order_id, dish_id, quantity) VALUES (7, 3, 1);
