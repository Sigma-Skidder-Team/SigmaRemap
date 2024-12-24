package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public class Class1067 extends Class1066 {
   private static String[] field5878;

   public Class1067(EntityType<? extends Class1067> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public SoundEvent getAmbientSound() {
      super.getAmbientSound();
      return SoundEvents.field26508;
   }

   @Override
   public SoundEvent method4893() {
      super.method4893();
      return SoundEvents.field26509;
   }

   @Override
   public SoundEvent getDeathSound() {
      super.getDeathSound();
      return SoundEvents.field26511;
   }

   @Nullable
   @Override
   public SoundEvent method4894() {
      return SoundEvents.field26512;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      super.getHurtSound(var1);
      return SoundEvents.field26513;
   }

   @Override
   public boolean method4386(AnimalEntity var1) {
      if (var1 != this) {
         return !(var1 instanceof Class1067) && !(var1 instanceof Class1074) ? false : this.method4961() && ((AbstractHorseEntity)var1).method4961();
      } else {
         return false;
      }
   }

   @Override
   public Class1045 method4389(ServerWorld var1, Class1045 var2) {
      EntityType var5 = !(var2 instanceof Class1074) ? EntityType.DONKEY : EntityType.MULE;
      AbstractHorseEntity var6 = (AbstractHorseEntity)var5.create(var1);
      this.method4962(var2, var6);
      return var6;
   }
}
