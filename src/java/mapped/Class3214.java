package mapped;

public class Class3214 extends Class3213 {
   private static String[] field18623;
   public static final Class6408 field18624 = Block.method11539(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   public Class3214(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field18624;
   }

   @Override
   public ActionResultType method11505(Class7380 var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, Class8711 var6) {
      this.method11603(var1, var2, var3);
      return ActionResultType.method9002(var2.field9020);
   }

   @Override
   public void method11602(Class7380 var1, World var2, BlockPos var3, PlayerEntity var4) {
      this.method11603(var1, var2, var3);
   }

   private void method11603(Class7380 var1, World var2, BlockPos var3) {
      for (int var6 = 0; var6 < 1000; var6++) {
         BlockPos var7 = var3.method8336(
            var2.field9016.nextInt(16) - var2.field9016.nextInt(16),
            var2.field9016.nextInt(8) - var2.field9016.nextInt(8),
            var2.field9016.nextInt(16) - var2.field9016.nextInt(16)
         );
         if (var2.method6738(var7).method23393()) {
            if (!var2.field9020) {
               var2.method6725(var7, var1, 2);
               var2.method6728(var3, false);
            } else {
               for (int var8 = 0; var8 < 128; var8++) {
                  double var9 = var2.field9016.nextDouble();
                  float var11 = (var2.field9016.nextFloat() - 0.5F) * 0.2F;
                  float var12 = (var2.field9016.nextFloat() - 0.5F) * 0.2F;
                  float var13 = (var2.field9016.nextFloat() - 0.5F) * 0.2F;
                  double var14 = MathHelper.method37822(var9, (double)var7.method8304(), (double)var3.method8304()) + (var2.field9016.nextDouble() - 0.5) + 0.5;
                  double var16 = MathHelper.method37822(var9, (double)var7.getY(), (double)var3.getY()) + var2.field9016.nextDouble() - 0.5;
                  double var18 = MathHelper.method37822(var9, (double)var7.method8306(), (double)var3.method8306()) + (var2.field9016.nextDouble() - 0.5) + 0.5;
                  var2.method6746(Class7940.field34090, var14, var16, var18, (double)var11, (double)var12, (double)var13);
               }
            }

            return;
         }
      }
   }

   @Override
   public int method11597() {
      return 5;
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
