package mapped;

import net.minecraft.world.GameType;

// $VF: synthetic class
public class Class9243 {
   private static String[] field42530;
   public static final int[] field42531;
   public static final int[] field42532 = new int[GameType.values().length];

   static {
      try {
         field42532[GameType.SPECTATOR.ordinal()] = 1;
      } catch (NoSuchFieldError var9) {
      }

      try {
         field42532[GameType.field11102.ordinal()] = 2;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field42532[GameType.field11103.ordinal()] = 3;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field42532[GameType.field11104.ordinal()] = 4;
      } catch (NoSuchFieldError var6) {
      }

      field42531 = new int[Class2150.values().length];

      try {
         field42531[Class2150.field14055.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field42531[Class2150.field14056.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field42531[Class2150.field14057.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
