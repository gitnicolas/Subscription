ALTER TABLE "subscription$enumeration" ADD "order" INT NULL;
UPDATE "subscription$enumeration"
 SET "order" = 0;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('f33e94e6-e402-42b1-bed8-ec167ffd1765', 
'f4f65128-c553-4ba3-8bc7-6c94c581778f', 
'Order', 
'order', 
3, 
0, 
'0', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20180915 18:09:51';
