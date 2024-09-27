package mapped;

import net.minecraft.inventory.EquipmentSlotType;

// $VF: synthetic class
public class Class8875 {
   private static String[] field40094;
   public static final int[] field40095 = new int[EquipmentSlotType.values().length];

   static {
      try {
         field40095[EquipmentSlotType.HEAD.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field40095[EquipmentSlotType.CHEST.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field40095[EquipmentSlotType.LEGS.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field40095[EquipmentSlotType.FEET.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
