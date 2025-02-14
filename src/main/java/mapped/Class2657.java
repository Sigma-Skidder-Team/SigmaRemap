package mapped;

import net.minecraft.entity.LivingEntity;

public class Class2657 extends MeleeAttackGoal {
   private static String[] field16989;

   public Class2657(SpiderEntity var1) {
      super(var1, 1.0, true);
   }

   @Override
   public boolean method10803() {
      return super.method10803() && !this.field16990.isBeingRidden();
   }

   @Override
   public boolean method10806() {
      float var3 = this.field16990.getBrightness();
      if (var3 >= 0.5F && this.field16990.getRNG().nextInt(100) == 0) {
         this.field16990.setAttackTarget((LivingEntity)null);
         return false;
      } else {
         return super.method10806();
      }
   }

   @Override
   public double method10859(LivingEntity var1) {
      return (double)(4.0F + var1.getWidth());
   }
}
