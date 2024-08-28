package mapped;

public class Class5679 extends Class5676<Class1033> {
   private static final ResourceLocation field25044 = new ResourceLocation("textures/entity/illager/illusioner.png");

   public Class5679(Class8853 var1) {
      super(var1, new Class2823<Class1033>(0.0F, 0.0F, 64, 64), 0.5F);
      this.method17880(new Class243(this, this));
      this.field25086.method11026().field31039 = true;
   }

   public ResourceLocation method17843(Class1033 var1) {
      return field25044;
   }

   public void method17853(Class1033 var1, float var2, float var3, Class9332 var4, Class7733 var5, int var6) {
      if (!var1.method3342()) {
         super.method17853(var1, var2, var3, var4, var5, var6);
      } else {
         Vector3d[] var9 = var1.method4611(var3);
         float var10 = this.method17871(var1, var3);

         for (int var11 = 0; var11 < var9.length; var11++) {
            var4.method35294();
            var4.method35291(
               var9[var11].field18048 + (double)Class9679.method37764((float)var11 + var10 * 0.5F) * 0.025,
               var9[var11].field18049 + (double)Class9679.method37764((float)var11 + var10 * 0.75F) * 0.0125,
               var9[var11].field18050 + (double)Class9679.method37764((float)var11 + var10 * 0.7F) * 0.025
            );
            super.method17853(var1, var2, var3, var4, var5, var6);
            var4.method35295();
         }
      }
   }

   public boolean method17869(Class1033 var1) {
      return true;
   }
}
