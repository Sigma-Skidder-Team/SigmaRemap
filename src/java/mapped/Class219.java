package mapped;

public abstract class Class219<T extends Entity, M extends Class2827<T>> {
   private final Class5714<T, M> field863;

   public Class219(Class5714<T, M> var1) {
      this.field863 = var1;
   }

   public static <T extends Class880> void method823(
      Class2827<T> var0,
      Class2827<T> var1,
      ResourceLocation var2,
      MatrixStack var3,
      Class7733 var4,
      int var5,
      T var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15
   ) {
      if (!var6.method3342()) {
         var0.method11027(var1);
         var1.method10997(var6, var7, var8, var12);
         var1.method10998(var6, var7, var8, var9, var10, var11);
         method824(var1, var2, var3, var4, var5, var6, var13, var14, var15);
      }
   }

   public static <T extends Class880> void method824(
           Class2827<T> var0, ResourceLocation var1, MatrixStack var2, Class7733 var3, int var4, T var5, float var6, float var7, float var8
   ) {
      Class5422 var11 = var3.method25597(RenderType.getEntityCutoutNoCull(var1));
      var0.method11016(var2, var11, var4, Class5712.method17883(var5, 0.0F), var6, var7, var8, 1.0F);
   }

   public M method825() {
      return this.field863.method17881();
   }

   public ResourceLocation method826(T var1) {
      return this.field863.method17843((T)var1);
   }

   public abstract void method820(MatrixStack var1, Class7733 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10);
}
