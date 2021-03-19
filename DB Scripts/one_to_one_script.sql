
-- Set default database
USE pc_build;

-------------------------------------------------------------------------------
-- table `case_accessory`
ALTER TABLE case_accessory -- Drop foreign key
   DROP FOREIGN KEY FK_case_accessory_product_id;

ALTER TABLE case_accessory -- Drop index
   DROP INDEX FK_case_accessory_product_id;

ALTER TABLE case_accessory -- Alter column `product_id` on table `case_accessory`
  CHANGE COLUMN product_id product_id MEDIUMINT UNSIGNED NOT NULL UNIQUE;

ALTER TABLE case_accessory -- Create foreign key
  ADD CONSTRAINT FK_case_accessory_product_id FOREIGN KEY (product_id)
    REFERENCES product(product_id);
	
-------------------------------------------------------------------------------
-- table `case_fan`
ALTER TABLE case_fan -- Drop foreign key
   DROP FOREIGN KEY FK_case_fan_product_id;

ALTER TABLE case_fan -- Drop index
   DROP INDEX FK_case_fan_product_id;

-- `product_id` on table `case_fan`
--
ALTER TABLE case_fan -- Alter column
  CHANGE COLUMN product_id product_id MEDIUMINT UNSIGNED NOT NULL UNIQUE;

ALTER TABLE case_fan -- Create foreign key
  ADD CONSTRAINT FK_case_fan_product_id FOREIGN KEY (product_id)
    REFERENCES product(product_id);

ALTER TABLE cpu -- Drop foreign key
   DROP FOREIGN KEY FK_cpu_product_id;

-------------------------------------------------------------------------------
-- table `cpu`
--
ALTER TABLE cpu -- Drop index 
   DROP INDEX FK_cpu_product_id;

ALTER TABLE cpu -- Alter column 
  CHANGE COLUMN product_id product_id MEDIUMINT UNSIGNED NOT NULL UNIQUE;


ALTER TABLE cpu -- Create foreign key
  ADD CONSTRAINT FK_cpu_product_id FOREIGN KEY (product_id)
    REFERENCES product(product_id);
	
-------------------------------------------------------------------------------

-- table `cpu_cooler`
ALTER TABLE cpu_cooler -- Drop foreign key
   DROP FOREIGN KEY FK_cpu_cooler_product_id;

--
-- Drop index `FK_cpu_cooler_product_id` from 
--
ALTER TABLE cpu_cooler 
   DROP INDEX FK_cpu_cooler_product_id;

--
-- Alter column `product_id` on table `cpu_cooler`
--
ALTER TABLE cpu_cooler 
  CHANGE COLUMN product_id product_id MEDIUMINT UNSIGNED NOT NULL UNIQUE;

--
-- Create foreign key
--
ALTER TABLE cpu_cooler 
  ADD CONSTRAINT FK_cpu_cooler_product_id FOREIGN KEY (product_id)
    REFERENCES product(product_id);
	
-------------------------------------------------------------------------------

--
-- Drop foreign key
--
ALTER TABLE external_harddrive 
   DROP FOREIGN KEY FK_external_harddrive_product_id;

--
-- Drop index `FK_external_harddrive_product_id` from table `external_harddrive`
--
ALTER TABLE external_harddrive 
   DROP INDEX FK_external_harddrive_product_id;

--
-- Alter column `product_id` on table `external_harddrive`
--
ALTER TABLE external_harddrive 
  CHANGE COLUMN product_id product_id MEDIUMINT UNSIGNED NOT NULL UNIQUE;

--
-- Create foreign key
--
ALTER TABLE external_harddrive 
  ADD CONSTRAINT FK_external_harddrive_product_id FOREIGN KEY (product_id)
    REFERENCES product(product_id);
	
-------------------------------------------------------------------------------

--
-- Drop foreign key
--
ALTER TABLE fan_controller 
   DROP FOREIGN KEY FK_fan_controller_product_id;

--
-- Drop index `FK_fan_controller_product_id` from table `fan_controller`
--
ALTER TABLE fan_controller 
   DROP INDEX FK_fan_controller_product_id;

--
-- Alter column `product_id` on table `fan_controller`
--
ALTER TABLE fan_controller 
  CHANGE COLUMN product_id product_id MEDIUMINT UNSIGNED NOT NULL UNIQUE;

--
-- Create foreign key
--
ALTER TABLE fan_controller 
  ADD CONSTRAINT FK_fan_controller_product_id FOREIGN KEY (product_id)
    REFERENCES product(product_id);
	
-------------------------------------------------------------------------------

--
-- Drop foreign key
--
ALTER TABLE headphones 
   DROP FOREIGN KEY FK_headphones_product_id;

