package mapped;

public abstract class Class5727<T extends AbstractArrowEntity> extends Class5715<T> {
   public Class5727(Class8853 var1) {
      super(var1);
   }

   public void method17853(T var1, float var2, float var3, Class9332 var4, Class7733 var5, int var6) {
      var4.method35294();
      var4.method35293(Class7680.field32900.method25286(MathHelper.method37821(var3, var1.field5033, var1.field5031) - 90.0F));
      var4.method35293(Class7680.field32902.method25286(MathHelper.method37821(var3, var1.field5034, var1.field5032)));
      boolean var9 = false;
      float var10 = 0.0F;
      float var11 = 0.5F;
      float var12 = 0.0F;
      float var13 = 0.15625F;
      float var14 = 0.0F;
      float var15 = 0.15625F;
      float var16 = 0.15625F;
      float var17 = 0.3125F;
      float var18 = 0.05625F;
      float var19 = (float)var1.field5103 - var3;
      if (var19 > 0.0F) {
         float var20 = -MathHelper.method37763(var19 * 3.0F) * var19;
         var4.method35293(Class7680.field32902.method25286(var20));
      }

      var4.method35293(Class7680.field32898.method25286(45.0F));
      var4.method35292(0.05625F, 0.05625F, 0.05625F);
      var4.method35291(-4.0, 0.0, 0.0);
      Class5422 var25 = var5.method25597(Class4520.method14310(this.method17843((T)var1)));
      Class8892 var21 = var4.method35296();
      Class9367 var22 = var21.method32361();
      Class8967 var23 = var21.method32362();
      this.method17913(var22, var23, var25, -7, -2, -2, 0.0F, 0.15625F, -1, 0, 0, var6);
      this.method17913(var22, var23, var25, -7, -2, 2, 0.15625F, 0.15625F, -1, 0, 0, var6);
      this.method17913(var22, var23, var25, -7, 2, 2, 0.15625F, 0.3125F, -1, 0, 0, var6);
      this.method17913(var22, var23, var25, -7, 2, -2, 0.0F, 0.3125F, -1, 0, 0, var6);
      this.method17913(var22, var23, var25, -7, 2, -2, 0.0F, 0.15625F, 1, 0, 0, var6);
      this.method17913(var22, var23, var25, -7, 2, 2, 0.15625F, 0.15625F, 1, 0, 0, var6);
      this.method17913(var22, var23, var25, -7, -2, 2, 0.15625F, 0.3125F, 1, 0, 0, var6);
      this.method17913(var22, var23, var25, -7, -2, -2, 0.0F, 0.3125F, 1, 0, 0, var6);

      for (int var24 = 0; var24 < 4; var24++) {
         var4.method35293(Class7680.field32898.method25286(90.0F));
         this.method17913(var22, var23, var25, -8, -2, 0, 0.0F, 0.0F, 0, 1, 0, var6);
         this.method17913(var22, var23, var25, 8, -2, 0, 0.5F, 0.0F, 0, 1, 0, var6);
         this.method17913(var22, var23, var25, 8, 2, 0, 0.5F, 0.15625F, 0, 1, 0, var6);
         this.method17913(var22, var23, var25, -8, 2, 0, 0.0F, 0.15625F, 0, 1, 0, var6);
      }

      var4.method35295();
      super.method17853((T)var1, var2, var3, var4, var5, var6);
   }

   public void method17913(
      Class9367 var1, Class8967 var2, Class5422 var3, int var4, int var5, int var6, float var7, float var8, int var9, int var10, int var11, int var12
   ) {
      var3.method17040(var1, (float)var4, (float)var5, (float)var6)
         .method17026(255, 255, 255, 255)
         .method17027(var7, var8)
         .method17035(Class213.field798)
         .method17034(var12)
         .method17041(var2, (float)var9, (float)var11, (float)var10)
         .method17031();
   }
}
