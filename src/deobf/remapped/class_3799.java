package remapped;

public enum class_3799 implements class_7163 {
   field_18546("TELEPORT_CONFIRM"),
   field_18565("QUERY_BLOCK_NBT"),
   field_18574("SET_DIFFICULTY"),
   field_18570("CHAT_MESSAGE"),
   field_18541("CLIENT_STATUS"),
   field_18563("CLIENT_SETTINGS"),
   field_18583("TAB_COMPLETE"),
   field_18547("WINDOW_CONFIRMATION"),
   field_18569("CLICK_WINDOW_BUTTON"),
   field_18542("CLICK_WINDOW"),
   field_18579("CLOSE_WINDOW"),
   field_18566("PLUGIN_MESSAGE"),
   field_18536("EDIT_BOOK"),
   field_18553("ENTITY_NBT_REQUEST"),
   field_18580("INTERACT_ENTITY"),
   field_18555("GENERATE_JIGSAW"),
   field_18557("KEEP_ALIVE"),
   field_18573("LOCK_DIFFICULTY"),
   field_18540("PLAYER_POSITION"),
   field_18549("PLAYER_POSITION_AND_ROTATION"),
   field_18556("PLAYER_ROTATION"),
   field_18544("PLAYER_MOVEMENT"),
   field_18537("VEHICLE_MOVE"),
   field_18567("STEER_BOAT"),
   field_18560("PICK_ITEM"),
   field_18545("CRAFT_RECIPE_REQUEST"),
   field_18576("PLAYER_ABILITIES"),
   field_18571("PLAYER_DIGGING"),
   field_18538("ENTITY_ACTION"),
   field_18554("STEER_VEHICLE"),
   field_18581("RECIPE_BOOK_DATA"),
   field_18552("SEEN_RECIPE"),
   field_18551("RENAME_ITEM"),
   field_18585("RESOURCE_PACK_STATUS"),
   field_18572("ADVANCEMENT_TAB"),
   field_18577("SELECT_TRADE"),
   field_18564("SET_BEACON_EFFECT"),
   field_18550("HELD_ITEM_CHANGE"),
   field_18575("UPDATE_COMMAND_BLOCK"),
   field_18568("UPDATE_COMMAND_BLOCK_MINECART"),
   field_18582("CREATIVE_INVENTORY_ACTION"),
   field_18584("UPDATE_JIGSAW_BLOCK"),
   field_18543("UPDATE_STRUCTURE_BLOCK"),
   field_18548("UPDATE_SIGN"),
   field_18578("ANIMATION"),
   field_18558("SPECTATE"),
   field_18539("PLAYER_BLOCK_PLACEMENT"),
   field_18535("USE_ITEM");

   public String field_18559;

   private class_3799(String var3) {
      this.field_18559 = var3;
   }

   @Override
   public String method_31560() {
      return this.field_18559;
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
