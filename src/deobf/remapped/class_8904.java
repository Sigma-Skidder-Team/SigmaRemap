package remapped;

public class class_8904 implements class_4388 {
   public class_8904(class_1161 var1, class_1161 var2, int[] var3, Runnable var4) {
      this.field_45651 = var1;
      this.field_45652 = var2;
      this.field_45653 = var3;
      this.field_45654 = var4;
   }

   @Override
   public void method_20453(Object var1) {
      try {
         if (var1 instanceof String) {
            class_1161.method_5171(this.field_45652).method_30953((String)var1);
         } else if (var1 instanceof byte[]) {
            class_1161.method_5171(this.field_45652).method_30954(class_9091.method_41910((byte[])var1));
         }
      } catch (IllegalStateException var5) {
         class_1161.method_5172().fine("websocket closed before we could write");
      }

      if (0 == --this.field_45653[0]) {
         this.field_45654.run();
      }
   }
}
