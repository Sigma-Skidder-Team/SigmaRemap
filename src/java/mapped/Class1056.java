package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public abstract class Class1056 extends Class1046 {
   public Class1056(EntityType<? extends Class1056> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public boolean onLivingFall(float var1, float var2) {
      return false;
   }

   @Nullable
   @Override
   public SoundEvent getAmbientSound() {
      return null;
   }

   @Nullable
   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return null;
   }

   @Nullable
   @Override
   public SoundEvent getDeathSound() {
      return null;
   }

   @Override
   public int method4236() {
      return 120;
   }

   @Override
   public boolean method4254(double var1) {
      return false;
   }
}
