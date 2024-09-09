package mapped;

import java.util.EnumSet;
import java.util.Random;

public class Class2684 extends Class2595 {
   private static String[] field17099;
   private final Class1112 field17100;

   public Class2684(Class1112 var1) {
      this.field17100 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      Class6829 var3 = this.field17100.method4228();
      if (!var3.method20811()) {
         return true;
      } else {
         double var4 = var3.method20817() - this.field17100.getPosX();
         double var6 = var3.method20818() - this.field17100.getPosY();
         double var8 = var3.method20819() - this.field17100.getPosZ();
         double var10 = var4 * var4 + var6 * var6 + var8 * var8;
         return var10 < 1.0 || var10 > 3600.0;
      }
   }

   @Override
   public boolean method10806() {
      return false;
   }

   @Override
   public void method10804() {
      Random var3 = this.field17100.getRNG();
      double var4 = this.field17100.getPosX() + (double)((var3.nextFloat() * 2.0F - 1.0F) * 16.0F);
      double var6 = this.field17100.getPosY() + (double)((var3.nextFloat() * 2.0F - 1.0F) * 16.0F);
      double var8 = this.field17100.getPosZ() + (double)((var3.nextFloat() * 2.0F - 1.0F) * 16.0F);
      this.field17100.method4228().method20813(var4, var6, var8, 1.0);
   }
}
