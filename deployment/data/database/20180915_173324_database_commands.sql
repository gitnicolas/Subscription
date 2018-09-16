ALTER TABLE "subscription$person_foodpreference" DROP CONSTRAINT "uniq_subscription$person_foodpreference_subscription$personid";
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_subscription$person_foodpreference_subscription$personid';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20180915 17:33:22';
