package remapped;

public class class_7265 {
   private static final float field_37214 = 1.0F / (float)Math.cos((float) (Math.PI / 8)) - 1.0F;
   private static final float field_37215 = 1.0F / (float)Math.cos((float) (Math.PI / 4)) - 1.0F;

   public class_5024 method_33202(
      class_2426 var1, class_2426 var2, class_7300 var3, class_5155 var4, class_240 var5, class_5598 var6, class_1868 var7, boolean var8, class_4639 var9
   ) {
      class_9874 var12 = var3.field_37314;
      if (var6.method_25404()) {
         var12 = method_33203(var3.field_37314, var5, var6.method_25403(), var9);
      }

      float[] var13 = new float[var12.field_49930.length];
      System.arraycopy(var12.field_49930, 0, var13, 0, var13.length);
      float var14 = var4.method_23632();
      float var15 = (var12.field_49930[0] + var12.field_49930[0] + var12.field_49930[2] + var12.field_49930[2]) / 4.0F;
      float var16 = (var12.field_49930[1] + var12.field_49930[1] + var12.field_49930[3] + var12.field_49930[3]) / 4.0F;
      var12.field_49930[0] = class_9299.method_42795(var14, var12.field_49930[0], var15);
      var12.field_49930[2] = class_9299.method_42795(var14, var12.field_49930[2], var15);
      var12.field_49930[1] = class_9299.method_42795(var14, var12.field_49930[1], var16);
      var12.field_49930[3] = class_9299.method_42795(var14, var12.field_49930[3], var16);
      boolean var17 = !class_7860.field_39996.method_3596() ? var8 : false;
      int[] var18 = this.method_33200(var12, var4, var5, this.method_33192(var1, var2), var6.method_25403(), var7, var17);
      class_240 var19 = method_33195(var18);
      System.arraycopy(var13, 0, var12.field_49930, 0, var13.length);
      if (var7 == null) {
         this.method_33196(var18, var19);
      }

      if (!class_7860.field_39996.method_3596()) {
         return new class_5024(var18, var3.field_37315, var19, var4, var8);
      } else {
         class_7860.method_35556(class_7860.field_39996, var18, var19);
         return new class_5024(var18, var3.field_37315, var19, var4, var8);
      }
   }

   public static class_9874 method_33203(class_9874 var0, class_240 var1, class_1221 var2, class_4639 var3) {
      class_8107 var6 = class_4977.method_22874(var2, var1, () -> "Unable to resolve UVLock for model: " + var3).method_5410();
      float var7 = var0.method_45503(var0.method_45505(0));
      float var8 = var0.method_45501(var0.method_45505(0));
      class_2637 var9 = new class_2637(var7 / 16.0F, var8 / 16.0F, 0.0F, 1.0F);
      var9.method_11929(var6);
      float var10 = 16.0F * var9.method_11923();
      float var11 = 16.0F * var9.method_11922();
      float var12 = var0.method_45503(var0.method_45505(2));
      float var13 = var0.method_45501(var0.method_45505(2));
      class_2637 var14 = new class_2637(var12 / 16.0F, var13 / 16.0F, 0.0F, 1.0F);
      var14.method_11929(var6);
      float var15 = 16.0F * var14.method_11923();
      float var16 = 16.0F * var14.method_11922();
      float var17;
      float var18;
      if (Math.signum(var12 - var7) != Math.signum(var15 - var10)) {
         var17 = var15;
         var18 = var10;
      } else {
         var17 = var10;
         var18 = var15;
      }

      float var19;
      float var20;
      if (Math.signum(var13 - var8) != Math.signum(var16 - var11)) {
         var19 = var16;
         var20 = var11;
      } else {
         var19 = var11;
         var20 = var16;
      }

      float var21 = (float)Math.toRadians((double)var0.field_49932);
      class_2426 var22 = new class_2426(class_9299.method_42840(var21), class_9299.method_42818(var21), 0.0F);
      class_6555 var23 = new class_6555(var6);
      var22.method_11059(var23);
      int var24 = Math.floorMod(-((int)Math.round(Math.toDegrees(Math.atan2((double)var22.method_11061(), (double)var22.method_11057())) / 90.0)) * 90, 360);
      return new class_9874(new float[]{var17, var19, var18, var20}, var24);
   }

