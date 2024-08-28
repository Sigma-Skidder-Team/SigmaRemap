package mapped;

public enum Class1929 implements Class1919 {
   field12037("TELEPORT_CONFIRM"),
   field12038("TAB_COMPLETE"),
   field12039("CHAT_MESSAGE"),
   field12040("CLIENT_STATUS"),
   field12041("CLIENT_SETTINGS"),
   field12042("WINDOW_CONFIRMATION"),
   field12043("CLICK_WINDOW_BUTTON"),
   field12044("CLICK_WINDOW"),
   field12045("CLOSE_WINDOW"),
   field12046("PLUGIN_MESSAGE"),
   field12047("INTERACT_ENTITY"),
   field12048("KEEP_ALIVE"),
   field12049("PLAYER_POSITION"),
   field12050("PLAYER_POSITION_AND_ROTATION"),
   field12051("PLAYER_ROTATION"),
   field12052("PLAYER_MOVEMENT"),
   field12053("VEHICLE_MOVE"),
   field12054("STEER_BOAT"),
   field12055("PLAYER_ABILITIES"),
   field12056("PLAYER_DIGGING"),
   field12057("ENTITY_ACTION"),
   field12058("STEER_VEHICLE"),
   field12059("RESOURCE_PACK_STATUS"),
   field12060("HELD_ITEM_CHANGE"),
   field12061("CREATIVE_INVENTORY_ACTION"),
   field12062("UPDATE_SIGN"),
   field12063("ANIMATION"),
   field12064("SPECTATE"),
   field12065("PLAYER_BLOCK_PLACEMENT"),
   field12066("USE_ITEM");

   public String field12067;
   private static final Class1929[] field12068 = new Class1929[]{
      field12037,
      field12038,
      field12039,
      field12040,
      field12041,
      field12042,
      field12043,
      field12044,
      field12045,
      field12046,
      field12047,
      field12048,
      field12049,
      field12050,
      field12051,
      field12052,
      field12053,
      field12054,
      field12055,
      field12056,
      field12057,
      field12058,
      field12059,
      field12060,
      field12061,
      field12062,
      field12063,
      field12064,
      field12065,
      field12066
   };

   private Class1929(String var3) {
      this.field12067 = var3;
   }

   @Override
   public String method8193() {
      return this.field12067;
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
