"# henry.xh2-gmail.com" 

Check my blog for steps: https://jarmx.blogspot.com/2020/03/kotlin-oauth2-springboot2-jpa.html

Create table on MySql:

CREATE TABLE `users` 
( 
 `id`       INT(11) NOT NULL auto_increment, 
 `username` VARCHAR(255) NOT NULL, 
 `password` VARCHAR(255) NOT NULL, 
 `created` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP() on 
  UPDATE CURRENT_TIMESTAMP(), 
  PRIMARY KEY (`id`) 
)

INSERT INTO users 
VALUES      (1, 
             'henry', 
             '$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu'); 



