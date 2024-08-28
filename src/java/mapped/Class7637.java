package mapped;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class Class7637 extends Class7633 {
   @Override
   public Class7631 method25075() {
      return Class9479.field44067;
   }

   @Override
   public Class7631 method25077() {
      return Class9479.field44068;
   }

   @Override
   public Class3257 method25050() {
      return Class8514.field37884;
   }

   @Override
   public void method25051(Class1655 var1, BlockPos var2, Class7379 var3, Random var4) {
      BlockPos var7 = var2.method8311();
      if (var1.method6738(var7).method23393() && !var1.method6738(var7).method23409(var1, var7)) {
         if (var4.nextInt(100) == 0) {
            double var8 = (double)var2.method8304() + var4.nextDouble();
            double var10 = (double)var2.getY() + 1.0;
            double var12 = (double)var2.method8306() + var4.nextDouble();
            var1.method6746(Class7940.field34086, var8, var10, var12, 0.0, 0.0, 0.0);
            var1.method6745(
               var8, var10, var12, Class6067.field26727, Class2266.field14732, 0.2F + var4.nextFloat() * 0.2F, 0.9F + var4.nextFloat() * 0.15F, false
            );
         }

         if (var4.nextInt(200) == 0) {
            var1.method6745(
               (double)var2.method8304(),
               (double)var2.getY(),
               (double)var2.method8306(),
               Class6067.field26725,
               Class2266.field14732,
               0.2F + var4.nextFloat() * 0.2F,
               0.9F + var4.nextFloat() * 0.15F,
               false
            );
         }
      }
   }

   @Override
   public void method25053(Class1655 var1, BlockPos var2, Class7379 var3, Random var4) {
      if (var1.method6789().method17135(Class5462.field24223)) {
         int var7 = var4.nextInt(3);
         if (var7 <= 0) {
            for (int var8 = 0; var8 < 3; var8++) {
               BlockPos var9 = var2.method8336(var4.nextInt(3) - 1, 0, var4.nextInt(3) - 1);
               if (!var1.method6763(var9)) {
                  return;
               }

               if (var1.method7007(var9.method8311()) && this.method25103(var1, var9)) {
                  var1.method6730(var9.method8311(), Class3397.method12009(var1, var9));
               }
            }
         } else {
            BlockPos var11 = var2;

            for (int var12 = 0; var12 < var7; var12++) {
               var11 = var11.method8336(var4.nextInt(3) - 1, 1, var4.nextInt(3) - 1);
               if (!var1.method6763(var11)) {
                  return;
               }

               Class7380 var10 = var1.method6738(var11);
               if (!var10.method23393()) {
                  if (var10.method23384().method31087()) {
                     return;
                  }
               } else if (this.method25102(var1, var11)) {
                  var1.method6730(var11, Class3397.method12009(var1, var11));
                  return;
               }
            }
         }
      }
   }

   private boolean method25102(Class1662 var1, BlockPos var2) {
      for (Direction var8 : Direction.values()) {
         if (this.method25103(var1, var2.method8349(var8))) {
            return true;
         }
      }

      return false;
   }

   private boolean method25103(Class1662 var1, BlockPos var2) {
      return var2.getY() >= 0 && var2.getY() < 256 && !var1.method7017(var2) ? false : var1.method6738(var2).method23384().method31088();
   }

   @Nullable
   @Override
   public Class7436 method25054() {
      return Class7940.field34057;
   }

   @Override
   public void method25081(Class1660 var1, BlockPos var2, Class7380 var3) {
      this.method25104(var1, var2);
   }

   @Override
   public int method25087(Class1662 var1) {
      return !var1.method6812().method36877() ? 2 : 4;
   }

   @Override
   public Class7380 method25063(Class7379 var1) {
      return Blocks.LAVA.method11579().method23465(Class3404.field19079, Integer.valueOf(method25094(var1)));
   }

   @Override
   public boolean method25066(Class7631 var1) {
      return var1 == Class9479.field44068 || var1 == Class9479.field44067;
   }

   @Override
   public int method25092(Class1662 var1) {
      return !var1.method6812().method36877() ? 2 : 1;
   }

   @Override
   public boolean method25055(Class7379 var1, Class1665 var2, BlockPos var3, Class7631 var4, Direction var5) {
      return var1.method23475(var2, var3) >= 0.44444445F && var4.method25067(Class8953.field40469);
   }

   @Override
   public int method25057(Class1662 var1) {
      return !var1.method6812().method36877() ? 30 : 10;
   }

   @Override
   public int method25093(Class1655 var1, BlockPos var2, Class7379 var3, Class7379 var4) {
      int var7 = this.method25057(var1);
      if (!var3.method23474()
         && !var4.method23474()
         && !var3.<Boolean>method23463(field32712)
         && !var4.<Boolean>method23463(field32712)
         && var4.method23475(var1, var2) > var3.method23475(var1, var2)
         && var1.method6814().nextInt(4) != 0) {
         var7 *= 4;
      }

      return var7;
   }

   private void method25104(Class1660 var1, BlockPos var2) {
      var1.method6999(1501, var2, 0);
   }

   @Override
   public boolean method25079() {
      return false;
   }

   @Override
   public void method25080(Class1660 var1, BlockPos var2, Class7380 var3, Direction var4, Class7379 var5) {
      if (var4 == Direction.field672) {
         Class7379 var8 = var1.method6739(var2);
         if (this.method25067(Class8953.field40470) && var8.method23486(Class8953.field40469)) {
            if (var3.method23383() instanceof Class3404) {
               var1.method6725(var2, Blocks.STONE.method11579(), 3);
            }

            this.method25104(var1, var2);
            return;
         }
      }

      super.method25080(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method25058() {
      return true;
   }

   @Override
   public float method25060() {
      return 100.0F;
   }
}
