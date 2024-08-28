package mapped;

public abstract class Class5651<T extends Class1006, M extends Class2827<T>> extends Class5712<T, M> {
   public Class5651(Class8853 var1, M var2, float var3) {
      super(var1, (M)var2, var3);
   }

   public boolean method17852(T var1) {
      return super.method17852((T)var1) && (var1.method2939() || var1.method3381() && var1 == this.field25097.field40019);
   }

   public boolean method17854(T var1, Class7647 var2, double var3, double var5, double var7) {
      if (!super.method17854((T)var1, var2, var3, var5, var7)) {
         Entity var11 = var1.method4297();
         return var11 == null ? false : var2.method25122(var11.method3186());
      } else {
         return true;
      }
   }

   public void method17853(T var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      super.method17853((T)var1, var2, var3, var4, var5, var6);
      Entity var9 = var1.method4297();
      if (var9 != null) {
         this.method17847((T)var1, var3, var4, var5, var9);
      }
   }

   private <E extends Entity> void method17847(T var1, float var2, MatrixStack var3, Class7733 var4, E var5) {
      if (!Class7944.method26921() || !Class8981.field40609) {
         var3.method35294();
         Vector3d var8 = var5.method2986(var2);
         double var9 = (double)(MathHelper.method37821(var2, var1.field4965, var1.field4966) * (float) (Math.PI / 180.0)) + (Math.PI / 2);
         Vector3d var11 = var1.method3394();
         double var12 = Math.cos(var9) * var11.field18050 + Math.sin(var9) * var11.field18048;
         double var14 = Math.sin(var9) * var11.field18050 - Math.cos(var9) * var11.field18048;
         double var16 = MathHelper.method37822((double)var2, var1.field5025, var1.getPosX()) + var12;
         double var18 = MathHelper.method37822((double)var2, var1.field5026, var1.getPosY()) + var11.field18049;
         double var20 = MathHelper.method37822((double)var2, var1.field5027, var1.getPosZ()) + var14;
         var3.method35291(var12, var11.field18049, var14);
         float var22 = (float)(var8.field18048 - var16);
         float var23 = (float)(var8.field18049 - var18);
         float var24 = (float)(var8.field18050 - var20);
         float var25 = 0.025F;
         Class5422 var26 = var4.method25597(Class4520.method14327());
         Class9367 var27 = var3.method35296().method32361();
         float var28 = MathHelper.method37815(var22 * var22 + var24 * var24) * 0.025F / 2.0F;
         float var29 = var24 * var28;
         float var30 = var22 * var28;
         BlockPos var31 = new BlockPos(var1.method3286(var2));
         BlockPos var32 = new BlockPos(var5.method3286(var2));
         int var33 = this.method17858((T)var1, var31);
         int var34 = this.field25097.<Entity>method32212(var5).method17858(var5, var32);
         int var35 = var1.field5024.method7020(Class1977.field12881, var31);
         int var36 = var1.field5024.method7020(Class1977.field12881, var32);
         if (Class7944.method26921()) {
            Class8981.method33119();
         }

         method17848(var26, var27, var22, var23, var24, var33, var34, var35, var36, 0.025F, 0.025F, var29, var30);
         method17848(var26, var27, var22, var23, var24, var33, var34, var35, var36, 0.025F, 0.0F, var29, var30);
         if (Class7944.method26921()) {
            Class8981.method33120();
         }

         var3.method35295();
      }
   }

   public static void method17848(
      Class5422 var0,
      Class9367 var1,
      float var2,
      float var3,
      float var4,
      int var5,
      int var6,
      int var7,
      int var8,
      float var9,
      float var10,
      float var11,
      float var12
   ) {
      byte var15 = 24;

      for (int var16 = 0; var16 < 24; var16++) {
         float var17 = (float)var16 / 23.0F;
         int var18 = (int) MathHelper.method37821(var17, (float)var5, (float)var6);
         int var19 = (int) MathHelper.method37821(var17, (float)var7, (float)var8);
         int var20 = Class1699.method7321(var18, var19);
         method17849(var0, var1, var20, var2, var3, var4, var9, var10, 24, var16, false, var11, var12);
         method17849(var0, var1, var20, var2, var3, var4, var9, var10, 24, var16 + 1, true, var11, var12);
      }
   }

   public static void method17849(
      Class5422 var0,
      Class9367 var1,
      int var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      int var8,
      int var9,
      boolean var10,
      float var11,
      float var12
   ) {
      float var15 = 0.5F;
      float var16 = 0.4F;
      float var17 = 0.3F;
      if (var9 % 2 == 0) {
         var15 *= 0.7F;
         var16 *= 0.7F;
         var17 *= 0.7F;
      }

      float var18 = (float)var9 / (float)var8;
      float var19 = var3 * var18;
      float var20 = !(var4 > 0.0F) ? var4 - var4 * (1.0F - var18) * (1.0F - var18) : var4 * var18 * var18;
      float var21 = var5 * var18;
      if (!var10) {
         var0.method17040(var1, var19 + var11, var20 + var6 - var7, var21 - var12).method17033(var15, var16, var17, 1.0F).method17034(var2).method17031();
      }

      var0.method17040(var1, var19 - var11, var20 + var7, var21 + var12).method17033(var15, var16, var17, 1.0F).method17034(var2).method17031();
      if (var10) {
         var0.method17040(var1, var19 + var11, var20 + var6 - var7, var21 - var12).method17033(var15, var16, var17, 1.0F).method17034(var2).method17031();
      }
   }
}
