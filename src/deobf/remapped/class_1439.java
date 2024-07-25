package remapped;

public class class_1439 extends class_4785<class_1439> {
   private class_1439(class_2605 var1) {
      this.field_7763 = var1;
   }

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      class_2451 var13 = class_3231.method_14806(this.field_7763.field_12881).field_12875.get(var2);
      class_3231.method_14799(this.field_7763.field_12881, var1, var4 + 40, var3, var13);

      for (int var14 = 0; var14 < class_3231.method_14806(this.field_7763.field_12881).field_12877.size(); var14++) {
         class_6676 var15;
         if (!(var13 instanceof class_6201)) {
            var15 = null;
         } else {
            var15 = class_3231.method_14806(this.field_7763.field_12881).field_12877.get(var14).method_43790(((class_6201)var13).method_28392());
         }

         this.method_6588(var1, var15, var4 + class_3231.method_14805(this.field_7763.field_12881, var14), var3, var2 % 2 == 0);
      }

      for (int var16 = 0; var16 < class_3231.method_14806(this.field_7763.field_12881).field_12873.size(); var16++) {
         this.method_6588(
            var1,
            class_3231.method_14806(this.field_7763.field_12881).field_12873.get(var16).method_43790(var13),
            var4 + class_3231.method_14805(this.field_7763.field_12881, var16 + class_3231.method_14806(this.field_7763.field_12881).field_12877.size()),
            var3,
            var2 % 2 == 0
         );
      }
   }

   public void method_6588(class_7966 var1, class_6676<?> var2, int var3, int var4, boolean var5) {
      String var8 = var2 != null ? var2.method_30627(class_3231.method_14804(this.field_7763.field_12881).method_19276(var2)) : "-";
      AbstractGui.method_9770(
         var1,
         this.field_7763.field_12881.field_948,
         var8,
         var3 - this.field_7763.field_12881.field_948.method_45395(var8),
         var4 + 5,
         !var5 ? 9474192 : 16777215
      );
   }
}
