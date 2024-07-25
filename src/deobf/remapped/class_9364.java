package remapped;

public enum class_9364 implements class_1372 {
   field_47834("SPAWN_ENTITY"),
   field_47827("SPAWN_EXPERIENCE_ORB"),
   field_47869("SPAWN_GLOBAL_ENTITY"),
   field_47833("SPAWN_MOB"),
   field_47878("SPAWN_PAINTING"),
   field_47847("SPAWN_PLAYER"),
   field_47845("ENTITY_ANIMATION"),
   field_47866("STATISTICS"),
   field_47894("BLOCK_BREAK_ANIMATION"),
   field_47862("BLOCK_ENTITY_DATA"),
   field_47829("BLOCK_ACTION"),
   field_47871("BLOCK_CHANGE"),
   field_47867("BOSSBAR"),
   field_47839("SERVER_DIFFICULTY"),
   field_47880("TAB_COMPLETE"),
   field_47853("CHAT_MESSAGE"),
   field_47899("MULTI_BLOCK_CHANGE"),
   field_47870("WINDOW_CONFIRMATION"),
   field_47864("CLOSE_WINDOW"),
   field_47852("OPEN_WINDOW"),
   field_47838("WINDOW_ITEMS"),
   field_47875("WINDOW_PROPERTY"),
   field_47835("SET_SLOT"),
   field_47882("COOLDOWN"),
   field_47841("PLUGIN_MESSAGE"),
   field_47890("NAMED_SOUND"),
   field_47857("DISCONNECT"),
   field_47822("ENTITY_STATUS"),
   field_47860("EXPLOSION"),
   field_47836("UNLOAD_CHUNK"),
   field_47885("GAME_EVENT"),
   field_47893("KEEP_ALIVE"),
   field_47859("CHUNK_DATA"),
   field_47856("EFFECT"),
   field_47858("SPAWN_PARTICLE"),
   field_47842("JOIN_GAME"),
   field_47887("MAP_DATA"),
   field_47891("ENTITY_POSITION"),
   field_47872("ENTITY_POSITION_AND_ROTATION"),
   field_47830("ENTITY_ROTATION"),
   field_47896("ENTITY_MOVEMENT"),
   field_47828("VEHICLE_MOVE"),
   field_47881("OPEN_SIGN_EDITOR"),
   field_47840("PLAYER_ABILITIES"),
   field_47849("COMBAT_EVENT"),
   field_47851("PLAYER_INFO"),
   field_47888("PLAYER_POSITION"),
   field_47843("USE_BED"),
   field_47879("DESTROY_ENTITIES"),
   field_47865("REMOVE_ENTITY_EFFECT"),
   field_47897("RESOURCE_PACK"),
   field_47832("RESPAWN"),
   field_47844("ENTITY_HEAD_LOOK"),
   field_47850("WORLD_BORDER"),
   field_47873("CAMERA"),
   field_47825("HELD_ITEM_CHANGE"),
   field_47861("DISPLAY_SCOREBOARD"),
   field_47892("ENTITY_METADATA"),
   field_47874("ATTACH_ENTITY"),
   field_47863("ENTITY_VELOCITY"),
   field_47846("ENTITY_EQUIPMENT"),
   field_47889("SET_EXPERIENCE"),
   field_47868("UPDATE_HEALTH"),
   field_47883("SCOREBOARD_OBJECTIVE"),
   field_47895("SET_PASSENGERS"),
   field_47900("TEAMS"),
   field_47848("UPDATE_SCORE"),
   field_47886("SPAWN_POSITION"),
   field_47826("TIME_UPDATE"),
   field_47877("TITLE"),
   field_47898("SOUND"),
   field_47837("TAB_LIST"),
   field_47854("COLLECT_ITEM"),
   field_47824("ENTITY_TELEPORT"),
   field_47855("ENTITY_PROPERTIES"),
   field_47884("ENTITY_EFFECT");

   public String field_47876;

   private class_9364(String var3) {
      this.field_47876 = var3;
   }

   @Override
   public String method_31560() {
      return this.field_47876;
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
