package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.SoundEvents;

public class Class2650 extends Class2647 {
   private static String[] field16989;
   public final Class1095 field17002;

   public Class2650(Class1095 var1, double var2, boolean var4) {
      super(var1, var2, var4);
      this.field17002 = var1;
   }

   @Override
   public void method10854(LivingEntity var1, double var2) {
      double var6 = this.method10859(var1);
      if (var2 <= var6 && this.method10856()) {
         this.method10855();
         this.field16990.attackEntityAsMob(var1);
         this.field17002.playSound(SoundEvents.field26590, 1.0F, 1.0F);
      }
   }

   @Override
   public void method10804() {
      this.field17002.method5144(false);
      super.method10804();
   }

   @Override
   public boolean method10803() {
      return !this.field17002.method5129()
         && !this.field17002.isSleeping()
         && !this.field17002.isCrouching()
         && !this.field17002.method5131()
         && super.method10803();
   }
}
