package remapped;

import java.util.function.Consumer;

public class class_2422 extends class_8457 {
   private static String[] field_12062;
   private final Identifier field_12061;

   private class_2422(Identifier var1, int var2, int var3, class_7279[] var4, class_2913[] var5) {
      super(var2, var3, var4, var5);
      this.field_12061 = var1;
   }

   @Override
   public class_3515 method_17435() {
      return class_5570.field_28303;
   }

   @Override
   public void method_38897(Consumer<ItemStack> var1, class_2792 var2) {
      var2.method_12697(this.field_12061, var1);
   }

   public static class_7550<?> method_11046(Identifier var0) {
      return method_38895((var1, var2, var3, var4) -> new class_2422(var0, var1, var2, var3, var4));
   }
}
