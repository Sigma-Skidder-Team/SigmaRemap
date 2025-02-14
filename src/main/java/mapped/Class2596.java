package mapped;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;

import java.util.function.Predicate;

public class Class2596<T extends MobEntity> extends Class2595 {
   private static String[] field16816;
   private final T field16817;
   private final ItemStack field16818;
   private final Predicate<? super T> field16819;
   private final SoundEvent field16820;

   public Class2596(T var1, ItemStack var2, SoundEvent var3, Predicate<? super T> var4) {
      this.field16817 = (T)var1;
      this.field16818 = var2;
      this.field16820 = var3;
      this.field16819 = var4;
   }

   @Override
   public boolean method10803() {
      return this.field16819.test(this.field16817);
   }

   @Override
   public boolean method10806() {
      return this.field16817.isHandActive();
   }

   @Override
   public void startExecuting() {
      this.field16817.setItemStackToSlot(EquipmentSlotType.MAINHAND, this.field16818.copy());
      this.field16817.setActiveHand(Hand.MAIN_HAND);
   }

   @Override
   public void method10807() {
      this.field16817.setItemStackToSlot(EquipmentSlotType.MAINHAND, ItemStack.EMPTY);
      if (this.field16820 != null) {
         this.field16817.playSound(this.field16820, 1.0F, this.field16817.getRNG().nextFloat() * 0.2F + 0.9F);
      }
   }
}
