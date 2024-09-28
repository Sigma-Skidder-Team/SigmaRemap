package mapped;

import net.minecraft.state.properties.SlabType;

// $VF: synthetic class
public class Class3497 {
   private static String[] field19371;
   public static final int[] field19372;
   public static final int[] field19373 = new int[Class1947.values().length];

   static {
      try {
         field19373[Class1947.field12614.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field19373[Class1947.field12615.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field19373[Class1947.field12616.ordinal()] = 3;
      } catch (NoSuchFieldError var5) {
      }

      field19372 = new int[SlabType.values().length];

      try {
         field19372[SlabType.field220.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field19372[SlabType.field218.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }
   }
}
