package remapped;

public enum class_7956 implements class_1372 {
   field_40764("SPAWN_ENTITY"),
   field_40718("SPAWN_EXPERIENCE_ORB"),
   field_40738("SPAWN_GLOBAL_ENTITY"),
   field_40757("SPAWN_MOB"),
   field_40703("SPAWN_PAINTING"),
   field_40754("SPAWN_PLAYER"),
   field_40693("ENTITY_ANIMATION"),
   field_40702("STATISTICS"),
   field_40747("BLOCK_BREAK_ANIMATION"),
   field_40768("BLOCK_ENTITY_DATA"),
   field_40698("BLOCK_ACTION"),
   field_40725("BLOCK_CHANGE"),
   field_40708("BOSSBAR"),
   field_40700("SERVER_DIFFICULTY"),
   field_40736("TAB_COMPLETE"),
   field_40753("CHAT_MESSAGE"),
   field_40758("MULTI_BLOCK_CHANGE"),
   field_40761("WINDOW_CONFIRMATION"),
   field_40735("CLOSE_WINDOW"),
   field_40724("OPEN_WINDOW"),
   field_40697("WINDOW_ITEMS"),
   field_40713("WINDOW_PROPERTY"),
   field_40749("SET_SLOT"),
   field_40715("COOLDOWN"),
   field_40746("PLUGIN_MESSAGE"),
   field_40748("NAMED_SOUND"),
   field_40752("DISCONNECT"),
   field_40745("ENTITY_STATUS"),
   field_40699("EXPLOSION"),
   field_40739("UNLOAD_CHUNK"),
   field_40695("GAME_EVENT"),
   field_40734("KEEP_ALIVE"),
   field_40750("CHUNK_DATA"),
   field_40731("EFFECT"),
   field_40694("SPAWN_PARTICLE"),
   field_40763("JOIN_GAME"),
   field_40730("MAP_DATA"),
   field_40759("ENTITY_POSITION"),
   field_40726("ENTITY_POSITION_AND_ROTATION"),
   field_40719("ENTITY_ROTATION"),
   field_40691("ENTITY_MOVEMENT"),
   field_40709("VEHICLE_MOVE"),
   field_40729("OPEN_SIGN_EDITOR"),
   field_40707("PLAYER_ABILITIES"),
   field_40740("COMBAT_EVENT"),
   field_40765("PLAYER_INFO"),
   field_40756("PLAYER_POSITION"),
   field_40755("USE_BED"),
   field_40742("DESTROY_ENTITIES"),
   field_40769("REMOVE_ENTITY_EFFECT"),
   field_40727("RESOURCE_PACK"),
   field_40762("RESPAWN"),
   field_40704("ENTITY_HEAD_LOOK"),
   field_40696("WORLD_BORDER"),
   field_40741("CAMERA"),
   field_40766("HELD_ITEM_CHANGE"),
   field_40711("DISPLAY_SCOREBOARD"),
   field_40701("ENTITY_METADATA"),
   field_40712("ATTACH_ENTITY"),
   field_40733("ENTITY_VELOCITY"),
   field_40710("ENTITY_EQUIPMENT"),
   field_40720("SET_EXPERIENCE"),
   field_40722("UPDATE_HEALTH"),
   field_40760("SCOREBOARD_OBJECTIVE"),
   field_40751("SET_PASSENGERS"),
   field_40690("TEAMS"),
   field_40716("UPDATE_SCORE"),
   field_40717("SPAWN_POSITION"),
   field_40767("TIME_UPDATE"),
   field_40706("TITLE"),
   field_40721("UPDATE_SIGN"),
   field_40737("SOUND"),
   field_40743("TAB_LIST"),
   field_40732("COLLECT_ITEM"),
   field_40714("ENTITY_TELEPORT"),
   field_40723("ENTITY_PROPERTIES"),
   field_40705("ENTITY_EFFECT");

   public String field_40728;

   private class_7956(String var3) {
      this.field_40728 = var3;
   }

   @Override
   public String method_31560() {
      return this.field_40728;
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
