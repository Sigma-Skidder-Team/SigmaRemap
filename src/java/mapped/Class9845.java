package mapped;

import net.minecraft.pathfinding.PathType;

// $VF: synthetic class
public class Class9845 {
   private static String[] field45948;
   public static final int[] field45949 = new int[PathType.values().length];

   static {
      try {
         field45949[PathType.field12614.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field45949[PathType.field12615.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field45949[PathType.AIR.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
