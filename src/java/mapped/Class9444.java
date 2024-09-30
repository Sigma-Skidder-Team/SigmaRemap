package mapped;

import net.minecraft.pathfinding.PathType;

// $VF: synthetic class
public class Class9444 {
   private static String[] field43873;
   public static final int[] field43874 = new int[PathType.values().length];

   static {
      try {
         field43874[PathType.field12614.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field43874[PathType.field12615.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field43874[PathType.AIR.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
