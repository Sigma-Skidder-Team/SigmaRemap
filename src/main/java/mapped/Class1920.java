package mapped;

public enum Class1920 implements Class1919 {
   field11722("TELEPORT_CONFIRM"),
   field11723("QUERY_BLOCK_NBT"),
   field11724("SET_DIFFICULTY"),
   field11725("CHAT_MESSAGE"),
   field11726("CLIENT_STATUS"),
   field11727("CLIENT_SETTINGS"),
   field11728("TAB_COMPLETE"),
   field11729("WINDOW_CONFIRMATION"),
   field11730("CLICK_WINDOW_BUTTON"),
   field11731("CLICK_WINDOW"),
   field11732("CLOSE_WINDOW"),
   field11733("PLUGIN_MESSAGE"),
   field11734("EDIT_BOOK"),
   field11735("ENTITY_NBT_REQUEST"),
   field11736("INTERACT_ENTITY"),
   field11737("GENERATE_JIGSAW"),
   field11738("KEEP_ALIVE"),
   field11739("LOCK_DIFFICULTY"),
   field11740("PLAYER_POSITION"),
   field11741("PLAYER_POSITION_AND_ROTATION"),
   field11742("PLAYER_ROTATION"),
   field11743("PLAYER_MOVEMENT"),
   field11744("VEHICLE_MOVE"),
   field11745("STEER_BOAT"),
   field11746("PICK_ITEM"),
   field11747("CRAFT_RECIPE_REQUEST"),
   field11748("PLAYER_ABILITIES"),
   field11749("PLAYER_DIGGING"),
   field11750("ENTITY_ACTION"),
   field11751("STEER_VEHICLE"),
   field11752("RECIPE_BOOK_DATA"),
   field11753("SEEN_RECIPE"),
   field11754("RENAME_ITEM"),
   field11755("RESOURCE_PACK_STATUS"),
   field11756("ADVANCEMENT_TAB"),
   field11757("SELECT_TRADE"),
   field11758("SET_BEACON_EFFECT"),
   field11759("HELD_ITEM_CHANGE"),
   field11760("UPDATE_COMMAND_BLOCK"),
   field11761("UPDATE_COMMAND_BLOCK_MINECART"),
   field11762("CREATIVE_INVENTORY_ACTION"),
   field11763("UPDATE_JIGSAW_BLOCK"),
   field11764("UPDATE_STRUCTURE_BLOCK"),
   field11765("UPDATE_SIGN"),
   field11766("ANIMATION"),
   field11767("SPECTATE"),
   field11768("PLAYER_BLOCK_PLACEMENT"),
   field11769("USE_ITEM");

   public String field11770;
   private static final Class1920[] field11771 = new Class1920[]{
      field11722,
      field11723,
      field11724,
      field11725,
      field11726,
      field11727,
      field11728,
      field11729,
      field11730,
      field11731,
      field11732,
      field11733,
      field11734,
      field11735,
      field11736,
      field11737,
      field11738,
      field11739,
      field11740,
      field11741,
      field11742,
      field11743,
      field11744,
      field11745,
      field11746,
      field11747,
      field11748,
      field11749,
      field11750,
      field11751,
      field11752,
      field11753,
      field11754,
      field11755,
      field11756,
      field11757,
      field11758,
      field11759,
      field11760,
      field11761,
      field11762,
      field11763,
      field11764,
      field11765,
      field11766,
      field11767,
      field11768,
      field11769
   };

   private Class1920(String var3) {
      this.field11770 = var3;
   }

   @Override
   public String method8193() {
      return this.field11770;
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
