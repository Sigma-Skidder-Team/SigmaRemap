package remapped;

import java.util.function.Consumer;

public class class_203 extends class_8457 {
   private static String[] field_677;
   private final class_2307<class_2451> field_678;
   private final boolean field_676;

   private class_203(class_2307<class_2451> var1, boolean var2, int var3, int var4, class_7279[] var5, class_2913[] var6) {
      super(var3, var4, var5, var6);
      this.field_678 = var1;
      this.field_676 = var2;
   }

   @Override
   public class_3515 method_17435() {
      return class_5570.field_28298;
   }

   @Override
   public void method_38897(Consumer<class_6098> var1, class_2792 var2) {
      this.field_678.method_10608().forEach(var1x -> var1.accept(new class_6098(var1x)));
   }

   private boolean method_874(class_2792 var1, Consumer<class_2283> var2) {
      if (!this.method_17437(var1)) {
         return false;
      } else {
         for (class_2451 var6 : this.field_678.method_10608()) {
            var2.accept(new class_5392(this, var6));
         }

         return true;
      }
   }

   @Override
   public boolean method_4277(class_2792 var1, Consumer<class_2283> var2) {
      return !this.field_676 ? super.method_4277(var1, var2) : this.method_874(var1, var2);
   }

   public static class_7550<?> method_871(class_2307<class_2451> var0) {
      return method_38895((var1, var2, var3, var4) -> new class_203(var0, true, var1, var2, var3, var4));
   }
}
