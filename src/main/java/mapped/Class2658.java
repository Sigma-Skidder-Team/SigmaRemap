package mapped;

import net.minecraft.entity.LivingEntity;

public class Class2658 extends MeleeAttackGoal {
   private static String[] field16989;
   public final PolarBearEntity field17010;

   public Class2658(PolarBearEntity var1) {
      super(var1, 1.25, true);
      this.field17010 = var1;
   }

   @Override
   public void method10854(LivingEntity var1, double var2) {
      double var6 = this.method10859(var1);
      if (var2 <= var6 && this.method10856()) {
         this.method10855();
         this.field16990.attackEntityAsMob(var1);
         this.field17010.method5184(false);
      } else if (!(var2 <= var6 * 2.0)) {
         this.method10855();
         this.field17010.method5184(false);
      } else {
         if (this.method10856()) {
            this.field17010.method5184(false);
            this.method10855();
         }

         if (this.method10857() <= 10) {
            this.field17010.method5184(true);
            this.field17010.method5182();
         }
      }
   }

   @Override
   public void method10807() {
      this.field17010.method5184(false);
      super.method10807();
   }

   @Override
   public double method10859(LivingEntity var1) {
      return (double)(4.0F + var1.getWidth());
   }
}
