--
-- Set default database
--
USE pc_build;

--
-- Create table `product_rating`
--
CREATE TABLE product_rating (
   rating_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   user_id mediumint UNSIGNED NOT NULL,
   procduct_id mediumint UNSIGNED NOT NULL,
   active tinyint(1) NOT NULL DEFAULT 1,
   rating enum ('1', '2', '3', '4', '5') DEFAULT NULL,
   comment text DEFAULT NULL,
   created_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   updated_data timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
   PRIMARY KEY (rating_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 805101,
CHARACTER SET utf8,
COLLATE utf8_general_ci;

--
-- Create foreign key
--
ALTER TABLE product_rating
ADD CONSTRAINT FK_product_rating_procduct_id FOREIGN KEY (procduct_id)
REFERENCES product (product_id);

--
-- Create foreign key
--
ALTER TABLE product_rating
ADD CONSTRAINT FK_product_rating_user_id FOREIGN KEY (user_id)
REFERENCES user (user_id);