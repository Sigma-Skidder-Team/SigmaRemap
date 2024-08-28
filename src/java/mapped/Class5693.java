package mapped;

public class Class5693 extends Class5651<Class1079, Class2881<Class1079>> {
   private static final ResourceLocation field25062 = new ResourceLocation("textures/entity/wither/wither_invulnerable.png");
   private static final ResourceLocation field25063 = new ResourceLocation("textures/entity/wither/wither.png");

   public Class5693(Class8853 var1) {
      super(var1, new Class2881<Class1079>(0.0F), 1.0F);
      this.method17880(new Class224(this));
   }

   public int method17858(Class1079 var1, BlockPos var2) {
      return 15;
   }

   public ResourceLocation method17843(Class1079 var1) {
      int var4 = var1.method5012();
      return var4 > 0 && (var4 > 80 || var4 / 5 % 2 != 1) ? field25062 : field25063;
   }

   public void method17857(Class1079 var1, Class9332 var2, float var3) {
      float var6 = 2.0F;
      int var7 = var1.method5012();
      if (var7 > 0) {
         var6 -= ((float)var7 - var3) / 220.0F * 0.5F;
      }

      var2.method35292(var6, var6, var6);
   }
}
