package mapped;

import net.minecraft.inventory.EquipmentSlotType;

// $VF: synthetic class
public class Class7259 {
   private static String[] field31146;
   public static final int[] field31147 = new int[EquipmentSlotType.Group.values().length];

   static {
      try {
         field31147[EquipmentSlotType.Group.HAND.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field31147[EquipmentSlotType.Group.ARMOR.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }
   }
}
