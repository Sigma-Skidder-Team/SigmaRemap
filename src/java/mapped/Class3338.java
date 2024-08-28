package mapped;

public class Class3338 extends Class3257 {
   private static String[] field18845;

   public Class3338(Class5643 var1) {
      super(var1);
   }

   @Override
   public Class8848 method11709(Class8848 var1, Class1655 var2, Class880 var3) {
      Class8848 var6 = super.method11709(var1, var2, var3);
      if (!var2.field9020) {
         double var7 = var3.getPosX();
         double var9 = var3.getPosY();
         double var11 = var3.getPosZ();

         for (int var13 = 0; var13 < 16; var13++) {
            double var14 = var3.getPosX() + (var3.method3013().nextDouble() - 0.5) * 16.0;
            double var16 = Class9679.method37778(var3.getPosY() + (double)(var3.method3013().nextInt(16) - 8), 0.0, (double)(var2.method6998() - 1));
            double var18 = var3.getPosZ() + (var3.method3013().nextDouble() - 0.5) * 16.0;
            if (var3.method3328()) {
               var3.method2759();
            }

            if (var3.method3168(var14, var16, var18, true)) {
               Class9455 var20 = !(var3 instanceof Class1095) ? Class6067.field26457 : Class6067.field26598;
               var2.method6743((PlayerEntity)null, var7, var9, var11, var20, Class2266.field14735, 1.0F, 1.0F);
               var3.method2863(var20, 1.0F, 1.0F);
               break;
            }
         }

         if (var3 instanceof PlayerEntity) {
            ((PlayerEntity)var3).method2976().method19638(this, 20);
         }
      }

      return var6;
   }
}
