package remapped;

public enum class_5975 implements class_7163 {
   field_30466("TELEPORT_CONFIRM"),
   field_30467("QUERY_BLOCK_NBT"),
   field_30447("CHAT_MESSAGE"),
   field_30440("CLIENT_STATUS"),
   field_30446("CLIENT_SETTINGS"),
   field_30445("TAB_COMPLETE"),
   field_30462("WINDOW_CONFIRMATION"),
   field_30459("CLICK_WINDOW_BUTTON"),
   field_30457("CLICK_WINDOW"),
   field_30431("CLOSE_WINDOW"),
   field_30464("PLUGIN_MESSAGE"),
   field_30460("EDIT_BOOK"),
   field_30451("ENTITY_NBT_REQUEST"),
   field_30430("INTERACT_ENTITY"),
   field_30471("KEEP_ALIVE"),
   field_30436("PLAYER_MOVEMENT"),
   field_30443("PLAYER_POSITION"),
   field_30473("PLAYER_POSITION_AND_ROTATION"),
   field_30432("PLAYER_ROTATION"),
   field_30450("VEHICLE_MOVE"),
   field_30469("STEER_BOAT"),
   field_30458("PICK_ITEM"),
   field_30474("CRAFT_RECIPE_REQUEST"),
   field_30438("PLAYER_ABILITIES"),
   field_30448("PLAYER_DIGGING"),
   field_30444("ENTITY_ACTION"),
   field_30461("STEER_VEHICLE"),
   field_30454("RECIPE_BOOK_DATA"),
   field_30468("RENAME_ITEM"),
   field_30452("RESOURCE_PACK_STATUS"),
   field_30463("ADVANCEMENT_TAB"),
   field_30465("SELECT_TRADE"),
   field_30437("SET_BEACON_EFFECT"),
   field_30453("HELD_ITEM_CHANGE"),
   field_30434("UPDATE_COMMAND_BLOCK"),
   field_30439("UPDATE_COMMAND_BLOCK_MINECART"),
   field_30455("CREATIVE_INVENTORY_ACTION"),
   field_30441("UPDATE_STRUCTURE_BLOCK"),
   field_30429("UPDATE_SIGN"),
   field_30442("ANIMATION"),
   field_30470("SPECTATE"),
   field_30472("PLAYER_BLOCK_PLACEMENT"),
   field_30449("USE_ITEM");

   public String field_30435;

   private class_5975(String var3) {
      this.field_30435 = var3;
   }

   @Override
   public String method_31560() {
      return this.field_30435;
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