--
-- Drop index `FK_headphones_product_id` from table `headphones`
--
ALTER TABLE headphones 
   DROP INDEX FK_headphones_product_id;

--
-- Alter column `product_id` on table `headphones`
--
ALTER TABLE headphones 
  CHANGE COLUMN product_id product_id MEDIUMINT UNSIGNED NOT NULL UNIQUE;

--
-- Create foreign key
--
ALTER TABLE headphones 
  ADD CONSTRAINT FK_headphones_product_id FOREIGN KEY (product_id)
    REFERENCES product(product_id);
	
-------------------------------------------------------------------------------

--
-- Drop foreign key
--
ALTER TABLE internal_harddrive 
   DROP FOREIGN KEY FK_internal_harddrive_product_id;

--
-- Drop index `FK_internal_harddrive_product_id` from table `internal_harddrive`
--
ALTER TABLE internal_harddrive 
   DROP INDEX FK_internal_harddrive_product_id;

--
-- Alter column `product_id` on table `internal_harddrive`
--
ALTER TABLE internal_harddrive 
  CHANGE COLUMN product_id product_id MEDIUMINT UNSIGNED NOT NULL UNIQUE;

--
-- Create foreign key
--
ALTER TABLE internal_harddrive 
  ADD CONSTRAINT FK_internal_harddrive_product_id FOREIGN KEY (product_id)
    REFERENCES product(product_id);
	
-------------------------------------------------------------------------------

--
-- Drop foreign key
--
ALTER TABLE keyboard 
   DROP FOREIGN KEY FK_keyboard_product_id;

--
-- Drop index `FK_keyboard_product_id` from table `keyboard`
--
ALTER TABLE keyboard 
   DROP INDEX FK_keyboard_product_id;

--
-- Alter column `product_id` on table `keyboard`
--
ALTER TABLE keyboard 
  CHANGE COLUMN product_id product_id MEDIUMINT UNSIGNED NOT NULL UNIQUE;

--
-- Create foreign key
--
ALTER TABLE keyboard 
  ADD CONSTRAINT FK_keyboard_product_id FOREIGN KEY (product_id)
    REFERENCES product(product_id);
	
-------------------------------------------------------------------------------

--
-- Drop foreign key
--
ALTER TABLE memory 
   DROP FOREIGN KEY FK_memory_product_id;

--
-- Drop index `FK_memory_product_id` from table `memory`
--
ALTER TABLE memory 
   DROP INDEX FK_memory_product_id;

--
-- Alter column `product_id` on table `memory`
--
ALTER TABLE memory 
  CHANGE COLUMN product_id product_id MEDIUMINT UNSIGNED NOT NULL UNIQUE;

--
-- Create foreign key
--
ALTER TABLE memory 
  ADD CONSTRAINT FK_memory_product_id FOREIGN KEY (product_id)
    REFERENCES product(product_id);

-------------------------------------------------------------------------------
--
-- Drop foreign key
--
ALTER TABLE monitor 
   DROP FOREIGN KEY FK_monitor_product_id;

--
-- Drop index `FK_monitor_product_id` from table `monitor`
--
ALTER TABLE monitor 
   DROP INDEX FK_monitor_product_id;

--
-- Alter column `product_id` on table `monitor`
--
ALTER TABLE monitor 
  CHANGE COLUMN product_id product_id MEDIUMINT UNSIGNED NOT NULL UNIQUE;

--
-- Create foreign key
--
ALTER TABLE monitor 
  ADD CONSTRAINT FK_monitor_product_id FOREIGN KEY (product_id)
    REFERENCES product(product_id);
	
--
-------------------------------------------------------------------------------

--
-- Drop foreign key
--
ALTER TABLE motherboard 
   DROP FOREIGN KEY FK_motherboard_product_id;

--
-- Drop index `FK_motherboard_product_id` from table `motherboard`
--
ALTER TABLE motherboard 
   DROP INDEX FK_motherboard_product_id;

--
-- Alter column `product_id` on table `motherboard`
--
ALTER TABLE motherboard 
  CHANGE COLUMN product_id product_id MEDIUMINT UNSIGNED NOT NULL UNIQUE;

--
-- Create foreign key
--
ALTER TABLE motherboard 
  ADD CONSTRAINT FK_motherboard_product_id FOREIGN KEY (product_id)
    REFERENCES product(product_id);
	
-------------------------------------------------------------------------------

--
-- Drop foreign key
--
ALTER TABLE mouse 
   DROP FOREIGN KEY FK_mouse_product_id;

--
-- Drop index `FK_mouse_product_id` from table `mouse`
--
ALTER TABLE mouse 
   DROP INDEX FK_mouse_product_id;

