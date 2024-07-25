package remapped;

import java.util.function.Consumer;

public class class_308 {
   private final class_2451 field_1130;
   private final class_8137 field_1135;
   private final float field_1132;
   private final int field_1131;
   private final class_3321 field_1133 = class_3321.method_15269();
   private String field_1134;
   private final class_705<?> field_1128;

   private class_308(class_8525 var1, class_8137 var2, float var3, int var4, class_705<?> var5) {
      this.field_1130 = var1.method_10803();
      this.field_1135 = var2;
      this.field_1132 = var3;
      this.field_1131 = var4;
      this.field_1128 = var5;
   }

   public static class_308 method_1365(class_8137 var0, class_8525 var1, float var2, int var3, class_705<?> var4) {
      return new class_308(var1, var0, var2, var3, var4);
   }

   public static class_308 method_1370(class_8137 var0, class_8525 var1, float var2, int var3) {
      return method_1365(var0, var1, var2, var3, class_2994.field_14718);
   }

   public static class_308 method_1373(class_8137 var0, class_8525 var1, float var2, int var3) {
      return method_1365(var0, var1, var2, var3, class_2994.field_14725);
   }

   public class_308 method_1366(String var1, class_5154 var2) {
      this.field_1133.method_15272(var1, var2);
      return this;
   }

   public void method_1367(Consumer<class_4219> var1) {
      this.method_1369(var1, class_8669.field_44382.method_39797(this.field_1130));
   }

   public void method_1368(Consumer<class_4219> var1, String var2) {
      Identifier var5 = class_8669.field_44382.method_39797(this.field_1130);
      Identifier var6 = new Identifier(var2);
      if (!var6.equals(var5)) {
         this.method_1369(var1, var6);
      } else {
         throw new IllegalStateException("Recipe " + var6 + " should remove its 'save' argument");
      }
   }

   public void method_1369(Consumer<class_4219> var1, Identifier var2) {
      this.method_1372(var2);
      this.field_1133
         .method_15260(new Identifier("recipes/root"))
         .method_15272("has_the_recipe", class_8435.method_38807(var2))
         .method_15258(class_7365.method_33536(var2))
         .method_15271(class_6701.field_34598);
      var1.accept(
         new class_7106(
            var2,
            this.field_1134 != null ? this.field_1134 : "",
            this.field_1135,
            this.field_1130,
            this.field_1132,
            this.field_1131,
            this.field_1133,
            new Identifier(var2.method_21461(), "recipes/" + this.field_1130.method_11226().method_37691() + "/" + var2.method_21456()),
            (class_2994<? extends class_3151>)this.field_1128
         )
      );
   }

   private void method_1372(Identifier var1) {
      if (this.field_1133.method_15255().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + var1);
      }
   }
}
