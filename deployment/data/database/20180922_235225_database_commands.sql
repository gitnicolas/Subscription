DROP INDEX "idx_subscription$person_persondocument_subscription$persondocument_subscription$person";
ALTER TABLE "subscription$person_persondocument" RENAME TO "2f9729ecfb3e4c89b996238d4e063c6d";
DELETE FROM "mendixsystem$association" 
 WHERE "id" = '2406e040-c999-4106-a10c-4de3dd3a0edc';
CREATE TABLE "subscription$persondocument_person" (
	"subscription$persondocumentid" BIGINT NOT NULL,
	"subscription$personid" BIGINT NOT NULL,
	PRIMARY KEY("subscription$persondocumentid","subscription$personid"),
	CONSTRAINT "uniq_subscription$persondocument_person_subscription$persondocumentid" UNIQUE ("subscription$persondocumentid"));
CREATE INDEX "idx_subscription$persondocument_person_subscription$person_subscription$persondocument" ON "subscription$persondocument_person" ("subscription$personid" ASC,"subscription$persondocumentid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('4a64e3ce-96ed-4f41-aea4-225efb79a6c5', 
'Subscription.PersonDocument_Person', 
'subscription$persondocument_person', 
'3a45cd11-3c19-4e16-a9d9-505bf5be9311', 
'113d6398-8bfa-4180-bf89-504dd27f259f', 
'subscription$persondocumentid', 
'subscription$personid', 
'idx_subscription$persondocument_person_subscription$person_subscription$persondocument');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_subscription$persondocument_person_subscription$persondocumentid', 
'4a64e3ce-96ed-4f41-aea4-225efb79a6c5', 
'88f253a2-4920-3ad7-845f-576aef625798');
DROP TABLE "2f9729ecfb3e4c89b996238d4e063c6d";
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20180922 23:52:22';
