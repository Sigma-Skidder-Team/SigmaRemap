package mapped;

public class Class263 extends Class219<Class1098, Class2861<Class1098>> {
   private static final ResourceLocation field928 = new ResourceLocation("textures/entity/cat/cat_collar.png");
   private final Class2861<Class1098> field929 = new Class2861<Class1098>(0.01F);

   public Class263(Class5714<Class1098, Class2861<Class1098>> var1) {
      super(var1);
   }

   public void method820(Class9332 var1, Class7733 var2, int var3, Class1098 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (var4.method4393()) {
         float[] var13 = var4.method5256().method311();
         method823(this.method825(), this.field929, field928, var1, var2, var3, var4, var5, var6, var8, var9, var10, var7, var13[0], var13[1], var13[2]);
      }
   }
}
