USE adlister_db;

DROP TABLE ads;

CREATE TABLE IF NOT EXISTS ads (
                                     id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                                     user_id INT UNSIGNED NOT NULL,
                                     title VARCHAR(200) NOT NULL,
                                     description TEXT NOT NULL,
                                     PRIMARY KEY (id),
                                     FOREIGN KEY (user_id) REFERENCES users(id)
);

DESCRIBE ads;

SELECT * FROM ads;