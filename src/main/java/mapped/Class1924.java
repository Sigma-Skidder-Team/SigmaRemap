package mapped;

public enum Class1924 implements Class1919 {
   field11893("TELEPORT_CONFIRM"),
   field11894("TAB_COMPLETE"),
   field11895("CHAT_MESSAGE"),
   field11896("CLIENT_STATUS"),
   field11897("CLIENT_SETTINGS"),
   field11898("WINDOW_CONFIRMATION"),
   field11899("CLICK_WINDOW_BUTTON"),
   field11900("CLICK_WINDOW"),
   field11901("CLOSE_WINDOW"),
   field11902("PLUGIN_MESSAGE"),
   field11903("INTERACT_ENTITY"),
   field11904("KEEP_ALIVE"),
   field11905("PLAYER_MOVEMENT"),
   field11906("PLAYER_POSITION"),
   field11907("PLAYER_POSITION_AND_ROTATION"),
   field11908("PLAYER_ROTATION"),
   field11909("VEHICLE_MOVE"),
   field11910("STEER_BOAT"),
   field11911("CRAFT_RECIPE_REQUEST"),
   field11912("PLAYER_ABILITIES"),
   field11913("PLAYER_DIGGING"),
   field11914("ENTITY_ACTION"),
   field11915("STEER_VEHICLE"),
   field11916("RECIPE_BOOK_DATA"),
   field11917("RESOURCE_PACK_STATUS"),
   field11918("ADVANCEMENT_TAB"),
   field11919("HELD_ITEM_CHANGE"),
   field11920("CREATIVE_INVENTORY_ACTION"),
   field11921("UPDATE_SIGN"),
   field11922("ANIMATION"),
   field11923("SPECTATE"),
   field11924("PLAYER_BLOCK_PLACEMENT"),
   field11925("USE_ITEM");

   public String field11926;
   private static final Class1924[] field11927 = new Class1924[]{
      field11893,
      field11894,
      field11895,
      field11896,
      field11897,
      field11898,
      field11899,
      field11900,
      field11901,
      field11902,
      field11903,
      field11904,
      field11905,
      field11906,
      field11907,
      field11908,
      field11909,
      field11910,
      field11911,
      field11912,
      field11913,
      field11914,
      field11915,
      field11916,
      field11917,
      field11918,
      field11919,
      field11920,
      field11921,
      field11922,
      field11923,
      field11924,
      field11925
   };

   private Class1924(String var3) {
      this.field11926 = var3;
   }

   @Override
   public String method8193() {
      return this.field11926;
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
