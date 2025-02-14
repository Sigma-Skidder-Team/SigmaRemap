package mapped;

import net.minecraft.inventory.EquipmentSlotType;

// $VF: synthetic class
public class Class8979 {
   private static String[] field40588;
   public static final int[] field40589;
   public static final int[] field40590 = new int[EquipmentSlotType.values().length];

   static {
      try {
         field40590[EquipmentSlotType.HEAD.ordinal()] = 1;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field40590[EquipmentSlotType.CHEST.ordinal()] = 2;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field40590[EquipmentSlotType.LEGS.ordinal()] = 3;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field40590[EquipmentSlotType.FEET.ordinal()] = 4;
      } catch (NoSuchFieldError var5) {
      }

      field40589 = new int[EquipmentSlotType.Group.values().length];

      try {
         field40589[EquipmentSlotType.Group.HAND.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field40589[EquipmentSlotType.Group.ARMOR.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }
   }
}
