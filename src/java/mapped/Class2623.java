package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;

import java.util.EnumSet;
import java.util.List;

public class Class2623 extends Class2595 {
   private static String[] field16915;
   private int field16916;
   public final PandaEntity field16917;

   public Class2623(PandaEntity var1) {
      this.field16917 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      if (this.field16916 <= this.field16917.ticksExisted
         && !this.field16917.isChild()
         && !this.field16917.isInWater()
         && this.field16917.method5230()
         && this.field16917.method5186() <= 0) {
         List var3 = this.field16917
            .world
            .<ItemEntity>getEntitiesInAABBexcluding(ItemEntity.class, this.field16917.getBoundingBox().grow(6.0, 6.0, 6.0), PandaEntity.method5243());
         return !var3.isEmpty() || !this.field16917.getItemStackFromSlot(EquipmentSlotType.MAINHAND).isEmpty();
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      return !this.field16917.isInWater() && (this.field16917.method5210() || PandaEntity.method5244(this.field16917).nextInt(600) != 1)
         ? PandaEntity.method5245(this.field16917).nextInt(2000) != 1
         : false;
   }

   @Override
   public void method10805() {
      if (!this.field16917.method5189() && !this.field16917.getItemStackFromSlot(EquipmentSlotType.MAINHAND).isEmpty()) {
         PandaEntity.method5246(this.field16917);
      }
   }

   @Override
   public void method10804() {
      List var3 = this.field16917
         .world
         .<ItemEntity>getEntitiesInAABBexcluding(ItemEntity.class, this.field16917.getBoundingBox().grow(8.0, 8.0, 8.0), PandaEntity.method5243());
      if (!var3.isEmpty() && this.field16917.getItemStackFromSlot(EquipmentSlotType.MAINHAND).isEmpty()) {
         this.field16917.method4230().method21655((Entity)var3.get(0), 1.2F);
      } else if (!this.field16917.getItemStackFromSlot(EquipmentSlotType.MAINHAND).isEmpty()) {
         PandaEntity.method5246(this.field16917);
      }

      this.field16916 = 0;
   }

   @Override
   public void method10807() {
      ItemStack var3 = this.field16917.getItemStackFromSlot(EquipmentSlotType.MAINHAND);
      if (!var3.isEmpty()) {
         this.field16917.method3302(var3);
         this.field16917.setItemStackToSlot(EquipmentSlotType.MAINHAND, ItemStack.EMPTY);
         int var4 = !this.field16917.method5210()
            ? PandaEntity.method5248(this.field16917).nextInt(150) + 10
            : PandaEntity.method5247(this.field16917).nextInt(50) + 10;
         this.field16916 = this.field16917.ticksExisted + var4 * 20;
      }

      this.field16917.method5190(false);
   }
}
