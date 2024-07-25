package remapped;

import java.util.function.Consumer;

public class class_4889 extends class_8457 {
   private final Identifier field_24306;

   private class_4889(Identifier var1, int var2, int var3, class_7279[] var4, class_2913[] var5) {
      super(var2, var3, var4, var5);
      this.field_24306 = var1;
   }

   @Override
   public class_3515 method_17435() {
      return class_5570.field_28304;
   }

   @Override
   public void method_38897(Consumer<class_6098> var1, class_2792 var2) {
      class_1758 var5 = var2.method_12686(this.field_24306);
      var5.method_7874(var2, var1);
   }

   @Override
   public void method_17436(class_4737 var1) {
      if (!var1.method_21890(this.field_24306)) {
         super.method_17436(var1);
         class_1758 var4 = var1.method_21886(this.field_24306);
         if (var4 != null) {
            var4.method_7867(var1.method_21894("->{" + this.field_24306 + "}", this.field_24306));
         } else {
            var1.method_21892("Unknown loot table called " + this.field_24306);
         }
      } else {
         var1.method_21892("Table " + this.field_24306 + " is recursively called");
      }
   }

   public static class_7550<?> method_22426(Identifier var0) {
      return method_38895((var1, var2, var3, var4) -> new class_4889(var0, var1, var2, var3, var4));
   }
}
