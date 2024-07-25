package remapped;

import com.google.common.collect.ImmutableMap;

public class class_2137 extends class_5920<class_5886> {
   private static String[] field_10715;
   private final float field_10716;

   public class_2137(float var1) {
      super(ImmutableMap.of());
      this.field_10716 = var1;
   }

   public boolean method_9995(class_6331 var1, class_5886 var2) {
      return var2.method_37285() && var2.method_37284(class_6503.field_33094) > var2.method_37108() || var2.method_37370();
   }

   public boolean method_9994(class_6331 var1, class_5886 var2, long var3) {
      return this.method_9995(var1, var2);
   }

   public void method_9993(class_6331 var1, class_5886 var2, long var3) {
      if (var2.method_26594().nextFloat() < this.field_10716) {
         var2.method_26886().method_18772();
      }
   }
}
