package mapped;

import java.util.Random;

public class Class2685 extends Class2595 {
   private static String[] field17101;
   private final Class1010 field17102;

   public Class2685(Class1010 var1) {
      this.field17102 = var1;
   }

   @Override
   public boolean method10803() {
      if (this.field17102.method4357() != null) {
         return this.field17102.field5024.method6789().method17135(Class5462.field24224) ? this.field17102.method3013().nextInt(2000) == 0 : false;
      } else {
         return false;
      }
   }

   @Override
   public void method10805() {
      Random var3 = this.field17102.method3013();
      Class1655 var4 = this.field17102.field5024;
      int var5 = MathHelper.method37769(this.field17102.getPosX() - 1.0 + var3.nextDouble() * 2.0);
      int var6 = MathHelper.method37769(this.field17102.getPosY() + var3.nextDouble() * 2.0);
      int var7 = MathHelper.method37769(this.field17102.getPosZ() - 1.0 + var3.nextDouble() * 2.0);
      BlockPos var8 = new BlockPos(var5, var6, var7);
      Class7380 var9 = var4.method6738(var8);
      BlockPos var10 = var8.method8313();
      Class7380 var11 = var4.method6738(var10);
      Class7380 var12 = this.field17102.method4357();
      if (var12 != null) {
         var12 = Block.method11542(var12, this.field17102.field5024, var8);
         if (this.method10901(var4, var8, var12, var9, var11, var10)) {
            var4.method6725(var8, var12, 3);
            this.field17102.method4356((Class7380)null);
         }
      }
   }

   private boolean method10901(Class1655 var1, BlockPos var2, Class7380 var3, Class7380 var4, Class7380 var5, BlockPos var6) {
      return var4.method23393()
         && !var5.method23393()
         && !var5.method23448(Blocks.BEDROCK)
         && var5.method23456(var1, var6)
         && var3.method23443(var1, var2)
         && var1.method7181(this.field17102, Class6488.method19657(Vector3d.method11329(var2))).isEmpty();
   }
}
