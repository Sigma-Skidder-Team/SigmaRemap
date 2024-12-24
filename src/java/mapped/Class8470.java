package mapped;

// $VF: synthetic class
public class Class8470 {
   private static String[] field36294;
   public static final int[] field36295 = new int[EntitySpawnPlacementRegistry$PlacementType.values().length];

   static {
      try {
         field36295[EntitySpawnPlacementRegistry$PlacementType.IN_WATER.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field36295[EntitySpawnPlacementRegistry$PlacementType.field13475.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field36295[EntitySpawnPlacementRegistry$PlacementType.ON_GROUND.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
