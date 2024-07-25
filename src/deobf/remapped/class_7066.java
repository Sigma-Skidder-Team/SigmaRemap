package remapped;

public enum class_7066 implements class_7163 {
   field_36484("TELEPORT_CONFIRM"),
   field_36470("TAB_COMPLETE"),
   field_36477("CHAT_MESSAGE"),
   field_36471("CLIENT_STATUS"),
   field_36468("CLIENT_SETTINGS"),
   field_36475("WINDOW_CONFIRMATION"),
   field_36488("CLICK_WINDOW_BUTTON"),
   field_36461("CLICK_WINDOW"),
   field_36489("CLOSE_WINDOW"),
   field_36466("PLUGIN_MESSAGE"),
   field_36462("INTERACT_ENTITY"),
   field_36479("KEEP_ALIVE"),
   field_36474("PLAYER_POSITION"),
   field_36480("PLAYER_POSITION_AND_ROTATION"),
   field_36472("PLAYER_ROTATION"),
   field_36458("PLAYER_MOVEMENT"),
   field_36486("VEHICLE_MOVE"),
   field_36482("STEER_BOAT"),
   field_36481("PLAYER_ABILITIES"),
   field_36457("PLAYER_DIGGING"),
   field_36483("ENTITY_ACTION"),
   field_36473("STEER_VEHICLE"),
   field_36464("RESOURCE_PACK_STATUS"),
   field_36469("HELD_ITEM_CHANGE"),
   field_36459("CREATIVE_INVENTORY_ACTION"),
   field_36487("UPDATE_SIGN"),
   field_36476("ANIMATION"),
   field_36485("SPECTATE"),
   field_36478("PLAYER_BLOCK_PLACEMENT"),
   field_36465("USE_ITEM");

   public String field_36463;

   private class_7066(String var3) {
      this.field_36463 = var3;
   }

   @Override
   public String method_31560() {
      return this.field_36463;
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
