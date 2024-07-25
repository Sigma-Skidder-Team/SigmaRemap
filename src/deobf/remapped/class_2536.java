package remapped;

public final class class_2536 extends class_8856 {
   private final class_8121 field_12577;
   private final class_8067 field_12576;

   public class_2536(class_8121 var1, class_8067 var2) {
      this.field_12577 = var1;
      this.field_12576 = var2;
   }

   @Override
   public class_1972 method_40738() {
      String var3 = this.field_12577.method_36955("Content-Type");
      return var3 == null ? null : class_1972.method_9069(var3);
   }

   @Override
   public long method_40730() {
      return class_4464.method_20719(this.field_12577);
   }

   @Override
   public class_8067 method_40735() {
      return this.field_12576;
   }
}
