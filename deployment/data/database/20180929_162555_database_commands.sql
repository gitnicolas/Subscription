ALTER TABLE "subscription$person" ADD "phone" VARCHAR_IGNORECASE(32) NULL;
ALTER TABLE "subscription$person" ADD CONSTRAINT "uniq_subscription$person_phone" UNIQUE ("phone");
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('303a4b11-4add-45f1-8083-0a3ec8dd6ca6', 
'113d6398-8bfa-4180-bf89-504dd27f259f', 
'Phone', 
'phone', 
30, 
32, 
'', 
false);
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_subscription$person_phone', 
'113d6398-8bfa-4180-bf89-504dd27f259f', 
'303a4b11-4add-45f1-8083-0a3ec8dd6ca6');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20180929 16:25:53';
