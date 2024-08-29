package mapped;

import java.util.Random;

public class Class3213 extends Block {
   private static String[] field18622;

   public Class3213(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public void method11589(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      var2.method6860().method20726(var3, this, this.method11597());
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      var4.method6860().method20726(var5, this, this.method11597());
      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (method11598(var2.getBlockState(var3.down())) && var3.getY() >= 0) {
         Class907 var7 = new Class907(var2, (double)var3.getX() + 0.5, (double)var3.getY(), (double)var3.getZ() + 0.5, var2.getBlockState(var3));
         this.method11596(var7);
         var2.method6916(var7);
      }
   }

   public void method11596(Class907 var1) {
   }

   public int method11597() {
      return 2;
   }

   public static boolean method11598(BlockState var0) {
      Class8649 var3 = var0.method23384();
      return var0.isAir() || var0.method23446(BlockTags.field32798) || var3.method31085() || var3.method31089();
   }

   public void method11599(World var1, BlockPos var2, BlockState var3, BlockState var4, Class907 var5) {
   }

   public void method11600(World var1, BlockPos var2, Class907 var3) {
   }

   @Override
   public void method11512(BlockState var1, World var2, BlockPos var3, Random var4) {
      if (var4.nextInt(16) == 0) {
         BlockPos var7 = var3.down();
         if (method11598(var2.getBlockState(var7))) {
            double var8 = (double)var3.getX() + var4.nextDouble();
            double var10 = (double)var3.getY() - 0.05;
            double var12 = (double)var3.getZ() + var4.nextDouble();
            var2.method6746(new Class7439(Class7940.field34071, var1), var8, var10, var12, 0.0, 0.0, 0.0);
         }
      }
   }

   public int method11601(BlockState var1, Class1665 var2, BlockPos var3) {
      return -16777216;
   }
}
