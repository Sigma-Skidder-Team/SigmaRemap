package mapped;

import java.util.EnumSet;

public class Class2696 extends Class2595 {
   private static String[] field17146;
   public final Class1031 field17147;

   public Class2696(Class1031 var1) {
      this.field17147 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658));
   }

   @Override
   public boolean method10803() {
      return this.field17147.method4597() > 0;
   }

   @Override
   public void method10804() {
      super.method10804();
      Class1031.method4599(this.field17147).method21666();
   }

   @Override
   public void method10807() {
      super.method10807();
      this.field17147.method4595(Class2031.field13181);
   }

   @Override
   public void method10805() {
      if (this.field17147.getAttackTarget() != null) {
         this.field17147.method4227().method28040(this.field17147.getAttackTarget(), (float)this.field17147.method4260(), (float)this.field17147.method4259());
      }
   }
}
