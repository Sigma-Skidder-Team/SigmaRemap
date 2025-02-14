package mapped;

import net.minecraft.state.properties.RailShape;

// $VF: synthetic class
public class Class4683 {
   private static String[] field22259;
   public static final int[] field22260 = new int[RailShape.values().length];

   static {
      try {
         field22260[RailShape.field249.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field22260[RailShape.field250.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field22260[RailShape.field251.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field22260[RailShape.field252.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
