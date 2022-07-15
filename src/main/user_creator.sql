USE adlister_db;

CREATE USER IF NOT EXISTS 'adlister_db_user'@'localhost' IDENTIFIED BY 'password';

GRANT ALL ON adlister_db.* TO 'adlister_db_user'@'localhost';

SELECT user, host FROM mysql.user;