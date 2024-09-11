package mapped;

import net.minecraft.network.play.server.SPlayerListItemPacket;

// $VF: synthetic class
public class Class9002 {
   private static String[] field41158;
   public static final int[] field41159 = new int[SPlayerListItemPacket.Action.values().length];

   static {
      try {
         field41159[SPlayerListItemPacket.Action.ADD_PLAYER.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field41159[SPlayerListItemPacket.Action.UPDATE_GAME_MODE.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field41159[SPlayerListItemPacket.Action.UPDATE_LATENCY.ordinal()] = 3;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field41159[SPlayerListItemPacket.Action.UPDATE_DISPLAY_NAME.ordinal()] = 4;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field41159[SPlayerListItemPacket.Action.REMOVE_PLAYER.ordinal()] = 5;
      } catch (NoSuchFieldError var3) {
      }
   }
}
