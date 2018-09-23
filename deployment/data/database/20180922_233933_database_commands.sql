ALTER TABLE "subscription$person_persondocument" DROP CONSTRAINT "uniq_subscription$person_persondocument_subscription$personid";
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_subscription$person_persondocument_subscription$personid';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20180922 23:39:31';
