package mapped;

import com.mentalfrostbyte.jello.util.render.animation.Direction;

// $VF: synthetic class
public class Class7722 {
   private static String[] field33155;
   public static final int[] field33156 = new int[Direction.values().length];

   static {
      try {
         field33156[Direction.FORWARDS.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field33156[Direction.BACKWARDS.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }
   }
}
