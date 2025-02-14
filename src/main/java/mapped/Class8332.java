package mapped;

import net.minecraft.state.properties.StairsShape;
import net.minecraft.util.Mirror;

// $VF: synthetic class
public class Class8332 {
   private static String[] field35833;
   public static final int[] field35834;
   public static final int[] field35835 = new int[Mirror.values().length];

   static {
      try {
         field35835[Mirror.field13615.ordinal()] = 1;
      } catch (NoSuchFieldError var9) {
      }

      try {
         field35835[Mirror.field13616.ordinal()] = 2;
      } catch (NoSuchFieldError var8) {
      }

      field35834 = new int[StairsShape.values().length];

      try {
         field35834[StairsShape.INNER_LEFT.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field35834[StairsShape.INNER_RIGHT.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field35834[StairsShape.OUTER_LEFT.ordinal()] = 3;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field35834[StairsShape.OUTER_RIGHT.ordinal()] = 4;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field35834[StairsShape.STRAIGHT.ordinal()] = 5;
      } catch (NoSuchFieldError var3) {
      }
   }
}
