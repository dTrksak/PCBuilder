--NOTE from William:
--This is a schema rip from the database after running pc_build_database_script.sql
--This file only contains tables, does not create a database, must create database pc_build first.

-- MariaDB dump 10.17  Distrib 10.4.6-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: pc_build
-- ------------------------------------------------------
-- Server version	10.4.6-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `build`
--

DROP TABLE IF EXISTS `build`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `build` (
  `build_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` mediumint(8) unsigned NOT NULL,
  `active` tinyint(1) NOT NULL DEFAULT 1,
  `created_date` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_data` timestamp NULL DEFAULT NULL ON UPDATE current_timestamp(),
  PRIMARY KEY (`build_id`),
  KEY `FK_build_user_id` (`user_id`),
  CONSTRAINT `FK_build_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=450101 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `build_product`
--

DROP TABLE IF EXISTS `build_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `build_product` (
  `build_product_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `build_id` mediumint(8) unsigned NOT NULL,
  `product_id` mediumint(8) unsigned NOT NULL,
  PRIMARY KEY (`build_product_id`),
  KEY `FK_build_product_build_id` (`build_id`),
  KEY `FK_build_product_product_id` (`product_id`),
  CONSTRAINT `FK_build_product_build_id` FOREIGN KEY (`build_id`) REFERENCES `build` (`build_id`),
  CONSTRAINT `FK_build_product_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=605101 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `case_accessory`
--

DROP TABLE IF EXISTS `case_accessory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `case_accessory` (
  `case_accesssory_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` mediumint(8) unsigned NOT NULL,
  `acc_type` enum('LED Controller','Card Reader') DEFAULT NULL,
  `form_factor` double unsigned DEFAULT NULL,
  PRIMARY KEY (`case_accesssory_id`),
  KEY `FK_case_accessory_product_id` (`product_id`),
  CONSTRAINT `FK_case_accessory_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=265109 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=2048;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `case_fan`
--

DROP TABLE IF EXISTS `case_fan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `case_fan` (
  `case_fan_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` mediumint(8) unsigned NOT NULL,
  `mm_size` tinyint(3) unsigned DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  `rpm` varchar(50) DEFAULT NULL,
  `airflow` varchar(50) DEFAULT NULL,
  `noise_level` varchar(50) DEFAULT NULL,
  `pwm_4_pin` enum('Yes','No') DEFAULT NULL,
  PRIMARY KEY (`case_fan_id`),
  KEY `FK_case_fan_product_id` (`product_id`),
  CONSTRAINT `FK_case_fan_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=271593 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=87;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `category_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `category_name` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=100126 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=655;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `cpu`
--

DROP TABLE IF EXISTS `cpu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cpu` (
  `cpu_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` mediumint(8) unsigned NOT NULL,
  `core_count` tinyint(3) unsigned DEFAULT NULL,
  `core_clock` varchar(10) DEFAULT NULL,
  `boost_clock` varchar(10) DEFAULT NULL,
  `tdp` varchar(50) DEFAULT NULL,
  `integrated_graphics` varchar(50) DEFAULT NULL,
  `smt` enum('Yes','No') DEFAULT NULL,
  PRIMARY KEY (`cpu_id`),
  KEY `FK_cpu_product_id` (`product_id`),
  CONSTRAINT `FK_cpu_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=276314 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=13;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `cpu_cooler`
--

DROP TABLE IF EXISTS `cpu_cooler`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cpu_cooler` (
  `cpu_cooler_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` mediumint(8) unsigned NOT NULL,
  `fan_rpm` varchar(50) DEFAULT NULL,
  `noise_level` varchar(50) DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  `radiator_size` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cpu_cooler_id`),
  KEY `FK_cpu_cooler_product_id` (`product_id`),
  CONSTRAINT `FK_cpu_cooler_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=281212 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=88;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `external_harddrive`
--

DROP TABLE IF EXISTS `external_harddrive`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `external_harddrive` (
  `external_harddrive_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` mediumint(8) unsigned NOT NULL,
  `hardrive_type` enum('Portable','Desktop') DEFAULT NULL,
  `interface` varchar(255) DEFAULT NULL,
  `capacity` varchar(50) DEFAULT NULL,
  `price_per_gb` double DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`external_harddrive_id`),
  KEY `FK_external_harddrive_product_id` (`product_id`),
  CONSTRAINT `FK_external_harddrive_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=285420 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=154;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `fan_controller`
--

DROP TABLE IF EXISTS `fan_controller`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fan_controller` (
  `fan_controller_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` mediumint(8) unsigned NOT NULL,
  `channels` tinyint(3) unsigned DEFAULT NULL,
  `channel_wattage` varchar(10) DEFAULT NULL,
  `pwm_4_pin` enum('Yes','No') DEFAULT NULL,
  `form_factor` varchar(20) DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`fan_controller_id`),
  KEY `FK_fan_controller_product_id` (`product_id`),
  CONSTRAINT `FK_fan_controller_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=290143 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `headphones`
--

DROP TABLE IF EXISTS `headphones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `headphones` (
  `headphones_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` mediumint(8) unsigned NOT NULL,
  `headphones_type` enum('Circumaural','Earbud','In Ear','Supra-aural') DEFAULT NULL,
  `frequency_response` varchar(50) DEFAULT NULL,
  `microphone` enum('Yes','No') DEFAULT NULL,
  `wireless` enum('Yes','No') DEFAULT NULL,
  `enclosure_type` enum('Closed','Open','Semi-Open') DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`headphones_id`),
  KEY `FK_headphones_product_id` (`product_id`),
  CONSTRAINT `FK_headphones_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=301564 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=71;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `internal_harddrive`
--

DROP TABLE IF EXISTS `internal_harddrive`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `internal_harddrive` (
  `internal_harddrive_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` mediumint(8) unsigned NOT NULL,
  `capacity` varchar(10) DEFAULT NULL,
  `price_per_gb` double DEFAULT NULL,
  `harddrive_type` varchar(50) DEFAULT NULL,
  `cache` varchar(255) DEFAULT NULL,
  `form_factor` varchar(50) DEFAULT NULL,
  `interface` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`internal_harddrive_id`),
  KEY `FK_internal_harddrive_product_id` (`product_id`),
  CONSTRAINT `FK_internal_harddrive_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=303889 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=77;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `keyboard`
--

DROP TABLE IF EXISTS `keyboard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `keyboard` (
  `keyboard_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` mediumint(8) unsigned NOT NULL,
  `style` enum('Ergonomic','Gaming','Mini','Slim','Standard') DEFAULT NULL,
  `switch_type` varchar(50) DEFAULT NULL,
  `backlit` varchar(50) DEFAULT NULL,
  `tenkeyless` enum('No','Yes') DEFAULT NULL,
  `connection_type` enum('Bluetooth Wireless','Wired','Wireless') DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`keyboard_id`),
  KEY `FK_keyboard_product_id` (`product_id`),
  CONSTRAINT `FK_keyboard_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=312364 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=65;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `memory`
--

DROP TABLE IF EXISTS `memory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `memory` (
  `memory_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` mediumint(8) unsigned NOT NULL,
  `speed` varchar(50) DEFAULT NULL,
  `memory_type` varchar(50) DEFAULT NULL,
  `modules` varchar(50) DEFAULT NULL,
  `price_per_gb` double DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  `cas_latency` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`memory_id`),
  KEY `FK_memory_product_id` (`product_id`),
  CONSTRAINT `FK_memory_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=322252 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=221;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `monitor`
--

DROP TABLE IF EXISTS `monitor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `monitor` (
  `monitor_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` mediumint(8) unsigned NOT NULL,
  `screen_size` varchar(50) DEFAULT NULL,
  `resolution` varchar(50) DEFAULT NULL,
  `refresh_rate` varchar(10) DEFAULT NULL,
  `response_time_(g2g)` varchar(10) DEFAULT NULL,
  `panel_type` varchar(10) DEFAULT NULL,
  `aspect_ratio` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`monitor_id`),
  KEY `FK_monitor_product_id` (`product_id`),
  CONSTRAINT `FK_monitor_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=327869 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=82;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `motherboard`
--

DROP TABLE IF EXISTS `motherboard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `motherboard` (
  `motherboard_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` mediumint(8) unsigned NOT NULL,
  `socket_per_cpu` varchar(50) DEFAULT NULL,
  `form_factor` varchar(50) DEFAULT NULL,
  `ram_slots` tinyint(4) DEFAULT NULL,
  `max_ram` varchar(50) DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`motherboard_id`),
  KEY `FK_motherboard_product_id` (`product_id`),
  CONSTRAINT `FK_motherboard_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=333141 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=75;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `mouse`
--

DROP TABLE IF EXISTS `mouse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mouse` (
  `mouse_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` mediumint(8) unsigned NOT NULL,
  `tracking_method` enum('Optical','Laser','Touchpad','Trackball') DEFAULT NULL,
  `connection_type` enum('Bluetooth Wireless','Wired','Wireless') DEFAULT NULL,
  `maximum_dpi` smallint(6) DEFAULT NULL,
  `hand_orientation` enum('Right','Left','Both') DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`mouse_id`),
  KEY `FK_mouse_product_id` (`product_id`),
  CONSTRAINT `FK_mouse_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=337049 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `optical_drive`
--

DROP TABLE IF EXISTS `optical_drive`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `optical_drive` (
  `optical_drive_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` mediumint(8) unsigned NOT NULL,
  `bd` tinyint(3) unsigned DEFAULT NULL,
  `dvd` tinyint(3) unsigned DEFAULT NULL,
  `cd` tinyint(4) DEFAULT NULL,
  `bd_write` varchar(50) DEFAULT NULL,
  `dvd_write` varchar(50) DEFAULT NULL,
  `cd_write` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`optical_drive_id`),
  KEY `FK_optical_drive_product_id` (`product_id`),
  CONSTRAINT `FK_optical_drive_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=340318 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=75;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `os`
--

DROP TABLE IF EXISTS `os`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `os` (
  `os_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` mediumint(8) unsigned NOT NULL,
  `os_type` enum('Windows','iOS','Android','Linux') DEFAULT NULL,
  `mode` enum('64-bit','32-bit','32/64-bit') DEFAULT NULL,
  `max_memory` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`os_id`),
  KEY `FK_os_product_id` (`product_id`),
  CONSTRAINT `FK_os_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=345157 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=292;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `pc_case`
--

DROP TABLE IF EXISTS `pc_case`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pc_case` (
  `case_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` mediumint(8) unsigned NOT NULL,
  `case_type` varchar(50) DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  `power_supply` varchar(50) DEFAULT NULL,
  `side_panel_window` varchar(50) DEFAULT NULL,
  `external_bays` tinyint(3) unsigned DEFAULT NULL,
  `internal_bays` tinyint(3) unsigned DEFAULT NULL,
  PRIMARY KEY (`case_id`),
  KEY `FK_pc_case_product_id` (`product_id`),
  CONSTRAINT `FK_pc_case_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=258980 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=80;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `power_supply`
--

DROP TABLE IF EXISTS `power_supply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `power_supply` (
  `power_supply_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` mediumint(8) unsigned NOT NULL,
  `form_factor` varchar(50) DEFAULT NULL,
  `efficiency_rating` varchar(50) DEFAULT NULL,
  `wattage` varchar(255) DEFAULT NULL,
  `modular` enum('Full','No','Semi') DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`power_supply_id`),
  KEY `FK_power_supply_product_id` (`product_id`),
  CONSTRAINT `FK_power_supply_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=352128 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=64;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `product_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `category_id` mediumint(8) unsigned NOT NULL,
  `product_name` varchar(100) DEFAULT NULL,
  `product_price` double unsigned DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  KEY `FK_product_category_id` (`category_id`),
  CONSTRAINT `FK_product_category_id` FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=144474 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=66;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `software`
--

DROP TABLE IF EXISTS `software`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `software` (
  `software_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` mediumint(8) unsigned NOT NULL,
  `software_type` varchar(50) DEFAULT NULL,
  `media_type` enum('Download','CD/DVD','Product Key Card') DEFAULT NULL,
  PRIMARY KEY (`software_id`),
  KEY `FK_software_product_id` (`product_id`),
  CONSTRAINT `FK_software_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=355244 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=114;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `sound_card`
--

DROP TABLE IF EXISTS `sound_card`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sound_card` (
  `sound_card_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` mediumint(8) unsigned NOT NULL,
  `channels` enum('2.0','4.0','5.1','7.1') DEFAULT NULL,
  `digital_audio` enum('24-bit','16-bit','32-bit') DEFAULT NULL,
  `snr` varchar(50) DEFAULT NULL,
  `sample_rate` varchar(50) DEFAULT NULL,
  `chipset` varchar(50) DEFAULT NULL,
  `interface` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`sound_card_id`),
  KEY `FK_sound_card_product_id` (`product_id`),
  CONSTRAINT `FK_sound_card_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=360172 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=230;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `speakers`
--

DROP TABLE IF EXISTS `speakers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `speakers` (
  `speakers_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` mediumint(8) unsigned NOT NULL,
  `configuration` enum('1.0','2.0','2.1','5.1') DEFAULT NULL,
  `total_wattage` varchar(50) DEFAULT NULL,
  `frequency_response` varchar(50) DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`speakers_id`),
  KEY `FK_speakers_product_id` (`product_id`),
  CONSTRAINT `FK_speakers_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=365296 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=16384;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `thermal_paste`
--

DROP TABLE IF EXISTS `thermal_paste`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `thermal_paste` (
  `thermal_paste_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` mediumint(8) unsigned NOT NULL,
  `amount` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`thermal_paste_id`),
  KEY `FK_thermal_paste_product_id` (`product_id`),
  CONSTRAINT `FK_thermal_paste_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=370204 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=159;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `ups`
--

DROP TABLE IF EXISTS `ups`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ups` (
  `ups_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` mediumint(8) unsigned NOT NULL,
  `capacity_w` smallint(5) unsigned DEFAULT NULL,
  `capacity_va` smallint(5) unsigned DEFAULT NULL,
  PRIMARY KEY (`ups_id`),
  KEY `FK_ups_product_id` (`product_id`),
  CONSTRAINT `FK_ups_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=375759 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=74;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `user_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `first_name` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=250101 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `video_card`
--

DROP TABLE IF EXISTS `video_card`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `video_card` (
  `video_card_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` mediumint(8) unsigned NOT NULL,
  `chipset` varchar(50) DEFAULT NULL,
  `memory` varchar(50) DEFAULT NULL,
  `core_clock` varchar(50) DEFAULT NULL,
  `boost_clock` varchar(50) DEFAULT NULL,
  `interface` varchar(50) DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`video_card_id`),
  KEY `FK_video_card_product_id` (`product_id`),
  CONSTRAINT `FK_video_card_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=384276 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=93;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `wired_network_card`
--

DROP TABLE IF EXISTS `wired_network_card`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wired_network_card` (
  `wired_network_card_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` mediumint(8) unsigned NOT NULL,
  `interface` varchar(50) DEFAULT NULL,
  `ports` varchar(50) DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`wired_network_card_id`),
  KEY `FK_wired_network_card_product_id` (`product_id`),
  CONSTRAINT `FK_wired_network_card_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=390222 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=135;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `wireless_network_card`
--

DROP TABLE IF EXISTS `wireless_network_card`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wireless_network_card` (
  `wireless_network_card_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` mediumint(8) unsigned NOT NULL,
  `protocol` varchar(50) DEFAULT NULL,
  `interface` varchar(50) DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`wireless_network_card_id`),
  KEY `FK_wireless_network_card_product_id` (`product_id`),
  CONSTRAINT `FK_wireless_network_card_product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=395404 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=54;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-18 20:51:18
