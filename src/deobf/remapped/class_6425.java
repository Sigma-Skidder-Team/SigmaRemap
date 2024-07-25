package remapped;

public class class_6425 implements class_6224 {
   public class_6425(class_6586 var1, class_6586 var2) {
      this.field_32832 = var1;
      this.field_32831 = var2;
   }

   @Override
   public void method_28452(Object... var1) {
      class_6586.method_30085().fine("writing close packet");

      try {
         this.field_32831.method_10543(new class_8970[]{new class_8970("close")});
      } catch (class_4819 var5) {
         throw new RuntimeException(var5);
      }
   }
}
