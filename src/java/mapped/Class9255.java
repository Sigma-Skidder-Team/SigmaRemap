package mapped;

import net.minecraft.network.play.server.SUpdateBossInfoPacket;

// $VF: synthetic class
public class Class9255 {
   private static String[] field42561;
   public static final int[] field42562 = new int[SUpdateBossInfoPacket.Operation.values().length];

   static {
      try {
         field42562[SUpdateBossInfoPacket.Operation.ADD.ordinal()] = 1;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field42562[SUpdateBossInfoPacket.Operation.REMOVE.ordinal()] = 2;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field42562[SUpdateBossInfoPacket.Operation.UPDATE_PCT.ordinal()] = 3;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field42562[SUpdateBossInfoPacket.Operation.UPDATE_NAME.ordinal()] = 4;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field42562[SUpdateBossInfoPacket.Operation.UPDATE_STYLE.ordinal()] = 5;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field42562[SUpdateBossInfoPacket.Operation.UPDATE_PROPERTIES.ordinal()] = 6;
      } catch (NoSuchFieldError var3) {
      }
   }
}
