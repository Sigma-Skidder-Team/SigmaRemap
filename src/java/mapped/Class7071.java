package mapped;

import net.minecraft.network.play.server.SUpdateBossInfoPacket;

// $VF: synthetic class
public class Class7071 {
   private static String[] field30456;
   public static final int[] field30457 = new int[SUpdateBossInfoPacket.Operation.values().length];

   static {
      try {
         field30457[SUpdateBossInfoPacket.Operation.UPDATE_NAME.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field30457[SUpdateBossInfoPacket.Operation.UPDATE_PCT.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field30457[SUpdateBossInfoPacket.Operation.UPDATE_STYLE.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field30457[SUpdateBossInfoPacket.Operation.UPDATE_PROPERTIES.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
