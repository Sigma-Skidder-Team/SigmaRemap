package mapped;

import net.minecraft.util.ResourceLocation;

public class Class5690 extends Class5651<Class1012, Class2859<Class1012>> {
   private static final ResourceLocation field25057 = new ResourceLocation("textures/entity/wolf/wolf.png");
   private static final ResourceLocation field25058 = new ResourceLocation("textures/entity/wolf/wolf_tame.png");
   private static final ResourceLocation field25059 = new ResourceLocation("textures/entity/wolf/wolf_angry.png");

   public Class5690(EntityRendererManager var1) {
      super(var1, new Class2859<Class1012>(), 0.5F);
      this.method17880(new Class221(this));
   }

   public float method17871(Class1012 var1, float var2) {
      return var1.method4380();
   }

   public void method17853(Class1012 var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      if (var1.method4375()) {
         float var9 = var1.method4376(var3);
         this.field25086.method11190(var9, var9, var9);
      }

      super.method17853(var1, var2, var3, var4, var5, var6);
      if (var1.method4375()) {
         this.field25086.method11190(1.0F, 1.0F, 1.0F);
      }
   }

   public ResourceLocation method17843(Class1012 var1) {
      if (!var1.method4393()) {
         return !var1.method4369() ? field25057 : field25059;
      } else {
         return field25058;
      }
   }
}
