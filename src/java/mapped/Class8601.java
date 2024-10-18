package mapped;

import net.minecraft.client.world.ClientWorld;
import net.optifine.Config;

public class Class8601 {
   private Class7448 field38699 = null;
   private float[][] field38700 = new float[16][3];
   private float[][] field38701 = new float[16][3];

   public Class8601(Class7448 var1) {
      this.field38699 = var1;
   }

   public Class7448 method30775() {
      return this.field38699;
   }

   public boolean method30776(ClientWorld var1, float var2, int[] var3, boolean var4) {
      if (this.field38699 == null) {
         return false;
      } else {
         int var7 = this.field38699.method24076();
         if (var4 && var7 < 64) {
            return false;
         } else {
            int var8 = this.field38699.method24075();
            if (var8 < 16) {
               method30779("Invalid lightmap width: " + var8);
               this.field38699 = null;
               return false;
            } else {
               int var9 = 0;
               if (var4) {
                  var9 = var8 * 16 * 2;
               }

               float var10 = 1.1666666F * (var1.method6872(1.0F) - 0.2F);
               if (var1.getTimeLightningFlash() > 0) {
                  var10 = 1.0F;
               }

               var10 = Config.method26834(var10);
               float var11 = var10 * (float)(var8 - 1);
               float var12 = Config.method26834(var2 + 0.5F) * (float)(var8 - 1);
               float var13 = Config.method26834((float) Config.method26928().gamma);
               boolean var14 = var13 > 1.0E-4F;
               float[][] var15 = this.field38699.method24068();
               this.method30777(var15, var11, var9, var8, this.field38700);
               this.method30777(var15, var12, var9 + 16 * var8, var8, this.field38701);
               float[] var16 = new float[3];

               for (int var17 = 0; var17 < 16; var17++) {
                  for (int var18 = 0; var18 < 16; var18++) {
                     for (int var19 = 0; var19 < 3; var19++) {
                        float var20 = Config.method26834(this.field38700[var17][var19] + this.field38701[var18][var19]);
                        if (var14) {
                           float var21 = 1.0F - var20;
                           var21 = 1.0F - var21 * var21 * var21 * var21;
                           var20 = var13 * var21 + (1.0F - var13) * var20;
                        }

                        var16[var19] = var20;
                     }

                     int var23 = (int)(var16[0] * 255.0F);
                     int var24 = (int)(var16[1] * 255.0F);
                     int var26 = (int)(var16[2] * 255.0F);
                     var3[var17 * 16 + var18] = 0xFF000000 | var26 << 16 | var24 << 8 | var23;
                  }
               }

               return true;
            }
         }
      }
   }

   private void method30777(float[][] var1, float var2, int var3, int var4, float[][] var5) {
      int var8 = (int)Math.floor((double)var2);
      int var9 = (int)Math.ceil((double)var2);
      if (var8 != var9) {
         float var10 = 1.0F - (var2 - (float)var8);
         float var11 = 1.0F - ((float)var9 - var2);

         for (int var12 = 0; var12 < 16; var12++) {
            float[] var13 = var1[var3 + var12 * var4 + var8];
            float[] var14 = var1[var3 + var12 * var4 + var9];
            float[] var15 = var5[var12];

            for (int var16 = 0; var16 < 3; var16++) {
               var15[var16] = var13[var16] * var10 + var14[var16] * var11;
            }
         }
      } else {
         for (int var17 = 0; var17 < 16; var17++) {
            float[] var18 = var1[var3 + var17 * var4 + var8];
            float[] var19 = var5[var17];

            for (int var20 = 0; var20 < 3; var20++) {
               var19[var20] = var18[var20];
            }
         }
      }
   }

   private static void method30778(String var0) {
      Config.method26810("CustomColors: " + var0);
   }

   private static void method30779(String var0) {
      Config.method26811("CustomColors: " + var0);
   }
}