--
-- Alter column `product_id` on table `mouse`
--
ALTER TABLE mouse 
  CHANGE COLUMN product_id product_id MEDIUMINT UNSIGNED NOT NULL UNIQUE;

--
-- Create foreign key
--
ALTER TABLE mouse 
  ADD CONSTRAINT FK_mouse_product_id FOREIGN KEY (product_id)
    REFERENCES product(product_id);
	
-------------------------------------------------------------------------------

--
-- Drop foreign key
--
ALTER TABLE optical_drive 
   DROP FOREIGN KEY FK_optical_drive_product_id;

--
-- Drop index `FK_optical_drive_product_id` from table `optical_drive`
--
ALTER TABLE optical_drive 
   DROP INDEX FK_optical_drive_product_id;

--
-- Alter column `product_id` on table `optical_drive`
--
ALTER TABLE optical_drive 
  CHANGE COLUMN product_id product_id MEDIUMINT UNSIGNED NOT NULL UNIQUE;

--
-- Create foreign key
--
ALTER TABLE optical_drive 
  ADD CONSTRAINT FK_optical_drive_product_id FOREIGN KEY (product_id)
    REFERENCES product(product_id);
	
-------------------------------------------------------------------------------

--
-- Drop foreign key
--
ALTER TABLE os 
   DROP FOREIGN KEY FK_os_product_id;

--
-- Drop index `FK_os_product_id` from table `os`
--
ALTER TABLE os 
   DROP INDEX FK_os_product_id;

--
-- Alter column `product_id` on table `os`
--
ALTER TABLE os 
  CHANGE COLUMN product_id product_id MEDIUMINT UNSIGNED NOT NULL UNIQUE;

--
-- Create foreign key
--
ALTER TABLE os 
  ADD CONSTRAINT FK_os_product_id FOREIGN KEY (product_id)
    REFERENCES product(product_id);
	
-------------------------------------------------------------------------------

--
-- Drop foreign key
--
ALTER TABLE pc_case 
   DROP FOREIGN KEY FK_pc_case_product_id;

--
-- Drop index `FK_pc_case_product_id` from table `pc_case`
--
ALTER TABLE pc_case 
   DROP INDEX FK_pc_case_product_id;

--
-- Alter column `product_id` on table `pc_case`
--
ALTER TABLE pc_case 
  CHANGE COLUMN product_id product_id MEDIUMINT UNSIGNED NOT NULL UNIQUE;

--
-- Create foreign key
--
ALTER TABLE pc_case 
  ADD CONSTRAINT FK_pc_case_product_id FOREIGN KEY (product_id)
    REFERENCES product(product_id);
	
-------------------------------------------------------------------------------

--
-- Drop foreign key
--
ALTER TABLE power_supply 
   DROP FOREIGN KEY FK_power_supply_product_id;

--
-- Drop index `FK_power_supply_product_id` from table `power_supply`
--
ALTER TABLE power_supply 
   DROP INDEX FK_power_supply_product_id;

--
-- Alter column `product_id` on table `power_supply`
--
ALTER TABLE power_supply 
  CHANGE COLUMN product_id product_id MEDIUMINT UNSIGNED NOT NULL UNIQUE;

--
-- Create foreign key
--
ALTER TABLE power_supply 
  ADD CONSTRAINT FK_power_supply_product_id FOREIGN KEY (product_id)
    REFERENCES product(product_id);
	
-------------------------------------------------------------------------------

--
-- Drop foreign key
--
ALTER TABLE software 
   DROP FOREIGN KEY FK_software_product_id;

--
-- Drop index `FK_software_product_id` from table `software`
--
ALTER TABLE software 
   DROP INDEX FK_software_product_id;

--
-- Alter column `product_id` on table `software`
--
ALTER TABLE software 
  CHANGE COLUMN product_id product_id MEDIUMINT UNSIGNED NOT NULL UNIQUE;

--
-- Create foreign key
--
ALTER TABLE software 
  ADD CONSTRAINT FK_software_product_id FOREIGN KEY (product_id)
    REFERENCES product(product_id);
	
-------------------------------------------------------------------------------

--
-- Drop foreign key
--
ALTER TABLE sound_card 
   DROP FOREIGN KEY FK_sound_card_product_id;

--
-- Drop index `FK_sound_card_product_id` from table `sound_card`
--
ALTER TABLE sound_card 
   DROP INDEX FK_sound_card_product_id;

--
-- Alter column `product_id` on table `sound_card`
--
ALTER TABLE sound_card 
  CHANGE COLUMN product_id product_id MEDIUMINT UNSIGNED NOT NULL UNIQUE;

