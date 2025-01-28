package mapped;

import net.minecraft.entity.LivingEntity;

public class Class2708 extends HurtByTargetGoal {
   private static String[] field17178;
   public final BeeEntity field17186;

   public Class2708(BeeEntity var1, BeeEntity var2) {
      super(var2);
      this.field17186 = var1;
   }

   @Override
   public boolean method10806() {
      return this.field17186.method4369() && super.method10806();
   }

   @Override
   public void method10920(MobEntity var1, LivingEntity var2) {
      if (var1 instanceof BeeEntity && this.field17153.canEntityBeSeen(var2)) {
         var1.setAttackTarget(var2);
      }
   }
}
