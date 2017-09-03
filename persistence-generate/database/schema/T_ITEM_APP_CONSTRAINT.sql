ALTER TABLE "T_ITEM_APP" MODIFY ("ID" NOT NULL ENABLE);
ALTER TABLE "T_ITEM_APP" MODIFY ("CODE" NOT NULL ENABLE);
ALTER TABLE "T_ITEM_APP" MODIFY ("LABEL" NOT NULL ENABLE);
ALTER TABLE "T_ITEM_APP" MODIFY ("VALUE" NOT NULL ENABLE);
ALTER TABLE "T_ITEM_APP" MODIFY ("ACTIVE" NOT NULL ENABLE);
ALTER TABLE "T_ITEM_APP" MODIFY ("START_DATE" NOT NULL ENABLE);
ALTER TABLE "T_ITEM_APP" MODIFY ("AUDIT_TIME" NOT NULL ENABLE);

ALTER TABLE "T_ITEM_APP" ADD CONSTRAINT "T_ITEM_ID_PK" PRIMARY KEY ("ID");

ALTER TABLE "T_ITEM_APP" ADD CONSTRAINT "T_ITEM_ACTIVE_CK" CHECK ("ACTIVE" in (0,1));

ALTER TABLE "T_ITEM_APP" ADD CONSTRAINT "T_ITEM_CODE_UK" UNIQUE ("CODE");
