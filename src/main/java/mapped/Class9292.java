package mapped;

import net.minecraft.state.properties.ChestType;

// $VF: synthetic class
public class Class9292 {
   private static String[] field42733;
   public static final int[] field42734 = new int[ChestType.values().length];

   static {
      try {
         field42734[ChestType.LEFT.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field42734[ChestType.RIGHT.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field42734[ChestType.field379.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }
   }
}
