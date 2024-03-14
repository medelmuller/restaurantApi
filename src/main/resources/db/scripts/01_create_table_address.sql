CREATE TABLE IF NOT EXISTS address
(
    id              BIGINT AUTO_INCREMENT PRIMARY KEY,
    street          VARCHAR(128),
    street_number   INT,
    city            VARCHAR(128),
    zip_code        VARCHAR(128)
);