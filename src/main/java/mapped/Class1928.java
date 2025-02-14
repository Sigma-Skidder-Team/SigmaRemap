package mapped;

public enum Class1928 implements Class1919 {
   field12005("TELEPORT_CONFIRM"),
   field12006("TAB_COMPLETE"),
   field12007("CHAT_MESSAGE"),
   field12008("CLIENT_STATUS"),
   field12009("CLIENT_SETTINGS"),
   field12010("WINDOW_CONFIRMATION"),
   field12011("CLICK_WINDOW_BUTTON"),
   field12012("CLICK_WINDOW"),
   field12013("CLOSE_WINDOW"),
   field12014("PLUGIN_MESSAGE"),
   field12015("INTERACT_ENTITY"),
   field12016("KEEP_ALIVE"),
   field12017("PLAYER_POSITION"),
   field12018("PLAYER_POSITION_AND_ROTATION"),
   field12019("PLAYER_ROTATION"),
   field12020("PLAYER_MOVEMENT"),
   field12021("VEHICLE_MOVE"),
   field12022("STEER_BOAT"),
   field12023("PLAYER_ABILITIES"),
   field12024("PLAYER_DIGGING"),
   field12025("ENTITY_ACTION"),
   field12026("STEER_VEHICLE"),
   field12027("RESOURCE_PACK_STATUS"),
   field12028("HELD_ITEM_CHANGE"),
   field12029("CREATIVE_INVENTORY_ACTION"),
   field12030("UPDATE_SIGN"),
   field12031("ANIMATION"),
   field12032("SPECTATE"),
   field12033("PLAYER_BLOCK_PLACEMENT"),
   field12034("USE_ITEM");

   public String field12035;
   private static final Class1928[] field12036 = new Class1928[]{
      field12005,
      field12006,
      field12007,
      field12008,
      field12009,
      field12010,
      field12011,
      field12012,
      field12013,
      field12014,
      field12015,
      field12016,
      field12017,
      field12018,
      field12019,
      field12020,
      field12021,
      field12022,
      field12023,
      field12024,
      field12025,
      field12026,
      field12027,
      field12028,
      field12029,
      field12030,
      field12031,
      field12032,
      field12033,
      field12034
   };

   private Class1928(String var3) {
      this.field12035 = var3;
   }

   @Override
   public String method8193() {
      return this.field12035;
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
