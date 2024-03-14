CREATE TABLE IF NOT EXISTS tables
(
    id                  BIGINT AUTO_INCREMENT PRIMARY KEY,
    number_of_seats     BIGINT,
    x                   FLOAT,
    y                   FLOAT,
    available           BOOLEAN,
    restaurant_id           BIGINT,
    FOREIGN KEY (restaurant_id) REFERENCES restaurant(id)
);