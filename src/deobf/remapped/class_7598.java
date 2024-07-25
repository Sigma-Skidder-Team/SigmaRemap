package remapped;

public enum class_7598 implements class_7163 {
   field_38683("KEEP_ALIVE"),
   field_38689("CHAT_MESSAGE"),
   field_38681("INTERACT_ENTITY"),
   field_38695("PLAYER_MOVEMENT"),
   field_38697("PLAYER_POSITION"),
   field_38674("PLAYER_ROTATION"),
   field_38693("PLAYER_POSITION_AND_ROTATION"),
   field_38691("PLAYER_DIGGING"),
   field_38694("PLAYER_BLOCK_PLACEMENT"),
   field_38679("HELD_ITEM_CHANGE"),
   field_38684("ANIMATION"),
   field_38680("ENTITY_ACTION"),
   field_38692("STEER_VEHICLE"),
   field_38700("CLOSE_WINDOW"),
   field_38677("CLICK_WINDOW"),
   field_38675("WINDOW_CONFIRMATION"),
   field_38690("CREATIVE_INVENTORY_ACTION"),
   field_38687("CLICK_WINDOW_BUTTON"),
   field_38678("UPDATE_SIGN"),
   field_38685("PLAYER_ABILITIES"),
   field_38699("TAB_COMPLETE"),
   field_38688("CLIENT_SETTINGS"),
   field_38686("CLIENT_STATUS"),
   field_38696("PLUGIN_MESSAGE");

   public String field_38682;

   private class_7598(String var3) {
      this.field_38682 = var3;
   }

   @Override
   public String method_31560() {
      return this.field_38682;
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
