package mapped;

public class Class221 extends Class219<Class1012, Class2859<Class1012>> {
   private static final ResourceLocation field866 = new ResourceLocation("textures/entity/wolf/wolf_collar.png");

   public Class221(Class5714<Class1012, Class2859<Class1012>> var1) {
      super(var1);
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, Class1012 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (var4.method4393() && !var4.method3342()) {
         float[] var13 = var4.method4382().method311();
         if (Class7944.method26911()) {
            var13 = Class9680.method37883(var4.method4382(), var13);
         }

         method824(this.method825(), field866, var1, var2, var3, var4, var13[0], var13[1], var13[2]);
      }
   }
}
