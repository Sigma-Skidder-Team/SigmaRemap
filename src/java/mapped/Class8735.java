package mapped;

import net.minecraft.pathfinding.PathType;

// $VF: synthetic class
public class Class8735 {
   private static String[] field39384;
   public static final int[] field39385 = new int[PathType.values().length];

   static {
      try {
         field39385[PathType.field12614.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field39385[PathType.field12615.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field39385[PathType.AIR.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
