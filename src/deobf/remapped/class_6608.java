package remapped;

public enum class_6608 implements class_1372 {
   field_34077("SPAWN_ENTITY"),
   field_34082("SPAWN_EXPERIENCE_ORB"),
   field_34083("SPAWN_MOB"),
   field_34139("SPAWN_PAINTING"),
   field_34116("SPAWN_PLAYER"),
   field_34102("ENTITY_ANIMATION"),
   field_34118("STATISTICS"),
   field_34115("ACKNOWLEDGE_PLAYER_DIGGING"),
   field_34112("BLOCK_BREAK_ANIMATION"),
   field_34127("BLOCK_ENTITY_DATA"),
   field_34064("BLOCK_ACTION"),
   field_34146("BLOCK_CHANGE"),
   field_34122("BOSSBAR"),
   field_34151("SERVER_DIFFICULTY"),
   field_34104("CHAT_MESSAGE"),
   field_34144("TAB_COMPLETE"),
   field_34063("DECLARE_COMMANDS"),
   field_34093("WINDOW_CONFIRMATION"),
   field_34100("CLOSE_WINDOW"),
   field_34062("WINDOW_ITEMS"),
   field_34126("WINDOW_PROPERTY"),
   field_34124("SET_SLOT"),
   field_34074("COOLDOWN"),
   field_34135("PLUGIN_MESSAGE"),
   field_34075("NAMED_SOUND"),
   field_34076("DISCONNECT"),
   field_34113("ENTITY_STATUS"),
   field_34096("EXPLOSION"),
   field_34109("UNLOAD_CHUNK"),
   field_34141("GAME_EVENT"),
   field_34142("OPEN_HORSE_WINDOW"),
   field_34136("KEEP_ALIVE"),
   field_34108("CHUNK_DATA"),
   field_34070("EFFECT"),
   field_34095("SPAWN_PARTICLE"),
   field_34103("UPDATE_LIGHT"),
   field_34087("JOIN_GAME"),
   field_34130("MAP_DATA"),
   field_34106("TRADE_LIST"),
   field_34085("ENTITY_POSITION"),
   field_34071("ENTITY_POSITION_AND_ROTATION"),
   field_34137("ENTITY_ROTATION"),
   field_34086("ENTITY_MOVEMENT"),
   field_34065("VEHICLE_MOVE"),
   field_34143("OPEN_BOOK"),
   field_34140("OPEN_WINDOW"),
   field_34068("OPEN_SIGN_EDITOR"),
   field_34138("CRAFT_RECIPE_RESPONSE"),
   field_34134("PLAYER_ABILITIES"),
   field_34078("COMBAT_EVENT"),
   field_34081("PLAYER_INFO"),
   field_34119("FACE_PLAYER"),
   field_34110("PLAYER_POSITION"),
   field_34088("UNLOCK_RECIPES"),
   field_34105("DESTROY_ENTITIES"),
   field_34133("REMOVE_ENTITY_EFFECT"),
   field_34091("RESOURCE_PACK"),
   field_34099("RESPAWN"),
   field_34079("ENTITY_HEAD_LOOK"),
   field_34123("MULTI_BLOCK_CHANGE"),
   field_34145("SELECT_ADVANCEMENTS_TAB"),
   field_34101("WORLD_BORDER"),
   field_34060("CAMERA"),
   field_34069("HELD_ITEM_CHANGE"),
   field_34149("UPDATE_VIEW_POSITION"),
   field_34080("UPDATE_VIEW_DISTANCE"),
   field_34089("SPAWN_POSITION"),
   field_34073("DISPLAY_SCOREBOARD"),
   field_34061("ENTITY_METADATA"),
   field_34129("ATTACH_ENTITY"),
   field_34094("ENTITY_VELOCITY"),
   field_34072("ENTITY_EQUIPMENT"),
   field_34059("SET_EXPERIENCE"),
   field_34148("UPDATE_HEALTH"),
   field_34117("SCOREBOARD_OBJECTIVE"),
   field_34111("SET_PASSENGERS"),
   field_34131("TEAMS"),
   field_34098("UPDATE_SCORE"),
   field_34125("TIME_UPDATE"),
   field_34150("TITLE"),
   field_34107("ENTITY_SOUND"),
   field_34066("SOUND"),
   field_34132("STOP_SOUND"),
   field_34114("TAB_LIST"),
   field_34147("NBT_QUERY"),
   field_34120("COLLECT_ITEM"),
   field_34128("ENTITY_TELEPORT"),
   field_34090("ADVANCEMENTS"),
   field_34067("ENTITY_PROPERTIES"),
   field_34097("ENTITY_EFFECT"),
   field_34152("DECLARE_RECIPES"),
   field_34084("TAGS");

   public String field_34092;

   private class_6608(String var3) {
      this.field_34092 = var3;
   }

   @Override
   public String method_31560() {
      return this.field_34092;
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
