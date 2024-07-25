package remapped;

public enum class_4023 implements class_7163 {
   field_19528("TELEPORT_CONFIRM"),
   field_19553("TAB_COMPLETE"),
   field_19554("CHAT_MESSAGE"),
   field_19525("CLIENT_STATUS"),
   field_19539("CLIENT_SETTINGS"),
   field_19538("WINDOW_CONFIRMATION"),
   field_19526("CLICK_WINDOW_BUTTON"),
   field_19543("CLICK_WINDOW"),
   field_19532("CLOSE_WINDOW"),
   field_19529("PLUGIN_MESSAGE"),
   field_19551("INTERACT_ENTITY"),
   field_19534("KEEP_ALIVE"),
   field_19537("PLAYER_POSITION"),
   field_19536("PLAYER_POSITION_AND_ROTATION"),
   field_19544("PLAYER_ROTATION"),
   field_19527("PLAYER_MOVEMENT"),
   field_19545("VEHICLE_MOVE"),
   field_19531("STEER_BOAT"),
   field_19550("PLAYER_ABILITIES"),
   field_19533("PLAYER_DIGGING"),
   field_19547("ENTITY_ACTION"),
   field_19540("STEER_VEHICLE"),
   field_19556("RESOURCE_PACK_STATUS"),
   field_19552("HELD_ITEM_CHANGE"),
   field_19555("CREATIVE_INVENTORY_ACTION"),
   field_19549("UPDATE_SIGN"),
   field_19548("ANIMATION"),
   field_19530("SPECTATE"),
   field_19557("PLAYER_BLOCK_PLACEMENT"),
   field_19542("USE_ITEM");

   public String field_19546;

   private class_4023(String var3) {
      this.field_19546 = var3;
   }

   @Override
   public String method_31560() {
      return this.field_19546;
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
