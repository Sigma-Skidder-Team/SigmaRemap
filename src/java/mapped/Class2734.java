package mapped;

import java.util.Random;

public class Class2734 extends Class2595 {
   private static String[] field17253;
   private final Class1010 field17254;

   public Class2734(Class1010 var1) {
      this.field17254 = var1;
   }

   @Override
   public boolean method10803() {
      if (this.field17254.method4357() == null) {
         return this.field17254.world.method6789().method17135(Class5462.field24224) ? this.field17254.method3013().nextInt(20) == 0 : false;
      } else {
         return false;
      }
   }

   @Override
   public void method10805() {
      Random var3 = this.field17254.method3013();
      World var4 = this.field17254.world;
      int var5 = MathHelper.floor(this.field17254.getPosX() - 2.0 + var3.nextDouble() * 4.0);
      int var6 = MathHelper.floor(this.field17254.getPosY() + var3.nextDouble() * 3.0);
      int var7 = MathHelper.floor(this.field17254.getPosZ() - 2.0 + var3.nextDouble() * 4.0);
      BlockPos var8 = new BlockPos(var5, var6, var7);
      BlockState var9 = var4.getBlockState(var8);
      Block var10 = var9.getBlock();
      Vector3d var11 = new Vector3d(
         (double) MathHelper.floor(this.field17254.getPosX()) + 0.5,
         (double)var6 + 0.5,
         (double) MathHelper.floor(this.field17254.getPosZ()) + 0.5
      );
      Vector3d var12 = new Vector3d((double)var5 + 0.5, (double)var6 + 0.5, (double)var7 + 0.5);
      BlockRayTraceResult var13 = var4.method7036(new Class6809(var11, var12, Class2271.field14775, Class1985.field12962, this.field17254));
      boolean var14 = var13.getPos().equals(var8);
      if (var10.method11540(Class7645.field32778) && var14) {
         var4.method6728(var8, false);
         this.field17254.method4356(var9.getBlock().method11579());
      }
   }
}
