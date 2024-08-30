package mapped;

public class Class9155 {
   private static final float field42034 = 1.0F / (float)Math.cos((float) (Math.PI / 8)) - 1.0F;
   private static final float field42035 = 1.0F / (float)Math.cos((float) (Math.PI / 4)) - 1.0F;

   public Class8557 method34175(
           Vector3f var1, Vector3f var2, Class9163 var3, TextureAtlasSprite var4, Direction var5, Class1902 var6, Class7360 var7, boolean var8, ResourceLocation var9
   ) {
      Class9840 var12 = var3.field42069;
      if (var6.method8170()) {
         var12 = method34176(var3.field42069, var5, var6.method8166(), var9);
      }

      float[] var13 = new float[var12.field45939.length];
      System.arraycopy(var12.field45939, 0, var13, 0, var13.length);
      float var14 = var4.getUvShrinkRatio();
      float var15 = (var12.field45939[0] + var12.field45939[0] + var12.field45939[2] + var12.field45939[2]) / 4.0F;
      float var16 = (var12.field45939[1] + var12.field45939[1] + var12.field45939[3] + var12.field45939[3]) / 4.0F;
      var12.field45939[0] = MathHelper.lerp(var14, var12.field45939[0], var15);
      var12.field45939[2] = MathHelper.lerp(var14, var12.field45939[2], var15);
      var12.field45939[1] = MathHelper.lerp(var14, var12.field45939[1], var16);
      var12.field45939[3] = MathHelper.lerp(var14, var12.field45939[3], var16);
      boolean var17 = !Class9299.field42868.method20214() ? var8 : false;
      int[] var18 = this.method34177(var12, var4, var5, this.method34178(var1, var2), var6.method8166(), var7, var17);
      Direction var19 = method34184(var18);
      System.arraycopy(var13, 0, var12.field45939, 0, var13.length);
      if (var7 == null) {
         this.method34185(var18, var19);
      }

      if (!Class9299.field42868.method20214()) {
         return new Class8557(var18, var3.field42067, var19, var4, var8);
      } else {
         Class9299.method35062(Class9299.field42868, var18, var19);
         return new Class8557(var18, var3.field42067, var19, var4, var8);
      }
   }

   public static Class9840 method34176(Class9840 var0, Direction var1, Class6979 var2, ResourceLocation var3) {
      Matrix4f var6 = Class8539.method30384(var2, var1, () -> "Unable to resolve UVLock for model: " + var3).method21548();
      float var7 = var0.method38890(var0.method38893(0));
      float var8 = var0.method38891(var0.method38893(0));
      Class7755 var9 = new Class7755(var7 / 16.0F, var8 / 16.0F, 0.0F, 1.0F);
      var9.method25709(var6);
      float var10 = 16.0F * var9.method25701();
      float var11 = 16.0F * var9.method25702();
      float var12 = var0.method38890(var0.method38893(2));
      float var13 = var0.method38891(var0.method38893(2));
      Class7755 var14 = new Class7755(var12 / 16.0F, var13 / 16.0F, 0.0F, 1.0F);
      var14.method25709(var6);
      float var15 = 16.0F * var14.method25701();
      float var16 = 16.0F * var14.method25702();
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

      float var21 = (float)Math.toRadians((double)var0.field45940);
      Vector3f var22 = new Vector3f(MathHelper.cos(var21), MathHelper.sin(var21), 0.0F);
      Class8967 var23 = new Class8967(var6);
      var22.method25282(var23);
      int var24 = Math.floorMod(-((int)Math.round(Math.toDegrees(Math.atan2((double)var22.method25270(), (double)var22.method25269())) / 90.0)) * 90, 360);
      return new Class9840(new float[]{var17, var19, var18, var20}, var24);
   }

   private int[] method34177(Class9840 var1, TextureAtlasSprite var2, Direction var3, float[] var4, Class6979 var5, Class7360 var6, boolean var7) {
      int var10 = !Class7944.method26921() ? DefaultVertexFormats.field43338 : DefaultVertexFormats.field43339;
      int[] var11 = new int[var10];

      for (int var12 = 0; var12 < 4; var12++) {
         this.method34179(var11, var12, var3, var1, var4, var2, var5, var6, var7);
      }

      return var11;
   }

