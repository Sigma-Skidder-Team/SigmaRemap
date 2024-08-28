package mapped;

public class Class5653 extends Class5651<Class1114, Class2811> {
   private static final ResourceLocation field25005 = new ResourceLocation("textures/entity/bat.png");

   public Class5653(Class8853 var1) {
      super(var1, new Class2811(), 0.25F);
   }

   public ResourceLocation method17843(Class1114 var1) {
      return field25005;
   }

   public void method17857(Class1114 var1, Class9332 var2, float var3) {
      var2.method35292(0.35F, 0.35F, 0.35F);
   }

   public void method17842(Class1114 var1, Class9332 var2, float var3, float var4, float var5) {
      if (!var1.method5364()) {
         var2.method35291(0.0, (double)(Class9679.method37764(var3 * 0.3F) * 0.1F), 0.0);
      } else {
         var2.method35291(0.0, -0.1F, 0.0);
      }

      super.method17842(var1, var2, var3, var4, var5);
   }
}
