package mapped;

public enum Class1922 implements Class1919 {
   field11817("TELEPORT_CONFIRM"),
   field11818("QUERY_BLOCK_NBT"),
   field11819("SET_DIFFICULTY"),
   field11820("CHAT_MESSAGE"),
   field11821("CLIENT_STATUS"),
   field11822("CLIENT_SETTINGS"),
   field11823("TAB_COMPLETE"),
   field11824("WINDOW_CONFIRMATION"),
   field11825("CLICK_WINDOW_BUTTON"),
   field11826("CLICK_WINDOW"),
   field11827("CLOSE_WINDOW"),
   field11828("PLUGIN_MESSAGE"),
   field11829("EDIT_BOOK"),
   field11830("ENTITY_NBT_REQUEST"),
   field11831("INTERACT_ENTITY"),
   field11832("KEEP_ALIVE"),
   field11833("LOCK_DIFFICULTY"),
   field11834("PLAYER_POSITION"),
   field11835("PLAYER_POSITION_AND_ROTATION"),
   field11836("PLAYER_ROTATION"),
   field11837("PLAYER_MOVEMENT"),
   field11838("VEHICLE_MOVE"),
   field11839("STEER_BOAT"),
   field11840("PICK_ITEM"),
   field11841("CRAFT_RECIPE_REQUEST"),
   field11842("PLAYER_ABILITIES"),
   field11843("PLAYER_DIGGING"),
   field11844("ENTITY_ACTION"),
   field11845("STEER_VEHICLE"),
   field11846("RECIPE_BOOK_DATA"),
   field11847("RENAME_ITEM"),
   field11848("RESOURCE_PACK_STATUS"),
   field11849("ADVANCEMENT_TAB"),
   field11850("SELECT_TRADE"),
   field11851("SET_BEACON_EFFECT"),
   field11852("HELD_ITEM_CHANGE"),
   field11853("UPDATE_COMMAND_BLOCK"),
   field11854("UPDATE_COMMAND_BLOCK_MINECART"),
   field11855("CREATIVE_INVENTORY_ACTION"),
   field11856("UPDATE_JIGSAW_BLOCK"),
   field11857("UPDATE_STRUCTURE_BLOCK"),
   field11858("UPDATE_SIGN"),
   field11859("ANIMATION"),
   field11860("SPECTATE"),
   field11861("PLAYER_BLOCK_PLACEMENT"),
   field11862("USE_ITEM");

   public String field11863;
   private static final Class1922[] field11864 = new Class1922[]{
      field11817,
      field11818,
      field11819,
      field11820,
      field11821,
      field11822,
      field11823,
      field11824,
      field11825,
      field11826,
      field11827,
      field11828,
      field11829,
      field11830,
      field11831,
      field11832,
      field11833,
      field11834,
      field11835,
      field11836,
      field11837,
      field11838,
      field11839,
      field11840,
      field11841,
      field11842,
      field11843,
      field11844,
      field11845,
      field11846,
      field11847,
      field11848,
      field11849,
      field11850,
      field11851,
      field11852,
      field11853,
      field11854,
      field11855,
      field11856,
      field11857,
      field11858,
      field11859,
      field11860,
      field11861,
      field11862
   };

   private Class1922(String var3) {
      this.field11863 = var3;
   }

   @Override
   public String method8193() {
      return this.field11863;
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
