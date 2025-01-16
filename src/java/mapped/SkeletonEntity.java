package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class SkeletonEntity extends Class1082 {
   private static String[] field5950;

   public SkeletonEntity(EntityType<? extends SkeletonEntity> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field27059;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field27069;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field27060;
   }

   @Override
   public SoundEvent method5030() {
      return SoundEvents.field27071;
   }

   @Override
   public void dropSpecialItems(DamageSource var1, int var2, boolean var3) {
      super.dropSpecialItems(var1, var2, var3);
      Entity var6 = var1.getTrueSource();
      if (var6 instanceof CreeperEntity) {
         CreeperEntity var7 = (CreeperEntity)var6;
         if (var7.method5026()) {
            var7.method5027();
            this.entityDropItem(Items.field38058);
         }
      }
   }
}
