package mapped;

import java.util.EnumSet;

public class Class2778 extends Class2595 {
   private static String[] field17375;
   private final Class1013 field17376;

   public Class2778(Class1013 var1) {
      this.field17376 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14659, Class2240.field14657));
   }

   @Override
   public boolean method10806() {
      return this.field17376.method4402();
   }

   @Override
   public boolean method10803() {
      if (this.field17376.method4393()) {
         if (this.field17376.method3255()) {
            return false;
         } else if (this.field17376.method3226()) {
            Class880 var3 = this.field17376.method4400();
            if (var3 == null) {
               return true;
            } else {
               return this.field17376.getDistanceSq(var3) < 144.0 && var3.method3014() != null ? false : this.field17376.method4402();
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public void method10804() {
      this.field17376.method4230().method21666();
      this.field17376.method4396(true);
   }

   @Override
   public void method10807() {
      this.field17376.method4396(false);
   }
}
