package mapped;

import net.minecraft.inventory.EquipmentSlotType;

// $VF: synthetic class
public class Class8717 {
   private static String[] field39332;
   public static final int[] field39333;
   public static final int[] field39334 = new int[EquipmentSlotType.values().length];

   static {
      try {
         field39334[EquipmentSlotType.MAINHAND.ordinal()] = 1;
      } catch (NoSuchFieldError var10) {
      }

      try {
         field39334[EquipmentSlotType.OFFHAND.ordinal()] = 2;
      } catch (NoSuchFieldError var9) {
      }

      try {
         field39334[EquipmentSlotType.HEAD.ordinal()] = 3;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field39334[EquipmentSlotType.CHEST.ordinal()] = 4;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field39334[EquipmentSlotType.FEET.ordinal()] = 5;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field39334[EquipmentSlotType.LEGS.ordinal()] = 6;
      } catch (NoSuchFieldError var5) {
      }

      field39333 = new int[EquipmentSlotType.Group.values().length];

      try {
         field39333[EquipmentSlotType.Group.HAND.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field39333[EquipmentSlotType.Group.ARMOR.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }
   }
}
