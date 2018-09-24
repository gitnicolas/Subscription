ALTER TABLE "subscription$persondocument_person" DROP CONSTRAINT "uniq_subscription$persondocument_person_subscription$persondocumentid";
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_subscription$persondocument_person_subscription$persondocumentid';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20180924 21:41:02';
