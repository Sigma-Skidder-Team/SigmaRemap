package mapped;

public class Class5951 extends Class5942<Class934> {
   public static final Class7826 field25950 = new Class7826(Class289.field1102, new ResourceLocation("entity/enchanting_table_book"));
   private final Class2850 field25951 = new Class2850();

   public Class5951(Class8086 var1) {
      super(var1);
   }

   public void method18462(Class934 var1, float var2, MatrixStack var3, Class7733 var4, int var5, int var6) {
      var3.method35294();
      var3.method35291(0.5, 0.75, 0.5);
      float var9 = (float)var1.field5281 + var2;
      var3.method35291(0.0, (double)(0.1F + MathHelper.method37763(var9 * 0.1F) * 0.01F), 0.0);
      float var10 = var1.field5288 - var1.field5289;

      while (var10 >= (float) Math.PI) {
         var10 -= (float) (Math.PI * 2);
      }

      while (var10 < (float) -Math.PI) {
         var10 += (float) (Math.PI * 2);
      }

      float var11 = var1.field5289 + var10 * var2;
      var3.method35293(Class7680.field32900.method25285(-var11));
      var3.method35293(Class7680.field32902.method25286(80.0F));
      float var12 = MathHelper.method37821(var2, var1.field5283, var1.field5282);
      float var13 = MathHelper.method37807(var12 + 0.25F) * 1.6F - 0.3F;
      float var14 = MathHelper.method37807(var12 + 0.75F) * 1.6F - 0.3F;
      float var15 = MathHelper.method37821(var2, var1.field5287, var1.field5286);
      this.field25951.method11177(var9, MathHelper.method37777(var13, 0.0F, 1.0F), MathHelper.method37777(var14, 0.0F, 1.0F), var15);
      Class5422 var16 = field25950.method26200(var4, Class4520::method14309);
      this.field25951.method11176(var3, var16, var5, var6, 1.0F, 1.0F, 1.0F, 1.0F);
      var3.method35295();
   }
}
