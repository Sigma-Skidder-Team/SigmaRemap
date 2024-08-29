package mapped;

public interface Class1092 {
   int method5082();

   static boolean method5091(Class880 var0, Class880 var1) {
      float var4 = (float)var0.method3086(Class9173.field42110);
      float var5;
      if (!var0.method3005() && (int)var4 > 0) {
         var5 = var4 / 2.0F + (float)var0.world.rand.nextInt((int)var4);
      } else {
         var5 = var4;
      }

      boolean var6 = var1.method2741(Class8654.method31115(var0), var5);
      if (var6) {
         var0.method3399(var0, var1);
         if (!var0.method3005()) {
            method5092(var0, var1);
         }
      }

      return var6;
   }

   static void method5092(Class880 var0, Class880 var1) {
      double var4 = var0.method3086(Class9173.field42111);
      double var6 = var1.method3086(Class9173.field42107);
      double var8 = var4 - var6;
      if (!(var8 <= 0.0)) {
         double var10 = var1.getPosX() - var0.getPosX();
         double var12 = var1.getPosZ() - var0.getPosZ();
         float var14 = (float)(var0.world.rand.nextInt(21) - 10);
         double var15 = var8 * (double)(var0.world.rand.nextFloat() * 0.5F + 0.2F);
         Vector3d var17 = new Vector3d(var10, 0.0, var12).method11333().method11344(var15).method11351(var14);
         double var18 = var8 * (double)var0.world.rand.nextFloat() * 0.5;
         var1.method3280(var17.field18048, var18, var17.field18050);
         var1.velocityChanged = true;
      }
   }
}
