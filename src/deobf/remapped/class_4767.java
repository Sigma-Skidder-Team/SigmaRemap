package remapped;

public enum class_4767 implements class_7163 {
   field_23088("KEEP_ALIVE"),
   field_23084("CHAT_MESSAGE"),
   field_23083("INTERACT_ENTITY"),
   field_23087("PLAYER_MOVEMENT"),
   field_23100("PLAYER_POSITION"),
   field_23094("PLAYER_ROTATION"),
   field_23085("PLAYER_POSITION_AND_ROTATION"),
   field_23107("PLAYER_DIGGING"),
   field_23093("PLAYER_BLOCK_PLACEMENT"),
   field_23103("HELD_ITEM_CHANGE"),
   field_23092("ANIMATION"),
   field_23090("ENTITY_ACTION"),
   field_23104("STEER_VEHICLE"),
   field_23081("CLOSE_WINDOW"),
   field_23079("CLICK_WINDOW"),
   field_23095("WINDOW_CONFIRMATION"),
   field_23102("CREATIVE_INVENTORY_ACTION"),
   field_23097("CLICK_WINDOW_BUTTON"),
   field_23089("UPDATE_SIGN"),
   field_23091("PLAYER_ABILITIES"),
   field_23098("TAB_COMPLETE"),
   field_23080("CLIENT_SETTINGS"),
   field_23105("CLIENT_STATUS"),
   field_23106("PLUGIN_MESSAGE"),
   field_23086("SPECTATE"),
   field_23096("RESOURCE_PACK_STATUS");

   public String field_23099;

   private class_4767(String var3) {
      this.field_23099 = var3;
   }

   @Override
   public String method_31560() {
      return this.field_23099;
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
