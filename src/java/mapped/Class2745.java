package mapped;

import java.util.EnumSet;

public class Class2745 extends Class2595 {
   private static String[] field17273;
   private final Class1006 field17274;
   private Class880 field17275;
   private final float field17276;

   public Class2745(Class1006 var1, float var2) {
      this.field17274 = var1;
      this.field17276 = var2;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14659, Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      if (!this.field17274.isBeingRidden()) {
         this.field17275 = this.field17274.method4232();
         if (this.field17275 != null) {
            double var3 = this.field17274.getDistanceSq(this.field17275);
            if (var3 < 4.0 || var3 > 16.0) {
               return false;
            } else {
               return this.field17274.method3226() ? this.field17274.method3013().nextInt(5) == 0 : false;
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
      return !this.field17274.method3226();
   }

   @Override
   public void method10804() {
      Vector3d var3 = this.field17274.method3433();
      Vector3d var4 = new Vector3d(
         this.field17275.getPosX() - this.field17274.getPosX(), 0.0, this.field17275.getPosZ() - this.field17274.getPosZ()
      );
      if (var4.method11349() > 1.0E-7) {
         var4 = var4.method11333().method11344(0.4).method11338(var3.method11344(0.2));
      }

      this.field17274.method3435(var4.field18048, (double)this.field17276, var4.field18050);
   }
}
