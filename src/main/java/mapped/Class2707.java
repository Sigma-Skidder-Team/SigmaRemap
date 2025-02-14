package mapped;

import net.minecraft.entity.LivingEntity;

public class Class2707 extends HurtByTargetGoal {
   private static String[] field17178;
   public final PolarBearEntity field17185;

   public Class2707(PolarBearEntity var1) {
      super(var1);
      this.field17185 = var1;
   }

   @Override
   public void startExecuting() {
      super.startExecuting();
      if (this.field17185.isChild()) {
         this.method10919();
         this.method10807();
      }
   }

   @Override
   public void method10920(MobEntity var1, LivingEntity var2) {
      if (var1 instanceof PolarBearEntity && !var1.isChild()) {
         super.method10920(var1, var2);
      }
   }
}
