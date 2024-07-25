package remapped;

public enum class_3974 implements class_1372 {
   field_19283("KEEP_ALIVE"),
   field_19345("JOIN_GAME"),
   field_19312("CHAT_MESSAGE"),
   field_19321("TIME_UPDATE"),
   field_19352("ENTITY_EQUIPMENT"),
   field_19288("SPAWN_POSITION"),
   field_19292("UPDATE_HEALTH"),
   field_19340("RESPAWN"),
   field_19351("PLAYER_POSITION"),
   field_19313("HELD_ITEM_CHANGE"),
   field_19327("USE_BED"),
   field_19320("ENTITY_ANIMATION"),
   field_19285("SPAWN_PLAYER"),
   field_19338("COLLECT_ITEM"),
   field_19294("SPAWN_ENTITY"),
   field_19299("SPAWN_MOB"),
   field_19306("SPAWN_PAINTING"),
   field_19329("SPAWN_EXPERIENCE_ORB"),
   field_19358("ENTITY_VELOCITY"),
   field_19293("DESTROY_ENTITIES"),
   field_19348("ENTITY_MOVEMENT"),
   field_19330("ENTITY_POSITION"),
   field_19339("ENTITY_ROTATION"),
   field_19353("ENTITY_POSITION_AND_ROTATION"),
   field_19355("ENTITY_TELEPORT"),
   field_19350("ENTITY_HEAD_LOOK"),
   field_19308("ENTITY_STATUS"),
   field_19304("ATTACH_ENTITY"),
   field_19342("ENTITY_METADATA"),
   field_19303("ENTITY_EFFECT"),
   field_19286("REMOVE_ENTITY_EFFECT"),
   field_19328("SET_EXPERIENCE"),
   field_19331("ENTITY_PROPERTIES"),
   field_19334("CHUNK_DATA"),
   field_19354("MULTI_BLOCK_CHANGE"),
   field_19333("BLOCK_CHANGE"),
   field_19291("BLOCK_ACTION"),
   field_19311("BLOCK_BREAK_ANIMATION"),
   field_19357("MAP_BULK_CHUNK"),
   field_19290("EXPLOSION"),
   field_19349("EFFECT"),
   field_19341("NAMED_SOUND"),
   field_19310("SPAWN_PARTICLE"),
   field_19287("GAME_EVENT"),
   field_19344("SPAWN_GLOBAL_ENTITY"),
   field_19319("OPEN_WINDOW"),
   field_19301("CLOSE_WINDOW"),
   field_19322("SET_SLOT"),
   field_19284("WINDOW_ITEMS"),
   field_19324("WINDOW_PROPERTY"),
   field_19295("WINDOW_CONFIRMATION"),
   field_19347("UPDATE_SIGN"),
   field_19305("MAP_DATA"),
   field_19346("BLOCK_ENTITY_DATA"),
   field_19316("OPEN_SIGN_EDITOR"),
   field_19323("STATISTICS"),
   field_19309("PLAYER_INFO"),
   field_19317("PLAYER_ABILITIES"),
   field_19289("TAB_COMPLETE"),
   field_19307("SCOREBOARD_OBJECTIVE"),
   field_19325("UPDATE_SCORE"),
   field_19300("DISPLAY_SCOREBOARD"),
   field_19326("TEAMS"),
   field_19318("PLUGIN_MESSAGE"),
   field_19297("DISCONNECT"),
   field_19336("SERVER_DIFFICULTY"),
   field_19332("COMBAT_EVENT"),
   field_19335("CAMERA"),
   field_19343("WORLD_BORDER"),
   field_19282("TITLE"),
   field_19296("SET_COMPRESSION"),
   field_19302("TAB_LIST"),
   field_19314("RESOURCE_PACK"),
   field_19315("UPDATE_ENTITY_NBT");

   public String field_19337;

   private class_3974(String var3) {
      this.field_19337 = var3;
   }

   @Override
   public String method_31560() {
      return this.field_19337;
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
