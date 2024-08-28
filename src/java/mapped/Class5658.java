package mapped;

public class Class5658 extends Class5651<Class1105, Class2820> {
   private static final ResourceLocation field25020 = new ResourceLocation("textures/entity/guardian.png");
   private static final ResourceLocation field25021 = new ResourceLocation("textures/entity/guardian_beam.png");
   private static final Class4520 field25022 = Class4520.method14312(field25021);

   public Class5658(Class8853 var1) {
      this(var1, 0.5F);
   }

   public Class5658(Class8853 var1, float var2) {
      super(var1, new Class2820(), var2);
   }

   public boolean method17854(Class1105 var1, Class7647 var2, double var3, double var5, double var7) {
      if (!super.method17854(var1, var2, var3, var5, var7)) {
         if (var1.method5305()) {
            Class880 var11 = var1.method5306();
            if (var11 != null) {
               Vector3d var12 = this.method17861(var11, (double)var11.method3430() * 0.5, 1.0F);
               Vector3d var13 = this.method17861(var1, (double)var1.method3393(), 1.0F);
               return var2.method25122(
                  new Class6488(var13.field18048, var13.field18049, var13.field18050, var12.field18048, var12.field18049, var12.field18050)
               );
            }
         }

         return false;
      } else {
         return true;
      }
   }

   private Vector3d method17861(Class880 var1, double var2, float var4) {
      double var7 = MathHelper.method37822((double)var4, var1.field5048, var1.getPosX());
      double var9 = MathHelper.method37822((double)var4, var1.field5049, var1.getPosY()) + var2;
      double var11 = MathHelper.method37822((double)var4, var1.field5050, var1.getPosZ());
      return new Vector3d(var7, var9, var11);
   }

   public void method17853(Class1105 var1, float var2, float var3, Class9332 var4, Class7733 var5, int var6) {
      super.method17853(var1, var2, var3, var4, var5, var6);
      Class880 var9 = var1.method5306();
      if (var9 != null) {
         float var10 = var1.method5310(var3);
         float var11 = (float)var1.field5024.method6783() + var3;
         float var12 = var11 * 0.5F % 1.0F;
         float var13 = var1.method3393();
         var4.method35294();
         var4.method35291(0.0, (double)var13, 0.0);
         Vector3d var14 = this.method17861(var9, (double)var9.method3430() * 0.5, var3);
         Vector3d var15 = this.method17861(var1, (double)var13, var3);
         Vector3d var16 = var14.method11336(var15);
         float var17 = (float)(var16.method11348() + 1.0);
         var16 = var16.method11333();
         float var18 = (float)Math.acos(var16.field18049);
         float var19 = (float)Math.atan2(var16.field18050, var16.field18048);
         var4.method35293(Class7680.field32900.method25286(((float) (Math.PI / 2) - var19) * (180.0F / (float)Math.PI)));
         var4.method35293(Class7680.field32898.method25286(var18 * (180.0F / (float)Math.PI)));
         boolean var20 = true;
         float var21 = var11 * 0.05F * -1.5F;
         float var22 = var10 * var10;
         int var23 = 64 + (int)(var22 * 191.0F);
         int var24 = 32 + (int)(var22 * 191.0F);
         int var25 = 128 - (int)(var22 * 64.0F);
         float var26 = 0.2F;
         float var27 = 0.282F;
         float var28 = MathHelper.method37764(var21 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
         float var29 = MathHelper.method37763(var21 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
         float var30 = MathHelper.method37764(var21 + (float) (Math.PI / 4)) * 0.282F;
         float var31 = MathHelper.method37763(var21 + (float) (Math.PI / 4)) * 0.282F;
         float var32 = MathHelper.method37764(var21 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
         float var33 = MathHelper.method37763(var21 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
         float var34 = MathHelper.method37764(var21 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
         float var35 = MathHelper.method37763(var21 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
         float var36 = MathHelper.method37764(var21 + (float) Math.PI) * 0.2F;
         float var37 = MathHelper.method37763(var21 + (float) Math.PI) * 0.2F;
         float var38 = MathHelper.method37764(var21 + 0.0F) * 0.2F;
         float var39 = MathHelper.method37763(var21 + 0.0F) * 0.2F;
         float var40 = MathHelper.method37764(var21 + (float) (Math.PI / 2)) * 0.2F;
         float var41 = MathHelper.method37763(var21 + (float) (Math.PI / 2)) * 0.2F;
         float var42 = MathHelper.method37764(var21 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
         float var43 = MathHelper.method37763(var21 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
         float var44 = 0.0F;
         float var45 = 0.4999F;
         float var46 = -1.0F + var12;
         float var47 = var17 * 2.5F + var46;
         Class5422 var48 = var5.method25597(field25022);
         Class8892 var49 = var4.method35296();
         Class9367 var50 = var49.method32361();
         Class8967 var51 = var49.method32362();
         method17862(var48, var50, var51, var36, var17, var37, var23, var24, var25, 0.4999F, var47);
         method17862(var48, var50, var51, var36, 0.0F, var37, var23, var24, var25, 0.4999F, var46);
         method17862(var48, var50, var51, var38, 0.0F, var39, var23, var24, var25, 0.0F, var46);
         method17862(var48, var50, var51, var38, var17, var39, var23, var24, var25, 0.0F, var47);
         method17862(var48, var50, var51, var40, var17, var41, var23, var24, var25, 0.4999F, var47);
         method17862(var48, var50, var51, var40, 0.0F, var41, var23, var24, var25, 0.4999F, var46);
         method17862(var48, var50, var51, var42, 0.0F, var43, var23, var24, var25, 0.0F, var46);
         method17862(var48, var50, var51, var42, var17, var43, var23, var24, var25, 0.0F, var47);
         float var52 = 0.0F;
         if (var1.field5055 % 2 == 0) {
            var52 = 0.5F;
         }

         method17862(var48, var50, var51, var28, var17, var29, var23, var24, var25, 0.5F, var52 + 0.5F);
         method17862(var48, var50, var51, var30, var17, var31, var23, var24, var25, 1.0F, var52 + 0.5F);
         method17862(var48, var50, var51, var34, var17, var35, var23, var24, var25, 1.0F, var52);
         method17862(var48, var50, var51, var32, var17, var33, var23, var24, var25, 0.5F, var52);
         var4.method35295();
      }
   }

   private static void method17862(
      Class5422 var0, Class9367 var1, Class8967 var2, float var3, float var4, float var5, int var6, int var7, int var8, float var9, float var10
   ) {
      var0.method17040(var1, var3, var4, var5)
         .method17026(var6, var7, var8, 255)
         .method17027(var9, var10)
         .method17035(Class213.field798)
         .method17034(15728880)
         .method17041(var2, 0.0F, 1.0F, 0.0F)
         .method17031();
   }

   public ResourceLocation method17843(Class1105 var1) {
      return field25020;
   }
}
