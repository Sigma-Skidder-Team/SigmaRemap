package mapped;

import net.minecraft.state.properties.AttachFace;
import net.minecraft.util.Direction;

// $VF: synthetic class
public class Class6392 {
   private static String[] field27978;
   public static final int[] field27979;
   public static final int[] field27980 = new int[AttachFace.values().length];

   static {
      try {
         field27980[AttachFace.field313.ordinal()] = 1;
      } catch (NoSuchFieldError var9) {
      }

      try {
         field27980[AttachFace.field314.ordinal()] = 2;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field27980[AttachFace.field315.ordinal()] = 3;
      } catch (NoSuchFieldError var7) {
      }

      field27979 = new int[Direction.values().length];

      try {
         field27979[Direction.EAST.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field27979[Direction.WEST.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field27979[Direction.SOUTH.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field27979[Direction.NORTH.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
