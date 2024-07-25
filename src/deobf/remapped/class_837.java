package remapped;

public enum class_837 {
   field_4399((var0, var1, var2, var3) -> var2),
   field_4400(
      (var0, var1, var2, var3) -> var1.method_12173() != var0.field_48996
               && var1.method_12173() != var0.field_48991
               && var1.method_12165() != var0.field_48995
               && var1.method_12165() != var0.field_48993
               && var1.method_12185() != var0.field_48992
               && var1.method_12185() != var0.field_48994
            ? null
            : var2
   ),
   field_4396(
      (var0, var1, var2, var3) -> var1.method_12173() != var0.field_48996
               && var1.method_12173() != var0.field_48991
               && var1.method_12165() != var0.field_48995
               && var1.method_12165() != var0.field_48993
               && var1.method_12185() != var0.field_48992
               && var1.method_12185() != var0.field_48994
            ? class_3411.method_15749()
            : var2
   ),
   field_4395((var0, var1, var2, var3) -> {
      var3.method_7510(var1, true);
      return var2;
   });

   public final class_2906 field_4397;

   private class_837(class_2906 var3) {
      this.field_4397 = var3;
   }
}
