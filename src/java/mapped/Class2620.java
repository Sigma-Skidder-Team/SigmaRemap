package mapped;

import java.util.EnumSet;

public class Class2620 extends Class2595 {
   private static String[] field16904;
   private final Class1108 field16905;
   private int field16906;

   public Class2620(Class1108 var1) {
      this.field16905 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14658));
   }

   @Override
   public boolean method10803() {
      Class880 var3 = this.field16905.method4232();
      if (var3 != null) {
         if (!var3.method3066()) {
            return false;
         } else {
            return var3 instanceof PlayerEntity && ((PlayerEntity)var3).field4919.field29606 ? false : this.field16905.method4228() instanceof Class6841;
         }
      } else {
         return false;
      }
   }

   @Override
   public void method10804() {
      this.field16906 = 300;
      super.method10804();
   }

   @Override
   public boolean method10806() {
      Class880 var3 = this.field16905.method4232();
      if (var3 != null) {
         if (var3.method3066()) {
            return var3 instanceof PlayerEntity && ((PlayerEntity)var3).field4919.field29606 ? false : --this.field16906 > 0;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public void method10805() {
      this.field16905.method4262(this.field16905.method4232(), 10.0F, 10.0F);
      ((Class6841)this.field16905.method4228()).method20822(this.field16905.field5031, this.field16905.method5325());
   }
}
