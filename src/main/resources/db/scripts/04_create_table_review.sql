CREATE TABLE IF NOT EXISTS review
(
    id                      BIGINT AUTO_INCREMENT PRIMARY KEY,
    review_grade            BIGINT,
    review_description      VARCHAR(128),
    restaurant_id           BIGINT,
    FOREIGN KEY (restaurant_id) REFERENCES restaurant(id)
);