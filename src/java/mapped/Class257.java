package mapped;

public class Class257 extends Class219<Class1095, Class2864<Class1095>> {
   private static String[] field916;

   public Class257(Class5714<Class1095, Class2864<Class1095>> var1) {
      super(var1);
   }

   public void method820(Class9332 var1, Class7733 var2, int var3, Class1095 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      boolean var13 = var4.isSleeping();
      boolean var14 = var4.method3005();
      var1.method35294();
      if (var14) {
         float var15 = 0.75F;
         var1.method35292(0.75F, 0.75F, 0.75F);
         var1.method35291(0.0, 0.5, 0.209375F);
      }

      var1.method35291(
         (double)(this.method825().field17750.field31032 / 16.0F),
         (double)(this.method825().field17750.field31033 / 16.0F),
         (double)(this.method825().field17750.field31034 / 16.0F)
      );
      float var17 = var4.method5146(var7);
      var1.method35293(Class7680.field32902.method25285(var17));
      var1.method35293(Class7680.field32900.method25286(var9));
      var1.method35293(Class7680.field32898.method25286(var10));
      if (!var4.method3005()) {
         if (!var13) {
            var1.method35291(0.06F, 0.27F, -0.5);
         } else {
            var1.method35291(0.46F, 0.26F, 0.22F);
         }
      } else if (!var13) {
         var1.method35291(0.06F, 0.26F, -0.5);
      } else {
         var1.method35291(0.4F, 0.26F, 0.15F);
      }

      var1.method35293(Class7680.field32898.method25286(90.0F));
      if (var13) {
         var1.method35293(Class7680.field32902.method25286(90.0F));
      }

      ItemStack var16 = var4.method2943(Class2106.field13731);
      Minecraft.getInstance().method1556().method37580(var4, var16, Class2327.field15931, false, var1, var2, var3);
      var1.method35295();
   }
}
