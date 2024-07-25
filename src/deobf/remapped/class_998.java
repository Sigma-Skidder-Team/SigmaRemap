package remapped;

public enum class_998 implements class_1372 {
   field_5142("SPAWN_ENTITY"),
   field_5152("SPAWN_EXPERIENCE_ORB"),
   field_5104("SPAWN_GLOBAL_ENTITY"),
   field_5095("SPAWN_MOB"),
   field_5112("SPAWN_PAINTING"),
   field_5129("SPAWN_PLAYER"),
   field_5110("ENTITY_ANIMATION"),
   field_5140("STATISTICS"),
   field_5151("BLOCK_BREAK_ANIMATION"),
   field_5134("BLOCK_ENTITY_DATA"),
   field_5124("BLOCK_ACTION"),
   field_5074("BLOCK_CHANGE"),
   field_5099("BOSSBAR"),
   field_5145("SERVER_DIFFICULTY"),
   field_5087("TAB_COMPLETE"),
   field_5108("CHAT_MESSAGE"),
   field_5149("MULTI_BLOCK_CHANGE"),
   field_5131("WINDOW_CONFIRMATION"),
   field_5137("CLOSE_WINDOW"),
   field_5130("OPEN_WINDOW"),
   field_5082("WINDOW_ITEMS"),
   field_5077("WINDOW_PROPERTY"),
   field_5146("SET_SLOT"),
   field_5098("COOLDOWN"),
   field_5089("PLUGIN_MESSAGE"),
   field_5097("NAMED_SOUND"),
   field_5096("DISCONNECT"),
   field_5115("ENTITY_STATUS"),
   field_5093("EXPLOSION"),
   field_5088("UNLOAD_CHUNK"),
   field_5091("GAME_EVENT"),
   field_5121("KEEP_ALIVE"),
   field_5128("CHUNK_DATA"),
   field_5102("EFFECT"),
   field_5141("SPAWN_PARTICLE"),
   field_5106("JOIN_GAME"),
   field_5155("MAP_DATA"),
   field_5084("ENTITY_MOVEMENT"),
   field_5094("ENTITY_POSITION"),
   field_5143("ENTITY_POSITION_AND_ROTATION"),
   field_5127("ENTITY_ROTATION"),
   field_5126("VEHICLE_MOVE"),
   field_5154("OPEN_SIGN_EDITOR"),
   field_5118("PLAYER_ABILITIES"),
   field_5133("COMBAT_EVENT"),
   field_5075("PLAYER_INFO"),
   field_5081("PLAYER_POSITION"),
   field_5132("USE_BED"),
   field_5135("UNLOCK_RECIPES"),
   field_5150("DESTROY_ENTITIES"),
   field_5119("REMOVE_ENTITY_EFFECT"),
   field_5125("RESOURCE_PACK"),
   field_5103("RESPAWN"),
   field_5078("ENTITY_HEAD_LOOK"),
   field_5086("SELECT_ADVANCEMENTS_TAB"),
   field_5105("WORLD_BORDER"),
   field_5120("CAMERA"),
   field_5147("HELD_ITEM_CHANGE"),
   field_5111("DISPLAY_SCOREBOARD"),
   field_5136("ENTITY_METADATA"),
   field_5113("ATTACH_ENTITY"),
   field_5107("ENTITY_VELOCITY"),
   field_5122("ENTITY_EQUIPMENT"),
   field_5148("SET_EXPERIENCE"),
   field_5123("UPDATE_HEALTH"),
   field_5076("SCOREBOARD_OBJECTIVE"),
   field_5085("SET_PASSENGERS"),
   field_5114("TEAMS"),
   field_5079("UPDATE_SCORE"),
   field_5092("SPAWN_POSITION"),
   field_5080("TIME_UPDATE"),
   field_5138("TITLE"),
   field_5083("SOUND"),
   field_5116("TAB_LIST"),
   field_5144("COLLECT_ITEM"),
   field_5117("ENTITY_TELEPORT"),
   field_5100("ADVANCEMENTS"),
   field_5153("ENTITY_PROPERTIES"),
   field_5090("ENTITY_EFFECT");

   public String field_5139;

   private class_998(String var3) {
      this.field_5139 = var3;
   }

   @Override
   public String method_31560() {
      return this.field_5139;
   }

   @Override
   public int method_31559() {
      for (int var3 = 0; var3 < values().length; var3++) {
         if (values()[var3] == this) {
            return var3;
         }
      }

      return 0;
   }
}
