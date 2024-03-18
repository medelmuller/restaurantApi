CREATE TABLE IF NOT EXISTS image_entity
(
    id              BIGINT AUTO_INCREMENT PRIMARY KEY,
    image           IMAGE,
    restaurant_id   BIGINT,
    FOREIGN KEY (restaurant_id) REFERENCES restaurant(id)
    );