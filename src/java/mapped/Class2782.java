package mapped;

import java.util.EnumSet;

public class Class2782 extends Class2595 {
   private static String[] field17387;
   private final Class1046 field17388;
   private Class880 field17389;
   private double field17390;
   private double field17391;
   private double field17392;
   private final double field17393;
   private final float field17394;

   public Class2782(Class1046 var1, double var2, float var4) {
      this.field17388 = var1;
      this.field17393 = var2;
      this.field17394 = var4;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      this.field17389 = this.field17388.method4232();
      if (this.field17389 != null) {
         if (!(this.field17389.method3277(this.field17388) > (double)(this.field17394 * this.field17394))) {
            Vector3d var3 = Class8037.method27587(this.field17388, 16, 7, this.field17389.method3431());
            if (var3 != null) {
               this.field17390 = var3.field18048;
               this.field17391 = var3.field18049;
               this.field17392 = var3.field18050;
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      return !this.field17388.method4230().method21664()
         && this.field17389.method3066()
         && this.field17389.method3277(this.field17388) < (double)(this.field17394 * this.field17394);
   }

   @Override
   public void method10807() {
      this.field17389 = null;
   }

   @Override
   public void method10804() {
      this.field17388.method4230().method21654(this.field17390, this.field17391, this.field17392, this.field17393);
   }
}
