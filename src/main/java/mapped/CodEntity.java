package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.fish.AbstractGroupFishEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class CodEntity extends AbstractGroupFishEntity {
   private static String[] field5812;

   public CodEntity(EntityType<? extends CodEntity> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public ItemStack getFishBucket() {
      return new ItemStack(Items.field37894);
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field26458;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26459;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26461;
   }

   @Override
   public SoundEvent getFlopSound() {
      return SoundEvents.field26460;
   }
}
