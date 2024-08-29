package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.Class4435;

public class Class9567 {
   private static String[] field44553;
   public static Minecraft field44554 = Minecraft.getInstance();

   public static double method37075() {
      double var2 = 0.2873;
      float var4 = 1.0F;
      Class9805 var5 = field44554.player.method3085(Class9173.field42108);
      var4 = (float)((double)var4 * ((var5.method38674() / (double)field44554.player.abilities.method20716() + 1.0) / 2.0));
      if (field44554.player.method3337()) {
         var4 = (float)((double)var4 - 0.15);
      }

      if (field44554.player.method3033(Class8254.field35467) && field44554.player.method3337()) {
         var4 = (float)((double)var4 - 0.03000002 * (double)(field44554.player.method3034(Class8254.field35467).method8629() + 1));
      }

      if (field44554.player.method3331()) {
         var2 *= 0.25;
      }

      if (method37081()) {
         var2 *= 0.3;
      }

      return var2 * (double)var4;
   }

   public static double method37076() {
      double var2 = 0.2873 + (double)method37078() * 0.057;
      if (field44554.player.method3331()) {
         var2 *= 0.25;
      }

      return var2;
   }

   public static double method37077() {
      double var2 = 0.2873;
      if (field44554.player.method3331()) {
         var2 *= 0.25;
      }

      if (method37081()) {
         var2 *= 0.3;
      }

      return var2;
   }

   public static int method37078() {
      return !field44554.player.method3033(Class8254.field35467) ? 0 : field44554.player.method3034(Class8254.field35467).method8629() + 1;
   }

   public static int method37079() {
      return !field44554.player.method3033(Class8254.field35474) ? 0 : field44554.player.method3034(Class8254.field35474).method8629() + 1;
   }

   public static double method37080() {
      return 0.42F + (double)method37079() * 0.1;
   }

   public static boolean method37081() {
      return field44554.player.method3250();
   }

   public static float[] method37082() {
      MovementInput var2 = field44554.player.field6131;
      float var3 = var2.field43908;
      float var4 = var2.field43907;
      return method37084(var3, var4);
   }

   public static float[] method37083() {
      MovementInput var2 = field44554.player.field6131;
      float var3 = var2.field43908;
      float var4 = var2.field43907;
      return method37085(var3, var4);
   }

   public static float[] method37084(float var0, float var1) {
      float var4 = field44554.player.field5031 + 90.0F;
      if (Client.getInstance().method19950().method31744() != -999.0F) {
         var4 = Client.getInstance().method19950().method31744() + 90.0F;
      }

      if (var0 != 0.0F) {
         if (!(var1 >= 1.0F)) {
            if (var1 <= -1.0F) {
               var4 += (float)(!(var0 > 0.0F) ? -45 : 45);
               var1 = 0.0F;
            }
         } else {
            var4 += (float)(!(var0 > 0.0F) ? 45 : -45);
            var1 = 0.0F;
         }

         if (!(var0 > 0.0F)) {
            if (var0 < 0.0F) {
               var0 = -1.0F;
            }
         } else {
            var0 = 1.0F;
         }
      }

      if (Client.getInstance().method19950().method31742()
         && !Client.getInstance().method19950().method31741()
         && (field44554.player.field4984 != 0.0F || field44554.player.field4982 != 0.0F)) {
         var0 = 1.0F;
      }

      return new float[]{var4, var0, var1};
   }

   public static float[] method37085(float var0, float var1) {
      float var4 = field44554.player.field5031 + 90.0F;
      if (var0 == 0.0F) {
         if (var1 != 0.0F) {
            var4 += (float)(!(var1 > 0.0F) ? 90 : -90);
            var1 = 0.0F;
         }
      } else {
         if (!(var1 >= 1.0F)) {
            if (var1 <= -1.0F) {
               var4 += (float)(!(var0 > 0.0F) ? -45 : 45);
               var1 = 0.0F;
            }
         } else {
            var4 += (float)(!(var0 > 0.0F) ? 45 : -45);
            var1 = 0.0F;
         }

         if (!(var0 > 0.0F)) {
            if (var0 < 0.0F) {
               var0 = -1.0F;
               var4 -= 180.0F;
            }
         } else {
            var0 = 1.0F;
         }
      }

      return new float[]{var4, var0, var1};
   }

