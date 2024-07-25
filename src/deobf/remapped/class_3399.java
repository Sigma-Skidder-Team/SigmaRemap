package remapped;

import java.util.function.Consumer;

public class class_3399 extends class_8457 {
   private static String[] field_16739;
   private final class_2451 field_16740;

   private class_3399(class_2451 var1, int var2, int var3, class_7279[] var4, class_2913[] var5) {
      super(var2, var3, var4, var5);
      this.field_16740 = var1;
   }

   @Override
   public class_3515 method_17435() {
      return class_5570.field_28306;
   }

   @Override
   public void method_38897(Consumer<ItemStack> var1, class_2792 var2) {
      var1.accept(new ItemStack(this.field_16740));
   }

   public static class_7550<?> method_15699(class_8525 var0) {
      return method_38895((var1, var2, var3, var4) -> new class_3399(var0.method_10803(), var1, var2, var3, var4));
   }
}
