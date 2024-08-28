package mapped;

public enum Class1923 implements Class1919 {
   field11865("KEEP_ALIVE"),
   field11866("CHAT_MESSAGE"),
   field11867("INTERACT_ENTITY"),
   field11868("PLAYER_MOVEMENT"),
   field11869("PLAYER_POSITION"),
   field11870("PLAYER_ROTATION"),
   field11871("PLAYER_POSITION_AND_ROTATION"),
   field11872("PLAYER_DIGGING"),
   field11873("PLAYER_BLOCK_PLACEMENT"),
   field11874("HELD_ITEM_CHANGE"),
   field11875("ANIMATION"),
   field11876("ENTITY_ACTION"),
   field11877("STEER_VEHICLE"),
   field11878("CLOSE_WINDOW"),
   field11879("CLICK_WINDOW"),
   field11880("WINDOW_CONFIRMATION"),
   field11881("CREATIVE_INVENTORY_ACTION"),
   field11882("CLICK_WINDOW_BUTTON"),
   field11883("UPDATE_SIGN"),
   field11884("PLAYER_ABILITIES"),
   field11885("TAB_COMPLETE"),
   field11886("CLIENT_SETTINGS"),
   field11887("CLIENT_STATUS"),
   field11888("PLUGIN_MESSAGE"),
   field11889("SPECTATE"),
   field11890("RESOURCE_PACK_STATUS");

   public String field11891;
   private static final Class1923[] field11892 = new Class1923[]{
      field11865,
      field11866,
      field11867,
      field11868,
      field11869,
      field11870,
      field11871,
      field11872,
      field11873,
      field11874,
      field11875,
      field11876,
      field11877,
      field11878,
      field11879,
      field11880,
      field11881,
      field11882,
      field11883,
      field11884,
      field11885,
      field11886,
      field11887,
      field11888,
      field11889,
      field11890
   };

   private Class1923(String var3) {
      this.field11891 = var3;
   }

   @Override
   public String method8193() {
      return this.field11891;
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
