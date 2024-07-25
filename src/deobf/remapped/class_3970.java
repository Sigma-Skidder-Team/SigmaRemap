package remapped;

public enum class_3970 implements class_7163 {
   field_19250("TELEPORT_CONFIRM"),
   field_19242("QUERY_BLOCK_NBT"),
   field_19231("SET_DIFFICULTY"),
   field_19236("CHAT_MESSAGE"),
   field_19243("CLIENT_STATUS"),
   field_19253("CLIENT_SETTINGS"),
   field_19219("TAB_COMPLETE"),
   field_19249("WINDOW_CONFIRMATION"),
   field_19222("CLICK_WINDOW_BUTTON"),
   field_19230("CLICK_WINDOW"),
   field_19239("CLOSE_WINDOW"),
   field_19221("PLUGIN_MESSAGE"),
   field_19215("EDIT_BOOK"),
   field_19251("ENTITY_NBT_REQUEST"),
   field_19220("INTERACT_ENTITY"),
   field_19247("KEEP_ALIVE"),
   field_19223("LOCK_DIFFICULTY"),
   field_19241("PLAYER_POSITION"),
   field_19255("PLAYER_POSITION_AND_ROTATION"),
   field_19246("PLAYER_ROTATION"),
   field_19261("PLAYER_MOVEMENT"),
   field_19257("VEHICLE_MOVE"),
   field_19235("STEER_BOAT"),
   field_19227("PICK_ITEM"),
   field_19234("CRAFT_RECIPE_REQUEST"),
   field_19229("PLAYER_ABILITIES"),
   field_19216("PLAYER_DIGGING"),
   field_19240("ENTITY_ACTION"),
   field_19254("STEER_VEHICLE"),
   field_19263("RECIPE_BOOK_DATA"),
   field_19259("RENAME_ITEM"),
   field_19237("RESOURCE_PACK_STATUS"),
   field_19248("ADVANCEMENT_TAB"),
   field_19238("SELECT_TRADE"),
   field_19233("SET_BEACON_EFFECT"),
   field_19258("HELD_ITEM_CHANGE"),
   field_19262("UPDATE_COMMAND_BLOCK"),
   field_19218("UPDATE_COMMAND_BLOCK_MINECART"),
   field_19244("CREATIVE_INVENTORY_ACTION"),
   field_19252("UPDATE_JIGSAW_BLOCK"),
   field_19224("UPDATE_STRUCTURE_BLOCK"),
   field_19232("UPDATE_SIGN"),
   field_19217("ANIMATION"),
   field_19260("SPECTATE"),
   field_19225("PLAYER_BLOCK_PLACEMENT"),
   field_19228("USE_ITEM");

   public String field_19226;

   private class_3970(String var3) {
      this.field_19226 = var3;
   }

   @Override
   public String method_31560() {
      return this.field_19226;
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
