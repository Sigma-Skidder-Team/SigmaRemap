package mapped;

public enum Class1933 implements Class1913 {
   field12270("KEEP_ALIVE"),
   field12271("JOIN_GAME"),
   field12272("CHAT_MESSAGE"),
   field12273("TIME_UPDATE"),
   field12274("ENTITY_EQUIPMENT"),
   field12275("SPAWN_POSITION"),
   field12276("UPDATE_HEALTH"),
   field12277("RESPAWN"),
   field12278("PLAYER_POSITION"),
   field12279("HELD_ITEM_CHANGE"),
   field12280("USE_BED"),
   field12281("ENTITY_ANIMATION"),
   field12282("SPAWN_PLAYER"),
   field12283("COLLECT_ITEM"),
   field12284("SPAWN_ENTITY"),
   field12285("SPAWN_MOB"),
   field12286("SPAWN_PAINTING"),
   field12287("SPAWN_EXPERIENCE_ORB"),
   field12288("ENTITY_VELOCITY"),
   field12289("DESTROY_ENTITIES"),
   field12290("ENTITY_MOVEMENT"),
   field12291("ENTITY_POSITION"),
   field12292("ENTITY_ROTATION"),
   field12293("ENTITY_POSITION_AND_ROTATION"),
   field12294("ENTITY_TELEPORT"),
   field12295("ENTITY_HEAD_LOOK"),
   field12296("ENTITY_STATUS"),
   field12297("ATTACH_ENTITY"),
   field12298("ENTITY_METADATA"),
   field12299("ENTITY_EFFECT"),
   field12300("REMOVE_ENTITY_EFFECT"),
   field12301("SET_EXPERIENCE"),
   field12302("ENTITY_PROPERTIES"),
   field12303("CHUNK_DATA"),
   field12304("MULTI_BLOCK_CHANGE"),
   field12305("BLOCK_CHANGE"),
   field12306("BLOCK_ACTION"),
   field12307("BLOCK_BREAK_ANIMATION"),
   field12308("MAP_BULK_CHUNK"),
   field12309("EXPLOSION"),
   field12310("EFFECT"),
   field12311("NAMED_SOUND"),
   field12312("SPAWN_PARTICLE"),
   field12313("GAME_EVENT"),
   field12314("SPAWN_GLOBAL_ENTITY"),
   field12315("OPEN_WINDOW"),
   field12316("CLOSE_WINDOW"),
   field12317("SET_SLOT"),
   field12318("WINDOW_ITEMS"),
   field12319("WINDOW_PROPERTY"),
   field12320("WINDOW_CONFIRMATION"),
   field12321("UPDATE_SIGN"),
   field12322("MAP_DATA"),
   field12323("BLOCK_ENTITY_DATA"),
   field12324("OPEN_SIGN_EDITOR"),
   field12325("STATISTICS"),
   field12326("PLAYER_INFO"),
   field12327("PLAYER_ABILITIES"),
   field12328("TAB_COMPLETE"),
   field12329("SCOREBOARD_OBJECTIVE"),
   field12330("UPDATE_SCORE"),
   field12331("DISPLAY_SCOREBOARD"),
   field12332("TEAMS"),
   field12333("PLUGIN_MESSAGE"),
   field12334("DISCONNECT"),
   field12335("SERVER_DIFFICULTY"),
   field12336("COMBAT_EVENT"),
   field12337("CAMERA"),
   field12338("WORLD_BORDER"),
   field12339("TITLE"),
   field12340("SET_COMPRESSION"),
   field12341("TAB_LIST"),
   field12342("RESOURCE_PACK"),
   field12343("UPDATE_ENTITY_NBT");

   public String field12344;
   private static final Class1933[] field12345 = new Class1933[]{
      field12270,
      field12271,
      field12272,
      field12273,
      field12274,
      field12275,
      field12276,
      field12277,
      field12278,
      field12279,
      field12280,
      field12281,
      field12282,
      field12283,
      field12284,
      field12285,
      field12286,
      field12287,
      field12288,
      field12289,
      field12290,
      field12291,
      field12292,
      field12293,
      field12294,
      field12295,
      field12296,
      field12297,
      field12298,
      field12299,
      field12300,
      field12301,
      field12302,
      field12303,
      field12304,
      field12305,
      field12306,
      field12307,
      field12308,
      field12309,
      field12310,
      field12311,
      field12312,
      field12313,
      field12314,
      field12315,
      field12316,
      field12317,
      field12318,
      field12319,
      field12320,
      field12321,
      field12322,
      field12323,
      field12324,
      field12325,
      field12326,
      field12327,
      field12328,
      field12329,
      field12330,
      field12331,
      field12332,
      field12333,
      field12334,
      field12335,
      field12336,
      field12337,
      field12338,
      field12339,
      field12340,
      field12341,
      field12342,
      field12343
   };

   private Class1933(String var3) {
      this.field12344 = var3;
   }

   @Override
   public String method8193() {
      return this.field12344;
   }

   @Override
   public int method8194() {
      for (int var3 = 0; var3 < values().length; var3++) {
         if (values()[var3] == this) {
            return var3;
         }
      }

      return 0;
   }
}