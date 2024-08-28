package mapped;

import java.util.Random;

public class Class5674 extends Class5651<Class1010, Class2799<Class1010>> {
   private static final ResourceLocation field25039 = new ResourceLocation("textures/entity/enderman/enderman.png");
   private final Random field25040 = new Random();

   public Class5674(Class8853 var1) {
      super(var1, new Class2799<Class1010>(0.0F), 0.5F);
      this.method17880(new Class228<Class1010>(this));
      this.method17880(new Class253(this));
   }

   public void method17853(Class1010 var1, float var2, float var3, Class9332 var4, Class7733 var5, int var6) {
      Class7380 var9 = var1.method4357();
      Class2799 var10 = this.method17881();
      var10.field17443 = var9 != null;
      var10.field17444 = var1.method4358();
      super.method17853(var1, var2, var3, var4, var5, var6);
   }

   public Vector3d method17867(Class1010 var1, float var2) {
      if (!var1.method4358()) {
         return super.method17867(var1, var2);
      } else {
         double var5 = 0.02;
         return new Vector3d(this.field25040.nextGaussian() * 0.02, 0.0, this.field25040.nextGaussian() * 0.02);
      }
   }

   public ResourceLocation method17843(Class1010 var1) {
      return field25039;
   }
}
