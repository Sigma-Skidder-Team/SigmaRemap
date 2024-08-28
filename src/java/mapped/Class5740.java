package mapped;

public class Class5740 extends Class5715<Class1004> {
   private static String[] field25163;

   public Class5740(Class8853 var1) {
      super(var1);
      this.field25098 = 0.5F;
   }

   public void method17853(Class1004 var1, float var2, float var3, Class9332 var4, Class7733 var5, int var6) {
      var4.method35294();
      var4.method35291(0.0, 0.5, 0.0);
      if ((float)var1.method4184() - var3 + 1.0F < 10.0F) {
         float var9 = 1.0F - ((float)var1.method4184() - var3 + 1.0F) / 10.0F;
         var9 = MathHelper.method37777(var9, 0.0F, 1.0F);
         var9 *= var9;
         var9 *= var9;
         float var10 = 1.0F + var9 * 0.3F;
         var4.method35292(var10, var10, var10);
      }

      var4.method35293(Class7680.field32900.method25286(-90.0F));
      var4.method35291(-0.5, -0.5, 0.5);
      var4.method35293(Class7680.field32900.method25286(90.0F));
      Class5733.method17916(Blocks.TNT.method11579(), var4, var5, var6, var1.method4184() / 5 % 2 == 0);
      var4.method35295();
      super.method17853(var1, var2, var3, var4, var5, var6);
   }

   public ResourceLocation method17843(Class1004 var1) {
      return Class289.field1102;
   }
}
