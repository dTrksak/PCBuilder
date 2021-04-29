
-- Script date 2/18/2021 4:51:09 PM
-- Server version: 8.0.20

-- -----------------------------------------------------------------------------
-- Disable foreign keys
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;

-- -----------------------------------------------------------------------------
-- Set default database
USE pc_build_1;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS category;

-- Create table 'category'
CREATE TABLE IF NOT EXISTS category (
   category_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   category_name varchar(50) NOT NULL DEFAULT '',
   PRIMARY KEY (category_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 100126,
AVG_ROW_LENGTH = 655,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS product;

-- Create table 'product'
CREATE TABLE IF NOT EXISTS product (
   product_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   category_id mediumint UNSIGNED NOT NULL,
   product_name varchar(100) DEFAULT NULL,
   product_price double DEFAULT NULL,
   PRIMARY KEY (product_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 144474,
AVG_ROW_LENGTH = 66,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS wireless_network_card;

-- Create table 'wireless_network_card'
CREATE TABLE IF NOT EXISTS wireless_network_card (
   wireless_network_card_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   product_id mediumint UNSIGNED NOT NULL UNIQUE,
   protocol varchar(50) DEFAULT NULL,
   interface varchar(50) DEFAULT NULL,
   color varchar(50) DEFAULT NULL,
   PRIMARY KEY (wireless_network_card_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 395404,
AVG_ROW_LENGTH = 54,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS wired_network_card;

-- Create table 'wired_network_card'
CREATE TABLE IF NOT EXISTS wired_network_card (
   wired_network_card_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   product_id mediumint UNSIGNED NOT NULL UNIQUE,
   interface varchar(50) DEFAULT NULL,
   ports varchar(50) DEFAULT NULL,
   color varchar(50) DEFAULT NULL,
   PRIMARY KEY (wired_network_card_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 390222,
AVG_ROW_LENGTH = 135,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS video_card;

-- Create table 'video_card'
CREATE TABLE IF NOT EXISTS video_card (
   video_card_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   product_id mediumint UNSIGNED NOT NULL UNIQUE,
   chipset varchar(50) DEFAULT NULL,
   memory varchar(50) DEFAULT NULL,
   core_clock varchar(50) DEFAULT NULL,
   boost_clock varchar(50) DEFAULT NULL,
   interface varchar(50) DEFAULT NULL,
   tdp_wattage int DEFAULT NULL,
   color varchar(50) DEFAULT NULL,
   PRIMARY KEY (video_card_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 384276,
AVG_ROW_LENGTH = 95,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS ups;

-- Create table 'ups'
CREATE TABLE IF NOT EXISTS ups (
   ups_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   product_id mediumint UNSIGNED NOT NULL UNIQUE,
   capacity_w smallint UNSIGNED DEFAULT NULL,
   capacity_va smallint UNSIGNED DEFAULT NULL,
   PRIMARY KEY (ups_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 375759,
AVG_ROW_LENGTH = 74,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS thermal_paste;

-- Create table 'thermal_paste'
CREATE TABLE IF NOT EXISTS thermal_paste (
   thermal_paste_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   product_id mediumint UNSIGNED NOT NULL UNIQUE,
   amount varchar(50) DEFAULT NULL,
   PRIMARY KEY (thermal_paste_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 370204,
AVG_ROW_LENGTH = 159,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS speakers;

-- Create table 'speakers'
CREATE TABLE IF NOT EXISTS speakers (
   speakers_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   product_id mediumint UNSIGNED NOT NULL UNIQUE,
   configuration enum ('1.0', '2.0', '2.1', '5.1') DEFAULT NULL,
   total_wattage varchar(50) DEFAULT NULL,
   frequency_response varchar(50) DEFAULT NULL,
   color varchar(50) DEFAULT NULL,
   PRIMARY KEY (speakers_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 365296,
AVG_ROW_LENGTH = 16384,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS sound_card;

-- Create table 'sound_card'
CREATE TABLE IF NOT EXISTS sound_card (
   sound_card_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   product_id mediumint UNSIGNED NOT NULL UNIQUE,
   channels enum ('2.0', '4.0', '5.1', '7.1') DEFAULT NULL,
   digital_audio enum ('24-bit', '16-bit', '32-bit') DEFAULT NULL,
   snr varchar(50) DEFAULT NULL,
   sample_rate varchar(50) DEFAULT NULL,
   chipset varchar(50) DEFAULT NULL,
   interface varchar(50) DEFAULT NULL,
   PRIMARY KEY (sound_card_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 360172,
AVG_ROW_LENGTH = 230,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS software;

-- Create table 'software'
CREATE TABLE IF NOT EXISTS software (
   software_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   product_id mediumint UNSIGNED NOT NULL UNIQUE,
   software_type varchar(50) DEFAULT NULL,
   media_type enum ('Download', 'CD/DVD', 'Product Key Card') DEFAULT NULL,
   PRIMARY KEY (software_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 355244,
AVG_ROW_LENGTH = 114,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS power_supply;

-- Create table 'power_supply'
CREATE TABLE IF NOT EXISTS power_supply (
   power_supply_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   product_id mediumint UNSIGNED NOT NULL UNIQUE,
   form_factor varchar(50) DEFAULT NULL,
   efficiency_rating varchar(50) DEFAULT NULL,
   total_wattage int UNSIGNED DEFAULT NULL,
   modular enum ('Full', 'No', 'Semi') DEFAULT NULL,
   color varchar(50) DEFAULT NULL,
   PRIMARY KEY (power_supply_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 352128,
AVG_ROW_LENGTH = 64,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS pc_case;

-- Create table 'pc_case'
CREATE TABLE IF NOT EXISTS pc_case (
   case_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   product_id mediumint UNSIGNED NOT NULL UNIQUE,
   case_type varchar(50) DEFAULT NULL,
   form_factor varchar(50) DEFAULT NULL,
   color varchar(50) DEFAULT NULL,
   power_supply varchar(50) DEFAULT NULL,
   side_panel_window varchar(50) DEFAULT NULL,
   external_bays tinyint UNSIGNED DEFAULT NULL,
   internal_bays tinyint UNSIGNED DEFAULT NULL,
   PRIMARY KEY (case_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 258980,
AVG_ROW_LENGTH = 80,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS os;

-- Create table 'os'
CREATE TABLE IF NOT EXISTS os (
   os_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   product_id mediumint UNSIGNED NOT NULL UNIQUE,
   os_type enum ('Windows', 'iOS', 'Android', 'Linux') DEFAULT NULL,
   mode enum ('64-bit', '32-bit', '32/64-bit') DEFAULT NULL,
   max_memory varchar(50) DEFAULT NULL,
   PRIMARY KEY (os_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 345157,
AVG_ROW_LENGTH = 292,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS optical_drive;

-- Create table 'optical_drive'
CREATE TABLE IF NOT EXISTS optical_drive (
   optical_drive_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   product_id mediumint UNSIGNED NOT NULL UNIQUE,
   bd tinyint UNSIGNED DEFAULT NULL,
   dvd tinyint UNSIGNED DEFAULT NULL,
   cd tinyint DEFAULT NULL,
   bd_write varchar(50) DEFAULT NULL,
   dvd_write varchar(50) DEFAULT NULL,
   cd_write varchar(50) DEFAULT NULL,
   PRIMARY KEY (optical_drive_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 340318,
AVG_ROW_LENGTH = 75,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS mouse;

-- Create table 'mouse'
CREATE TABLE IF NOT EXISTS mouse (
   mouse_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   product_id mediumint UNSIGNED NOT NULL UNIQUE,
   tracking_method enum ('Optical', 'Laser', 'Touchpad', 'Trackball') DEFAULT NULL,
   connection_type enum ('Bluetooth Wireless', 'Wired', 'Wireless') DEFAULT NULL,
   maximum_dpi smallint DEFAULT NULL,
   hand_orientation enum ('Right', 'Left', 'Both') DEFAULT NULL,
   color varchar(50) DEFAULT NULL,
   PRIMARY KEY (mouse_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 337049,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS motherboard;

-- Create table 'motherboard'
CREATE TABLE IF NOT EXISTS motherboard (
   motherboard_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   product_id mediumint UNSIGNED NOT NULL UNIQUE,
   socket_type varchar(50) DEFAULT NULL,
   form_factor varchar(50) DEFAULT NULL,
   ram_gen varchar(5) DEFAULT NULL,
   ram_slots tinyint DEFAULT NULL,
   max_ram varchar(50) DEFAULT NULL,
   color varchar(50) DEFAULT NULL,
   PRIMARY KEY (motherboard_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 333141,
AVG_ROW_LENGTH = 70,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS monitor;

-- Create table 'monitor'
CREATE TABLE IF NOT EXISTS monitor (
   monitor_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   product_id mediumint UNSIGNED NOT NULL UNIQUE,
   screen_size varchar(50) DEFAULT NULL,
   resolution varchar(50) DEFAULT NULL,
   refresh_rate varchar(10) DEFAULT NULL,
   response_time varchar(10) DEFAULT NULL,
   panel_type varchar(10) DEFAULT NULL,
   aspect_ratio varchar(10) DEFAULT NULL,
   PRIMARY KEY (monitor_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 327869,
AVG_ROW_LENGTH = 82,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS memory;

-- Create table 'memory'
CREATE TABLE IF NOT EXISTS memory (
   memory_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   product_id mediumint UNSIGNED NOT NULL UNIQUE,
   ram_gen varchar(5) DEFAULT NULL,
   speed smallint UNSIGNED DEFAULT NULL,
   memory_type varchar(50) DEFAULT NULL,
   modules varchar(50) DEFAULT NULL,
   price_per_gb double DEFAULT NULL,
   color varchar(50) DEFAULT NULL,
   cas_latency tinyint DEFAULT NULL,
   PRIMARY KEY (memory_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 322252,
AVG_ROW_LENGTH = 221,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS keyboard;

-- Create table 'keyboard'
CREATE TABLE IF NOT EXISTS keyboard (
   keyboard_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   product_id mediumint UNSIGNED NOT NULL UNIQUE,
   style enum ('Ergonomic', 'Gaming', 'Mini', 'Slim', 'Standard') DEFAULT NULL,
   switch_type varchar(50) DEFAULT NULL,
   backlit varchar(50) DEFAULT NULL,
   tenkeyless enum ('No', 'Yes') DEFAULT NULL,
   connection_type enum ('Bluetooth Wireless', 'Wired', 'Wireless') DEFAULT NULL,
   color varchar(50) DEFAULT NULL,
   PRIMARY KEY (keyboard_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 312364,
AVG_ROW_LENGTH = 65,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS internal_harddrive;

-- Create table 'internal_harddrive'
CREATE TABLE IF NOT EXISTS internal_harddrive (
   internal_harddrive_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   product_id mediumint UNSIGNED NOT NULL UNIQUE,
   capacity varchar(10) DEFAULT NULL,
   price_per_gb double DEFAULT NULL,
   harddrive_type varchar(50) DEFAULT NULL,
   cache varchar(255) DEFAULT NULL,
   form_factor varchar(50) DEFAULT NULL,
   interface varchar(50) DEFAULT NULL,
   PRIMARY KEY (internal_harddrive_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 303889,
AVG_ROW_LENGTH = 77,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS headphones;

-- Create table 'headphones'
CREATE TABLE IF NOT EXISTS headphones (
   headphones_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   product_id mediumint UNSIGNED NOT NULL UNIQUE,
   headphones_type enum ('Circumaural', 'Earbud', 'In Ear', 'Supra-aural') DEFAULT NULL,
   frequency_response varchar(50) DEFAULT NULL,
   microphone enum ('Yes', 'No') DEFAULT NULL,
   wireless enum ('Yes', 'No') DEFAULT NULL,
   enclosure_type enum ('Closed', 'Open', 'Semi-Open') DEFAULT NULL,
   color varchar(50) DEFAULT NULL,
   PRIMARY KEY (headphones_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 301564,
AVG_ROW_LENGTH = 71,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS fan_controller;

-- Create table 'fan_controller'
CREATE TABLE IF NOT EXISTS fan_controller (
   fan_controller_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   product_id mediumint UNSIGNED NOT NULL UNIQUE,
   channels tinyint UNSIGNED DEFAULT NULL,
   channel_wattage varchar(10) DEFAULT NULL,
   pwm_4_pin enum ('Yes', 'No') DEFAULT NULL,
   form_factor varchar(20) DEFAULT NULL,
   color varchar(50) DEFAULT NULL,
   PRIMARY KEY (fan_controller_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 290143,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS external_harddrive;

-- Create table 'external_harddrive'
CREATE TABLE IF NOT EXISTS external_harddrive (
   external_harddrive_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   product_id mediumint UNSIGNED NOT NULL UNIQUE,
   hardrive_type enum ('Portable', 'Desktop') DEFAULT NULL,
   interface varchar(255) DEFAULT NULL,
   capacity varchar(50) DEFAULT NULL,
   price_per_gb double DEFAULT NULL,
   color varchar(50) DEFAULT NULL,
   PRIMARY KEY (external_harddrive_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 285420,
AVG_ROW_LENGTH = 154,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS cpu_cooler;

-- Create table 'cpu_cooler'
CREATE TABLE IF NOT EXISTS cpu_cooler (
   cpu_cooler_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   product_id mediumint UNSIGNED NOT NULL UNIQUE,
   socket_type varchar(50) DEFAULT NULL,
   fan_rpm varchar(50) DEFAULT NULL,
   noise_level varchar(50) DEFAULT NULL,
   radiator_size varchar(50) DEFAULT NULL,
   color varchar(50) DEFAULT NULL,
   PRIMARY KEY (cpu_cooler_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 281212,
AVG_ROW_LENGTH = 73,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS cpu;

-- Create table 'cpu'
CREATE TABLE IF NOT EXISTS cpu (
   cpu_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   product_id mediumint UNSIGNED NOT NULL UNIQUE,
   socket_type varchar(50) DEFAULT NULL,
   core_count tinyint UNSIGNED DEFAULT NULL,
   core_clock varchar(10) DEFAULT NULL,
   boost_clock varchar(10) DEFAULT NULL,
   mode varchar(20) DEFAULT NULL,
   tdp_wattage int UNSIGNED DEFAULT NULL,
   integrated_graphics varchar(50) DEFAULT NULL,
   smt enum ('Yes', 'No') DEFAULT NULL,
   PRIMARY KEY (cpu_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 276314,
AVG_ROW_LENGTH = 81,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS case_fan;

-- Create table 'case_fan'
CREATE TABLE IF NOT EXISTS case_fan (
   case_fan_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   product_id mediumint UNSIGNED NOT NULL UNIQUE,
   mm_size tinyint UNSIGNED DEFAULT NULL,
   color varchar(50) DEFAULT NULL,
   rpm varchar(50) DEFAULT NULL,
   airflow varchar(50) DEFAULT NULL,
   noise_level varchar(50) DEFAULT NULL,
   pwm_4_pin enum ('Yes', 'No') DEFAULT NULL,
   PRIMARY KEY (case_fan_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 271593,
AVG_ROW_LENGTH = 87,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS case_accessory;

-- Create table 'case_accessory'
CREATE TABLE IF NOT EXISTS case_accessory (
   case_accesssory_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   product_id mediumint UNSIGNED NOT NULL UNIQUE,
   acc_type enum ('LED Controller', 'Card Reader') DEFAULT NULL,
   form_factor double DEFAULT NULL,
   PRIMARY KEY (case_accesssory_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 265109,
AVG_ROW_LENGTH = 2048,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS user;

-- Create table 'user'
CREATE TABLE IF NOT EXISTS user (
   user_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   first_name varchar(100) NOT NULL,
   last_name varchar(100) NOT NULL,
   email varchar(100) NOT NULL,
   password varchar(100) NOT NULL,
   PRIMARY KEY (user_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 250101,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS build;

-- Create table 'build'
CREATE TABLE IF NOT EXISTS build (
   build_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   user_id mediumint UNSIGNED NOT NULL,
   active tinyint NOT NULL DEFAULT 1,
   mode enum('64-bit','32-bit','32/64-bit') DEFAULT NULL,
   socket_type varchar(50) DEFAULT NULL,
   form_factor varchar(50) DEFAULT NULL,
   ram_gen varchar(5) DEFAULT NULL,
   ram_slots tinyint DEFAULT NULL,
   total_tdp smallint UNSIGNED DEFAULT NULL,
   cpu_tdp smallint UNSIGNED DEFAULT NULL,
   video_card_tdp int UNSIGNED DEFAULT NULL,
   created_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   updated_data timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
   PRIMARY KEY (build_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 450101,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- Create foreign key
-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS build_product;

-- Create table 'build_product'
CREATE TABLE IF NOT EXISTS build_product (
   build_product_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   build_id mediumint UNSIGNED NOT NULL,
   product_id mediumint UNSIGNED NOT NULL,
   PRIMARY KEY (build_product_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 605101,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
DROP TABLE IF EXISTS product_rating;

-- Create table 'product_rating'
CREATE TABLE IF NOT EXISTS product_rating (
   rating_id mediumint UNSIGNED NOT NULL AUTO_INCREMENT,
   user_id mediumint UNSIGNED NOT NULL,
   product_id mediumint UNSIGNED NOT NULL,
   active tinyint NOT NULL DEFAULT 1,
   rating enum ('1', '2', '3', '4', '5') DEFAULT NULL,
   comment text DEFAULT NULL,
   created_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
   updated_data timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
   PRIMARY KEY (rating_id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 805101,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_bin;

-- -----------------------------------------------------------------------------
-- Create foreign keys
ALTER TABLE product
ADD CONSTRAINT FK_product_category_id FOREIGN KEY (category_id)
REFERENCES category (category_id);

ALTER TABLE wireless_network_card
ADD CONSTRAINT FK_wireless_network_card_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE wired_network_card
ADD CONSTRAINT FK_wired_network_card_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE video_card
ADD CONSTRAINT FK_video_card_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE ups
ADD CONSTRAINT FK_ups_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE thermal_paste
ADD CONSTRAINT FK_thermal_paste_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE speakers
ADD CONSTRAINT FK_speakers_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE sound_card
ADD CONSTRAINT FK_sound_card_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE software
ADD CONSTRAINT FK_software_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE power_supply
ADD CONSTRAINT FK_power_supply_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE pc_case
ADD CONSTRAINT FK_pc_case_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE os
ADD CONSTRAINT FK_os_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE optical_drive
ADD CONSTRAINT FK_optical_drive_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE mouse
ADD CONSTRAINT FK_mouse_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE motherboard
ADD CONSTRAINT FK_motherboard_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE monitor
ADD CONSTRAINT FK_monitor_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE memory
ADD CONSTRAINT FK_memory_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE keyboard
ADD CONSTRAINT FK_keyboard_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE internal_harddrive
ADD CONSTRAINT FK_internal_harddrive_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE headphones
ADD CONSTRAINT FK_headphones_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE fan_controller
ADD CONSTRAINT FK_fan_controller_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE external_harddrive
ADD CONSTRAINT FK_external_harddrive_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE cpu_cooler
ADD CONSTRAINT FK_cpu_cooler_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE cpu
ADD CONSTRAINT FK_cpu_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE case_fan
ADD CONSTRAINT FK_case_fan_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE case_accessory
ADD CONSTRAINT FK_case_accessory_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE build
ADD CONSTRAINT FK_build_user_id FOREIGN KEY (user_id)
REFERENCES user (user_id);

ALTER TABLE build_product
ADD CONSTRAINT FK_build_product_build_id FOREIGN KEY (build_id)
REFERENCES build (build_id);

ALTER TABLE build_product
ADD CONSTRAINT FK_build_product_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE product_rating
ADD CONSTRAINT FK_product_rating_product_id FOREIGN KEY (product_id)
REFERENCES product (product_id);

ALTER TABLE product_rating
ADD CONSTRAINT FK_product_rating_user_id FOREIGN KEY (user_id)
REFERENCES user (user_id);

-- -----------------------------------------------------------------------------
-- Enable foreign keys
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;

-- -----------------------------------------------------------------------------
-- End of Script
