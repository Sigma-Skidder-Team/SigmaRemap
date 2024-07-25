package remapped;

public enum class_2277 implements class_1372 {
   field_11327("SPAWN_ENTITY"),
   field_11311("SPAWN_EXPERIENCE_ORB"),
   field_11357("SPAWN_GLOBAL_ENTITY"),
   field_11350("SPAWN_MOB"),
   field_11366("SPAWN_PAINTING"),
   field_11380("SPAWN_PLAYER"),
   field_11354("ENTITY_ANIMATION"),
   field_11335("STATISTICS"),
   field_11332("BLOCK_BREAK_ANIMATION"),
   field_11378("BLOCK_ENTITY_DATA"),
   field_11339("BLOCK_ACTION"),
   field_11351("BLOCK_CHANGE"),
   field_11387("BOSSBAR"),
   field_11371("SERVER_DIFFICULTY"),
   field_11372("TAB_COMPLETE"),
   field_11343("CHAT_MESSAGE"),
   field_11346("MULTI_BLOCK_CHANGE"),
   field_11312("WINDOW_CONFIRMATION"),
   field_11331("CLOSE_WINDOW"),
   field_11336("OPEN_WINDOW"),
   field_11324("WINDOW_ITEMS"),
   field_11369("WINDOW_PROPERTY"),
   field_11364("SET_SLOT"),
   field_11318("COOLDOWN"),
   field_11362("PLUGIN_MESSAGE"),
   field_11326("NAMED_SOUND"),
   field_11329("DISCONNECT"),
   field_11317("ENTITY_STATUS"),
   field_11356("EXPLOSION"),
   field_11381("UNLOAD_CHUNK"),
   field_11376("GAME_EVENT"),
   field_11385("KEEP_ALIVE"),
   field_11307("CHUNK_DATA"),
   field_11333("EFFECT"),
   field_11314("SPAWN_PARTICLE"),
   field_11305("JOIN_GAME"),
   field_11321("MAP_DATA"),
   field_11330("ENTITY_MOVEMENT"),
   field_11365("ENTITY_POSITION"),
   field_11363("ENTITY_POSITION_AND_ROTATION"),
   field_11316("ENTITY_ROTATION"),
   field_11344("VEHICLE_MOVE"),
   field_11349("OPEN_SIGN_EDITOR"),
   field_11377("CRAFT_RECIPE_RESPONSE"),
   field_11310("PLAYER_ABILITIES"),
   field_11341("COMBAT_EVENT"),
   field_11334("PLAYER_INFO"),
   field_11374("PLAYER_POSITION"),
   field_11308("USE_BED"),
   field_11322("UNLOCK_RECIPES"),
   field_11382("DESTROY_ENTITIES"),
   field_11328("REMOVE_ENTITY_EFFECT"),
   field_11373("RESOURCE_PACK"),
   field_11383("RESPAWN"),
   field_11368("ENTITY_HEAD_LOOK"),
   field_11370("SELECT_ADVANCEMENTS_TAB"),
   field_11345("WORLD_BORDER"),
   field_11315("CAMERA"),
   field_11375("HELD_ITEM_CHANGE"),
   field_11319("DISPLAY_SCOREBOARD"),
   field_11347("ENTITY_METADATA"),
   field_11360("ATTACH_ENTITY"),
   field_11320("ENTITY_VELOCITY"),
   field_11313("ENTITY_EQUIPMENT"),
   field_11367("SET_EXPERIENCE"),
   field_11355("UPDATE_HEALTH"),
   field_11323("SCOREBOARD_OBJECTIVE"),
   field_11359("SET_PASSENGERS"),
   field_11338("TEAMS"),
   field_11352("UPDATE_SCORE"),
   field_11325("SPAWN_POSITION"),
   field_11379("TIME_UPDATE"),
   field_11342("TITLE"),
   field_11309("SOUND"),
   field_11358("TAB_LIST"),
   field_11353("COLLECT_ITEM"),
   field_11340("ENTITY_TELEPORT"),
   field_11337("ADVANCEMENTS"),
   field_11361("ENTITY_PROPERTIES"),
   field_11348("ENTITY_EFFECT");

   public String field_11386;

   private class_2277(String var3) {
      this.field_11386 = var3;
   }

   @Override
   public String method_31560() {
      return this.field_11386;
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
