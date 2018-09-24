ALTER TABLE "subscription$persondocument_person" ADD CONSTRAINT "uniq_subscription$persondocument_person_subscription$persondocumentid" UNIQUE ("subscription$persondocumentid");
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_subscription$persondocument_person_subscription$persondocumentid', 
'4a64e3ce-96ed-4f41-aea4-225efb79a6c5', 
'88f253a2-4920-3ad7-845f-576aef625798');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20180924 21:45:33';