   public static float method37086() {
      float var2 = field44554.player.field4984;
      float var3 = field44554.player.field4982;
      float var4 = field44554.player.field5031 + 90.0F;
      if (var2 > 0.0F && field44554.gameSettings.field44634.isKeyDown()) {
         var2 = -1.0F;
      }

      if (var3 != 0.0F && var3 > 0.0F) {
         var4 -= 90.0F;
      } else if (var3 != 0.0F && var3 < 0.0F) {
         var4 += 90.0F;
      }

      if (var2 != 0.0F) {
         if (var3 != 0.0F && var3 > 0.0F) {
            var4 -= (float)(!(var2 > 0.0F) ? 45 : -45);
         } else if (var3 != 0.0F && var3 < 0.0F) {
            var4 -= (float)(!(var2 > 0.0F) ? -45 : 45);
         }
      }

      if (var2 < 0.0F && var3 == 0.0F) {
         var4 -= 180.0F;
      }

      return var4;
   }

   public static boolean method37087() {
      boolean var2 = field44554.gameSettings.field44632.isKeyDown();
      boolean var3 = field44554.gameSettings.field44633.isKeyDown();
      boolean var4 = field44554.gameSettings.field44635.isKeyDown();
      boolean var5 = field44554.gameSettings.field44634.isKeyDown();
      return var2 || var3 || var4 || var5;
   }

   public static void method37088(Class4435 var0, double var1) {
      float[] var5 = method37082();
      float var6 = var5[1];
      float var7 = var5[2];
      float var8 = var5[0];
      if (var6 == 0.0F && var7 == 0.0F) {
         var0.method13993(0.0);
         var0.method13997(0.0);
      }

      double var9 = Math.cos(Math.toRadians((double)var8));
      double var11 = Math.sin(Math.toRadians((double)var8));
      double var13 = ((double)var6 * var9 + (double)var7 * var11) * var1;
      double var15 = ((double)var6 * var11 - (double)var7 * var9) * var1;
      var0.method13993(var13);
      var0.method13997(var15);
      Class5628.method17724(var0.method13992());
      Class5628.method17726(var0.method13996());
   }

   public static void method37089(Class4435 var0, double var1, float var3) {
      float[] var6 = method37082();
      float var7 = var6[1];
      float var8 = var6[2];
      if (var7 == 0.0F && var8 == 0.0F) {
         var0.method13993(0.0);
         var0.method13997(0.0);
      }

      double var9 = Math.cos(Math.toRadians((double)var3));
      double var11 = Math.sin(Math.toRadians((double)var3));
      double var13 = var9 * var1;
      double var15 = var11 * var1;
      var0.method13993(var13);
      var0.method13997(var15);
      Class5628.method17724(var0.method13992());
      Class5628.method17726(var0.method13996());
   }

   public static void method37090(double var0) {
      float[] var4 = method37082();
      float var5 = var4[1];
      float var6 = var4[2];
      float var7 = var4[0];
      if (var5 == 0.0F && var6 == 0.0F) {
         Class5628.method17724(0.0);
         Class5628.method17726(0.0);
      }

      double var8 = Math.cos(Math.toRadians((double)var7));
      double var10 = Math.sin(Math.toRadians((double)var7));
      double var12 = ((double)var5 * var8 + (double)var6 * var10) * var0;
      double var14 = ((double)var5 * var10 - (double)var6 * var8) * var0;
      Class5628.method17724(var12);
      Class5628.method17726(var14);
   }

