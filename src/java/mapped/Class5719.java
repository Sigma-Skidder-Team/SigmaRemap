package mapped;

import java.util.Random;

public class Class5719 extends Class5715<Class906> {
   private static String[] field25116;

   public Class5719(Class8853 var1) {
      super(var1);
   }

   public void method17853(Class906 var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      float[] var9 = new float[8];
      float[] var10 = new float[8];
      float var11 = 0.0F;
      float var12 = 0.0F;
      Random var13 = new Random(var1.field5172);

      for (int var14 = 7; var14 >= 0; var14--) {
         var9[var14] = var11;
         var10[var14] = var12;
         var11 += (float)(var13.nextInt(11) - 5);
         var12 += (float)(var13.nextInt(11) - 5);
      }

      Class5422 var32 = var5.method25597(Class4520.method14341());
      Class9367 var15 = var4.method35296().method32361();

      for (int var16 = 0; var16 < 4; var16++) {
         Random var17 = new Random(var1.field5172);

         for (int var18 = 0; var18 < 3; var18++) {
            int var19 = 7;
            int var20 = 0;
            if (var18 > 0) {
               var19 = 7 - var18;
            }

            if (var18 > 0) {
               var20 = var19 - 2;
            }

            float var21 = var9[var19] - var11;
            float var22 = var10[var19] - var12;

            for (int var23 = var19; var23 >= var20; var23--) {
               float var24 = var21;
               float var25 = var22;
               if (var18 != 0) {
                  var21 += (float)(var17.nextInt(31) - 15);
                  var22 += (float)(var17.nextInt(31) - 15);
               } else {
                  var21 += (float)(var17.nextInt(11) - 5);
                  var22 += (float)(var17.nextInt(11) - 5);
               }

               float var26 = 0.5F;
               float var27 = 0.45F;
               float var28 = 0.45F;
               float var29 = 0.5F;
               float var30 = 0.1F + (float)var16 * 0.2F;
               if (var18 == 0) {
                  var30 = (float)((double)var30 * ((double)var23 * 0.1 + 1.0));
               }

               float var31 = 0.1F + (float)var16 * 0.2F;
               if (var18 == 0) {
                  var31 *= (float)(var23 - 1) * 0.1F + 1.0F;
               }

               method17907(var15, var32, var21, var22, var23, var24, var25, 0.45F, 0.45F, 0.5F, var30, var31, false, false, true, false);
               method17907(var15, var32, var21, var22, var23, var24, var25, 0.45F, 0.45F, 0.5F, var30, var31, true, false, true, true);
               method17907(var15, var32, var21, var22, var23, var24, var25, 0.45F, 0.45F, 0.5F, var30, var31, true, true, false, true);
               method17907(var15, var32, var21, var22, var23, var24, var25, 0.45F, 0.45F, 0.5F, var30, var31, false, true, false, false);
            }
         }
      }
   }

   private static void method17907(
      Class9367 var0,
      Class5422 var1,
      float var2,
      float var3,
      int var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      boolean var12,
      boolean var13,
      boolean var14,
      boolean var15
   ) {
      var1.method17040(var0, var2 + (!var12 ? -var11 : var11), (float)(var4 * 16), var3 + (!var13 ? -var11 : var11))
         .method17033(var7, var8, var9, 0.3F)
         .method17031();
      var1.method17040(var0, var5 + (!var12 ? -var10 : var10), (float)((var4 + 1) * 16), var6 + (!var13 ? -var10 : var10))
         .method17033(var7, var8, var9, 0.3F)
         .method17031();
      var1.method17040(var0, var5 + (!var14 ? -var10 : var10), (float)((var4 + 1) * 16), var6 + (!var15 ? -var10 : var10))
         .method17033(var7, var8, var9, 0.3F)
         .method17031();
      var1.method17040(var0, var2 + (!var14 ? -var11 : var11), (float)(var4 * 16), var3 + (!var15 ? -var11 : var11))
         .method17033(var7, var8, var9, 0.3F)
         .method17031();
   }

   public ResourceLocation method17843(Class906 var1) {
      return Class289.field1102;
   }
}
