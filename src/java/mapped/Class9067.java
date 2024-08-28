package mapped;

import java.util.function.Consumer;

public class Class9067 {
   private final Class3257 field41489;
   private final Class120 field41490;
   private final int field41491;
   private final Class7999 field41492 = Class7999.method27304();
   private String field41493;
   private final Class6504<?> field41494;

   public Class9067(Class6504<?> var1, Class120 var2, Class3303 var3, int var4) {
      this.field41494 = var1;
      this.field41489 = var3.method11581();
      this.field41490 = var2;
      this.field41491 = var4;
   }

   public static Class9067 method33769(Class120 var0, Class3303 var1) {
      return new Class9067(Class6504.field28489, var0, var1, 1);
   }

   public static Class9067 method33770(Class120 var0, Class3303 var1, int var2) {
      return new Class9067(Class6504.field28489, var0, var1, var2);
   }

   public Class9067 method33771(String var1, Class4477 var2) {
      this.field41492.method27312(var1, var2);
      return this;
   }

   public void method33772(Consumer<Class4664> var1, String var2) {
      ResourceLocation var5 = Class2348.field16075.method9181(this.field41489);
      if (!new ResourceLocation(var2).equals(var5)) {
         this.method33773(var1, new ResourceLocation(var2));
      } else {
         throw new IllegalStateException("Single Item Recipe " + var2 + " should remove its 'save' argument");
      }
   }

   public void method33773(Consumer<Class4664> var1, ResourceLocation var2) {
      this.method33774(var2);
      this.field41492
         .method27306(new ResourceLocation("recipes/root"))
         .method27312("has_the_recipe", Class4897.method15131(var2))
         .method27310(Class9182.method34345(var2))
         .method27314(Class9014.field41221);
      var1.accept(
         new Class4665(
            var2,
            this.field41494,
            this.field41493 != null ? this.field41493 : "",
            this.field41490,
            this.field41489,
            this.field41491,
            this.field41492,
            new ResourceLocation(var2.method8293(), "recipes/" + this.field41489.method11739().method23642() + "/" + var2.method8292())
         )
      );
   }

   private void method33774(ResourceLocation var1) {
      if (this.field41492.method27322().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + var1);
      }
   }
}
