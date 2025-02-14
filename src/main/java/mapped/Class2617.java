package mapped;

import net.minecraft.inventory.EquipmentSlotType;

public class Class2617 extends Class2595 {
   private static String[] field16891;
   private final CreatureEntity field16892;

   public Class2617(CreatureEntity var1) {
      this.field16892 = var1;
   }

   @Override
   public boolean method10803() {
      return this.field16892.world.method6740() && this.field16892.getItemStackFromSlot(EquipmentSlotType.HEAD).isEmpty() && Class8100.method28053(this.field16892);
   }

   @Override
   public void startExecuting() {
      ((Class6991)this.field16892.method4230()).method21684(true);
   }

   @Override
   public void method10807() {
      if (Class8100.method28053(this.field16892)) {
         ((Class6991)this.field16892.method4230()).method21684(false);
      }
   }
}
