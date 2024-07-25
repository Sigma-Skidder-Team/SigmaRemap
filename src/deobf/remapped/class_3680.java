package remapped;

public enum class_3680 implements class_1372 {
   field_18020("SPAWN_ENTITY"),
   field_17946("SPAWN_EXPERIENCE_ORB"),
   field_17972("SPAWN_MOB"),
   field_17990("SPAWN_PAINTING"),
   field_18015("SPAWN_PLAYER"),
   field_18011("ENTITY_ANIMATION"),
   field_18005("STATISTICS"),
   field_17973("ACKNOWLEDGE_PLAYER_DIGGING"),
   field_17976("BLOCK_BREAK_ANIMATION"),
   field_17999("BLOCK_ENTITY_DATA"),
   field_17951("BLOCK_ACTION"),
   field_17997("BLOCK_CHANGE"),
   field_17971("BOSSBAR"),
   field_17954("SERVER_DIFFICULTY"),
   field_18031("CHAT_MESSAGE"),
   field_17998("MULTI_BLOCK_CHANGE"),
   field_18030("TAB_COMPLETE"),
   field_17947("DECLARE_COMMANDS"),
   field_18008("WINDOW_CONFIRMATION"),
   field_17989("CLOSE_WINDOW"),
   field_17970("WINDOW_ITEMS"),
   field_17957("WINDOW_PROPERTY"),
   field_18009("SET_SLOT"),
   field_17991("COOLDOWN"),
   field_17982("PLUGIN_MESSAGE"),
   field_17980("NAMED_SOUND"),
   field_18023("DISCONNECT"),
   field_17987("ENTITY_STATUS"),
   field_17953("EXPLOSION"),
   field_18024("UNLOAD_CHUNK"),
   field_17988("GAME_EVENT"),
   field_17977("OPEN_HORSE_WINDOW"),
   field_17941("KEEP_ALIVE"),
   field_17978("CHUNK_DATA"),
   field_17967("EFFECT"),
   field_17979("SPAWN_PARTICLE"),
   field_17961("UPDATE_LIGHT"),
   field_18034("JOIN_GAME"),
   field_18014("MAP_DATA"),
   field_18004("TRADE_LIST"),
   field_18007("ENTITY_POSITION"),
   field_17956("ENTITY_POSITION_AND_ROTATION"),
   field_17996("ENTITY_ROTATION"),
   field_18013("ENTITY_MOVEMENT"),
   field_17984("VEHICLE_MOVE"),
   field_18000("OPEN_BOOK"),
   field_17966("OPEN_WINDOW"),
   field_18003("OPEN_SIGN_EDITOR"),
   field_17955("CRAFT_RECIPE_RESPONSE"),
   field_17974("PLAYER_ABILITIES"),
   field_17960("COMBAT_EVENT"),
   field_18018("PLAYER_INFO"),
   field_17995("FACE_PLAYER"),
   field_17943("PLAYER_POSITION"),
   field_17986("UNLOCK_RECIPES"),
   field_17952("DESTROY_ENTITIES"),
   field_18012("REMOVE_ENTITY_EFFECT"),
   field_17981("RESOURCE_PACK"),
   field_17975("RESPAWN"),
   field_18002("ENTITY_HEAD_LOOK"),
   field_18028("SELECT_ADVANCEMENTS_TAB"),
   field_17942("WORLD_BORDER"),
   field_18006("CAMERA"),
   field_17948("HELD_ITEM_CHANGE"),
   field_18027("UPDATE_VIEW_POSITION"),
   field_17992("UPDATE_VIEW_DISTANCE"),
   field_18032("SPAWN_POSITION"),
   field_18016("DISPLAY_SCOREBOARD"),
   field_18001("ENTITY_METADATA"),
   field_18019("ATTACH_ENTITY"),
   field_17993("ENTITY_VELOCITY"),
   field_17965("ENTITY_EQUIPMENT"),
   field_17958("SET_EXPERIENCE"),
   field_17985("UPDATE_HEALTH"),
   field_18022("SCOREBOARD_OBJECTIVE"),
   field_17950("SET_PASSENGERS"),
   field_17940("TEAMS"),
   field_18029("UPDATE_SCORE"),
   field_17983("TIME_UPDATE"),
   field_18033("TITLE"),
   field_17963("ENTITY_SOUND"),
   field_18026("SOUND"),
   field_17959("STOP_SOUND"),
   field_17944("TAB_LIST"),
   field_17964("NBT_QUERY"),
   field_17949("COLLECT_ITEM"),
   field_17994("ENTITY_TELEPORT"),
   field_17969("ADVANCEMENTS"),
   field_18010("ENTITY_PROPERTIES"),
   field_17945("ENTITY_EFFECT"),
   field_18017("DECLARE_RECIPES"),
   field_17962("TAGS");

   public String field_18021;

   private class_3680(String var3) {
      this.field_18021 = var3;
   }

   @Override
   public String method_31560() {
      return this.field_18021;
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