   private int[] method_33200(class_9874 var1, class_5155 var2, class_240 var3, float[] var4, class_1221 var5, class_1868 var6, boolean var7) {
      int var10 = !class_3111.method_14424() ? class_7985.field_40895 : class_7985.field_40899;
      int[] var11 = new int[var10];

      for (int var12 = 0; var12 < 4; var12++) {
         this.method_33197(var11, var12, var3, var1, var4, var2, var5, var6, var7);
      }

      return var11;
   }

   private float[] method_33192(class_2426 var1, class_2426 var2) {
      float[] var5 = new float[class_240.values().length];
      var5[class_6636.field_34355] = var1.method_11057() / 16.0F;
      var5[class_6636.field_34356] = var1.method_11061() / 16.0F;
      var5[class_6636.field_34354] = var1.method_11055() / 16.0F;
      var5[class_6636.field_34359] = var2.method_11057() / 16.0F;
      var5[class_6636.field_34360] = var2.method_11061() / 16.0F;
      var5[class_6636.field_34357] = var2.method_11055() / 16.0F;
      return var5;
   }

   private void method_33197(
      int[] var1, int var2, class_240 var3, class_9874 var4, float[] var5, class_5155 var6, class_1221 var7, class_1868 var8, boolean var9
   ) {
      class_9829 var12 = class_4188.method_19472(var3).method_19474(var2);
      class_2426 var13 = new class_2426(var5[var12.field_49786], var5[var12.field_49789], var5[var12.field_49787]);
      this.method_33194(var13, var8);
      this.method_33193(var13, var7);
      class_2870.method_13185(var13);
      this.method_33199(var1, var2, var13, var6, var4);
   }

   private void method_33199(int[] var1, int var2, class_2426 var3, class_5155 var4, class_9874 var5) {
      int var8 = var1.length / 4;
      int var9 = var2 * var8;
      var1[var9] = Float.floatToRawIntBits(var3.method_11057());
      var1[var9 + 1] = Float.floatToRawIntBits(var3.method_11061());
      var1[var9 + 2] = Float.floatToRawIntBits(var3.method_11055());
      var1[var9 + 3] = -1;
      var1[var9 + 4] = Float.floatToRawIntBits(var4.method_23602((double)var5.method_45503(var2)));
      var1[var9 + 4 + 1] = Float.floatToRawIntBits(var4.method_23639((double)var5.method_45501(var2)));
   }

   private void method_33194(class_2426 var1, class_1868 var2) {
      if (var2 != null) {
         class_2426 var5;
         class_2426 var6;
         switch (var2.field_9474) {
            case field_47215:
               var5 = new class_2426(1.0F, 0.0F, 0.0F);
               var6 = new class_2426(0.0F, 1.0F, 1.0F);
               break;
            case field_47216:
               var5 = new class_2426(0.0F, 1.0F, 0.0F);
               var6 = new class_2426(1.0F, 0.0F, 1.0F);
               break;
            case field_47219:
               var5 = new class_2426(0.0F, 0.0F, 1.0F);
               var6 = new class_2426(1.0F, 1.0F, 0.0F);
               break;
            default:
               throw new IllegalArgumentException("There are only 3 axes");
         }

         class_5422 var7 = new class_5422(var5, var2.field_9477, true);
         if (var2.field_9476) {
            if (Math.abs(var2.field_9477) == 22.5F) {
               var6.method_11068(field_37214);
            } else {
               var6.method_11068(field_37215);
            }

            var6.method_11071(1.0F, 1.0F, 1.0F);
         } else {
            var6.method_11065(1.0F, 1.0F, 1.0F);
         }

         this.method_33198(var1, var2.field_9478.method_11060(), new class_8107(var7), var6);
      }
   }

   public void method_33193(class_2426 var1, class_1221 var2) {
      if (var2 != class_1221.method_5406()) {
         this.method_33198(var1, new class_2426(0.5F, 0.5F, 0.5F), var2.method_5410(), new class_2426(1.0F, 1.0F, 1.0F));
      }
   }

   private void method_33198(class_2426 var1, class_2426 var2, class_8107 var3, class_2426 var4) {
      class_2637 var7 = new class_2637(
         var1.method_11057() - var2.method_11057(), var1.method_11061() - var2.method_11061(), var1.method_11055() - var2.method_11055(), 1.0F
      );
      var7.method_11929(var3);
      var7.method_11926(var4);
      var1.method_11065(var7.method_11923() + var2.method_11057(), var7.method_11922() + var2.method_11061(), var7.method_11927() + var2.method_11055());
   }

