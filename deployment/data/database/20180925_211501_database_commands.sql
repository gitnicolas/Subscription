ALTER TABLE "subscription$persondocument" RENAME TO "43f91a601b9940be8d47b603d3f95c81";
ALTER TABLE "subscription$persondocument_person" DROP CONSTRAINT "uniq_subscription$persondocument_person_subscription$persondocumentid";
DROP INDEX "idx_subscription$persondocument_person_subscription$person_subscription$persondocument";
ALTER TABLE "subscription$persondocument_person" RENAME TO "15354ee0e94743adb5c0b92c82b79ea3";
DELETE FROM "mendixsystem$entity" 
 WHERE "id" = '3a45cd11-3c19-4e16-a9d9-505bf5be9311';
DELETE FROM "mendixsystem$entityidentifier" 
 WHERE "id" = '3a45cd11-3c19-4e16-a9d9-505bf5be9311';
DELETE FROM "mendixsystem$sequence" 
 WHERE "attribute_id" IN (SELECT "id"
 FROM "mendixsystem$attribute"
 WHERE "entity_id" = '3a45cd11-3c19-4e16-a9d9-505bf5be9311');
DELETE FROM "mendixsystem$attribute" 
 WHERE "entity_id" = '3a45cd11-3c19-4e16-a9d9-505bf5be9311';
DELETE FROM "mendixsystem$association" 
 WHERE "id" = '4a64e3ce-96ed-4f41-aea4-225efb79a6c5';
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_subscription$persondocument_person_subscription$persondocumentid';
DELETE FROM "system$filedocument" 
 WHERE "id" IN (SELECT "id"
 FROM "43f91a601b9940be8d47b603d3f95c81");
DROP TABLE "43f91a601b9940be8d47b603d3f95c81";
DROP TABLE "15354ee0e94743adb5c0b92c82b79ea3";
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20180925 21:14:59';
