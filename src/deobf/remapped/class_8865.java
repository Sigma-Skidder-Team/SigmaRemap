package remapped;

public class class_8865 {
   private static String[] field_45328;
   public static class_1893 field_45329 = class_1893.method_8510();

   public static double method_40775() {
      double var2 = 0.2873;
      float var4 = 1.0F;
      class_9747 var5 = field_45329.field_9632.method_26561(class_7331.field_37465);
      var4 = (float)((double)var4 * ((var5.method_44998() / (double)field_45329.field_9632.field_3876.method_4229() + 1.0) / 2.0));
      if (field_45329.field_9632.method_37321()) {
         var4 = (float)((double)var4 - 0.15);
      }

      if (field_45329.field_9632.method_26480(class_4054.field_19739) && field_45329.field_9632.method_37321()) {
         var4 = (float)((double)var4 - 0.03000002 * (double)(field_45329.field_9632.method_26553(class_4054.field_19739).method_10333() + 1));
      }

      if (field_45329.field_9632.method_37252()) {
         var2 *= 0.25;
      }

      if (method_40771()) {
         var2 *= 0.3;
      }

      return var2 * (double)var4;
   }

   public static double method_40767() {
      double var2 = 0.2873 + (double)method_40770() * 0.057;
      if (field_45329.field_9632.method_37252()) {
         var2 *= 0.25;
      }

      return var2;
   }

   public static double method_40783() {
      double var2 = 0.2873;
      if (field_45329.field_9632.method_37252()) {
         var2 *= 0.25;
      }

      if (method_40771()) {
         var2 *= 0.3;
      }

      return var2;
   }

   public static int method_40770() {
      return !field_45329.field_9632.method_26480(class_4054.field_19739) ? 0 : field_45329.field_9632.method_26553(class_4054.field_19739).method_10333() + 1;
   }

   public static int method_40769() {
      return !field_45329.field_9632.method_26480(class_4054.field_19730) ? 0 : field_45329.field_9632.method_26553(class_4054.field_19730).method_10333() + 1;
   }

   public static double method_40786() {
      return 0.42F + (double)method_40769() * 0.1;
   }

   public static boolean method_40771() {
      return field_45329.field_9632.method_37285();
   }

   public static float[] method_40773() {
      class_8859 var2 = field_45329.field_9632.field_30533;
      float var3 = var2.field_45287;
      float var4 = var2.field_45282;
      return method_40774(var3, var4);
   }

   public static float[] method_40787() {
      class_8859 var2 = field_45329.field_9632.field_30533;
      float var3 = var2.field_45287;
      float var4 = var2.field_45282;
      return method_40788(var3, var4);
   }

