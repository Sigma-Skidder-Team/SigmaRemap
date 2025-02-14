package mapped;

// $VF: synthetic class
public class Class8869 {
   private static String[] field40060;
   public static final int[] field40061 = new int[RayTraceResult.Type.values().length];

   static {
      try {
         field40061[RayTraceResult.Type.BLOCK.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field40061[RayTraceResult.Type.ENTITY.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }
   }
}
