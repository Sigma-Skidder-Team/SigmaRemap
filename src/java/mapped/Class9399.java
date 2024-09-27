package mapped;

import net.minecraft.util.Rotation;

// $VF: synthetic class
public class Class9399 {
   private static String[] field43616;
   public static final int[] field43617 = new int[Rotation.values().length];

   static {
      try {
         field43617[Rotation.field187.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field43617[Rotation.field188.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field43617[Rotation.field186.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
