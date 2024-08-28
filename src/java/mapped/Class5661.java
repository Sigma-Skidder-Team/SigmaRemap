package mapped;

public class Class5661<T extends Class1006, M extends Class2797<T>> extends Class5651<T, M> {
   private static final ResourceLocation field25025 = new ResourceLocation("textures/entity/steve.png");

   public Class5661(Class8853 var1, M var2, float var3) {
      this(var1, (M)var2, var3, 1.0F, 1.0F, 1.0F);
   }

   public Class5661(Class8853 var1, M var2, float var3, float var4, float var5, float var6) {
      super(var1, (M)var2, var3);
      this.method17880(new Class235<T, M>(this, var4, var5, var6));
      this.method17880(new Class220<T, M>(this));
      this.method17880(new Class242<T, M>(this));
   }

   public ResourceLocation method17843(T var1) {
      return field25025;
   }
}
