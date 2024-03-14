CREATE TABLE IF NOT EXISTS restaurant
(
    id                      BIGINT AUTO_INCREMENT PRIMARY KEY,
    name                    VARCHAR(256),
    address_id              BIGINT,
    FOREIGN KEY (address_id) REFERENCES address(id),
    open_hour               TIMESTAMP,
    close_hour              TIMESTAMP,
    cuisine_type            VARCHAR(256)
    );