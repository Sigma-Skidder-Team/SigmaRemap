package remapped;

public class class_1767 extends class_1859 {
   public class_6430 field_9071;

   public class_1767(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.method_32148(this.field_9071 = new class_6430(this, "messages", 0, 114, var5, var6 - 114));
   }

   public void method_7900(String var1) {
      this.field_9071.method_29377(new class_7274(var1, true));
   }

   public void method_7899(String var1) {
      this.field_9071.method_29377(new class_7274(var1, false));
   }

   @Override
   public void method_32178(float var1) {
      super.method_32190();
      super.method_32130();
      byte var4 = 23;
      super.method_32178(var1);
   }
}
