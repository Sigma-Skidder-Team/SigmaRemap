package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;

import javax.annotation.Nullable;

public abstract class Class7361 implements Class7373 {
   public final Class1007 field31519;

   public Class7361(Class1007 var1) {
      this.field31519 = var1;
   }

   @Override
   public boolean method23358() {
      return false;
   }

   @Override
   public void method23359() {
   }

   @Override
   public void method23360() {
   }

   @Override
   public void method23361(EnderCrystalEntity var1, BlockPos var2, DamageSource var3, PlayerEntity var4) {
   }

   @Override
   public void method23362() {
   }

   @Override
   public void method23363() {
   }

   @Override
   public float method23364() {
      return 0.6F;
   }

   @Nullable
   @Override
   public Vector3d method23365() {
      return null;
   }

   @Override
   public float method23366(DamageSource var1, float var2) {
      return var2;
   }

   @Override
   public float method23367() {
      float var3 = MathHelper.sqrt(Entity.horizontalMag(this.field31519.getMotion())) + 1.0F;
      float var4 = Math.min(var3, 40.0F);
      return 0.7F / var4 / var3;
   }
}
