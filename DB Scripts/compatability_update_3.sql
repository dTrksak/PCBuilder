-- Change cpu tdp_wattage from a string to an int
ALTER TABLE cpu ADD tdp int;
UPDATE cpu SET tdp = CAST(tdp_wattage AS DOUBLE);
ALTER TABLE cpu DROP COLUMN tdp_wattage;
ALTER TABLE cpu rename COLUMN tdp to tdp_wattage;

-- Change video_card tdp_wattage from a string to an int
ALTER TABLE video_card ADD tdp int;
UPDATE video_card SET tdp = CAST(tdp_wattage AS DOUBLE);
ALTER TABLE video_card DROP COLUMN tdp_wattage;
ALTER TABLE video_card rename COLUMN tdp to tdp_wattage;

-- Change power_supply wattage string to total_wattage int
ALTER TABLE power_supply ADD tdp int;
UPDATE power_supply SET tdp = CAST(SUBSTRING(wattage, 1, 3) AS DOUBLE);
ALTER TABLE power_supply DROP COLUMN wattage;
ALTER TABLE power_supply rename COLUMN tdp to total_wattage;

-- add mode column to table cpu
ALTER TABLE cpu
ADD COLUMN mode VARCHAR(20) DEFAULT NULL;

-- randomly populate column mode on table cpu
UPDATE cpu
SET mode = (CASE floor(rand()*3) 
         WHEN 0 THEN '64-bit'
         WHEN 1 THEN '32-bit'
         WHEN 2 THEN '32/64-bit'
         END);

-- randomly populate column `socket_type` on table `cpu`
UPDATE cpu
SET socket_type = (CASE floor(rand()*8) 
		WHEN 0 THEN 'AM4'
		WHEN 1 THEN 'BGA1440'
		WHEN 2 THEN 'FP5'
		WHEN 3 THEN 'LGA1151'
		WHEN 4 THEN 'LGA1200'
		WHEN 5 THEN 'LGA2066'
		WHEN 6 THEN 'sTRX4'
		WHEN 7 THEN 'TR4'
         END);