package remapped;

public class class_6237 implements class_857 {
   public class_6237(class_8258 var1) {
      this.field_31914 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      int var4 = var1.<Integer>method_23242(class_8039.field_41157);
      byte var5 = var1.<Byte>method_23242(class_8039.field_41133);
      String var6 = var4 != 0 ? (var4 != 1 ? "REDSTONE" : "AUTO") : "SEQUENCE";
      var1.method_23236(class_8039.field_41161, false);
      var1.method_23236(class_8039.field_41171, var6);
      var1.method_23236(class_8039.field_41161, false);
      var1.method_23236(class_8039.field_41161, false);
   }
}
