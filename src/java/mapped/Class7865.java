package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;

import java.util.List;
import java.util.Optional;

public class Class7865 implements Class7864 {
   private final Entity field33677;
   private final boolean field33678;

   public Class7865(Entity var1, boolean var2) {
      this.field33677 = var1;
      this.field33678 = var2;
   }

   @Override
   public Vector3d method26356() {
      return !this.field33678 ? this.field33677.getPositionVec() : this.field33677.getPositionVec().method11339(0.0, (double)this.field33677.method3393(), 0.0);
   }

   @Override
   public BlockPos method26357() {
      return this.field33677.getPosition();
   }

   @Override
   public boolean method26358(LivingEntity var1) {
      if (!(this.field33677 instanceof LivingEntity)) {
         return true;
      } else {
         Optional var4 = var1.method2992().<List<LivingEntity>>method21410(Class8830.field39819);
         return this.field33677.isAlive() && var4.isPresent() && ((List)var4.get()).contains(this.field33677);
      }
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.field33677;
   }
}
