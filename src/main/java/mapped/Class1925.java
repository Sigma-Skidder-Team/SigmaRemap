package mapped;

public enum Class1925 implements Class1919 {
   field11928("KEEP_ALIVE"),
   field11929("CHAT_MESSAGE"),
   field11930("INTERACT_ENTITY"),
   field11931("PLAYER_MOVEMENT"),
   field11932("PLAYER_POSITION"),
   field11933("PLAYER_ROTATION"),
   field11934("PLAYER_POSITION_AND_ROTATION"),
   field11935("PLAYER_DIGGING"),
   field11936("PLAYER_BLOCK_PLACEMENT"),
   field11937("HELD_ITEM_CHANGE"),
   field11938("ANIMATION"),
   field11939("ENTITY_ACTION"),
   field11940("STEER_VEHICLE"),
   field11941("CLOSE_WINDOW"),
   field11942("CLICK_WINDOW"),
   field11943("WINDOW_CONFIRMATION"),
   field11944("CREATIVE_INVENTORY_ACTION"),
   field11945("CLICK_WINDOW_BUTTON"),
   field11946("UPDATE_SIGN"),
   field11947("PLAYER_ABILITIES"),
   field11948("TAB_COMPLETE"),
   field11949("CLIENT_SETTINGS"),
   field11950("CLIENT_STATUS"),
   field11951("PLUGIN_MESSAGE");

   public String field11952;
   private static final Class1925[] field11953 = new Class1925[]{
      field11928,
      field11929,
      field11930,
      field11931,
      field11932,
      field11933,
      field11934,
      field11935,
      field11936,
      field11937,
      field11938,
      field11939,
      field11940,
      field11941,
      field11942,
      field11943,
      field11944,
      field11945,
      field11946,
      field11947,
      field11948,
      field11949,
      field11950,
      field11951
   };

   private Class1925(String var3) {
      this.field11952 = var3;
   }

   @Override
   public String method8193() {
      return this.field11952;
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
