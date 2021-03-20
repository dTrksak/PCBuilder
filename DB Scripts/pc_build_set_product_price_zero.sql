--Run this after populating the database
--The program doesn't like NULL product_prices
UPDATE product SET product_price=0.0 WHERE product_price IS NULL;