   public static void method37091() {
      double var2 = field44554.player.getPosX();
      double var4 = field44554.player.getPosY();
      double var6 = field44554.player.getPosZ();

      for (int var8 = 0; var8 < 49 + method37079() * 17; var8++) {
         field44554.getConnection().sendPacket(new Class5605(var2, var4 + 0.06248, var6, false));
         field44554.getConnection().sendPacket(new Class5605(var2, var4, var6, false));
      }

      field44554.getConnection().sendPacket(new Class5605(var2, var4, var6, true));
   }

   public static float method37092(Class4435 var0, double var1, float var3, float var4, float var5) {
      float var8 = Class9142.method34143(var4, var3);
      if (!(var8 > var5)) {
         var4 = var3;
      } else {
         var4 += !(MathHelper.method37792(var3 - var4) > 0.0F) ? -var5 : var5;
      }

      float var9 = (var4 - 90.0F) * (float) (Math.PI / 180.0);
      var0.method13993((double)(-MathHelper.sin(var9)) * var1);
      var0.method13997((double) MathHelper.cos(var9) * var1);
      Class5628.method17724(var0.method13992());
      Class5628.method17726(var0.method13996());
      return var4;
   }

   public static float method37093(double var0, float var2, float var3, float var4) {
      float var7 = Class9142.method34143(var3, var2);
      if (!(var7 > var4)) {
         var3 = var2;
      } else {
         var3 += !(MathHelper.method37792(var2 - var3) > 0.0F) ? -var4 : var4;
      }

      float var8 = (var3 - 90.0F) * (float) (Math.PI / 180.0);
      Class5628.method17724((double)(-MathHelper.sin(var8)) * var0);
      Class5628.method17726((double) MathHelper.cos(var8) * var0);
      return var3;
   }

   public static Vector3d method37094(boolean var0, double var1, double var3) {
      Vector3d var7 = new Vector3d(var1, (double)field44554.player.field4983, var3);
      double var8 = var7.method11349();
      float var10 = 0.6F;
      double var11 = !var0 ? (double)field44554.player.field4969 : (double)(field44554.player.method2918() * (0.21600002F / (var10 * var10 * var10)));
      Vector3d var13 = (!(var8 > 1.0) ? var7 : var7.method11333()).method11344(var11);
      float var14 = MathHelper.sin(field44554.player.field5031 * (float) (Math.PI / 180.0));
      float var15 = MathHelper.cos(field44554.player.field5031 * (float) (Math.PI / 180.0));
      return new Vector3d(
         var13.field18048 * (double)var15 - var13.field18050 * (double)var14,
         var13.field18049,
         var13.field18050 * (double)var15 + var13.field18048 * (double)var14
      );
   }

   public static void method37095(double var0) {
      double var4 = (double)field44554.player.field6131.field43908;
      double var6 = (double)field44554.player.field6131.field43907;
      float var8 = field44554.player.field5031;
      if (var4 != 0.0) {
         if (!(var6 > 0.0)) {
            if (var6 < 0.0) {
               var8 += (float)(!(var4 > 0.0) ? -45 : 45);
            }
         } else {
            var8 += (float)(!(var4 > 0.0) ? 45 : -45);
         }

         var6 = 0.0;
         if (!(var4 > 0.0)) {
            if (var4 < 0.0) {
               var4 = -1.0;
            }
         } else {
            var4 = 1.0;
         }
      }

      double var9 = field44554.player.getPosX();
      double var11 = field44554.player.getPosY();
      double var13 = field44554.player.getPosZ();
      double var15 = var4 * var0 * Math.cos(Math.toRadians((double)(var8 + 90.0F))) + var6 * var0 * Math.sin(Math.toRadians((double)(var8 + 90.0F)));
      double var17 = var4 * var0 * Math.sin(Math.toRadians((double)(var8 + 90.0F))) - var6 * var0 * Math.cos(Math.toRadians((double)(var8 + 90.0F)));
      field44554.player.method3215(var9 + var15, var11, var13 + var17);
   }
}
