package mapped;

// $VF: synthetic class
public class Class7913 {
   private static String[] field33894;
   public static final int[] field33895 = new int[Heightmap.Type.values().length];

   static {
      try {
         field33895[Heightmap.Type.WORLD_SURFACE_WG.ordinal()] = 1;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field33895[Heightmap.Type.OCEAN_FLOOR_WG.ordinal()] = 2;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field33895[Heightmap.Type.WORLD_SURFACE.ordinal()] = 3;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field33895[Heightmap.Type.OCEAN_FLOOR.ordinal()] = 4;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field33895[Heightmap.Type.MOTION_BLOCKING.ordinal()] = 5;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field33895[Heightmap.Type.MOTION_BLOCKING_NO_LEAVES.ordinal()] = 6;
      } catch (NoSuchFieldError var3) {
      }
   }
}
