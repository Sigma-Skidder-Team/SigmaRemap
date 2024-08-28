package mapped;

import java.util.EnumSet;

public class Class2624 extends Class2595 {
   private static String[] field16918;
   private final Class1010 field16919;
   private Class880 field16920;

   public Class2624(Class1010 var1) {
      this.field16919 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14659, Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      this.field16920 = this.field16919.method4232();
      if (this.field16920 instanceof PlayerEntity) {
         double var3 = this.field16920.method3277(this.field16919);
         return !(var3 > 256.0) ? Class1010.method4362(this.field16919, (PlayerEntity)this.field16920) : false;
      } else {
         return false;
      }
   }

   @Override
   public void method10804() {
      this.field16919.method4230().method21666();
   }

   @Override
   public void method10805() {
      this.field16919.method4227().method28041(this.field16920.getPosX(), this.field16920.method3442(), this.field16920.getPosZ());
   }
}