--
-- Create foreign key
--
ALTER TABLE sound_card 
  ADD CONSTRAINT FK_sound_card_product_id FOREIGN KEY (product_id)
    REFERENCES product(product_id);
	
-------------------------------------------------------------------------------

--
-- Drop foreign key
--
ALTER TABLE speakers 
   DROP FOREIGN KEY FK_speakers_product_id;

--
-- Drop index `FK_speakers_product_id` from table `speakers`
--
ALTER TABLE speakers 
   DROP INDEX FK_speakers_product_id;

--
-- Alter column `product_id` on table `speakers`
--
ALTER TABLE speakers 
  CHANGE COLUMN product_id product_id MEDIUMINT UNSIGNED NOT NULL UNIQUE;

--
-- Create foreign key
--
ALTER TABLE speakers 
  ADD CONSTRAINT FK_speakers_product_id FOREIGN KEY (product_id)
    REFERENCES product(product_id);
	
-------------------------------------------------------------------------------
--
-- Drop foreign key `FK_thermal_paste_product_id` from table `thermal_paste`
--
ALTER TABLE thermal_paste 
   DROP FOREIGN KEY FK_thermal_paste_product_id;

--
-- Drop index
--
ALTER TABLE thermal_paste 
   DROP INDEX FK_thermal_paste_product_id;

--
-- Alter column `product_id` on table `thermal_paste`
--
ALTER TABLE thermal_paste 
  CHANGE COLUMN product_id product_id MEDIUMINT UNSIGNED NOT NULL UNIQUE;

--
-- Create foreign key
--
ALTER TABLE thermal_paste 
  ADD CONSTRAINT FK_thermal_paste_product_id FOREIGN KEY (product_id)
    REFERENCES product(product_id);

-------------------------------------------------------------------------------
--
-- Drop foreign key
--
ALTER TABLE ups 
   DROP FOREIGN KEY FK_ups_product_id;

--
-- Drop index `FK_ups_product_id` from table `ups`
--
ALTER TABLE ups 
   DROP INDEX FK_ups_product_id;

--
-- Alter column `product_id` on table `ups`
--
ALTER TABLE ups 
  CHANGE COLUMN product_id product_id MEDIUMINT UNSIGNED NOT NULL UNIQUE;

--
-- Create foreign key
--
ALTER TABLE ups 
  ADD CONSTRAINT FK_ups_product_id FOREIGN KEY (product_id)
    REFERENCES product(product_id);
	
-------------------------------------------------------------------------------

--
-- Drop foreign key
--
ALTER TABLE video_card 
   DROP FOREIGN KEY FK_video_card_product_id;

--
-- Drop index `FK_video_card_product_id` from table `video_card`
--
ALTER TABLE video_card 
   DROP INDEX FK_video_card_product_id;

--
-- Alter column `product_id` on table `video_card`
--
ALTER TABLE video_card 
  CHANGE COLUMN product_id product_id MEDIUMINT UNSIGNED NOT NULL UNIQUE;

--
-- Create foreign key
--
ALTER TABLE video_card 
  ADD CONSTRAINT FK_video_card_product_id FOREIGN KEY (product_id)
    REFERENCES product(product_id);
	
-------------------------------------------------------------------------------
-- Drop foreign key `FK_wired_network_card_product_id` from table `wired_network_card`
ALTER TABLE wired_network_card 
   DROP FOREIGN KEY FK_wired_network_card_product_id;

ALTER TABLE wired_network_card -- Drop index
   DROP INDEX FK_wired_network_card_product_id;

-- Alter column `product_id` on table `wired_network_card`
ALTER TABLE wired_network_card 
  CHANGE COLUMN product_id product_id MEDIUMINT UNSIGNED NOT NULL UNIQUE;

ALTER TABLE wired_network_card -- Create foreign key
  ADD CONSTRAINT FK_wired_network_card_product_id FOREIGN KEY (product_id)
    REFERENCES product(product_id);
	
-------------------------------------------------------------------------------	
-- Drop foreign key `FK_wireless_network_card_product_id` from table `wireless_network_card`
ALTER TABLE wireless_network_card 
   DROP FOREIGN KEY FK_wireless_network_card_product_id;

ALTER TABLE wireless_network_card -- Drop index 
   DROP INDEX FK_wireless_network_card_product_id;

-- Alter column `product_id` on table `wireless_network_card`
ALTER TABLE wireless_network_card 
  CHANGE COLUMN product_id product_id MEDIUMINT UNSIGNED NOT NULL UNIQUE;

ALTER TABLE wireless_network_card -- Create foreign key
  ADD CONSTRAINT FK_wireless_network_card_product_id FOREIGN KEY (product_id)
    REFERENCES product(product_id);