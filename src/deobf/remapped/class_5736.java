package remapped;

public enum class_5736 implements class_1372 {
   field_29010("SPAWN_ENTITY"),
   field_28997("SPAWN_EXPERIENCE_ORB"),
   field_29014("SPAWN_GLOBAL_ENTITY"),
   field_29070("SPAWN_MOB"),
   field_29013("SPAWN_PAINTING"),
   field_29007("SPAWN_PLAYER"),
   field_29004("ENTITY_ANIMATION"),
   field_28996("STATISTICS"),
   field_28980("BLOCK_BREAK_ANIMATION"),
   field_29021("BLOCK_ENTITY_DATA"),
   field_29073("BLOCK_ACTION"),
   field_29024("BLOCK_CHANGE"),
   field_28999("BOSSBAR"),
   field_28989("SERVER_DIFFICULTY"),
   field_28991("CHAT_MESSAGE"),
   field_29029("MULTI_BLOCK_CHANGE"),
   field_29031("TAB_COMPLETE"),
   field_28987("DECLARE_COMMANDS"),
   field_29062("WINDOW_CONFIRMATION"),
   field_29015("CLOSE_WINDOW"),
   field_28994("WINDOW_ITEMS"),
   field_29054("WINDOW_PROPERTY"),
   field_29023("SET_SLOT"),
   field_29026("COOLDOWN"),
   field_29006("PLUGIN_MESSAGE"),
   field_28988("NAMED_SOUND"),
   field_29009("DISCONNECT"),
   field_29061("ENTITY_STATUS"),
   field_29053("EXPLOSION"),
   field_28998("UNLOAD_CHUNK"),
   field_29057("GAME_EVENT"),
   field_29025("OPEN_HORSE_WINDOW"),
   field_29001("KEEP_ALIVE"),
   field_29002("CHUNK_DATA"),
   field_28982("EFFECT"),
   field_29063("SPAWN_PARTICLE"),
   field_29020("UPDATE_LIGHT"),
   field_29011("JOIN_GAME"),
   field_29065("MAP_DATA"),
   field_29018("TRADE_LIST"),
   field_29044("ENTITY_POSITION"),
   field_29071("ENTITY_POSITION_AND_ROTATION"),
   field_29075("ENTITY_ROTATION"),
   field_29060("ENTITY_MOVEMENT"),
   field_28990("VEHICLE_MOVE"),
   field_29069("OPEN_BOOK"),
   field_29052("OPEN_WINDOW"),
   field_29074("OPEN_SIGN_EDITOR"),
   field_29036("CRAFT_RECIPE_RESPONSE"),
   field_29042("PLAYER_ABILITIES"),
   field_29045("COMBAT_EVENT"),
   field_29068("PLAYER_INFO"),
   field_29027("FACE_PLAYER"),
   field_29030("PLAYER_POSITION"),
   field_29049("UNLOCK_RECIPES"),
   field_28983("DESTROY_ENTITIES"),
   field_29034("REMOVE_ENTITY_EFFECT"),
   field_29016("RESOURCE_PACK"),
   field_28984("RESPAWN"),
   field_28985("ENTITY_HEAD_LOOK"),
   field_29059("SELECT_ADVANCEMENTS_TAB"),
   field_29019("WORLD_BORDER"),
   field_29056("CAMERA"),
   field_29012("HELD_ITEM_CHANGE"),
   field_29047("UPDATE_VIEW_POSITION"),
   field_29055("UPDATE_VIEW_DISTANCE"),
   field_29028("DISPLAY_SCOREBOARD"),
   field_29043("ENTITY_METADATA"),
   field_29058("ATTACH_ENTITY"),
   field_29067("ENTITY_VELOCITY"),
   field_29072("ENTITY_EQUIPMENT"),
   field_29041("SET_EXPERIENCE"),
   field_29005("UPDATE_HEALTH"),
   field_29035("SCOREBOARD_OBJECTIVE"),
   field_29048("SET_PASSENGERS"),
   field_28993("TEAMS"),
   field_29032("UPDATE_SCORE"),
   field_29039("SPAWN_POSITION"),
   field_29040("TIME_UPDATE"),
   field_29033("TITLE"),
   field_29003("ENTITY_SOUND"),
   field_28995("SOUND"),
   field_29038("STOP_SOUND"),
   field_29066("TAB_LIST"),
   field_29017("NBT_QUERY"),
   field_29000("COLLECT_ITEM"),
   field_28981("ENTITY_TELEPORT"),
   field_28992("ADVANCEMENTS"),
   field_29046("ENTITY_PROPERTIES"),
   field_29051("ENTITY_EFFECT"),
   field_28986("DECLARE_RECIPES"),
   field_29064("TAGS"),
   field_29037("ACKNOWLEDGE_PLAYER_DIGGING");

   public String field_29022;

   private class_5736(String var3) {
      this.field_29022 = var3;
   }

   @Override
   public String method_31560() {
      return this.field_29022;
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