   private float[] method34178(Vector3f var1, Vector3f var2) {
      float[] var5 = new float[Direction.values().length];
      var5[Class8993.field41132] = var1.method25269() / 16.0F;
      var5[Class8993.field41131] = var1.method25270() / 16.0F;
      var5[Class8993.field41130] = var1.method25271() / 16.0F;
      var5[Class8993.field41129] = var2.method25269() / 16.0F;
      var5[Class8993.field41128] = var2.method25270() / 16.0F;
      var5[Class8993.field41127] = var2.method25271() / 16.0F;
      return var5;
   }

   private void method34179(int[] var1, int var2, Direction var3, Class9840 var4, float[] var5, TextureAtlasSprite var6, Class6979 var7, Class7360 var8, boolean var9) {
      Class9827 var12 = Class2264.method8992(var3).method8993(var2);
      Vector3f var13 = new Vector3f(var5[var12.field45906], var5[var12.field45907], var5[var12.field45908]);
      this.method34181(var13, var8);
      this.method34182(var13, var7);
      Class7832.method26237(var13);
      this.method34180(var1, var2, var13, var6, var4);
   }

   private void method34180(int[] var1, int var2, Vector3f var3, TextureAtlasSprite var4, Class9840 var5) {
      int var8 = var1.length / 4;
      int var9 = var2 * var8;
      var1[var9] = Float.floatToRawIntBits(var3.method25269());
      var1[var9 + 1] = Float.floatToRawIntBits(var3.method25270());
      var1[var9 + 2] = Float.floatToRawIntBits(var3.method25271());
      var1[var9 + 3] = -1;
      var1[var9 + 4] = Float.floatToRawIntBits(var4.method7461((double)var5.method38890(var2)));
      var1[var9 + 4 + 1] = Float.floatToRawIntBits(var4.method7464((double)var5.method38891(var2)));
   }

   private void method34181(Vector3f var1, Class7360 var2) {
      if (var2 != null) {
         Vector3f var5;
         Vector3f var6;
         switch (Class9128.field41940[var2.field31516.ordinal()]) {
            case 1:
               var5 = new Vector3f(1.0F, 0.0F, 0.0F);
               var6 = new Vector3f(0.0F, 1.0F, 1.0F);
               break;
            case 2:
               var5 = new Vector3f(0.0F, 1.0F, 0.0F);
               var6 = new Vector3f(1.0F, 0.0F, 1.0F);
               break;
            case 3:
               var5 = new Vector3f(0.0F, 0.0F, 1.0F);
               var6 = new Vector3f(1.0F, 1.0F, 0.0F);
               break;
            default:
               throw new IllegalArgumentException("There are only 3 axes");
         }

         Class8661 var7 = new Class8661(var5, var2.field31517, true);
         if (var2.field31518) {
            if (Math.abs(var2.field31517) == 22.5F) {
               var6.method25272(field42034);
            } else {
               var6.method25272(field42035);
            }

            var6.method25276(1.0F, 1.0F, 1.0F);
         } else {
            var6.method25275(1.0F, 1.0F, 1.0F);
         }

         this.method34183(var1, var2.field31515.method25287(), new Matrix4f(var7), var6);
      }
   }

   public void method34182(Vector3f var1, Class6979 var2) {
      if (var2 != Class6979.method21542()) {
         this.method34183(var1, new Vector3f(0.5F, 0.5F, 0.5F), var2.method21548(), new Vector3f(1.0F, 1.0F, 1.0F));
      }
   }

   private void method34183(Vector3f var1, Vector3f var2, Matrix4f var3, Vector3f var4) {
      Class7755 var7 = new Class7755(
         var1.method25269() - var2.method25269(), var1.method25270() - var2.method25270(), var1.method25271() - var2.method25271(), 1.0F
      );
      var7.method25709(var3);
      var7.method25705(var4);
      var1.method25275(var7.method25701() + var2.method25269(), var7.method25702() + var2.method25270(), var7.method25703() + var2.method25271());
   }

