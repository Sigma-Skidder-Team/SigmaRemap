package remapped;

public enum class_6410 implements class_7163 {
   field_32741("TELEPORT_CONFIRM"),
   field_32739("PREPARE_CRAFTING_GRID"),
   field_32723("TAB_COMPLETE"),
   field_32713("CHAT_MESSAGE"),
   field_32738("CLIENT_STATUS"),
   field_32740("CLIENT_SETTINGS"),
   field_32717("WINDOW_CONFIRMATION"),
   field_32746("CLICK_WINDOW_BUTTON"),
   field_32719("CLICK_WINDOW"),
   field_32737("CLOSE_WINDOW"),
   field_32743("PLUGIN_MESSAGE"),
   field_32734("INTERACT_ENTITY"),
   field_32730("KEEP_ALIVE"),
   field_32715("PLAYER_MOVEMENT"),
   field_32711("PLAYER_POSITION"),
   field_32714("PLAYER_POSITION_AND_ROTATION"),
   field_32720("PLAYER_ROTATION"),
   field_32716("VEHICLE_MOVE"),
   field_32744("STEER_BOAT"),
   field_32712("PLAYER_ABILITIES"),
   field_32727("PLAYER_DIGGING"),
   field_32725("ENTITY_ACTION"),
   field_32735("STEER_VEHICLE"),
   field_32728("RECIPE_BOOK_DATA"),
   field_32733("RESOURCE_PACK_STATUS"),
   field_32732("ADVANCEMENT_TAB"),
   field_32721("HELD_ITEM_CHANGE"),
   field_32718("CREATIVE_INVENTORY_ACTION"),
   field_32736("UPDATE_SIGN"),
   field_32745("ANIMATION"),
   field_32722("SPECTATE"),
   field_32729("PLAYER_BLOCK_PLACEMENT"),
   field_32731("USE_ITEM");

   public String field_32724;

   private class_6410(String var3) {
      this.field_32724 = var3;
   }

   @Override
   public String method_31560() {
      return this.field_32724;
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