   public static class_240 method_33195(int[] var0) {
      int var3 = var0.length / 4;
      int var4 = var3 * 2;
      class_2426 var5 = new class_2426(Float.intBitsToFloat(var0[0]), Float.intBitsToFloat(var0[1]), Float.intBitsToFloat(var0[2]));
      class_2426 var6 = new class_2426(Float.intBitsToFloat(var0[var3]), Float.intBitsToFloat(var0[var3 + 1]), Float.intBitsToFloat(var0[var3 + 2]));
      class_2426 var7 = new class_2426(Float.intBitsToFloat(var0[var4]), Float.intBitsToFloat(var0[var4 + 1]), Float.intBitsToFloat(var0[var4 + 2]));
      class_2426 var8 = var5.method_11060();
      var8.method_11064(var6);
      class_2426 var9 = var7.method_11060();
      var9.method_11064(var6);
      class_2426 var10 = var9.method_11060();
      var10.method_11054(var8);
      var10.method_11066();
      class_240 var11 = null;
      float var12 = 0.0F;

      for (class_240 var16 : class_240.values()) {
         class_2700 var17 = var16.method_1037();
         class_2426 var18 = new class_2426((float)var17.method_12173(), (float)var17.method_12165(), (float)var17.method_12185());
         float var19 = var10.method_11067(var18);
         if (var19 >= 0.0F && var19 > var12) {
            var12 = var19;
            var11 = var16;
         }
      }

      return var11 != null ? var11 : class_240.field_817;
   }

   private void method_33196(int[] var1, class_240 var2) {
      int[] var5 = new int[var1.length];
      System.arraycopy(var1, 0, var5, 0, var1.length);
      float[] var6 = new float[class_240.values().length];
      var6[class_6636.field_34355] = 999.0F;
      var6[class_6636.field_34356] = 999.0F;
      var6[class_6636.field_34354] = 999.0F;
      var6[class_6636.field_34359] = -999.0F;
      var6[class_6636.field_34360] = -999.0F;
      var6[class_6636.field_34357] = -999.0F;
      int var7 = var1.length / 4;

      for (int var8 = 0; var8 < 4; var8++) {
         int var9 = var7 * var8;
         float var10 = Float.intBitsToFloat(var5[var9]);
         float var11 = Float.intBitsToFloat(var5[var9 + 1]);
         float var12 = Float.intBitsToFloat(var5[var9 + 2]);
         if (var10 < var6[class_6636.field_34355]) {
            var6[class_6636.field_34355] = var10;
         }

         if (var11 < var6[class_6636.field_34356]) {
            var6[class_6636.field_34356] = var11;
         }

         if (var12 < var6[class_6636.field_34354]) {
            var6[class_6636.field_34354] = var12;
         }

         if (var10 > var6[class_6636.field_34359]) {
            var6[class_6636.field_34359] = var10;
         }

         if (var11 > var6[class_6636.field_34360]) {
            var6[class_6636.field_34360] = var11;
         }

         if (var12 > var6[class_6636.field_34357]) {
            var6[class_6636.field_34357] = var12;
         }
      }

      class_4188 var20 = class_4188.method_19472(var2);

      for (int var21 = 0; var21 < 4; var21++) {
         int var22 = var7 * var21;
         class_9829 var23 = var20.method_19474(var21);
         float var24 = var6[var23.field_49786];
         float var13 = var6[var23.field_49789];
         float var14 = var6[var23.field_49787];
         var1[var22] = Float.floatToRawIntBits(var24);
         var1[var22 + 1] = Float.floatToRawIntBits(var13);
         var1[var22 + 2] = Float.floatToRawIntBits(var14);

         for (int var15 = 0; var15 < 4; var15++) {
            int var16 = var7 * var15;
            float var17 = Float.intBitsToFloat(var5[var16]);
            float var18 = Float.intBitsToFloat(var5[var16 + 1]);
            float var19 = Float.intBitsToFloat(var5[var16 + 2]);
            if (class_9299.method_42856(var24, var17) && class_9299.method_42856(var13, var18) && class_9299.method_42856(var14, var19)) {
               var1[var22 + 4] = var5[var16 + 4];
               var1[var22 + 4 + 1] = var5[var16 + 4 + 1];
            }
         }
      }
   }
}
