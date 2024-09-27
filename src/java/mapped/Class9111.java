package mapped;

import net.minecraft.util.Rotation;

// $VF: synthetic class
public class Class9111 {
   private static String[] field41871;
   public static final int[] field41872;
   public static final int[] field41873 = new int[Rotation.values().length];

   static {
      try {
         field41873[Rotation.field188.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field41873[Rotation.field186.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      field41872 = new int[Direction.values().length];

      try {
         field41872[Direction.Z.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field41872[Direction.X.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }
   }
}
