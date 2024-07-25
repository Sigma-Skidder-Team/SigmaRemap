package remapped;

public enum class_2786 implements class_1372 {
   field_13594("SPAWN_ENTITY"),
   field_13604("SPAWN_EXPERIENCE_ORB"),
   field_13662("SPAWN_GLOBAL_ENTITY"),
   field_13618("SPAWN_MOB"),
   field_13684("SPAWN_PAINTING"),
   field_13602("SPAWN_PLAYER"),
   field_13678("ENTITY_ANIMATION"),
   field_13659("STATISTICS"),
   field_13612("ACKNOWLEDGE_PLAYER_DIGGING"),
   field_13606("BLOCK_BREAK_ANIMATION"),
   field_13652("BLOCK_ENTITY_DATA"),
   field_13614("BLOCK_ACTION"),
   field_13688("BLOCK_CHANGE"),
   field_13622("BOSSBAR"),
   field_13628("SERVER_DIFFICULTY"),
   field_13653("CHAT_MESSAGE"),
   field_13598("MULTI_BLOCK_CHANGE"),
   field_13687("TAB_COMPLETE"),
   field_13639("DECLARE_COMMANDS"),
   field_13648("WINDOW_CONFIRMATION"),
   field_13636("CLOSE_WINDOW"),
   field_13623("WINDOW_ITEMS"),
   field_13624("WINDOW_PROPERTY"),
   field_13643("SET_SLOT"),
   field_13674("COOLDOWN"),
   field_13666("PLUGIN_MESSAGE"),
   field_13657("NAMED_SOUND"),
   field_13630("DISCONNECT"),
   field_13683("ENTITY_STATUS"),
   field_13681("EXPLOSION"),
   field_13649("UNLOAD_CHUNK"),
   field_13650("GAME_EVENT"),
   field_13651("OPEN_HORSE_WINDOW"),
   field_13607("KEEP_ALIVE"),
   field_13595("CHUNK_DATA"),
   field_13633("EFFECT"),
   field_13617("SPAWN_PARTICLE"),
   field_13644("UPDATE_LIGHT"),
   field_13600("JOIN_GAME"),
   field_13655("MAP_DATA"),
   field_13685("TRADE_LIST"),
   field_13680("ENTITY_POSITION"),
   field_13642("ENTITY_POSITION_AND_ROTATION"),
   field_13672("ENTITY_ROTATION"),
   field_13616("ENTITY_MOVEMENT"),
   field_13663("VEHICLE_MOVE"),
   field_13631("OPEN_BOOK"),
   field_13620("OPEN_WINDOW"),
   field_13682("OPEN_SIGN_EDITOR"),
   field_13641("CRAFT_RECIPE_RESPONSE"),
   field_13611("PLAYER_ABILITIES"),
   field_13615("COMBAT_EVENT"),
   field_13646("PLAYER_INFO"),
   field_13599("FACE_PLAYER"),
   field_13654("PLAYER_POSITION"),
   field_13673("UNLOCK_RECIPES"),
   field_13676("DESTROY_ENTITIES"),
   field_13634("REMOVE_ENTITY_EFFECT"),
   field_13593("RESOURCE_PACK"),
   field_13629("RESPAWN"),
   field_13601("ENTITY_HEAD_LOOK"),
   field_13675("SELECT_ADVANCEMENTS_TAB"),
   field_13632("WORLD_BORDER"),
   field_13635("CAMERA"),
   field_13638("HELD_ITEM_CHANGE"),
   field_13626("UPDATE_VIEW_POSITION"),
   field_13665("UPDATE_VIEW_DISTANCE"),
   field_13608("DISPLAY_SCOREBOARD"),
   field_13656("ENTITY_METADATA"),
   field_13668("ATTACH_ENTITY"),
   field_13677("ENTITY_VELOCITY"),
   field_13596("ENTITY_EQUIPMENT"),
   field_13661("SET_EXPERIENCE"),
   field_13597("UPDATE_HEALTH"),
   field_13613("SCOREBOARD_OBJECTIVE"),
   field_13686("SET_PASSENGERS"),
   field_13647("TEAMS"),
   field_13658("UPDATE_SCORE"),
   field_13679("SPAWN_POSITION"),
   field_13637("TIME_UPDATE"),
   field_13610("TITLE"),
   field_13670("ENTITY_SOUND"),
   field_13645("SOUND"),
   field_13664("STOP_SOUND"),
   field_13609("TAB_LIST"),
   field_13627("NBT_QUERY"),
   field_13625("COLLECT_ITEM"),
   field_13669("ENTITY_TELEPORT"),
   field_13660("ADVANCEMENTS"),
   field_13671("ENTITY_PROPERTIES"),
   field_13640("ENTITY_EFFECT"),
   field_13603("DECLARE_RECIPES"),
   field_13619("TAGS");

   public String field_13621;

   private class_2786(String var3) {
      this.field_13621 = var3;
   }

   @Override
   public String method_31560() {
      return this.field_13621;
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
