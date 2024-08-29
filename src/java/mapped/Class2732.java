package mapped;

import java.util.EnumSet;

public class Class2732 extends Class2595 {
   private static String[] field17249;
   private final Class1097 field17250;

   public Class2732(Class1097 var1) {
      this.field17250 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658, Class2240.field14659));
   }

   @Override
   public boolean method10803() {
      if ((this.field17250.method3005() || this.field17250.method5212()) && this.field17250.field5036) {
         if (this.field17250.method5230()) {
            float var3 = this.field17250.field5031 * (float) (Math.PI / 180.0);
            int var4 = 0;
            int var5 = 0;
            float var6 = -MathHelper.sin(var3);
            float var7 = MathHelper.cos(var3);
            if ((double)Math.abs(var6) > 0.5) {
               var4 = (int)((float)var4 + var6 / Math.abs(var6));
            }

            if ((double)Math.abs(var7) > 0.5) {
               var5 = (int)((float)var5 + var7 / Math.abs(var7));
            }

            if (this.field17250.world.getBlockState(this.field17250.getPosition().method8336(var4, -1, var5)).isAir()) {
               return true;
            } else {
               return this.field17250.method5212() && Class1097.method5241(this.field17250).nextInt(60) == 1
                  ? true
                  : Class1097.method5242(this.field17250).nextInt(500) == 1;
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
      return false;
   }

   @Override
   public void method10804() {
      this.field17250.method5205(true);
   }

   @Override
   public boolean method10808() {
      return false;
   }
}
