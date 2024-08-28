package mapped;

public enum Class1930 implements Class1919 {
   field12069("TELEPORT_CONFIRM"),
   field12070("PREPARE_CRAFTING_GRID"),
   field12071("TAB_COMPLETE"),
   field12072("CHAT_MESSAGE"),
   field12073("CLIENT_STATUS"),
   field12074("CLIENT_SETTINGS"),
   field12075("WINDOW_CONFIRMATION"),
   field12076("CLICK_WINDOW_BUTTON"),
   field12077("CLICK_WINDOW"),
   field12078("CLOSE_WINDOW"),
   field12079("PLUGIN_MESSAGE"),
   field12080("INTERACT_ENTITY"),
   field12081("KEEP_ALIVE"),
   field12082("PLAYER_MOVEMENT"),
   field12083("PLAYER_POSITION"),
   field12084("PLAYER_POSITION_AND_ROTATION"),
   field12085("PLAYER_ROTATION"),
   field12086("VEHICLE_MOVE"),
   field12087("STEER_BOAT"),
   field12088("PLAYER_ABILITIES"),
   field12089("PLAYER_DIGGING"),
   field12090("ENTITY_ACTION"),
   field12091("STEER_VEHICLE"),
   field12092("RECIPE_BOOK_DATA"),
   field12093("RESOURCE_PACK_STATUS"),
   field12094("ADVANCEMENT_TAB"),
   field12095("HELD_ITEM_CHANGE"),
   field12096("CREATIVE_INVENTORY_ACTION"),
   field12097("UPDATE_SIGN"),
   field12098("ANIMATION"),
   field12099("SPECTATE"),
   field12100("PLAYER_BLOCK_PLACEMENT"),
   field12101("USE_ITEM");

   public String field12102;
   private static final Class1930[] field12103 = new Class1930[]{
      field12069,
      field12070,
      field12071,
      field12072,
      field12073,
      field12074,
      field12075,
      field12076,
      field12077,
      field12078,
      field12079,
      field12080,
      field12081,
      field12082,
      field12083,
      field12084,
      field12085,
      field12086,
      field12087,
      field12088,
      field12089,
      field12090,
      field12091,
      field12092,
      field12093,
      field12094,
      field12095,
      field12096,
      field12097,
      field12098,
      field12099,
      field12100,
      field12101
   };

   private Class1930(String var3) {
      this.field12102 = var3;
   }

   @Override
   public String method8193() {
      return this.field12102;
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
