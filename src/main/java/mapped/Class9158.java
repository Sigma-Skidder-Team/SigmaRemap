package mapped;

// $VF: synthetic class
public class Class9158 {
   private static String[] field42042;
   public static final int[] field42043;
   public static final int[] field42044 = new int[MinecartType.values().length];

   static {
      try {
         field42044[MinecartType.FURNACE.ordinal()] = 1;
      } catch (NoSuchFieldError var10) {
      }

      try {
         field42044[MinecartType.CHEST.ordinal()] = 2;
      } catch (NoSuchFieldError var9) {
      }

      try {
         field42044[MinecartType.TNT.ordinal()] = 3;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field42044[MinecartType.HOPPER.ordinal()] = 4;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field42044[MinecartType.COMMAND_BLOCK.ordinal()] = 5;
      } catch (NoSuchFieldError var6) {
      }

      field42043 = new int[RayTraceResult.Type.values().length];

      try {
         field42043[RayTraceResult.Type.ENTITY.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field42043[RayTraceResult.Type.BLOCK.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field42043[RayTraceResult.Type.MISS.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
