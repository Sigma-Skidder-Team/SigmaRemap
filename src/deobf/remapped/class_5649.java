package remapped;

public enum class_5649 implements class_7163 {
   field_28628("TELEPORT_CONFIRM"),
   field_28636("TAB_COMPLETE"),
   field_28645("CHAT_MESSAGE"),
   field_28661("CLIENT_STATUS"),
   field_28646("CLIENT_SETTINGS"),
   field_28659("WINDOW_CONFIRMATION"),
   field_28653("CLICK_WINDOW_BUTTON"),
   field_28656("CLICK_WINDOW"),
   field_28655("CLOSE_WINDOW"),
   field_28651("PLUGIN_MESSAGE"),
   field_28632("INTERACT_ENTITY"),
   field_28635("KEEP_ALIVE"),
   field_28642("PLAYER_MOVEMENT"),
   field_28639("PLAYER_POSITION"),
   field_28629("PLAYER_POSITION_AND_ROTATION"),
   field_28631("PLAYER_ROTATION"),
   field_28650("VEHICLE_MOVE"),
   field_28652("STEER_BOAT"),
   field_28644("CRAFT_RECIPE_REQUEST"),
   field_28627("PLAYER_ABILITIES"),
   field_28649("PLAYER_DIGGING"),
   field_28626("ENTITY_ACTION"),
   field_28657("STEER_VEHICLE"),
   field_28660("RECIPE_BOOK_DATA"),
   field_28643("RESOURCE_PACK_STATUS"),
   field_28658("ADVANCEMENT_TAB"),
   field_28637("HELD_ITEM_CHANGE"),
   field_28630("CREATIVE_INVENTORY_ACTION"),
   field_28638("UPDATE_SIGN"),
   field_28654("ANIMATION"),
   field_28640("SPECTATE"),
   field_28634("PLAYER_BLOCK_PLACEMENT"),
   field_28647("USE_ITEM");

   public String field_28633;

   private class_5649(String var3) {
      this.field_28633 = var3;
   }

   @Override
   public String method_31560() {
      return this.field_28633;
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
