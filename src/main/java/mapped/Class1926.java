package mapped;

public enum Class1926 implements Class1919 {
   field11954("TELEPORT_CONFIRM"),
   field11955("QUERY_BLOCK_NBT"),
   field11956("SET_DIFFICULTY"),
   field11957("CHAT_MESSAGE"),
   field11958("CLIENT_STATUS"),
   field11959("CLIENT_SETTINGS"),
   field11960("TAB_COMPLETE"),
   field11961("WINDOW_CONFIRMATION"),
   field11962("CLICK_WINDOW_BUTTON"),
   field11963("CLICK_WINDOW"),
   field11964("CLOSE_WINDOW"),
   field11965("PLUGIN_MESSAGE"),
   field11966("EDIT_BOOK"),
   field11967("ENTITY_NBT_REQUEST"),
   field11968("INTERACT_ENTITY"),
   field11969("GENERATE_JIGSAW"),
   field11970("KEEP_ALIVE"),
   field11971("LOCK_DIFFICULTY"),
   field11972("PLAYER_POSITION"),
   field11973("PLAYER_POSITION_AND_ROTATION"),
   field11974("PLAYER_ROTATION"),
   field11975("PLAYER_MOVEMENT"),
   field11976("VEHICLE_MOVE"),
   field11977("STEER_BOAT"),
   field11978("PICK_ITEM"),
   field11979("CRAFT_RECIPE_REQUEST"),
   field11980("PLAYER_ABILITIES"),
   field11981("PLAYER_DIGGING"),
   field11982("ENTITY_ACTION"),
   field11983("STEER_VEHICLE"),
   field11984("RECIPE_BOOK_DATA"),
   field11985("RENAME_ITEM"),
   field11986("RESOURCE_PACK_STATUS"),
   field11987("ADVANCEMENT_TAB"),
   field11988("SELECT_TRADE"),
   field11989("SET_BEACON_EFFECT"),
   field11990("HELD_ITEM_CHANGE"),
   field11991("UPDATE_COMMAND_BLOCK"),
   field11992("UPDATE_COMMAND_BLOCK_MINECART"),
   field11993("CREATIVE_INVENTORY_ACTION"),
   field11994("UPDATE_JIGSAW_BLOCK"),
   field11995("UPDATE_STRUCTURE_BLOCK"),
   field11996("UPDATE_SIGN"),
   field11997("ANIMATION"),
   field11998("SPECTATE"),
   field11999("PLAYER_BLOCK_PLACEMENT"),
   field12000("USE_ITEM");

   public String field12001;
   private static final Class1926[] field12002 = new Class1926[]{
      field11954,
      field11955,
      field11956,
      field11957,
      field11958,
      field11959,
      field11960,
      field11961,
      field11962,
      field11963,
      field11964,
      field11965,
      field11966,
      field11967,
      field11968,
      field11969,
      field11970,
      field11971,
      field11972,
      field11973,
      field11974,
      field11975,
      field11976,
      field11977,
      field11978,
      field11979,
      field11980,
      field11981,
      field11982,
      field11983,
      field11984,
      field11985,
      field11986,
      field11987,
      field11988,
      field11989,
      field11990,
      field11991,
      field11992,
      field11993,
      field11994,
      field11995,
      field11996,
      field11997,
      field11998,
      field11999,
      field12000
   };

   private Class1926(String var3) {
      this.field12001 = var3;
   }

   @Override
   public String method8193() {
      return this.field12001;
   }

   @Override
   public int method8194() {
      for (int var3 = 0; var3 < values().length; var3++) {
         if (values()[var3] == this) {
            return var3;
         }
      }

      return 0;
   }
}
