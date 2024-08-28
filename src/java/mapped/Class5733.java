package mapped;

public class Class5733 extends Class5732<Class993> {
   private static String[] field25145;

   public Class5733(Class8853 var1) {
      super(var1);
   }

   public void method17915(Class993 var1, float var2, Class7380 var3, Class9332 var4, Class7733 var5, int var6) {
      int var9 = var1.method4073();
      if (var9 > -1 && (float)var9 - var2 + 1.0F < 10.0F) {
         float var10 = 1.0F - ((float)var9 - var2 + 1.0F) / 10.0F;
         var10 = Class9679.method37777(var10, 0.0F, 1.0F);
         var10 *= var10;
         var10 *= var10;
         float var11 = 1.0F + var10 * 0.3F;
         var4.method35292(var11, var11, var11);
      }

      method17916(var3, var4, var5, var6, var9 > -1 && var9 / 5 % 2 == 0);
   }

   public static void method17916(Class7380 var0, Class9332 var1, Class7733 var2, int var3, boolean var4) {
      int var7;
      if (!var4) {
         var7 = Class213.field798;
      } else {
         var7 = Class213.method730(Class213.method728(1.0F), 10);
      }

      if (Class7944.method26921() && var4) {
         Class8981.method33086(1.0F, 1.0F, 1.0F, 0.5F);
      }

      Minecraft.getInstance().method1553().method814(var0, var1, var2, var3, var7);
      if (Class7944.method26921()) {
         Class8981.method33086(0.0F, 0.0F, 0.0F, 0.0F);
      }
   }
}
