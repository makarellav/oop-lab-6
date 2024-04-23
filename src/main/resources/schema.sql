DROP TABLE IF EXISTS toys;

CREATE TABLE toys
(
    id          INT PRIMARY KEY AUTO_INCREMENT,
    name        TEXT             NOT NULL,
    price       DOUBLE PRECISION NOT NULL,
    description TEXT             NOT NULL,
    size        TEXT             NOT NULL,
    age_group   TEXT             NOT NULL
);

INSERT INTO toys(name, price, description, size, age_group)
VALUES ('Cute Doll', 23.99, 'The cute doll with big eyes and black hair', 'Medium', '0+');