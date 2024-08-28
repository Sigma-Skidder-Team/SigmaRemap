package mapped;

public class Class9140 {
   private static String[] field41995;
   public static Minecraft field41996 = Minecraft.getInstance();
   private static final int field41997 = 1 + MathHelper.method37803(MathHelper.method37800(30000000));
   private static final int field41998 = field41997;
   private static final int field41999 = 64 - field41997 - field41998;
   private static final int field42000 = 0 + field41998;
   private static final int field42001 = field42000 + field41999;
   private static final long field42002 = (1L << field41997) - 1L;
   private static final long field42003 = (1L << field41999) - 1L;
   private static final long field42004 = (1L << field41998) - 1L;
   public static double field42005;
   public static double field42006;
   public static double field42007;
   public static float field42008;

   public static long method34122(BlockPos var0) {
      return ((long)var0.method8304() & field42002) << field42001
         | ((long)var0.getY() & field42003) << field42000
         | ((long)var0.method8306() & field42004) << 0;
   }

   public static void method34123(float var0, float var1, float var2, float var3) {
      float var6 = var0 * var0 + var1 * var1 + var2 * var2;
      if (var6 >= 1.0E-4F) {
         var6 = MathHelper.method37765(var6);
         if (var6 < 1.0F) {
            var6 = 1.0F;
         }

         var6 = var3 / var6;
         var0 *= var6;
         var1 *= var6;
         var2 *= var6;
         float var7 = MathHelper.method37763(field41996.player.field5031 * (float) (Math.PI / 180.0));
         float var8 = MathHelper.method37764(field41996.player.field5031 * (float) (Math.PI / 180.0));
         field42005 += (double)(var0 * var8 - var2 * var7);
         field42006 += (double)var1;
         field42007 += (double)(var2 * var8 + var0 * var7);
      }
   }

   public static void method34124(float var0, float var1, float var2) {
      if ((field41996.player.method3138() || field41996.player.method3418()) && field41996.player.method3250()) {
         double var5 = field41996.player.getPosY();
         float var7 = method34128();
         float var8 = 0.02F;
         float var9 = (float)Class7858.method26326(field41996.player);
         if (var9 > 3.0F) {
            var9 = 3.0F;
         }

         if (!field41996.player.field5036) {
            var9 *= 0.5F;
         }

         if (var9 > 0.0F) {
            var7 += (0.54600006F - var7) * var9 / 3.0F;
            var8 += (field41996.player.method2918() - var8) * var9 / 3.0F;
         }

         method34123(var0, var1, var2, var8);
         method34126(field42005, field42006, field42007);
         field42005 *= (double)var7;
         field42006 *= 0.8F;
         field42007 *= (double)var7;
         if (!field41996.player.method3247()) {
            field42006 -= 0.02;
         }

         if (field41996.player.field5037
            && field41996.player.method3224(field42005, field42006 + 0.6F - field41996.player.getPosY() + var5, field42007)) {
            field42006 = 0.3F;
         }
      }
   }

   public static boolean method34125(Class6488 var0, Class8649 var1) {
      int var4 = MathHelper.method37769(var0.field28449);
      int var5 = MathHelper.method37774(var0.field28452);
      int var6 = MathHelper.method37769(var0.field28450);
      int var7 = MathHelper.method37774(var0.field28453);
      int var8 = MathHelper.method37769(var0.field28451);
      int var9 = MathHelper.method37774(var0.field28454);
      if (!field41996.world.method7019(var4, var6, var8, var5, var7, var9)) {
         return false;
      } else {
         for (int var10 = var4; var10 < var5; var10++) {
            for (int var11 = var6; var11 < var7; var11++) {
               for (int var12 = var8; var12 < var9; var12++) {
                  Class7380 var13 = field41996.world.method6738(new BlockPos(var10, var11, var12));
                  Block var14 = var13.method23383();
                  if (var13.method23384() == var1) {
                     return true;
                  }
               }
            }
         }

         return false;
      }
   }

   public static void method34126(double var0, double var2, double var4) {
   }

   public static void method34127() {
      field42006 += 0.04F;
   }

   public static float method34128() {
      return 0.8F;
   }

   public static boolean method34129() {
      return method34125(field41996.player.method3389().method19662(0.0, -0.4F, 0.0).method19660(0.001, 0.001, 0.001), Class8649.field38941);
   }
}
