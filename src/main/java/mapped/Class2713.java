package mapped;

import net.minecraft.entity.LivingEntity;

public class Class2713 extends NearestAttackableTargetGoal<LivingEntity> {
   private static String[] field17187;

   public Class2713(VindicatorEntity var1) {
      super(var1, LivingEntity.class, 0, true, true, LivingEntity::attackable);
   }

   @Override
   public boolean method10803() {
      return VindicatorEntity.method4593((VindicatorEntity)this.field17153) && super.method10803();
   }

   @Override
   public void startExecuting() {
      super.startExecuting();
      this.field17153.setIdleTime(0);
   }
}
