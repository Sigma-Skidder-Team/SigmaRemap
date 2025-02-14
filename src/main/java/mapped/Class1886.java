package mapped;

public class Class1886 implements Class1884 {
   private static String[] field11043;
   private String field11044;
   private ModelRenderer field11045;
   private Class2095 field11046;

   public Class1886(String var1, ModelRenderer var2, Class2095 var3) {
      this.field11044 = var1;
      this.field11045 = var2;
      this.field11046 = var3;
   }

   @Override
   public float method8142() {
      return this.method8143();
   }

   public float method8143() {
      return this.field11046.method8757(this.field11045);
   }

   public void method8144(float var1) {
      this.field11046.method8758(this.field11045, var1);
   }

   @Override
   public String toString() {
      return this.field11044;
   }
}
