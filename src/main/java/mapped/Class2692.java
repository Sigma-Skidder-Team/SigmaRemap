package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;

public abstract class Class2692 extends Class2595 {
   private final EntityPredicate field17132;
   public final FoxEntity field17133;

   public Class2692(FoxEntity var1) {
      this.field17133 = var1;
      EntityPredicate var10001 = new EntityPredicate().method30203(12.0).method30206();
      FoxEntity var10004 = this.field17133;
      this.field17133.getClass();
      this.field17132 = var10001.method30209(new Class168(var10004));
   }

   public boolean method10910() {
      BlockPos var3 = new BlockPos(this.field17133.getPosX(), this.field17133.getBoundingBox().maxY, this.field17133.getPosZ());
      return !this.field17133.world.method7022(var3) && this.field17133.getBlockPathWeight(var3) >= 0.0F;
   }

   public boolean method10911() {
      return !this.field17133
         .world
         .<LivingEntity>method7195(LivingEntity.class, this.field17132, this.field17133, this.field17133.getBoundingBox().grow(12.0, 6.0, 12.0))
         .isEmpty();
   }
}
