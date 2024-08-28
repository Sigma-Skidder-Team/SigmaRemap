package mapped;

public class Class7928 {
   private static String[] field33960;
   private final ResourceLocation field33961;
   public final Class9407 field33962;

   public Class7928(Class9407 var1, ResourceLocation var2, Block var3) {
      this.field33962 = var1;
      this.field33961 = Class9756.field45566.method34808(var2, Class7287.method23022(var3), Class9407.method35999(var1));
   }

   public Class7928 method26606(Block... var1) {
      for (Block var7 : var1) {
         Class9407.method36001(this.field33962).accept(Class9407.method36000(var7, this.field33961));
      }

      return this;
   }

   public Class7928 method26607(Block... var1) {
      for (Block var7 : var1) {
         Class9407.method36009(this.field33962, var7);
      }

      return this.method26606(var1);
   }

   public Class7928 method26608(Class9253 var1, Block... var2) {
      for (Block var8 : var2) {
         var1.method34808(Class9060.method33724(var8.method11581()), Class7287.method23022(var8), Class9407.method35999(this.field33962));
      }

      return this.method26606(var2);
   }
}
