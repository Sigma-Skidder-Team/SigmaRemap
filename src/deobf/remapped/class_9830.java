package remapped;

import java.util.function.Consumer;

public class class_9830 {
   private final class_8137 field_49795;
   private final class_8137 field_49791;
   private final class_2451 field_49790;
   private final class_3321 field_49792 = class_3321.method_15269();
   private final class_2994<?> field_49794;

   public class_9830(class_2994<?> var1, class_8137 var2, class_8137 var3, class_2451 var4) {
      this.field_49794 = var1;
      this.field_49795 = var2;
      this.field_49791 = var3;
      this.field_49790 = var4;
   }

   public static class_9830 method_45318(class_8137 var0, class_8137 var1, class_2451 var2) {
      return new class_9830(class_2994.field_14719, var0, var1, var2);
   }

   public class_9830 method_45316(String var1, class_5154 var2) {
      this.field_49792.method_15272(var1, var2);
      return this;
   }

   public void method_45313(Consumer<class_4219> var1, String var2) {
      this.method_45315(var1, new Identifier(var2));
   }

   public void method_45315(Consumer<class_4219> var1, Identifier var2) {
      this.method_45317(var2);
      this.field_49792
         .method_15260(new Identifier("recipes/root"))
         .method_15272("has_the_recipe", class_8435.method_38807(var2))
         .method_15258(class_7365.method_33536(var2))
         .method_15271(class_6701.field_34598);
      var1.accept(
         new class_5821(
            var2,
            this.field_49794,
            this.field_49795,
            this.field_49791,
            this.field_49790,
            this.field_49792,
            new Identifier(var2.method_21461(), "recipes/" + this.field_49790.method_11226().method_37691() + "/" + var2.method_21456())
         )
      );
   }

   private void method_45317(Identifier var1) {
      if (this.field_49792.method_15255().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + var1);
      }
   }
}
