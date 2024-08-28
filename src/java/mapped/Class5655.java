package mapped;

public class Class5655 extends Class5651<Class1052, Class2827<Class1052>> {
   private static String[] field25007;
   private final Class2809<Class1052> field25008 = new Class2809<Class1052>(0.0F);
   private final Class2810<Class1052> field25009 = new Class2810<Class1052>(0.0F);

   public Class5655(Class8853 var1) {
      super(var1, new Class2809<Class1052>(0.0F), 0.15F);
      this.method17880(new Class241(this));
   }

   public ResourceLocation method17843(Class1052 var1) {
      return var1.method4827();
   }

   public void method17853(Class1052 var1, float var2, float var3, Class9332 var4, Class7733 var5, int var6) {
      Object var9 = var1.method4824() != 0 ? this.field25009 : this.field25008;
      this.field25086 = (Class2827<Class1052>)var9;
      float[] var10 = var1.method4820();
      ((Class2808)var9).method11018(var10[0], var10[1], var10[2]);
      super.method17853(var1, var2, var3, var4, var5, var6);
      ((Class2808)var9).method11018(1.0F, 1.0F, 1.0F);
   }

   public void method17842(Class1052 var1, Class9332 var2, float var3, float var4, float var5) {
      super.method17842(var1, var2, var3, var4, var5);
      float var8 = 4.3F * Class9679.method37763(0.6F * var3);
      var2.method35293(Class7680.field32900.method25286(var8));
      if (!var1.method3250()) {
         var2.method35291(0.2F, 0.1F, 0.0);
         var2.method35293(Class7680.field32902.method25286(90.0F));
      }
   }
}
