package mapped;

public enum Class1921 implements Class1919 {
   field11772("TELEPORT_CONFIRM"),
   field11773("QUERY_BLOCK_NBT"),
   field11774("CHAT_MESSAGE"),
   field11775("CLIENT_STATUS"),
   field11776("CLIENT_SETTINGS"),
   field11777("TAB_COMPLETE"),
   field11778("WINDOW_CONFIRMATION"),
   field11779("CLICK_WINDOW_BUTTON"),
   field11780("CLICK_WINDOW"),
   field11781("CLOSE_WINDOW"),
   field11782("PLUGIN_MESSAGE"),
   field11783("EDIT_BOOK"),
   field11784("ENTITY_NBT_REQUEST"),
   field11785("INTERACT_ENTITY"),
   field11786("KEEP_ALIVE"),
   field11787("PLAYER_MOVEMENT"),
   field11788("PLAYER_POSITION"),
   field11789("PLAYER_POSITION_AND_ROTATION"),
   field11790("PLAYER_ROTATION"),
   field11791("VEHICLE_MOVE"),
   field11792("STEER_BOAT"),
   field11793("PICK_ITEM"),
   field11794("CRAFT_RECIPE_REQUEST"),
   field11795("PLAYER_ABILITIES"),
   field11796("PLAYER_DIGGING"),
   field11797("ENTITY_ACTION"),
   field11798("STEER_VEHICLE"),
   field11799("RECIPE_BOOK_DATA"),
   field11800("RENAME_ITEM"),
   field11801("RESOURCE_PACK_STATUS"),
   field11802("ADVANCEMENT_TAB"),
   field11803("SELECT_TRADE"),
   field11804("SET_BEACON_EFFECT"),
   field11805("HELD_ITEM_CHANGE"),
   field11806("UPDATE_COMMAND_BLOCK"),
   field11807("UPDATE_COMMAND_BLOCK_MINECART"),
   field11808("CREATIVE_INVENTORY_ACTION"),
   field11809("UPDATE_STRUCTURE_BLOCK"),
   field11810("UPDATE_SIGN"),
   field11811("ANIMATION"),
   field11812("SPECTATE"),
   field11813("PLAYER_BLOCK_PLACEMENT"),
   field11814("USE_ITEM");

   public String field11815;
   private static final Class1921[] field11816 = new Class1921[]{
      field11772,
      field11773,
      field11774,
      field11775,
      field11776,
      field11777,
      field11778,
      field11779,
      field11780,
      field11781,
      field11782,
      field11783,
      field11784,
      field11785,
      field11786,
      field11787,
      field11788,
      field11789,
      field11790,
      field11791,
      field11792,
      field11793,
      field11794,
      field11795,
      field11796,
      field11797,
      field11798,
      field11799,
      field11800,
      field11801,
      field11802,
      field11803,
      field11804,
      field11805,
      field11806,
      field11807,
      field11808,
      field11809,
      field11810,
      field11811,
      field11812,
      field11813,
      field11814
   };

   private Class1921(String var3) {
      this.field11815 = var3;
   }

   @Override
   public String method8193() {
      return this.field11815;
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