   public static Direction method34184(int[] var0) {
      int var3 = var0.length / 4;
      int var4 = var3 * 2;
      Vector3f var5 = new Vector3f(Float.intBitsToFloat(var0[0]), Float.intBitsToFloat(var0[1]), Float.intBitsToFloat(var0[2]));
      Vector3f var6 = new Vector3f(Float.intBitsToFloat(var0[var3]), Float.intBitsToFloat(var0[var3 + 1]), Float.intBitsToFloat(var0[var3 + 2]));
      Vector3f var7 = new Vector3f(Float.intBitsToFloat(var0[var4]), Float.intBitsToFloat(var0[var4 + 1]), Float.intBitsToFloat(var0[var4 + 2]));
      Vector3f var8 = var5.method25287();
      var8.method25278(var6);
      Vector3f var9 = var7.method25287();
      var9.method25278(var6);
      Vector3f var10 = var9.method25287();
      var10.method25281(var8);
      var10.method25280();
      Direction var11 = null;
      float var12 = 0.0F;

      for (Direction var16 : Direction.values()) {
         Class1998 var17 = var16.method556();
         Vector3f var18 = new Vector3f((float)var17.getX(), (float)var17.getY(), (float)var17.getZ());
         float var19 = var10.method25279(var18);
         if (var19 >= 0.0F && var19 > var12) {
            var12 = var19;
            var11 = var16;
         }
      }

      return var11 != null ? var11 : Direction.field673;
   }

   private void method34185(int[] var1, Direction var2) {
      int[] var5 = new int[var1.length];
      System.arraycopy(var1, 0, var5, 0, var1.length);
      float[] var6 = new float[Direction.values().length];
      var6[Class8993.field41132] = 999.0F;
      var6[Class8993.field41131] = 999.0F;
      var6[Class8993.field41130] = 999.0F;
      var6[Class8993.field41129] = -999.0F;
      var6[Class8993.field41128] = -999.0F;
      var6[Class8993.field41127] = -999.0F;
      int var7 = var1.length / 4;

      for (int var8 = 0; var8 < 4; var8++) {
         int var9 = var7 * var8;
         float var10 = Float.intBitsToFloat(var5[var9]);
         float var11 = Float.intBitsToFloat(var5[var9 + 1]);
         float var12 = Float.intBitsToFloat(var5[var9 + 2]);
         if (var10 < var6[Class8993.field41132]) {
            var6[Class8993.field41132] = var10;
         }

         if (var11 < var6[Class8993.field41131]) {
            var6[Class8993.field41131] = var11;
         }

         if (var12 < var6[Class8993.field41130]) {
            var6[Class8993.field41130] = var12;
         }

         if (var10 > var6[Class8993.field41129]) {
            var6[Class8993.field41129] = var10;
         }

         if (var11 > var6[Class8993.field41128]) {
            var6[Class8993.field41128] = var11;
         }

         if (var12 > var6[Class8993.field41127]) {
            var6[Class8993.field41127] = var12;
         }
      }

      Class2264 var20 = Class2264.method8992(var2);

      for (int var21 = 0; var21 < 4; var21++) {
         int var22 = var7 * var21;
         Class9827 var23 = var20.method8993(var21);
         float var24 = var6[var23.field45906];
         float var13 = var6[var23.field45907];
         float var14 = var6[var23.field45908];
         var1[var22] = Float.floatToRawIntBits(var24);
         var1[var22 + 1] = Float.floatToRawIntBits(var13);
         var1[var22 + 2] = Float.floatToRawIntBits(var14);

         for (int var15 = 0; var15 < 4; var15++) {
            int var16 = var7 * var15;
            float var17 = Float.intBitsToFloat(var5[var16]);
            float var18 = Float.intBitsToFloat(var5[var16 + 1]);
            float var19 = Float.intBitsToFloat(var5[var16 + 2]);
            if (MathHelper.method37786(var24, var17) && MathHelper.method37786(var13, var18) && MathHelper.method37786(var14, var19)) {
               var1[var22 + 4] = var5[var16 + 4];
               var1[var22 + 4 + 1] = var5[var16 + 4 + 1];
            }
         }
      }
   }
}
