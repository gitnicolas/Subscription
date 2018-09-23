ALTER TABLE "subscription$persondocument_person" DROP CONSTRAINT "uniq_subscription$persondocument_person_subscription$persondocumentid";
DROP INDEX "idx_subscription$persondocument_person_subscription$person_subscription$persondocument";
ALTER TABLE "subscription$persondocument_person" RENAME TO "bce5499fd51c45118ba26f75c77fd9fc";
DELETE FROM "mendixsystem$association" 
 WHERE "id" = '4a64e3ce-96ed-4f41-aea4-225efb79a6c5';
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_subscription$persondocument_person_subscription$persondocumentid';
CREATE TABLE "subscription$person_persondocument" (
	"subscription$personid" BIGINT NOT NULL,
	"subscription$persondocumentid" BIGINT NOT NULL,
	PRIMARY KEY("subscription$personid","subscription$persondocumentid"),
	CONSTRAINT "uniq_subscription$person_persondocument_subscription$personid" UNIQUE ("subscription$personid"));
CREATE INDEX "idx_subscription$person_persondocument_subscription$persondocument_subscription$person" ON "subscription$person_persondocument" ("subscription$persondocumentid" ASC,"subscription$personid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('2406e040-c999-4106-a10c-4de3dd3a0edc', 
'Subscription.Person_PersonDocument', 
'subscription$person_persondocument', 
'113d6398-8bfa-4180-bf89-504dd27f259f', 
'3a45cd11-3c19-4e16-a9d9-505bf5be9311', 
'subscription$personid', 
'subscription$persondocumentid', 
'idx_subscription$person_persondocument_subscription$persondocument_subscription$person');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_subscription$person_persondocument_subscription$personid', 
'2406e040-c999-4106-a10c-4de3dd3a0edc', 
'11a66f16-3a75-3db6-8371-9d534bfd45a7');
DROP TABLE "bce5499fd51c45118ba26f75c77fd9fc";
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20180922 23:12:16';
