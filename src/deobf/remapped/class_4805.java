package remapped;

public enum class_4805 implements class_7163 {
   field_24022("TELEPORT_CONFIRM"),
   field_24029("QUERY_BLOCK_NBT"),
   field_24042("SET_DIFFICULTY"),
   field_24006("CHAT_MESSAGE"),
   field_24002("CLIENT_STATUS"),
   field_24031("CLIENT_SETTINGS"),
   field_24036("TAB_COMPLETE"),
   field_24020("WINDOW_CONFIRMATION"),
   field_24015("CLICK_WINDOW_BUTTON"),
   field_24044("CLICK_WINDOW"),
   field_24032("CLOSE_WINDOW"),
   field_24012("PLUGIN_MESSAGE"),
   field_24051("EDIT_BOOK"),
   field_24005("ENTITY_NBT_REQUEST"),
   field_24013("INTERACT_ENTITY"),
   field_24043("GENERATE_JIGSAW"),
   field_24035("KEEP_ALIVE"),
   field_24039("LOCK_DIFFICULTY"),
   field_24047("PLAYER_POSITION"),
   field_24027("PLAYER_POSITION_AND_ROTATION"),
   field_24040("PLAYER_ROTATION"),
   field_24045("PLAYER_MOVEMENT"),
   field_24050("VEHICLE_MOVE"),
   field_24007("STEER_BOAT"),
   field_24008("PICK_ITEM"),
   field_24038("CRAFT_RECIPE_REQUEST"),
   field_24023("PLAYER_ABILITIES"),
   field_24021("PLAYER_DIGGING"),
   field_24034("ENTITY_ACTION"),
   field_24025("STEER_VEHICLE"),
   field_24049("RECIPE_BOOK_DATA"),
   field_24009("RENAME_ITEM"),
   field_24016("RESOURCE_PACK_STATUS"),
   field_24046("ADVANCEMENT_TAB"),
   field_24030("SELECT_TRADE"),
   field_24014("SET_BEACON_EFFECT"),
   field_24033("HELD_ITEM_CHANGE"),
   field_24018("UPDATE_COMMAND_BLOCK"),
   field_24010("UPDATE_COMMAND_BLOCK_MINECART"),
   field_24003("CREATIVE_INVENTORY_ACTION"),
   field_24048("UPDATE_JIGSAW_BLOCK"),
   field_24041("UPDATE_STRUCTURE_BLOCK"),
   field_24024("UPDATE_SIGN"),
   field_24011("ANIMATION"),
   field_24028("SPECTATE"),
   field_24037("PLAYER_BLOCK_PLACEMENT"),
   field_24019("USE_ITEM");

   public String field_24017;

   private class_4805(String var3) {
      this.field_24017 = var3;
   }

   @Override
   public String method_31560() {
      return this.field_24017;
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
