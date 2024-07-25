package remapped;

import java.util.function.Consumer;

public class class_6896 {
   private final class_2451 field_35462;
   private final class_8137 field_35461;
   private final int field_35466;
   private final class_3321 field_35467 = class_3321.method_15269();
   private String field_35465;
   private final class_2994<?> field_35463;

   public class_6896(class_2994<?> var1, class_8137 var2, class_8525 var3, int var4) {
      this.field_35463 = var1;
      this.field_35462 = var3.method_10803();
      this.field_35461 = var2;
      this.field_35466 = var4;
   }

   public static class_6896 method_31591(class_8137 var0, class_8525 var1) {
      return new class_6896(class_2994.field_14726, var0, var1, 1);
   }

   public static class_6896 method_31592(class_8137 var0, class_8525 var1, int var2) {
      return new class_6896(class_2994.field_14726, var0, var1, var2);
   }

   public class_6896 method_31593(String var1, class_5154 var2) {
      this.field_35467.method_15272(var1, var2);
      return this;
   }

   public void method_31589(Consumer<class_4219> var1, String var2) {
      Identifier var5 = class_8669.field_44382.method_39797(this.field_35462);
      if (!new Identifier(var2).equals(var5)) {
         this.method_31590(var1, new Identifier(var2));
      } else {
         throw new IllegalStateException("Single Item Recipe " + var2 + " should remove its 'save' argument");
      }
   }

   public void method_31590(Consumer<class_4219> var1, Identifier var2) {
      this.method_31594(var2);
      this.field_35467
         .method_15260(new Identifier("recipes/root"))
         .method_15272("has_the_recipe", class_8435.method_38807(var2))
         .method_15258(class_7365.method_33536(var2))
         .method_15271(class_6701.field_34598);
      var1.accept(
         new class_433(
            var2,
            this.field_35463,
            this.field_35465 != null ? this.field_35465 : "",
            this.field_35461,
            this.field_35462,
            this.field_35466,
            this.field_35467,
            new Identifier(var2.method_21461(), "recipes/" + this.field_35462.method_11226().method_37691() + "/" + var2.method_21456())
         )
      );
   }

   private void method_31594(Identifier var1) {
      if (this.field_35467.method_15255().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + var1);
      }
   }
}