   public static float[] method_40774(float var0, float var1) {
      float var4 = field_45329.field_9632.field_41701 + 90.0F;
      if (class_727.method_3328().method_3301().method_27147() != -999.0F) {
         var4 = class_727.method_3328().method_3301().method_27147() + 90.0F;
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

      if (class_727.method_3328().method_3301().method_27149()
         && !class_727.method_3328().method_3301().method_27151()
         && (field_45329.field_9632.field_29673 != 0.0F || field_45329.field_9632.field_29676 != 0.0F)) {
         var0 = 1.0F;
      }

      return new float[]{var4, var0, var1};
   }

   public static float[] method_40788(float var0, float var1) {
      float var4 = field_45329.field_9632.field_41701 + 90.0F;
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

   public static float method_40785() {
      float var2 = field_45329.field_9632.field_29673;
      float var3 = field_45329.field_9632.field_29676;
      float var4 = field_45329.field_9632.field_41701 + 90.0F;
      if (var2 > 0.0F && field_45329.field_9577.field_45434.method_27060()) {
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

   public static boolean method_40772() {
      boolean var2 = field_45329.field_9577.field_45416.method_27060();
      boolean var3 = field_45329.field_9577.field_45504.method_27060();
      boolean var4 = field_45329.field_9577.field_45411.method_27060();
      boolean var5 = field_45329.field_9577.field_45434.method_27060();
      return var2 || var3 || var4 || var5;
   }

   public static void method_40777(class_7767 var0, double var1) {
      float[] var5 = method_40773();
      float var6 = var5[1];
      float var7 = var5[2];
      float var8 = var5[0];
      if (var6 == 0.0F && var7 == 0.0F) {
         var0.method_35232(0.0);
         var0.method_35229(0.0);
      }

      double var9 = Math.cos(Math.toRadians((double)var8));
      double var11 = Math.sin(Math.toRadians((double)var8));
      double var13 = ((double)var6 * var9 + (double)var7 * var11) * var1;
      double var15 = ((double)var6 * var11 - (double)var7 * var9) * var1;
      var0.method_35232(var13);
      var0.method_35229(var15);
      class_314.method_1463(var0.method_35234());
      class_314.method_1405(var0.method_35231());
   }

   public static void method_40778(class_7767 var0, double var1, float var3) {
      float[] var6 = method_40773();
      float var7 = var6[1];
      float var8 = var6[2];
      if (var7 == 0.0F && var8 == 0.0F) {
         var0.method_35232(0.0);
         var0.method_35229(0.0);
      }

      double var9 = Math.cos(Math.toRadians((double)var3));
      double var11 = Math.sin(Math.toRadians((double)var3));
      double var13 = var9 * var1;
      double var15 = var11 * var1;
      var0.method_35232(var13);
      var0.method_35229(var15);
      class_314.method_1463(var0.method_35234());
      class_314.method_1405(var0.method_35231());
   }

   public static void method_40776(double var0) {
      float[] var4 = method_40773();
      float var5 = var4[1];
      float var6 = var4[2];
      float var7 = var4[0];
      if (var5 == 0.0F && var6 == 0.0F) {
         class_314.method_1463(0.0);
         class_314.method_1405(0.0);
      }

      double var8 = Math.cos(Math.toRadians((double)var7));
      double var10 = Math.sin(Math.toRadians((double)var7));
      double var12 = ((double)var5 * var8 + (double)var6 * var10) * var0;
      double var14 = ((double)var5 * var10 - (double)var6 * var8) * var0;
      class_314.method_1463(var12);
      class_314.method_1405(var14);
   }

   public static void method_40784() {
      double var2 = field_45329.field_9632.method_37302();
      double var4 = field_45329.field_9632.method_37309();
      double var6 = field_45329.field_9632.method_37156();

      for (int var8 = 0; var8 < 49 + method_40769() * 17; var8++) {
         field_45329.method_8614().method_4813(new class_9515(var2, var4 + 0.06248, var6, false));
         field_45329.method_8614().method_4813(new class_9515(var2, var4, var6, false));
      }

      field_45329.method_8614().method_4813(new class_9515(var2, var4, var6, true));
   }

   public static float method_40780(class_7767 var0, double var1, float var3, float var4, float var5) {
      float var8 = class_7211.method_32998(var4, var3);
      if (!(var8 > var5)) {
         var4 = var3;
      } else {
         var4 += !(class_9299.method_42810(var3 - var4) > 0.0F) ? -var5 : var5;
      }

      float var9 = (var4 - 90.0F) * (float) (Math.PI / 180.0);
      var0.method_35232((double)(-class_9299.method_42818(var9)) * var1);
      var0.method_35229((double)class_9299.method_42840(var9) * var1);
      class_314.method_1463(var0.method_35234());
      class_314.method_1405(var0.method_35231());
      return var4;
   }

   public static float method_40779(double var0, float var2, float var3, float var4) {
      float var7 = class_7211.method_32998(var3, var2);
      if (!(var7 > var4)) {
         var3 = var2;
      } else {
         var3 += !(class_9299.method_42810(var2 - var3) > 0.0F) ? -var4 : var4;
      }

      float var8 = (var3 - 90.0F) * (float) (Math.PI / 180.0);
      class_314.method_1463((double)(-class_9299.method_42818(var8)) * var0);
      class_314.method_1405((double)class_9299.method_42840(var8) * var0);
      return var3;
   }

   public static class_1343 method_40768(boolean var0, double var1, double var3) {
      class_1343 var7 = new class_1343(var1, (double)field_45329.field_9632.field_29651, var3);
      double var8 = var7.method_6221();
      float var10 = 0.6F;
      double var11 = !var0
         ? (double)field_45329.field_9632.field_29674
         : (double)(field_45329.field_9632.method_26423() * (0.21600002F / (var10 * var10 * var10)));
      class_1343 var13 = (!(var8 > 1.0) ? var7 : var7.method_6213()).method_6209(var11);
      float var14 = class_9299.method_42818(field_45329.field_9632.field_41701 * (float) (Math.PI / 180.0));
      float var15 = class_9299.method_42840(field_45329.field_9632.field_41701 * (float) (Math.PI / 180.0));
      return new class_1343(
         var13.field_7336 * (double)var15 - var13.field_7334 * (double)var14,
         var13.field_7333,
         var13.field_7334 * (double)var15 + var13.field_7336 * (double)var14
      );
   }

   public static void method_40781(double var0) {
      double var4 = (double)field_45329.field_9632.field_30533.field_45287;
      double var6 = (double)field_45329.field_9632.field_30533.field_45282;
      float var8 = field_45329.field_9632.field_41701;
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

      double var9 = field_45329.field_9632.method_37302();
      double var11 = field_45329.field_9632.method_37309();
      double var13 = field_45329.field_9632.method_37156();
      double var15 = var4 * var0 * Math.cos(Math.toRadians((double)(var8 + 90.0F))) + var6 * var0 * Math.sin(Math.toRadians((double)(var8 + 90.0F)));
      double var17 = var4 * var0 * Math.sin(Math.toRadians((double)(var8 + 90.0F))) - var6 * var0 * Math.cos(Math.toRadians((double)(var8 + 90.0F)));
      field_45329.field_9632.method_37256(var9 + var15, var11, var13 + var17);
   }
}
