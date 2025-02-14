package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;

import java.util.function.Predicate;

public class Class2720 extends NearestAttackableTargetGoal<PlayerEntity> {
   private static String[] field17187;
   public final PolarBearEntity field17206;

   public Class2720(PolarBearEntity var1) {
      super(var1, PlayerEntity.class, 20, true, true, (Predicate<LivingEntity>)null);
      this.field17206 = var1;
   }

   @Override
   public boolean method10803() {
      if (this.field17206.isChild()) {
         return false;
      } else {
         if (super.method10803()) {
            for (PolarBearEntity var4 : this.field17206.world.<PolarBearEntity>getEntitiesWithinAABB(PolarBearEntity.class, this.field17206.getBoundingBox().grow(8.0, 4.0, 8.0))) {
               if (var4.isChild()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   public double method10914() {
      return super.method10914() * 0.5;
   }
}
