package remapped;

public enum class_1082 implements class_1372 {
   field_5905("KEEP_ALIVE"),
   field_5932("JOIN_GAME"),
   field_5935("CHAT_MESSAGE"),
   field_5957("TIME_UPDATE"),
   field_5928("ENTITY_EQUIPMENT"),
   field_5966("SPAWN_POSITION"),
   field_5964("UPDATE_HEALTH"),
   field_5952("RESPAWN"),
   field_5922("PLAYER_POSITION"),
   field_5907("HELD_ITEM_CHANGE"),
   field_5943("USE_BED"),
   field_5937("ENTITY_ANIMATION"),
   field_5941("SPAWN_PLAYER"),
   field_5963("COLLECT_ITEM"),
   field_5949("SPAWN_ENTITY"),
   field_5899("SPAWN_MOB"),
   field_5918("SPAWN_PAINTING"),
   field_5915("SPAWN_EXPERIENCE_ORB"),
   field_5939("ENTITY_VELOCITY"),
   field_5930("DESTROY_ENTITIES"),
   field_5906("ENTITY_MOVEMENT"),
   field_5931("ENTITY_POSITION"),
   field_5956("ENTITY_ROTATION"),
   field_5951("ENTITY_POSITION_AND_ROTATION"),
   field_5914("ENTITY_TELEPORT"),
   field_5910("ENTITY_HEAD_LOOK"),
   field_5908("ENTITY_STATUS"),
   field_5911("ATTACH_ENTITY"),
   field_5944("ENTITY_METADATA"),
   field_5903("ENTITY_EFFECT"),
   field_5942("REMOVE_ENTITY_EFFECT"),
   field_5938("SET_EXPERIENCE"),
   field_5961("ENTITY_PROPERTIES"),
   field_5912("CHUNK_DATA"),
   field_5916("MULTI_BLOCK_CHANGE"),
   field_5923("BLOCK_CHANGE"),
   field_5900("BLOCK_ACTION"),
   field_5955("BLOCK_BREAK_ANIMATION"),
   field_5929("MAP_BULK_CHUNK"),
   field_5948("EXPLOSION"),
   field_5925("EFFECT"),
   field_5958("NAMED_SOUND"),
   field_5917("SPAWN_PARTICLE"),
   field_5933("GAME_EVENT"),
   field_5921("SPAWN_GLOBAL_ENTITY"),
   field_5927("OPEN_WINDOW"),
   field_5959("CLOSE_WINDOW"),
   field_5947("SET_SLOT"),
   field_5924("WINDOW_ITEMS"),
   field_5909("WINDOW_PROPERTY"),
   field_5954("WINDOW_CONFIRMATION"),
   field_5901("UPDATE_SIGN"),
   field_5902("MAP_DATA"),
   field_5919("BLOCK_ENTITY_DATA"),
   field_5936("OPEN_SIGN_EDITOR"),
   field_5950("STATISTICS"),
   field_5904("PLAYER_INFO"),
   field_5953("PLAYER_ABILITIES"),
   field_5946("TAB_COMPLETE"),
   field_5960("SCOREBOARD_OBJECTIVE"),
   field_5934("UPDATE_SCORE"),
   field_5926("DISPLAY_SCOREBOARD"),
   field_5965("TEAMS"),
   field_5920("PLUGIN_MESSAGE"),
   field_5940("DISCONNECT");

   public String field_5945;

   private class_1082(String var3) {
      this.field_5945 = var3;
   }

   @Override
   public String method_31560() {
      return this.field_5945;
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
