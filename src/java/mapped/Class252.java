package mapped;

public class Class252 extends Class219<AbstractClientPlayerEntity, Class2894<AbstractClientPlayerEntity>> {
   public Class252(Class5714<AbstractClientPlayerEntity, Class2894<AbstractClientPlayerEntity>> var1) {
      super(var1);
   }

   public void method820(Class9332 var1, Class7733 var2, int var3, AbstractClientPlayerEntity var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if ("deadmau5".equals(var4.getName().getString()) && var4.method5370() && !var4.method3342()) {
         Class5422 var13 = var2.method25597(Class4520.method14309(var4.method5371()));
         int var14 = Class5712.method17883(var4, 0.0F);

         for (int var15 = 0; var15 < 2; var15++) {
            float var16 = MathHelper.method37821(var7, var4.field5033, var4.field5031) - MathHelper.method37821(var7, var4.field4966, var4.field4965);
            float var17 = MathHelper.method37821(var7, var4.field5034, var4.field5032);
            var1.method35294();
            var1.method35293(Class7680.field32900.method25286(var16));
            var1.method35293(Class7680.field32898.method25286(var17));
            var1.method35291((double)(0.375F * (float)(var15 * 2 - 1)), 0.0, 0.0);
            var1.method35291(0.0, -0.375, 0.0);
            var1.method35293(Class7680.field32898.method25286(-var17));
            var1.method35293(Class7680.field32900.method25286(-var16));
            float var18 = 1.3333334F;
            var1.method35292(1.3333334F, 1.3333334F, 1.3333334F);
            this.method825().method11208(var1, var13, var3, var14);
            var1.method35295();
         }
      }
   }
}
